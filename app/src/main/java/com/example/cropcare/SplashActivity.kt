package com.example.cropcare

import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView

class SplashActivity : AppCompatActivity() {

    private val splashDelay: Long = 3000
    private lateinit var imgSplashIcon: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        imgSplashIcon = findViewById(R.id.app_icon)

        // Start the animation for the splash icon
        val fadeAnimation = ObjectAnimator.ofFloat(imgSplashIcon, "alpha", 0f, 1f)
        fadeAnimation.duration = 2000 // 2 second
        fadeAnimation.start()

        Handler().postDelayed({
            // Start the main activity here
            startActivity(Intent(this@SplashActivity, LoginActivity::class.java))
            finish()
        }, splashDelay)

    }
}