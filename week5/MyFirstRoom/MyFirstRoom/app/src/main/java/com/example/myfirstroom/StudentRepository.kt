package com.example.myfirstroom

import android.content.Context

class StudentRepository(context: Context) {
    var db: StudentDao? = AppDatabase.getInstance(context)?.studentDao()!!

    fun getAllStudents(): List<Students> {
        return db?.selectStudents() ?: listOf<Students>()
    }

    fun insertStudent(students: Students) {
        db?.insertStudent(students)
    }

    fun updateStudent(students: Students) {
        db?.updateStudent(students)
    }

    fun deleteStudent(students: Students){
        db?.deleteStudent(students)
    }

    // Insert things in an Async way
    //AsyncTask
    // doInBackground

    //coroutine

}