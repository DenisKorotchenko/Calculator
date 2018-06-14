package com.example.user.secondday

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.min

class MainActivity : AppCompatActivity() {
    var n : Int = 0
    fun funPlus(view : View){
        val plusButton = view as? Button
        if (first.text != null && second.text != null) {
            result.text = (first.text.toString().toDouble() + second.text.toString().toDouble()).toString()
        }
    }

    fun funMinus(view : View){
        val minusButton = view as? Button
        if (first.text != null && second.text != null)
            result.text = (first.text.toString().toDouble() - second.text.toString().toDouble()).toString()
    }

    fun funMulti(view : View){
        val multiButton = view as? Button
        if (first.text != null && second.text != null)
            result.text = (first.text.toString().toDouble() * second.text.toString().toDouble()).toString()
    }

    fun funDivInt(view : View){
        val divIntButton = view as? Button
        if (first.text != null && second.text != null) {
            result.text = (if (second.text.toString().toInt() != 0)
                (first.text.toString().toInt() / second.text.toString().toInt()).toString()
            else
                "division by zero")
        }
    }

    fun funFractDiv(view: View){
        if (first.text != null && second.text != null) {
            result.text = (if (second.text.toString().toInt() != 0)
                (first.text.toString().toDouble() / second.text.toString().toDouble()).toString()
            else
                "division by zero")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        plus.setOnClickListener(::funPlus)
        minus.setOnClickListener(::funMinus)
        multi.setOnClickListener(::funMulti)
        divint.setOnClickListener(::funDivInt)

    }
}
