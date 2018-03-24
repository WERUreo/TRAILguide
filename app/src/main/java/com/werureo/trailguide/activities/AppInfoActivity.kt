package com.werureo.trailguide.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.werureo.trailguide.R
import kotlinx.android.synthetic.main.activity_app_info.*

class AppInfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_info)

        backToAppBtn.setOnClickListener {
            finish()
        }
    }
}
