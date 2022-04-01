package com.example.week10_lut_oop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    WebView web;
    EditText textBox;
    Button searchButton;
    Button refreshButton;
    Button shoutOutButton;
    Button initializeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        web = findViewById(R.id.webView);
        textBox = (EditText) findViewById(R.id.editText);
        searchButton = (Button) findViewById(R.id.searchButton);
        refreshButton = (Button) findViewById(R.id.refreshButton);
        shoutOutButton = (Button) findViewById(R.id.shoutOutButton);
        initializeButton = (Button) findViewById(R.id.initializeButton);

        web.setWebViewClient(new WebViewClient());
        web.getSettings().setJavaScriptEnabled(true);


        web.loadUrl("file:///android_asset/index.html");
    }


    public void loadURL (View v) { web.loadUrl("http://" + textBox.getText()); }

    public void refreshPage (View v) { web.reload(); }

    public void shoutOut (View v) { web.evaluateJavascript("javascript:shoutOut()", null); }

    public void initialize (View w) { web.evaluateJavascript("javascript:initialize()", null); }
}