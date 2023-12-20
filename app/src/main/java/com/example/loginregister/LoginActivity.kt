package com.example.loginregister

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.L_bt_1
import kotlinx.android.synthetic.main.activity_login.L_img_1
import kotlinx.android.synthetic.main.activity_login.txt_regis
import kotlinx.android.synthetic.main.activity_main.bt_1
import kotlinx.android.synthetic.main.activity_register.R_bt_1
import kotlinx.android.synthetic.main.activity_register.txt_login

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

        btnBackLoginListener()
        txtRegisListener()
        btnLoginListener()
    }

    private fun btnBackLoginListener(){
        L_img_1.setOnClickListener{
            startActivities(arrayOf(Intent(this, MainActivity::class.java)))
        }
    }
    private fun txtRegisListener(){
        txt_regis.setOnClickListener{
            startActivities(arrayOf(Intent(this, RegisterActivity::class.java)))
        }
    }

    private fun btnLoginListener(){
        L_bt_1.setOnClickListener{
            startActivities(arrayOf(Intent(this, beritaku::class.java)))
        }
    }

}