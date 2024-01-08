package com.study.lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.study.lifecycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d("checkActivity", "onCreate")

        val goToOtherActivityButton = binding.goToOtherActivityButton
        goToOtherActivityButton.setOnClickListener {
            val intent = Intent(this, OtherActivity::class.java);
            startActivity(intent)
        }
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