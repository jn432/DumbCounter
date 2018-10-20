package com.ff255master.dumbcounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textCounter.text = counter.toString()
    }

    fun add1(v : View) {
        counter += 1
        textCounter.text = counter.toString()
    }

    fun add5(v : View) {
        counter += 5
        textCounter.text = counter.toString()
    }

    fun add10(v : View) {
        counter += 10
        textCounter.text = counter.toString()
    }

    fun subtract1(v : View) {
        counter -= 1
        textCounter.text = counter.toString()
    }

    fun subtract5(v : View) {
        counter -= 5
        textCounter.text = counter.toString()
    }

    fun subtract10(v : View) {
        counter -= 10
        textCounter.text = counter.toString()
    }
}
