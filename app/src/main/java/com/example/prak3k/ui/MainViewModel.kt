package com.example.prak3k.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.prak3k.domain.GetDataUseCase

class MainViewModel(private val getDataUseCase: GetDataUseCase) : ViewModel() {

    private val _data = MutableLiveData<String>()
    val data: LiveData<String> get() = _data

    fun fetchData() {
        _data.value = getDataUseCase.execute()
    }
}
