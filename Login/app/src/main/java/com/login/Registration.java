package com.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Registration extends AppCompatActivity {

    EditText username, email, pass, compass;
    Button reg;
    TextView lbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);

        username = findViewById(R.id.username);
        email = findViewById(R.id.email);
        pass = findViewById(R.id.pass);
        compass = findViewById(R.id.compass);

        reg = findViewById(R.id.reg);
        lbtn = findViewById(R.id.lbtn);

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Username, Email, Pass, Compass;

                Username = username.getText().toString();
                Email = email.getText().toString();
                Pass = pass.getText().toString();
                Compass = compass.getText().toString();
                
                if(Username.equals(""));{
                    Toast.makeText(Registration.this, "Username is blank", Toast.LENGTH_SHORT).show();
                }
                if(Email.equals(""));{
                    Toast.makeText(Registration.this, "Email is blank", Toast.LENGTH_LONG).show();
                }
                if(Pass.equals(""));{
                    Toast.makeText(Registration.this, "Password is blank", Toast.LENGTH_LONG).show();
                }
                if(Compass.equals(""));{
                    Toast.makeText(Registration.this, "Confirmation Password is blank", Toast.LENGTH_SHORT).show();
                }
            }
        });
        lbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent R = new Intent(Registration.this, MainActivity.class);
                startActivity(R);
                finish();
            }
        });



    }
}