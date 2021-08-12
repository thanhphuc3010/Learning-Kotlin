package com.example.notes.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.notes.entities.Note

@Dao
interface NoteDao {

    @Query("SELECT * FROM notes ORDER BY id DESC")
    fun getAllNotes(): LiveData<List<Note>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertNote(note: Note)

    @Delete
    fun deleteNote(note: Note)
}