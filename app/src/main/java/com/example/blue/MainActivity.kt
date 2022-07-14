package com.example.blue

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {

lateinit var btnLogin:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnLogin = findViewById(R.id.loginbutton)
btnLogin.setOnClickListener(View.OnClickListener {

    var intent = Intent(this,MainActivity2::class.java)

    startActivity(intent)

})

    }


}