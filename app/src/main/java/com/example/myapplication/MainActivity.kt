package com.example.myapplication

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private val IMG_REQUEST_CODE = 1
    private lateinit var img: ImageView

    companion object{
        val res2 = 2
        private const val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.btn).setOnClickListener {
            val photoPicker = Intent(Intent.ACTION_PICK)
            photoPicker.type = "image/*"
            startActivityForResult(photoPicker, IMG_REQUEST_CODE)
        }
        img = findViewById(R.id.img)

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)


        Log.d(TAG, "onActivityResult() called with: requestCode = $requestCode, resultCode = $resultCode, data = $data")
        if (requestCode == IMG_REQUEST_CODE && resultCode == Activity.RESULT_OK && data != null) {
            data.data?.let { uri ->
                val inputStream = contentResolver.openInputStream(uri)
                val bitmap = BitmapFactory.decodeStream(inputStream)
                img.setImageBitmap(bitmap)
            }

        }

    }
}