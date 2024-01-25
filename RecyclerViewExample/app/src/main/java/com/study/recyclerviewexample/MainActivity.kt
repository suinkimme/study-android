package com.study.recyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.study.recyclerviewexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val items = listOf(
        Item("안녕하세요"),
        Item("감사해요"),
        Item("잘 있어요"),
        Item("다시 만나요"),
        Item("안녕하세요"),
        Item("감사해요"),
        Item("잘 있어요"),
        Item("다시 만나요"),
        Item("아침해가 뜨면"),
        Item("매일 같은 사람들과"),
        Item("또 다시"),
        Item("새로운 하루 일을"),
        Item("시작해"),
        Item("안녕하세요"),
        Item("감사해요"),
        Item("잘 있어요"),
        Item("다시 만나요"),
        Item("안녕하세요"),
        Item("감사해요"),
        Item("잘 있어요"),
        Item("다시 만나요"),
        Item("아침해가 뜨면"),
        Item("매일 같은 사람들과"),
        Item("또 다시"),
        Item("새로운 하루 일을"),
        Item("시작해"),
        Item("안녕하세요"),
        Item("감사해요"),
        Item("잘 있어요"),
        Item("다시 만나요"),
        Item("안녕하세요"),
        Item("감사해요"),
        Item("잘 있어요"),
        Item("다시 만나요"),
        Item("아침해가 뜨면"),
        Item("매일 같은 사람들과"),
        Item("또 다시"),
        Item("새로운 하루 일을"),
        Item("시작해"),
        Item("안녕하세요"),
        Item("감사해요"),
        Item("잘 있어요"),
        Item("다시 만나요"),
        Item("안녕하세요"),
        Item("감사해요"),
        Item("잘 있어요"),
        Item("다시 만나요"),
        Item("아침해가 뜨면"),
        Item("매일 같은 사람들과"),
        Item("또 다시"),
        Item("새로운 하루 일을"),
        Item("시작해"),
        Item("안녕하세요"),
        Item("감사해요"),
        Item("잘 있어요"),
        Item("다시 만나요"),
        Item("안녕하세요"),
        Item("감사해요"),
        Item("잘 있어요"),
        Item("다시 만나요"),
        Item("아침해가 뜨면"),
        Item("매일 같은 사람들과"),
        Item("또 다시"),
        Item("새로운 하루 일을"),
        Item("시작해"),
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initViews()
    }

    private fun initViews() {
        binding.recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.recyclerView.adapter = Adapter(items)
    }
}