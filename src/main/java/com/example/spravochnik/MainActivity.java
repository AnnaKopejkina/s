package com.example.spravochnik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button = findViewById(R.id.Button);

    Button.setOnClickListener(listener -> ){
        Intent intent = new Intent(getApplicationContext(), Sprav.class);
        startActivity(intent);
        }
    }
}