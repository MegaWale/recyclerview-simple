package com.example.wale.myrecyclerviewapp.data

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.wale.myrecyclerviewapp.R
import com.example.wale.myrecyclerviewapp.model.Person


class PersonListAdapter(
        private val context: Context,
        private val list: ArrayList<Person>
): RecyclerView.Adapter<PersonListAdapter.ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {

        holder?.bindView(list[position])

    }

    override fun getItemCount(): Int {

        return list.size

    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(context).inflate(R.layout.list_more, parent, false)

        return ViewHolder(view)

    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindView(person: Person) {
            var title: TextView = itemView.findViewById<TextView>(R.id.title) as TextView
            var nickName: TextView = itemView.findViewById<TextView>(R.id.nickName) as TextView
            var like: TextView = itemView.findViewById<TextView>(R.id.like) as TextView

            title.text = person.name
            nickName.text = person.nickName
            like.text = person.like.toString()

        }
    }

}
