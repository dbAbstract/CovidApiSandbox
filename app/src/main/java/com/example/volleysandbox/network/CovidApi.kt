package com.example.volleysandbox.network

import com.example.volleysandbox.model.CountryStatus
import javax.inject.Singleton

@Singleton
interface CovidApi {

    suspend fun getByCountryAndStatus() : CountryStatus

}