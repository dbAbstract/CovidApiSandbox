package com.example.volleysandbox.model

data class CountryStatusItem(
    val Active: Int,
    val Confirmed: Int,
    val Country: String,
    val CountryCode: String,
    val Date: String,
    val Deaths: Int,
    val Latitude: String,
    val LocationID: String,
    val Longitude: String,
    val Recovered: Int
)