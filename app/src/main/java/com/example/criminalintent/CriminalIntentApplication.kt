package com.bignerdranch.androin.criminalintent

import android.app.Application
import com.example.crimeintent.CrimeRepository

class CriminalIntentApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        CrimeRepository.initialize(this)
    }

}