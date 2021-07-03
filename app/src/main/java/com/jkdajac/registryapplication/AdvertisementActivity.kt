package com.jkdajac.registryapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_advertisement.*

class AdvertisementActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_advertisement)
        ivBack.setOnClickListener {
            var intent = Intent(this, AdvertisementActivity::class.java)
            startActivity(intent)
        }
    }
}