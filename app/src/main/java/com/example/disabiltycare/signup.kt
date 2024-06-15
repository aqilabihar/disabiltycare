package com.example.disabiltycare

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputLayout

class signup : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup)

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

        val nameInputLayout = findViewById<TextInputLayout>(R.id.til_name)
        val emailInputLayout = findViewById<TextInputLayout>(R.id.til_email)
        val passwordInputLayout = findViewById<TextInputLayout>(R.id.til_password)
        val confirmPasswordInputLayout = findViewById<TextInputLayout>(R.id.til_confirm_password)
        val signupButton = findViewById<Button>(R.id.btn_signup)

        signupButton.setOnClickListener {
            // 1. Get values from input fields
            val name = nameInputLayout.editText?.text.toString()
            val email = emailInputLayout.editText?.text.toString()
            val password = passwordInputLayout.editText?.text.toString()
            val confirmPassword = confirmPasswordInputLayout.editText?.text.toString()
            startActivity(Intent(this, login::class.java))

            // 2. Perform validation (check if passwords match, etc.)
            // ... Your validation logic here ...

            // 3. If validation successful, proceed with signup logic
            // (e.g., send data to server, create user account)
            // ... Your signup logic here ...
        }
    }
}