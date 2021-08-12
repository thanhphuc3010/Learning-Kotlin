package com.example.notes.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes")
data class Note(

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    @ColumnInfo(name = "title")
    val title: String?,

    @ColumnInfo(name = "dateTime")
    val dateTime: String?,

    @ColumnInfo(name = "subtitle")
    val subtitle: String?,

    @ColumnInfo(name = "noteText")
    val noteText: String?,

    @ColumnInfo(name = "color")
    val color: String? = "#292929") {

    override fun toString(): String {
        return "$title: $dateTime"
    }

}
