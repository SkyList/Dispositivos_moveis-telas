package com.skylist.telalogin_aula

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    private val loginCorreto: String = "pantoja"
    private val senhaCorreta: String = "123"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnlogin.setOnClickListener({
            validaLogin( campoLogin, campoSenha)
        })
    }



    private fun validaLogin( login: EditText, senha: EditText){
        if( login.text.toString() == this.loginCorreto && senha.text.toString() == this.senhaCorreta ){
            Toast.makeText( applicationContext,"Entrando...",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText( applicationContext,"Try again!",Toast.LENGTH_SHORT).show();
        }
    }


}
