package com.example.prak3k.data

class DataRepository(private val dataSource: DataSource) {

    fun getData(): String {
        return dataSource.fetchData()
    }
}
