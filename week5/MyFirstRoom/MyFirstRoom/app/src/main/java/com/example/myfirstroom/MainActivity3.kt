package com.example.myfirstroom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    val repo: StudentRepository by lazy {
        StudentRepository(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var id: TextView = findViewById(R.id.id_t)
        var fname: EditText = findViewById(R.id.fname_t)
        var lname: EditText = findViewById(R.id.lname_t)
        var update: Button = findViewById(R.id.update)


        id.setText(intent.getIntExtra("Id",0).toString())
        fname.setText(intent.getStringExtra("Fname"))
        lname.setText(intent.getStringExtra("Lname"))

        update.setOnClickListener {
            repo.updateStudent(Students(id.text.toString().toInt(), fname.text.toString(), lname.text.toString()))
            val myIntent = Intent(this, MainActivity::class.java)
            startActivity(myIntent)
        }

    }
}