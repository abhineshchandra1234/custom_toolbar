package com.eegrab.wishkeyui



import android.os.Bundle
import android.view.View
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.login_screen.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_screen)

        setSupportActionBar(mytoolbar)

        getSupportActionBar()?.setDisplayShowTitleEnabled(false);



    }
}