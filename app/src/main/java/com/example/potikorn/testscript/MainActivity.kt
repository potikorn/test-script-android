package com.example.potikorn.testscript

import android.content.Intent
import android.content.res.Configuration
import android.content.res.Resources
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.util.DisplayMetrics
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

import java.util.Locale

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_swap_en.setOnClickListener { setLocale(this, "en") }
        btn_swap_de.setOnClickListener { setLocale(this, "de") }
        btn_next_page.setOnClickListener { startActivity(Intent(this, SecondActivity::class.java)) }

    }
}
