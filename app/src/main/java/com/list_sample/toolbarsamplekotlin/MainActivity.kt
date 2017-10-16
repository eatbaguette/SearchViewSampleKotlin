package com.list_sample.toolbarsamplekotlin

import android.nfc.Tag
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.MenuItemCompat
import android.text.TextUtils
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
        val searchView = searchItem.actionView as android.support.v7.widget.SearchView

        searchView.setOnQueryTextListener(object: android.support.v7.widget.SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String): Boolean {
                Log.d(TAG, "submitted text is $query")
                return true
            }

            override fun onQueryTextChange(newText: String): Boolean {
                if (!(TextUtils.isEmpty(newText))) {
                    Log.d(TAG, "text is changed $newText")
                }
                return true
            }
        })

        return true
    }
}
