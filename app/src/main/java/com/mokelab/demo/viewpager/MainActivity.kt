package com.mokelab.demo.viewpager

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            val manager = supportFragmentManager
            val transaction = manager?.beginTransaction()

            transaction?.add(R.id.container_0, PagerFragment.newInstance())
            transaction?.add(R.id.container_1, PagerFragment.newInstance())
            transaction?.add(R.id.container_2, PagerFragment.newInstance())
            transaction?.add(R.id.container_3, PagerFragment.newInstance())

            transaction?.commit()
        }
    }
}
