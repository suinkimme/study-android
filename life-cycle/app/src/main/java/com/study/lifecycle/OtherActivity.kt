package com.study.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class OtherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        Log.d("checkActivity", "OtherActivity onCreate");
    }

    override fun onStart() {
        super.onStart()

        Log.d("checkActivity", "OtherActivity onStart")
    }

    override fun onResume() {
        super.onResume()

        Log.d("checkActivity", "OtherActivity onResume")
    }

    override fun onPause() {
        super.onPause()

        Log.d("checkActivity", "OtherActivity onPause")
    }

    override fun onStop() {
        super.onStop()

        Log.d("checkActivity", "OtherActivity onStop")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("checkActivity", "OtherActivity onDestroy")
    }
}