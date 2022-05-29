package com.example.myfirstroom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    lateinit var studentList : List<Students>

    val repo:StudentRepository by lazy {
        StudentRepository(this)
    }
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

//            var fname: EditText = findViewById(R.id.finput)

//            var lname: EditText = findViewById(R.id.)
            // I am adding 10 Students to Room DB
            //for(i in 1..10) {
//              fun saveStudent(view: View) {
//                  var stu = Students(null, fname.text.toString() , fname.text.toString())
//                  repo.insertStudent(stu)
//              }
                //repo.updateStudent(stu)
            //}

            studentList = repo.getAllStudents()

            // init the data source
//        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView
//        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
            // Got reference to the view to populate
            val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
            // assigned the layout manager of the view
            recyclerView.layoutManager = LinearLayoutManager(this)
            //3
            //create an adapter with data source
            var adapter = StudentAdapter({position -> onCardClick(position) }, studentList)

            //Take the views adapter and then assign it to the custom adapter we created

            recyclerView.adapter = adapter
            // assign the adapter view

//            studentcard.setOnClickListener {
//                // you put your intent here
//                println("inside card click")
//            }
            var floating: FloatingActionButton = findViewById(R.id.floating)
            floating.setOnClickListener {
                val myIntent = Intent(this, MainActivity2::class.java)
                startActivity(myIntent)
            }

//            //1. This will not work
//            var studentcard: CardView = findViewById(R.id.studentcard)
//            studentcard.setOnClickListener {
//
//            }


        }

    // 2. Why you need this
    fun onCardClick(position: Int) {
        println("position:::$position")
        val myIntent = Intent(this, MainActivity3::class.java)
        myIntent.putExtra("Id", studentList[position].studentId)
        myIntent.putExtra("Fname", studentList[position].firstName)
        myIntent.putExtra("Lname", studentList[position].lastName)
        startActivity(myIntent)
    }

    }
