package com.antarpanen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pageUrl = "https://antarpanen.com/"
        launchWebView.setOnClickListener {
            val intent = WebActivity.newIntent(this, pageUrl)
            startActivity(intent)
        }
    }

}
