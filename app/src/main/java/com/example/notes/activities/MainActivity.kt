package com.example.notes.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.notes.R
import com.example.notes.database.NoteDatabase
import com.example.notes.databinding.ActivityMainBinding
import com.example.notes.repository.NoteRepository
import com.example.notes.viewModel.NoteActivityViewModel
import com.example.notes.viewModel.NoteActivityViewModelFactory
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    lateinit var noteActivityViewModel: NoteActivityViewModel
    private lateinit var bindind:ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindind = ActivityMainBinding.inflate(layoutInflater)

        try {
            setContentView(bindind.root)
            val noteRepository=NoteRepository(NoteDatabase(this))
            val noteActivityViewModelFactory = NoteActivityViewModelFactory(noteRepository)
            noteActivityViewModel=ViewModelProvider(this, noteActivityViewModelFactory)[NoteActivityViewModel::class.java]


        }catch (e: Exception)
        {
            Log.d("Tag", "Error")
        }
    }
}