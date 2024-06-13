package com.example.disabiltycare

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class splashscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splashscreen)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Add the fade-out animation for your ImageView if needed
        // iv_note.alpha = 0f

        splashScreen.setOnExitAnimationListener { splashScreenView ->
            Handler(Looper.getMainLooper()).postDelayed({
                // Start the login activity
                startActivity(Intent(this, login::class.java))

                // Finish the splash activity to prevent going back to it
                finish()

                // Remove the splash screen view
                splashScreenView.remove()
            }, 2000) // Adjust the delay (in milliseconds) as needed
        }
    }
}