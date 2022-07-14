package com.sirius.test_app


import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ab: ActionBar? = supportActionBar
        val inflator = this.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view: View = inflator.inflate(R.layout.actionbar, null)
        with(ab) {
            this?.customView = view
            this?.setDisplayShowCustomEnabled(true)
        }

    }
}