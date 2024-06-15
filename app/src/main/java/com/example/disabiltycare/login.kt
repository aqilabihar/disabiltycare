package com.example.disabiltycare

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val usernameLayout = findViewById<TextInputLayout>(R.id.til_username)
        val passwordLayout = findViewById<TextInputLayout>(R.id.til_password)
        val loginButton = findViewById<Button>(R.id.btn_login)
        val signupTextView = findViewById<TextView>(R.id.tv_signup)
        val username = usernameLayout.editText?.text.toString()
        val password = passwordLayout.editText?.text.toString()
        loginButton.setOnClickListener {
            // 1. Get username and password from EditTexts
            startActivity(Intent(this, MainActivity::class.java))

            // 2. Perform login logic (e.g., authentication against a server)
            // ... Your login logic here ...

            // 3. If login successful, navigate to the next screen
            // ... Start the appropriate Activity or Fragment ...
        }

        signupTextView.setOnClickListener {
            // Start the Signup Activity or show a Signup Fragment
            startActivity(Intent(this, signup::class.java))
            // ... Or handle signup logic here ...
        }
    }
}