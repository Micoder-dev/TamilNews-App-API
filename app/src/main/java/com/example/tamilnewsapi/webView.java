package com.example.tamilnewsapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webView extends AppCompatActivity {

    WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        mWebView = findViewById(R.id.webview);

        Intent intent = getIntent();
        String url = intent.getStringExtra("url");

        mWebView.setWebViewClient(new WebViewClient());
        mWebView.loadUrl(url);

    }
}