package com.example.cropcare

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.cropcare.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var etUserMobileNumber: EditText
    private lateinit var etUserPassword: EditText
    private lateinit var btnLogIn: Button
    private lateinit var btnGuest: Button

    private val validUserNum = 9693278015
    private val validUserPass = "nishant"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        etUserMobileNumber =findViewById(R.id.edt_number)
        etUserPassword = findViewById(R.id.edt_password)
        btnGuest = findViewById(R.id.btn_guest)
        btnLogIn = findViewById(R.id.btn_login)

        btnGuest.setOnClickListener {
            Toast.makeText(this, "Logging in as a Guest", Toast.LENGTH_SHORT).show()
            val intent = Intent(this@LoginActivity, MainActivity::class.java)
            startActivity(intent)
        }
        btnLogIn.setOnClickListener{

            if(etUserMobileNumber.text.toString() == validUserNum.toString() && etUserPassword.text.toString() == validUserPass){
                Toast.makeText(this, "Logging in as an admin", Toast.LENGTH_SHORT).show()
                val intent = Intent(this@LoginActivity, MainActivity::class.java)
                startActivity(intent)
            }
            else{
                Toast.makeText(this, "You are not an admin", Toast.LENGTH_SHORT).show()
            }

        }

    }
}