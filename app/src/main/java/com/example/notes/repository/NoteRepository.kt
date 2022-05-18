package com.example.notes.repository

import android.app.DownloadManager
import com.example.notes.database.NoteDatabase
import com.example.notes.model.Note

class NoteRepository(private val database: NoteDatabase) {

    fun getNote()= database.getNoteDao().getAllNote();

    fun searchNote(query: String) = database.getNoteDao().searchNote(query)

    suspend fun addNote(note : Note)= database.getNoteDao().addNote(note)

    suspend fun uptadeNote(note : Note)= database.getNoteDao().updateNote(note)

    suspend fun deleteNote(note : Note)= database.getNoteDao().deleteNote(note)



}