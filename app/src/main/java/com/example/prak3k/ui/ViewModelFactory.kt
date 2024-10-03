package com.example.prak3k.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.prak3k.domain.GetDataUseCase

class MainViewModelFactory(
    private val getDataUseCase: GetDataUseCase
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(getDataUseCase) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
