package com.example.notes.repository

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.room.Room
import com.example.notes.dao.NoteDao
import com.example.notes.database.NotesDatabase
import com.example.notes.entities.Note
import java.util.*
import java.util.concurrent.Executor
import java.util.concurrent.Executors

private const val DATABASE_NAME = "notes-database"

class NotesRepository(private val noteDao: NoteDao) {


    fun getAllNotes(): LiveData<List<Note>> = noteDao.getAllNotes()
//
//    fun getCrime(id: UUID): LiveData<Crime?> = crimeDao.getCrime(id)

    suspend fun insertNote(note: Note) {
        noteDao.insertNote(note)
    }

}