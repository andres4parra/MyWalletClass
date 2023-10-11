package com.fabiansuarez.mywallet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        Button boton  = findViewById(R.id.btn_register);
        boton.setOnClickListener(new View.OnClickListener()){
            public void onClick(View v){
                Intent intent= new Intent(this , RegisterActivity);
                startActivity(intent);
            }
        }
    }
}