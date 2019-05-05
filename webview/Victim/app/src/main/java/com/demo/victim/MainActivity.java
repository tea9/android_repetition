package com.demo.victim;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView webView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        webView = new WebView(this);
        setContentView(webView);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setAllowFileAccess(true);
        Intent mIntent = this.getIntent();
        Bundle bundle = mIntent.getBundleExtra("bundle");
        String url = bundle.getString("url");
//        if (url.startsWith("file://")){
//            webView.getSettings().setJavaScriptEnabled(false);
//        } else {
//            webView.getSettings().setJavaScriptEnabled(true);
//        }
        webView.loadUrl(url);
    }
}
