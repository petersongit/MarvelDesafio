package com.example.marvel.iu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.marvel.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // this.requestWindowFeature(Window.FEATURE_NO_TITLE)

        lblAcessarTelaDeCadastro.setOnClickListener{
            carregarTelaCadastro()
        }

        btnTelaInicial.setOnClickListener{
            carregarTelaInicial()
        }

    }



    fun carregarTelaInicial(){
        var intent = Intent(this, ListaHQActivity::class.java)
        startActivity(intent)
    }

    fun carregarTelaCadastro(){
        var intent = Intent(this, CadastroActivity::class.java)
        startActivity(intent)
    }
}