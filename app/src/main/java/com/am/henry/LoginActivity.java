package com.am.henry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button loginButton;
    private EditText edtLogin,edtSenha;
    private Intent MainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtLogin = (EditText) findViewById(R.id.edt_email);
        edtSenha = (EditText) findViewById(R.id.edt_password);
        MainActivity = new Intent(this, com.am.henry.MainActivity.class);
        loginButton = findViewById(R.id.btn_login);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mail = edtLogin.getText().toString();
                String password = edtSenha.getText().toString();

                if(mail.isEmpty() || password.isEmpty()){
                    showMessage("Please verify all fields");
                }else{
                    if (mail.equals("caue@mail.com") && password.equals("123")) {
                        //https://developer.android.com/training/id-auth/authenticate#java
                        showMessage("Login realizado com sucesso");
                        launchMainActivity(v);
                        finish();
                    }else{
                        showMessage("Usuário invalido e/ou senha invalido");
                    }
                }
            }
        });
    }

    public void launchMainActivity(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    private void showMessage(String text) {
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();
    }
}
