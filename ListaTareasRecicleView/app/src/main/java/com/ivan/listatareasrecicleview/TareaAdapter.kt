package com.ivan.listatareasrecicleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler

class TareaAdapter(private val mTareas: MutableList<Tarea>/*,
                    private val listener: (Tarea)->Unit*/)
    : RecyclerView.Adapter<TareaAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val tareaView = LayoutInflater.from(parent.context)
            .inflate(R.layout.tarea_datos, parent, false)

        return ViewHolder(tareaView)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val tarea:Tarea = mTareas[position]

        val todoName = viewHolder.todoName
        val prioridad = viewHolder.prio
        val isDone = viewHolder.isDoneButton
        todoName.text = tarea.nombreTarea
        prioridad.text = "${tarea.prioridadTarea}"
        isDone.text = if(tarea.haFinalizado) "✅" else "❌"
//        viewHolder.itemView.setOnClickListener{
//            listener(tarea)
//        }
    }

    override fun getItemCount(): Int {
        return mTareas.count()
    }

    fun add(tarea: Tarea) {
        mTareas.add(tarea)
        notifyDataSetChanged()
    }

    fun delete(tarea:Tarea){
        mTareas.remove(tarea)
        notifyDataSetChanged()
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val todoName = itemView.findViewById<TextView>(R.id.toDoName)
        val isDoneButton = itemView.findViewById<CheckBox>(R.id.doneButton)
        val prio = itemView.findViewById<TextView>(R.id.priority)
    }
}