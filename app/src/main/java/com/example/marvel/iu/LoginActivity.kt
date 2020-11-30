package com.example.marvel.iu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.marvel.R
import kotlinx.android.synthetic.main.activity_login.*
import java.math.BigInteger
import java.security.MessageDigest

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

        /*"6eb7e8896ec5850c52515a8a23ee97f0",
        "40a3aa568bb269dfad85ae0c4a297181"*/


    }


    fun md5(input:String): String {
        val md = MessageDigest.getInstance("MD5")
        return BigInteger(1, md.digest(input.toByteArray())).toString(16).padStart(32, '0')
    }

    fun carregarTelaInicial(){
        var intent = Intent(this, ListaHQActivity::class.java)
        startActivity(intent)
    }

    fun carregarTelaCadastro(){
        Log.i("CHAVE", md5("10dd0c16fedb8a02985977eafca66b49f5e6a526f6eb7e8896ec5850c52515a8a23ee97f0"))
        var intent = Intent(this, CadastroActivity::class.java)
        startActivity(intent)
    }
}