package com.bignerdranch.androin.criminalintent

import android.view.View
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*
import java.util.Date

@Entity
data class Crime(
    @PrimaryKey val id: UUID = UUID.randomUUID(),
    var title: String = "",
    var date: Date = Date(),
    var isSloved: Boolean = false,
    var suspect: String = "") {
    val photoFileName get() = "IMG_$id.jpg"
}