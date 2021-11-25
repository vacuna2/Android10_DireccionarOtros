package com.example.direccionarotros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    EditText edt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        edt = findViewById(R.id.editTextTextPersonName);
    }

    public void Web(View view) {
        Intent i = new Intent(this,MainActivity3.class);
        i.putExtra("web",edt.getText().toString());
        startActivity(i);

    }
}