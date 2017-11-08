package dev.uublabs.androidviewsandlayouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    private WebView wv;
    private static final String TAG = "MainActivityTAG";
    private EditText etFirstName;
    private EditText etLastName;
    private TextView tvPersonName;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindViews();
    }

    private void bindViews()
    {
        etFirstName = findViewById(R.id.etFirstName);
        etLastName = findViewById(R.id.etLastName);
        tvPersonName = findViewById(R.id.tvPersonName);
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
