package com.example.rohitkumarbhamu.successcec;

import android.webkit.WebView;
import android.webkit.WebViewClient;

class ourViewClient extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView v, String url) {
        v.loadUrl(url);
        return true;
    }
}
