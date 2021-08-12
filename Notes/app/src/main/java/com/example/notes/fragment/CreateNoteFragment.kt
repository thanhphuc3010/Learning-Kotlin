package com.example.notes.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.ViewModelProvider
import com.example.notes.R
import com.example.notes.entities.Note
import com.example.notes.viewmodel.NoteViewModel
import java.text.SimpleDateFormat
import java.util.*

class CreateNoteFragment : Fragment() {
    private lateinit var imvBack: ImageView
    private lateinit var edtTitle: EditText
    private lateinit var tvDateTime: TextView
    private lateinit var edtSubtitle: EditText
    private lateinit var edtNoteContent: EditText
    private lateinit var tvSave: TextView

    private lateinit var mNoteViewModel: NoteViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_create_note, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        imvBack = view.findViewById(R.id.image_back)
        imvBack.setOnClickListener {
            popCreateNoteFragment()
        }

        edtTitle = view.findViewById(R.id.input_note_title)
        edtSubtitle = view.findViewById(R.id.input_sub_title)
        edtNoteContent = view.findViewById(R.id.input_note_content)
        tvDateTime = view.findViewById(R.id.tv_note_date)
        tvSave = view.findViewById(R.id.tv_save)

        mNoteViewModel = ViewModelProvider(this).get(NoteViewModel::class.java)

        tvDateTime.text =
            SimpleDateFormat("EEEE, dd MMMM yyyy HH:mm a", Locale.getDefault()).format(Date())

        tvSave.setOnClickListener {
            saveNote()
            popCreateNoteFragment()
        }
    }

    private fun popCreateNoteFragment() {
        activity?.supportFragmentManager?.popBackStack(
            "CreateFragment",
            FragmentManager.POP_BACK_STACK_INCLUSIVE
        )
    }

    private fun saveNote() {
        if (edtTitle.text.toString().trim().isEmpty()) {
            Toast.makeText(activity, "Note title can't be empty!", Toast.LENGTH_SHORT)
                .show()
            return
        } else if (edtSubtitle.text.toString().trim().isEmpty()
            && edtNoteContent.text.toString().trim().isEmpty()
        ) {
            Toast.makeText(activity, "Note content can't be empty!", Toast.LENGTH_SHORT)
                .show()
            return
        }

        val noteTitle = edtTitle.text.toString().trim()
        val noteSubtitle = edtSubtitle.text.toString().trim()
        val noteContent = edtNoteContent.text.toString().trim()
        val dateTime = tvDateTime.text.toString().trim()

        val note = Note(0, noteTitle, dateTime, noteSubtitle, noteContent)
        mNoteViewModel.addNote(note)
    }
}