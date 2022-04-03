package com.example.davaleba4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    var isNew =true
    var old = ""
    var op = "+"
    fun numberClick(view: View){
        if(isNew)
        textView.setText("")
        isNew =false

        var bclick  = textView.text.toString()
        var bclicks = view as Button
        when(bclicks.id){
            number0.id -> {bclick += "0"}
            number1.id -> {bclick += "1"}
            number2.id -> {bclick += "2"}
            number3.id -> {bclick += "3"}
            number4.id -> {bclick += "4"}
            number5.id -> {bclick += "5"}
            number6.id -> {bclick += "6"}
            number7.id -> {bclick += "7"}
            number8.id -> {bclick += "8"}
            number9.id -> {bclick += "9"}
            number_dot.id -> {bclick += "."}
            number_plus_minus_btn.id -> {bclick = "-$bclick"}

        }
        textView.setText(bclick)

        }

    fun number_operator(view: View){
        isNew = true
        old =textView.text.toString()
        var bclicks = view as Button
        when(bclicks.id){
            number_multiply.id -> {op = "*"}
            number_plus.id -> {op = "+"}
            number_minus.id -> {op = "-"}
            number_slash.id -> {op = "/"}

        }
        textView.setText(op)

    }

    fun equal(view: View){
        var newnumber = textView.text.toString()
        var result = 0
        when(op){
            "+" -> {result = old.toInt() + newnumber.toInt()}
            "*" -> {result = old.toInt() * newnumber.toInt()}
            "/" -> {result = old.toInt() / newnumber.toInt()}
            "-" -> {result = old.toInt() - newnumber.toInt()}


        }
        textView.setText((result.toString()))
    }
    fun numer_c(view: View){
        textView.setText("")
        isNew = true

    }
    fun number_percent(view: View){
        var p =textView.text.toString().toDouble()/100
        textView.setText(p.toString())
        isNew = true
    }
    fun number_pesvi (view: View){
        val pesvi = sqrt(textView.text.toString().toDouble())
        this.textView.text = ""
        textView.setText(pesvi.toString())
        isNew = true

    }



    }






