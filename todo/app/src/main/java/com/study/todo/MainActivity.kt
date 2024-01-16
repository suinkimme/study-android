package com.study.todo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.study.todo.databinding.ActivityAddBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}