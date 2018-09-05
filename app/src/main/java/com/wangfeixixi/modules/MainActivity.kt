package com.wangfeixixi.modules

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.wangfeixixi.myapplication.TestModuleActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_test_module.setOnClickListener { startActivity(Intent(this, TestModuleActivity::class.java)) }
    }
}
