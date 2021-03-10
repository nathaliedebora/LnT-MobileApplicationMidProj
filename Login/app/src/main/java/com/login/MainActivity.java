package com.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText email, pass;
    Button login;
    TextView btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.email);
        pass = findViewById(R.id.pass);

        login = findViewById(R.id.login);

        btn = findViewById(R.id.btn);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mail, pas;

                mail = email.getText().toString();
                pas = pass.getText().toString();

                if(mail.equals("")){
                    Toast.makeText( MainActivity.this, "Email is blank", Toast.LENGTH_LONG).show();
                }

                else if(pas.equals("")){
                    Toast.makeText(MainActivity.this, "Pass is blank", Toast.LENGTH_LONG).show();
                }
                else{

                }
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Registration.class);
                startActivity(i);
                finish();

            }
        });

    }
}