package com.example.myfirstroom

import androidx.room.*

//
@Dao
interface StudentDao {
    //CRUD
    //create
    @Insert
    fun insertStudent(student : Students)
    //Read
    @Query("select * from students")
    fun selectStudents(): List<Students>

    //update
    @Update
    fun updateStudent(student: Students)

    //Delete
    @Delete
    fun deleteStudent(student:  Students)
}