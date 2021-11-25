package com.example.direccionarotros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void facebook(View view) {
        Intent face = getPackageManager().getLaunchIntentForPackage("com.facebook.katana");
        startActivity(face);
    }

    public void pjazul(View view) {
        Intent face = getPackageManager().getLaunchIntentForPackage("com.twitter.android");
        startActivity(face);
    }

    public void insta(View view) {
        try {
            Intent face = getPackageManager().getLaunchIntentForPackage("com.instagram.android");
            startActivity(face);
        }
        catch (Exception e)
        {
            Toast.makeText(this, e.getMessage().toString(), Toast.LENGTH_SHORT).show();
        }
    }

    public void steam(View view) {
        Intent face = getPackageManager().getLaunchIntentForPackage("com.valvesoftware.android.steam.community");
        startActivity(face);
    }
}