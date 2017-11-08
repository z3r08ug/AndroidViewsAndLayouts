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
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{

    private WebView wv;
    private static final String TAG = "MainActivityTAG";
    private EditText etFirstName;
    private EditText etLastName;
    private TextView tvPersonName;
    private List<Person> personList;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindViews();


        personList = new ArrayList<>();
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
        String firstName = etFirstName.getText().toString();
        String lastName = etLastName.getText().toString();

        Person person = new Person(firstName, lastName);
        personList.add(person);

        Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show();
    }

    public void displayPersons(View view)
    {
        tvPersonName.setText(personList.toString());
    }
}
