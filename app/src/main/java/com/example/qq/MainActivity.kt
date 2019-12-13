package com.example.qq

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //『選擇』按鈕點擊監聽
        btn_enter.setOnClickListener {
            //透過startActivityForResult發出Intent，並紀錄請求對象
            startActivityForResult(Intent(this, Main2Activity::class.java),1)

            Toast.makeText(this, "什麼都有！\n什麼都賣！\n什麼都不奇怪！", Toast.LENGTH_SHORT).show()


        }
    }
}
