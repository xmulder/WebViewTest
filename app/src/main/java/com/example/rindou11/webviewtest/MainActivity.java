package com.example.rindou11.webviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;


//记得AndroidManifest里面添加权限
public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView=(WebView)findViewById(R.id.web_view);

        //设置webview属性
        webView.getSettings().setJavaScriptEnabled(true);

        //始终在自建的webview中打开网址而不是调用系统浏览器,非常重要
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.google.com");
    }
}
