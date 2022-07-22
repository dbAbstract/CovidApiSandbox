package com.example.volleysandbox.screens

import androidx.lifecycle.ViewModel
import com.example.volleysandbox.repository.AppRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

// ViewModel for the Home-screen UI
@HiltViewModel
class HomeScreenViewModel @Inject constructor(private val repository: AppRepository) : ViewModel() {

}