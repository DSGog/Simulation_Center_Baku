package com.example.simulationcenterbaku;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

import kotlin.coroutines.CoroutineContextImplKt;

public class MainActivity extends AppCompatActivity {
    private WebView webView;

    //пытаюсь вспомнить как работать с гитом
CoroutineContextImplKt
{
    git
}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webView);

        // Включение JavaScript
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Установка WebViewClient для обработки переходов внутри WebView
        webView.setWebViewClient(new WebViewClient());

        // Загрузка URL
        webView.loadUrl("https://simcenter.az/az/");
    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}