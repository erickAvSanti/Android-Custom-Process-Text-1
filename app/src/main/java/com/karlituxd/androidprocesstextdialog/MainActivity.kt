package com.karlituxd.androidprocesstextdialog

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = intent
            .getCharSequenceExtra(Intent.EXTRA_PROCESS_TEXT)

        if(text != null && !text.isEmpty()){
            findViewById<TextView>(R.id.my_text).text = "Selected text = $text"
        }
    }
}