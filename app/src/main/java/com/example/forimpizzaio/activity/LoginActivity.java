package com.example.forimpizzaio.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.forimpizzaio.R;


public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnLogin;
    private EditText edtLogin, edtSenha;
    private TextView txtCadastroClique;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtCadastroClique = findViewById(R.id.txtCadastroClique);
        txtCadastroClique.setOnClickListener(this);

        edtLogin = findViewById(R.id.edtLogin);
        edtSenha = findViewById(R.id.edtSenha);

        btnLogin = findViewById(R.id.btLogin);
        btnLogin.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.txtCadastroClique:
                
                break;
            case R.id.btLogin:
                Intent login = new Intent(this, MainActivity.class);
                startActivity(login);
                break;
        }
    }
}
