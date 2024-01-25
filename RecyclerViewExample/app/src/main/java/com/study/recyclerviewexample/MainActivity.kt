package com.study.recyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.study.recyclerviewexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val list = ArrayList<Item>()
        list.add(Item("안녕하세요"))
        list.add(Item("감사해요"))
        list.add(Item("잘있어요"))
        list.add(Item("다시 만나요"))
    }
}