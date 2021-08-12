package com.example.notes.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.notes.R
import com.example.notes.adapters.NoteAdapter
import com.example.notes.viewmodel.NoteViewModel

class ListNotesFragment : Fragment() {
    private lateinit var imvSearch: ImageView
    private lateinit var layoutSearch: LinearLayout
    private lateinit var notesRecyclerView: RecyclerView
    private lateinit var imvAddNote: ImageView

    private var adapter: NoteAdapter? = NoteAdapter()
    private lateinit var mNoteViewModel: NoteViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_notes, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        layoutSearch = view.findViewById(R.id.layout_search)
        imvSearch = view.findViewById(R.id.image_search)

        imvSearch.setOnClickListener{
            layoutSearch.visibility = if (layoutSearch.visibility == View.GONE) {
                View.VISIBLE
            } else {
                View.GONE
            }
            changeConstraint()
        }

        imvAddNote = view.findViewById(R.id.image_add_note)
        imvAddNote.setOnClickListener{
            activity?.supportFragmentManager
                ?.beginTransaction()
                ?.replace(R.id.fragment_container, CreateNoteFragment())
                ?.addToBackStack("CreateFragment")
                ?.commit()
        }

        mNoteViewModel = ViewModelProvider(this).get(NoteViewModel::class.java)
        notesRecyclerView = view.findViewById(R.id.notes_recycler_view)
        notesRecyclerView.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        notesRecyclerView.adapter = adapter
        mNoteViewModel.readAllNotes.observe(viewLifecycleOwner, Observer { notes ->
            adapter?.setData(notes)
        })
    }

    private fun changeConstraint() {
        val isVisible = layoutSearch.isVisible
        val constrainLayout: ConstraintLayout? = view?.findViewById(R.id.layout_list_note)
        val constrainSet = ConstraintSet()

        if (isVisible) {
            constrainSet.clone(constrainLayout)
            constrainSet.clear(R.id.notes_recycler_view, ConstraintSet.TOP)
            constrainSet.connect(R.id.notes_recycler_view, ConstraintSet.TOP, R.id.layout_search, ConstraintSet.BOTTOM, 24)
            constrainSet.applyTo(constrainLayout)
        } else {
            constrainSet.clone(constrainLayout)
            constrainSet.clear(R.id.notes_recycler_view, ConstraintSet.TOP)
            constrainSet.connect(R.id.notes_recycler_view, ConstraintSet.TOP, R.id.image_search, ConstraintSet.BOTTOM, 24)
            constrainSet.applyTo(constrainLayout)
        }
    }
}