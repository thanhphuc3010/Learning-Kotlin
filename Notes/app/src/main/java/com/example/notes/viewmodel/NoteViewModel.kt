package com.example.notes.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.notes.database.NotesDatabase
import com.example.notes.entities.Note
import com.example.notes.repository.NotesRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class NoteViewModel(application: Application): AndroidViewModel(application) {

    val readAllNotes: LiveData<List<Note>>
    private val repository: NotesRepository

    init {
        val noteDao = NotesDatabase.getDatabase(application).noteDao()
        repository = NotesRepository(noteDao)
        readAllNotes = repository.getAllNotes()
    }

    fun addNote(note: Note) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.insertNote(note)
        }
    }
}