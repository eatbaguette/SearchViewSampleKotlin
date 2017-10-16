package com.list_sample.toolbarsamplekotlin

import android.nfc.Tag
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.MenuItemCompat
import android.util.Log
import android.view.Menu
import android.widget.SearchView
import android.widget.Toolbar

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById(R.id.toolbar_activity_main) as android.support.v7.widget.Toolbar
        toolbar.inflateMenu(R.menu.search)
        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.search, menu)
        val searchItem = menu!!.findItem(R.id.search_view)
        return true
    }

    val listener = SearchView.OnQueryTextListene
    }
}
