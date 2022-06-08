package com.example.googleaffirmations

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.googleaffirmations.data.Datasource
import com.example.googleaffirmations.data.ListAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = Datasource().loadAffirmations()

        val adapter = ListAdapter(this, data)
        recycler_view.adapter = adapter
    }
}