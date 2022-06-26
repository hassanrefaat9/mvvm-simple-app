package com.example.mvvm.model.repository

import com.example.mvvm.model.FakeApiService
import com.example.mvvm.model.FakeDatabase

class MainRepository {
    //data source reference
    private val api =FakeApiService()
    private val database = FakeDatabase()

    //functions to get date from data source
    fun getCurrentUser() = database.getCurrentUser()

    fun getRandomWisdom() = api.getRandomWisdom()
}