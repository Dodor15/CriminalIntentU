package com.example.crimeintent

import androidx.lifecycle.ViewModel
import com.bignerdranch.androin.criminalintent.Crime


class CrimeListViewModel : ViewModel() {
    private val crimeRepository = CrimeRepository.get()
    val crimeListLiveData = crimeRepository.getCrimes()
    fun addCrime(crime: Crime) {
        crimeRepository.addCrime(crime)
    }

}
