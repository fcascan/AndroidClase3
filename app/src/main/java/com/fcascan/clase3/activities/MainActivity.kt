package com.fcascan.clase3.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fcascan.clase3.R
import com.fcascan.clase3.entities.PlayerRepository
import com.fcascan.clase3.entities.User
import com.fcascan.clase3.entities.UserRepository

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
    }
}