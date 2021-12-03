package com.example.myapplication;

import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    WebView myWebView = (WebView) findViewById(R.id.view1);
    WebSettings webSettings = myWebView.getSettings();



    myWebView.setWebViewClient(new WebViewClient()); // 클릭시 새창 안뜨게
    webSettings.setJavaScriptEnabled(true); // 웹페이지 자바스클비트 허용 여부
    webSettings.setSupportMultipleWindows(false); // 새창 띄우기 허용 여부
    webSettings.setJavaScriptCanOpenWindowsAutomatically(false); // 자바스크립트 새창 띄우기(멀티뷰) 허용 여부
    webSettings.setLoadWithOverviewMode(true); // 메타태그 허용 여부
    webSettings.setUseWideViewPort(true); // 화면 사이즈 맞추기 허용 여부
    webSettings.setSupportZoom(false); // 화면 줌 허용 여부
    webSettings.setBuiltInZoomControls(false); // 화면 확대 축소 허용 여부
    webSettings.setCacheMode(WebSettings.LOAD_NO_CACHE); // 브라우저 캐시 허용 여부
    webSettings.setDomStorageEnabled(true); // 로컬저장소 허용 여부


    myWebView.loadUrl("https://master.d3jnb7ufp0dcv9.amplifyapp.com/");

  }
}