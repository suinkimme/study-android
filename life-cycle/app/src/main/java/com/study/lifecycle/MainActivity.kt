package com.study.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("checkActivity", "onCreate")
    }

    override fun onStart() {
        super.onStart()

        Log.d("checkActivity", "onStart")
    }

    override fun onResume() {
        super.onResume()

        Log.d("checkActivity", "onResume")
    }

    override fun onPause() {
        super.onPause()

        Log.d("checkActivity", "onPause")
    }

    override fun onStop() {
        super.onStop()

        Log.d("checkActivity", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("checkActivity", "onDestroy")
    }
}