package com.development.webbrowser;

import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class webbrowser extends AppCompatActivity {

    private WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webbrowser);

        web=(WebView)findViewById(R.id.webView);
        web.getSettings().setLoadsImagesAutomatically(true);
        web.loadUrl("https://www.google.com");
    }
}
