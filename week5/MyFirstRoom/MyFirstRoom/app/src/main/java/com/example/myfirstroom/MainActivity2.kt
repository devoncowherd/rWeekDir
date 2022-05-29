package com.example.myfirstroom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity2 : AppCompatActivity() {
    val repo: StudentRepository by lazy {
        StudentRepository(this)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var fname: EditText = findViewById(R.id.fname)
        var lname: EditText = findViewById(R.id.lname)
        var save: Button = findViewById(R.id.save)


        save.setOnClickListener {
            repo.insertStudent(Students(null, fname.text.toString(), lname.text.toString()))
            val myIntent = Intent(this, MainActivity::class.java)
            startActivity(myIntent)
        }

    }
}