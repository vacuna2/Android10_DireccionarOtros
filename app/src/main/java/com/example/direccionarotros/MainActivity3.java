package com.example.direccionarotros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity3 extends AppCompatActivity {

    WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        web = findViewById(R.id.webvieww);

        String URL = getIntent().getStringExtra("web");
        web.setWebViewClient(new WebViewClient());
        web.loadUrl("https://" + URL);
    }
}