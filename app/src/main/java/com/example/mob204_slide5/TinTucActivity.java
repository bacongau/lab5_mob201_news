package com.example.mob204_slide5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Toast;

public class TinTucActivity extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tin_tuc);

        webView = findViewById(R.id.webView1);

        Intent intent = getIntent();
        String linktin = intent.getStringExtra("linktintuc");
        Toast.makeText(this, linktin, Toast.LENGTH_SHORT).show();
        webView.loadUrl(linktin);
    }
}