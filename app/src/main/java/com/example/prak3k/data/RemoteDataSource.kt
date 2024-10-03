package com.example.prak3k.data

class RemoteDataSource : DataSource {

    override fun fetchData(): String {
        // Здесь могут быть сетевые запросы или доступ к базе данных
        return "Sample Data from Remote Source"
    }
}
