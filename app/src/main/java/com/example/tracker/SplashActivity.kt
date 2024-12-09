package com.example.BudgetBuddyApp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.tracker.R

// SplashActivity.kt
@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Navigate to MainActivity after a delay
        Handler(Looper.getMainLooper()).postDelayed({
                                                        val intent = Intent(this, MainActivity::class.java)
                                                        startActivity(intent)
                                                        finish()
                                                    } , 2000) // 2 seconds delay
    }
}