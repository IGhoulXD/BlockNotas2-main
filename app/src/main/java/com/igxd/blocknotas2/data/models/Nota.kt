package com.igxd.BlockNotas.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notas")
data class Nota(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val titulo: String,
    val contenido: String
)


