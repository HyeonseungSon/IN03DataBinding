package com.hyeonseungson.in03databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.hyeonseungson.in03databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // 1번 방식 : findViewById
        val btn = findViewById<Button>(R.id.testBtnId1)
        btn.setOnClickListener {
            Toast.makeText(this, "Click01", Toast.LENGTH_SHORT).show()
        }

        // 2번 방식 : DataBinding
        binding.testBtnId2.setOnClickListener{
            Toast.makeText(this, "Click02", Toast.LENGTH_SHORT).show()
        }

        for (item in 1..10 step 2) {
            Log.d("MainActivity", "item : $item")
        }

        Log.e("error", "오류")
        Log.w("warning", "경고")
        Log.i("information", "정보")
        Log.d("debug", "디버그")
        Log.v("view", "상세보기")

        Log.e("Test", "시험")
        Log.w("Test", "시험")
        Log.i("Test", "시험")
        Log.d("Test", "시험")
        Log.v("Test", "시험")
    }
}