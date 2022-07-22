package com.example.volleysandbox.repository

import com.example.volleysandbox.network.CovidApi
import javax.inject.Inject

class AppRepository @Inject constructor(private val api: CovidApi) {
}