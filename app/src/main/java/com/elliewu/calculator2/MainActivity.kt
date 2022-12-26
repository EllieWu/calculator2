package com.elliewu.calculator2

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var lastNum = false
        var lastDot = false
        var lastOperator = false
        var lastEqual = false
        var operator:Char = ' '
        var textList:MutableList<String> = mutableListOf("", "", "", "", "")
        var cresult = 0.0;
        var text = findViewById<TextView>(R.id.tvInput);
        text.setText("0");
        var button_AC = findViewById<Button>(R.id.button_AC);
        button_AC.setOnClickListener {
            text.setText("0");
        }
        var btn_0 = findViewById<Button>(R.id.button_0)
        btn_0.setOnClickListener {
            pikachu(btn_0.getText().toString())
        }
        var btn_1 = findViewById<Button>(R.id.button_1);
        btn_1.setOnClickListener {
            pikachu(btn_1.getText().toString())
        }
        var btn_2 = findViewById<Button>(R.id.button_2);
        btn_2.setOnClickListener {
            pikachu(btn_2.getText().toString())
        }
        var btn_3 = findViewById<Button>(R.id.button_3);
        btn_3.setOnClickListener {
            pikachu(btn_3.getText().toString())
        }
        var btn_4 = findViewById<Button>(R.id.button_4);
        btn_4.setOnClickListener {
            pikachu(btn_4.getText().toString())
        }
        var btn_5 = findViewById<Button>(R.id.button_5);
        btn_5.setOnClickListener {
            pikachu(btn_5.getText().toString())
        }
        var btn_6 = findViewById<Button>(R.id.button_6);
        btn_6.setOnClickListener {
            pikachu(btn_6.getText().toString())
        }
        var btn_7 = findViewById<Button>(R.id.button_7);
        btn_7.setOnClickListener {
            pikachu(btn_7.getText().toString())
        }
        var btn_8 = findViewById<Button>(R.id.button_8);
        btn_8.setOnClickListener {
            pikachu(btn_8.getText().toString())
        }
        var btn_9 = findViewById<Button>(R.id.button_9);
        btn_9.setOnClickListener {
            pikachu(btn_9.getText().toString())
        }
        var btn_dot = findViewById<Button>(R.id.button_dot)
        btn_dot.setOnClickListener {
            pikachu(btn_dot.getText().toString())
        }


    }
    fun pikachu(pipi:String){
        var text = findViewById<TextView>(R.id.tvInput);
        var a = text.getText().toString();
        if(a == "0"){
            text.setText(pipi);
        }
        else{
            a = a + pipi;
            text.setText(a);
        }
    }

    fun findButtonClick (Button:String){
        var text = findViewById<TextView>(R.id.tvInput);
        var a = text.getText().toString();

    }


}