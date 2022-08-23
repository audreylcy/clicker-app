package com.example.election;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebViewClient;
import android.widget.Toast;
import android.annotation.TargetApi;

public class Selecta extends Activity {
    private WebView mWebView;
    private int count;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieved);
        mWebView = new WebView(this);
        String userqn = getIntent().getStringExtra("count");
        mWebView.getSettings().setJavaScriptEnabled(true);
        final Activity activity = this;
        mWebView.setWebViewClient(new WebViewClient() {
            @SuppressWarnings("deprecation")
            @Override
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                Toast.makeText(activity, description, Toast.LENGTH_SHORT).show();
            }

            @TargetApi(Build.VERSION_CODES.M)
            @Override
            public void onReceivedError(WebView view, WebResourceRequest req, WebResourceError rerr) {
                // Redirect to deprecated method, so you can use it in all SDK versions
                onReceivedError(view, rerr.getErrorCode(), rerr.getDescription().toString(), req.getUrl().toString());
            }
        });

        mWebView.loadUrl("http://10.27.190.170:9999/clicker/select?question=" +userqn+ "&choice=a");


        //Intent intent = new Intent(Selecta.this, QuizActivity2.class);
        //startActivity(intent);
    }
}
