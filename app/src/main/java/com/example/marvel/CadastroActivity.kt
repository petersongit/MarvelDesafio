package com.example.marvel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cadastro.*

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        setSupportActionBar(toolBarTelaCadastrado)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)



        //imgCadastrar.bringToFront()
    }
}