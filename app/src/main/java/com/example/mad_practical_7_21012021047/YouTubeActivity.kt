package com.example.mad_practical_7_21012021047

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView

class YouTubeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_you_tube)

        val youtubeID = "fJn9B64Znrk"
        val youtubeWebView : WebView=findViewById(R.id.webview)
        val webSettings:WebSettings = youtubeWebView.settings
        webSettings.javaScriptEnabled = true
        webSettings.loadWithOverviewMode = true
        webSettings.useWideViewPort = true
        youtubeWebView.loadUrl("https://www.youtube.com/embed/$youtubeID")
    }
}