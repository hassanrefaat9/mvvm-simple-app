package com.example.mvvm.model

import com.example.mvvm.model.domin.User

class FakeDatabase {

    fun getCurrentUser(): User {
        return User("Hassan Refaat",2002)
}
}