package com.example.loginregister

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.L_img_1
import kotlinx.android.synthetic.main.activity_register.R_bt_1
import kotlinx.android.synthetic.main.activity_register.R_img_2
import kotlinx.android.synthetic.main.activity_register.txt_login

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        supportActionBar?.hide()

        btnBackRegisListener()
        txtLoginListener()
        btnRegisListener()
    }

    private fun btnBackRegisListener(){
        R_img_2.setOnClickListener{
            startActivities(arrayOf(Intent(this, MainActivity::class.java)))
        }
    }

    private fun txtLoginListener(){
        txt_login.setOnClickListener{
            startActivities(arrayOf(Intent(this, LoginActivity::class.java)))
        }
    }
    private fun btnRegisListener(){
        R_bt_1.setOnClickListener{
            startActivities(arrayOf(Intent(this, LoginActivity::class.java)))
        }
    }
}