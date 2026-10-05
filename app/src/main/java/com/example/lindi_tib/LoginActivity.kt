package com.example.lindi_tib

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.lindi_tib.databinding.ActivityLoginBinding


class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

//        val tombolLogin : Button=findViewById(R.id.btnlogin)
//        val username : EditText=findViewById(R.id.edtusn)
//        val password : EditText=findViewById(R.id.edtpass)

        binding.btnlogin.setOnClickListener {
            val user = binding.edtusn.text.toString()
            val pass = binding.edtpass.text.toString()
            Log.e("Hasil", "username $user password $pass")


            Toast.makeText(this, "username $user password $pass", Toast.LENGTH_LONG).show()

            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("username", user)
            intent.putExtra("password", pass)
            intent.putExtra("umur", 21)
            startActivity(intent)
        }
    }
}