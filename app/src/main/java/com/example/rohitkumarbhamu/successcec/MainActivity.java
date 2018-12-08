package com.example.rohitkumarbhamu.successcec;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
    EditText url;
    WebView ourBrow;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ourBrow = (WebView) findViewById(R.id.wvBrowser);

        ourBrow.getSettings().setJavaScriptEnabled(true);
        ourBrow.getSettings().setLoadWithOverviewMode(true);
        ourBrow.getSettings().setUseWideViewPort(true);
        ourBrow.setWebViewClient(new ourViewClient());
        try {
            ourBrow.loadUrl("http://successcec.in/");
        }catch (Exception e){
            e.printStackTrace();
        }
    /*    Button go =(Button) findViewById(R.id.bGo);
        Button back = (Button) findViewById(R.id.bBack);
        Button forward = (Button) findViewById(R.id.bForward);
        Button refresh = (Button) findViewById(R.id.bForward);
        Button clearHistory = (Button) findViewById(R.id.bHistory);
         go.setOnClickListener(this);
        back.setOnClickListener(this);
        refresh.setOnClickListener(this);
        forward.setOnClickListener(this);
        clearHistory.setOnClickListener(this);
        url = (EditText) findViewById(R.id.etURL);
      */

    }
/*
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bGo:
                String theWebsite = url.getText().toString();
                ourBrow.loadUrl(theWebsite);
                InputMethodManager imm=(InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(url.getWindowToken(),0);

                break;
            case R.id.bBack:
                if (ourBrow.canGoBack())
                    ourBrow.goBack();
                break;
            case R.id.bForward:
                if(ourBrow.canGoForward())
                    ourBrow.goForward();
                break;
            case R.id.bRefresh:
                ourBrow.reload();
                break;
            case R.id.bHistory:
                ourBrow.clearHistory();
                break;
        }

    }
    */
}
