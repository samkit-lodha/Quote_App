package com.example.quoteapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.quoteapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var viewModel : MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModel = ViewModelProvider(this,MainViewModelFactory(4)).get(MainViewModel::class.java)

        binding.quote = viewModel.quoteList[viewModel.index]

        binding.nextButton.setOnClickListener {
            viewModel.increment()
            setText()
        }

        binding.previousButton.setOnClickListener {
            viewModel.decrement()
            setText()
        }
    }

    private fun setText() {
        binding.quote = viewModel.quoteList[viewModel.index]
    }
}