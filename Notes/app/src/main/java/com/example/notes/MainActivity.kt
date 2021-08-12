package com.example.notes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.notes.fragment.ListNotesFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val currentFragment = supportFragmentManager.findFragmentById(R.id.fragment_container)

        if (currentFragment == null) {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction
                .add(R.id.fragment_container, ListNotesFragment())
                .commit()
        }
    }
}