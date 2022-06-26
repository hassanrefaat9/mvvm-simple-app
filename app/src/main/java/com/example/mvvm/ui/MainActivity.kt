package com.example.mvvm.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.mvvm.databinding.ActivityMainBinding
import com.example.mvvm.viewModels.MainViewModel

class MainActivity : AppCompatActivity() {
    //view binding
    lateinit var binding : ActivityMainBinding
    //view model reference
    private val viewModel : MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setup()

    }
    fun setup(){
        viewModel.getUserInfo()
        binding.mainBtnFetchWisdom.setOnClickListener{
            viewModel.getAWisdom()
        }

        viewModel.currentUser.observe(this) {
            binding.mainTvUserName.text = it.userName
        }

        viewModel.wisdom.observe(this) {
            binding.apply {
                mainTvDate.text=it.publishDate
                mainTvContent.text=it.content
            }
        }
    }

}





