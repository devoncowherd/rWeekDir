package com.example.myfirstroom

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

//4
class StudentAdapter(private val onCardClick: (position: Int) -> Unit,
                     private val studentList: List<Students>) : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflate a view and return it
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.student_list_item_layout, parent, false)
        return ViewHolder(view, onCardClick)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // add current item to the holder

        val itemVM = studentList[position]
        holder.fname.text = itemVM.firstName
        holder.lname.text = itemVM.lastName
// 3
//        holder.onClickListener {
//            var a = MainActivity()
//            a.onClick(position)
//        }
    }

    override fun getItemCount(): Int {
        // return the size of the datasource
        return studentList.size
    }
}


//    a= 1
//    AsyncPrintln(a)
//    a= 2
//    AsyncPrintln(a)
////when its async
//2
//2


//5
class ViewHolder(view: View, private val onCardClick: (position: Int) -> Unit)
    :RecyclerView.ViewHolder(view), View.OnClickListener  {
    init {
        itemView.setOnClickListener(this)
    }
    val fname : TextView = view.findViewById(R.id.fname)
    val lname : TextView = view.findViewById(R.id.lname)
    //6
    override fun onClick(v: View?) {
        val position = adapterPosition
        //7 - the function below is what is passed and referring to the one in MainActivity
        onCardClick(position)
    }
}