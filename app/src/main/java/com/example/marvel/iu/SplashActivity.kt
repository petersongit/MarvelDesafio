package com.example.marvel.iu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.marvel.R

@Suppress("DEPRECATION")
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            startActivity(Intent(this,ListaHQActivity::class.java))
            carregarTelaLogin()

            finish()
        }, 3000)
    }

    fun carregarTelaLogin(){
        var intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }

}