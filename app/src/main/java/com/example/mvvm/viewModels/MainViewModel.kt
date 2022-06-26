package com.example.mvvm.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvm.model.domin.User
import com.example.mvvm.model.domin.Wisdom
import com.example.mvvm.model.repository.MainRepository

class MainViewModel : ViewModel() {
    //repository reference
    private val repository =MainRepository()

    //MutableLiveData it is  like steam of data dependent on observer design pattern
    // we used this way to encapsulate mutable live data
      private val _currentUser = MutableLiveData<User>()
     val currentUser : LiveData<User>
        get() = _currentUser

     private val _wisdom = MutableLiveData<Wisdom>()
     val wisdom : LiveData<Wisdom>
        get() = _wisdom

    fun getUserInfo(){
       _currentUser.postValue(repository.getCurrentUser())
    }

    fun getAWisdom(){
        _wisdom.postValue(repository.getRandomWisdom())
    }
}