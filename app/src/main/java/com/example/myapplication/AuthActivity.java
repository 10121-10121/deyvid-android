package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.models.Users;

public class AuthActivity extends AppCompatActivity {

    Button btnLogin;
    EditText txtUsuario;
    EditText txtContraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);
        btnLogin = findViewById(R.id.btnLogin);
        txtUsuario = findViewById(R.id.txtUsuario);
        txtContraseña = findViewById(R.id.txtContraseña);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( Users.passwordIsValid(txtUsuario.getText().toString(), txtContraseña.getText().toString()) ) {
                    Intent o = new Intent(AuthActivity.this,
                            menuActivity.class);
                    startActivity(o);
                }

            }
        });

    }


}