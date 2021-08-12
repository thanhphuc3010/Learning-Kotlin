package com.example.notes.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.notes.R
import com.example.notes.entities.Note

class NoteAdapter() : RecyclerView.Adapter<NoteAdapter.NoteViewHolder>() {
    private var notes = emptyList<Note>()
    class NoteViewHolder(view: View): RecyclerView.ViewHolder(view) {
        private lateinit var note: Note
        private val tvTitle: TextView = itemView.findViewById(R.id.text_title)
        private val tvSubtitle: TextView = itemView.findViewById(R.id.text_subtitle)
        private val tvDataTime: TextView = itemView.findViewById(R.id.text_date_time)

        fun bind(note: Note) {
            this.note = note
            tvTitle.text = this.note.title
            tvSubtitle.text = this.note.subtitle
            tvDataTime.text = this.note.dateTime
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.note_item, parent, false)
        return NoteViewHolder(view)
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        val note = notes[position]
        holder.bind(note)
    }

    override fun getItemCount(): Int {
        return notes.size
    }

    fun setData(note: List<Note>) {
        this.notes = note
        notifyDataSetChanged()
    }

}