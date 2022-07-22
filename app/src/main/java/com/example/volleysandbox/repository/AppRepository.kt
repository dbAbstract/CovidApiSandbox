package com.example.volleysandbox.repository

import android.util.Log
import com.example.volleysandbox.data.DataOrException
import com.example.volleysandbox.model.CountryStatusItem
import com.example.volleysandbox.network.CovidApi
import javax.inject.Inject

class AppRepository @Inject constructor(private val api: CovidApi) {


    // UI - lazy column - user adds places onto the UI

    // Firebase - remote variable

    // Wrapping response object list in dataOrException for exception handling
    private val dataOrException = DataOrException<ArrayList<CountryStatusItem>, Boolean, Exception>()

    // request from text field -> ViewModel -> Repository -> GET REQUEST

    // create requestQueue --> Room DB --> ViewModel keeps track of ROOM DB -> UI keeps track of ViewModel
    suspend fun getByCountryAndStatus() : DataOrException<ArrayList<CountryStatusItem>, Boolean, Exception> {
        try {
            dataOrException.loading = true
            dataOrException.data = api.getByCountryAndStatus()
            if (dataOrException.data.toString().isNotEmpty()) dataOrException.loading = false

        } catch(ex: Exception) {
            dataOrException.e = ex
            Log.d("EXCEPTION", "getByCountryAndStatus Exception ${dataOrException.e!!.localizedMessage}")
        }
        return dataOrException
    }
}