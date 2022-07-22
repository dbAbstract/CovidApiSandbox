package com.example.volleysandbox.repository

import com.example.volleysandbox.data.DataOrException
import com.example.volleysandbox.model.CountryStatusItem
import com.example.volleysandbox.network.CovidApi
import javax.inject.Inject

class AppRepository @Inject constructor(private val api: CovidApi) {

    // Wrapping response object list in dataOrException for exception handling
    private val dataOrException = DataOrException<ArrayList<CountryStatusItem>, Boolean, Exception>()

    suspend fun getByCountryAndStatus() : DataOrException<ArrayList<CountryStatusItem>, Boolean, Exception>() {
        try {
            dataOrException.loading = true
        } catch(ex: Exception) {

        }
    }
}