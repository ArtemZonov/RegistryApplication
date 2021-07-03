package com.jkdajac.registryapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.VISIBLE
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    val loginValid : String = "Ivan"
    val passwordValid : String = "1"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var login: String = etLogin.text.toString()
        var password: String = etPassword.text.toString()

        btEnter.setOnClickListener {
            if (login.equals(loginValid)) {
                var intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            } else {
                tvInfoRegistry.text = " Invalid login or password "
            }
        }

    }


        }



