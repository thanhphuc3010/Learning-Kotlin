package com.example.loginapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openRegister(view: View) {
        val editText = findViewById<EditText>(R.id.email_input)
        val value = editText.text.toString()
//        val intent: Intent = Intent(this, RegisterActivity::class.java).apply {
//            putExtra("email", value)
//        }
        val intent: Intent = Intent(Intent.ACTION_SEND)
        intent.setType("text/plain")
        intent.putExtra(Intent.EXTRA_TEXT, value)
        startActivity(intent)
    }
}