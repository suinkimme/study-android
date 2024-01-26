package com.study.mygallery

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.study.mygallery.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loadImageButton.setOnClickListener {
            checkPermission()
        }
    }

    private fun checkPermission() {
        when {
            ContextCompat.checkSelfPermission(
                this,
                android.Manifest.permission.READ_MEDIA_IMAGES
            ) == PackageManager.PERMISSION_GRANTED -> {
                loadImage()
            }
            shouldShowRequestPermissionRationale(
                android.Manifest.permission.READ_MEDIA_IMAGES
            ) -> {
                showPermissionInfoDialog()
            }
            else -> {
                requestReadMediaImage()
            }
        }
    }

    private fun showPermissionInfoDialog() {
        AlertDialog.Builder(this).apply {
            setMessage("이미지를 가져오기 위해서 외부 저장소 읽기 권한이 필요합니다.")
            setNegativeButton("취소", null)
            setPositiveButton("동의") { _, _ ->
                requestReadMediaImage()
            }
        }.show()
    }

    private fun requestReadMediaImage() {
        ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.READ_MEDIA_IMAGES), REQUEST_READ_MEDIA_IMAGES)
    }

    private fun loadImage() {
        Toast.makeText(this, "이미지를 가져올 예정", Toast.LENGTH_SHORT).show()
    }

    companion object {
        const val REQUEST_READ_MEDIA_IMAGES = 100
    }
}