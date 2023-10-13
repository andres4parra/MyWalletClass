package com.fabiansuarez.mywallet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btn1=(Button) findViewById(R.id.btn_log);
        btn2=(Button) findViewById(R.id.btn_reg);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent= new Intent(LoginActivity.this, CategoryActivity.class);
                startActivity(myIntent);

            }

        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent= new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(myIntent);

            }

        });

    }
}