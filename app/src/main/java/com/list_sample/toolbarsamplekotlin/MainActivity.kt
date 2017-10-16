package com.list_sample.toolbarsamplekotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById(R.id.toolbar_activity_main) as android.support.v7.widget.Toolbar
        setSupportActionBar(toolbar)
    }
}
