package com.example.marvel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // this.requestWindowFeature(Window.FEATURE_NO_TITLE)

        lblAcessarTelaDeCadastro.setOnClickListener{
            carregarTelaCadastro()
        }

    }





    fun carregarTelaCadastro(){
        var intent = Intent(this, CadastroActivity::class.java)
        startActivity(intent)
    }
}