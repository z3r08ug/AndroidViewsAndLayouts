package dev.uublabs.androidviewsandlayouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    private WebView wv;
    private static final String TAG = "MainActivityTAG";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void goToSecondActivity(View view)
    {
        Log.d(TAG, "goToSecondActivity: ");

        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }

    public void savePersonName(View view)
    {

    }
}
