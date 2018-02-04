package com.example.wale.myrecyclerviewapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.wale.myrecyclerviewapp.data.PersonListAdapter
import com.example.wale.myrecyclerviewapp.model.Person
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private var adapter: PersonListAdapter? = null
    private var personList: ArrayList<Person>? = null
    private var layoutManager: RecyclerView.LayoutManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        personList = ArrayList<Person>()
        layoutManager = LinearLayoutManager(this)
        adapter = PersonListAdapter(this, personList!!)

        //setup the list
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter

        //laod data

        for (i in 0..45) {
            val person = Person()
            person.name = "Olawale Oyeyipo $i"
            person.nickName = "@OlobeSinger"
            person.like = 34 + i

            personList!!.add(person)
        }
        adapter!!.notifyDataSetChanged()


    }
}

