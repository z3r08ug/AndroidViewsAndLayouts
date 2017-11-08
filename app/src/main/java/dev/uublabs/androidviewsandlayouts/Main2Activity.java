package dev.uublabs.androidviewsandlayouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main2Activity extends AppCompatActivity
{

    private WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        wv = findViewById(R.id.wvMain);

//        setup webview
        WebSettings webSettings = wv.getSettings();
        WebViewClient wvClient = new WebViewClient();
        webSettings.setJavaScriptEnabled(true);
        wv.setWebViewClient(wvClient);

        wv.loadUrl("https://developer.android.com");
    }
}
