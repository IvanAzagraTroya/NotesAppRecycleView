package com.ivan.listatareasrecicleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class TareaActivity : AppCompatActivity() {

    private lateinit var mTareas: MutableList<Tarea>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tarea)

        val rvTareas = findViewById<View>(R.id.rvTarea) as RecyclerView

        mTareas = Tarea.createContactsList(20)
        val adapter = TareaAdapter(mTareas)

        rvTareas.adapter = adapter
        rvTareas.layoutManager = LinearLayoutManager(this)

    }

//    private fun TareaAdapter(mTareas: MutableList<Tarea>): TareaAdapter {
//
//    }
}