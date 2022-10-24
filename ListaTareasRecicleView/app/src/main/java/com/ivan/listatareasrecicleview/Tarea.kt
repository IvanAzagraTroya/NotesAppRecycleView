package com.ivan.listatareasrecicleview

data class Tarea(
    val id: Int,
    val nombreTarea: String,
    val prioridadTarea: Int?,
    val descripcion: String,
    var haFinalizado: Boolean = false
) {
    companion object {
        private var lastId = 0
        private var prioridadEjemplo = 0
        fun createContactsList(numTareas: Int): ArrayList<Tarea> {
            val contacts = ArrayList<Tarea>()
            for (i in 1..numTareas) {
                contacts.add(
                    Tarea(
                        ++lastId,
                        "Tarea $lastId",
                        ++prioridadEjemplo,
                        "Esto es una tarea prefabricada"
                    )
                )
            }
            return contacts
        }
    }
}
