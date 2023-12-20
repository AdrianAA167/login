package com.example.loginregister

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.bt_1
import kotlinx.android.synthetic.main.activity_main.bt_2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        btnLoginListener()
        btnRegisListener()
    }
    private fun btnLoginListener(){
        bt_1.setOnClickListener{
            startActivities(arrayOf(Intent(this, LoginActivity::class.java)))
        }
    }
    private fun btnRegisListener(){
        bt_2.setOnClickListener{
            startActivities(arrayOf(Intent(this, RegisterActivity::class.java)))
        }
    }
}