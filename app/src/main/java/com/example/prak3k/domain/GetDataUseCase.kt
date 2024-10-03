package com.example.prak3k.domain

import com.example.prak3k.data.DataRepository

class GetDataUseCase(private val dataRepository: DataRepository) {

    fun execute(): String {
        return dataRepository.getData()
    }
}
