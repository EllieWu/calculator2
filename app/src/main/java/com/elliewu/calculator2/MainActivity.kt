package com.elliewu.calculator2

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

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
        Pikachutest(btn_0);
        var btn_1 = findViewById<Button>(R.id.button_1);
        Pikachutest(btn_1);
        var btn_2 = findViewById<Button>(R.id.button_2);
        Pikachutest(btn_2);
        var btn_3 = findViewById<Button>(R.id.button_3);
        Pikachutest(btn_3);
        var btn_4 = findViewById<Button>(R.id.button_4);
        Pikachutest(btn_4);
        var btn_5 = findViewById<Button>(R.id.button_5);
        Pikachutest(btn_5);
        var btn_6 = findViewById<Button>(R.id.button_6);
        Pikachutest(btn_6);
        var btn_7 = findViewById<Button>(R.id.button_7);
        Pikachutest(btn_7);
        var btn_8 = findViewById<Button>(R.id.button_8);
        Pikachutest(btn_8);
        var btn_9 = findViewById<Button>(R.id.button_9);
        Pikachutest(btn_9);

        var btn_dot = findViewById<Button>(R.id.button_dot)
        Pikachutest(btn_dot);

//        var btn_plus = findViewById<CheckBox>(R.id.button_plus)
//        Caculate(btn_plus);
        var btn_minus = findViewById<CheckBox>(R.id.button_minus)
        Caculate(btn_minus);
        var btn_equal = findViewById<Button>(R.id.button_equal)
        btn_equal.setOnClickListener{
            var btn_plus = findViewById<CheckBox>(R.id.button_plus)
            Log.d("MainActivity","${btn_plus.isChecked()}")
            Toast.makeText(this, btn_plus.isChecked().toString(), Toast.LENGTH_LONG).show()
        }
    }
    fun Pikachutest(aaa:Button){
        aaa.setOnClickListener {
            var text = findViewById<TextView>(R.id.tvInput);
            var buttontext = aaa.getText().toString();
            var a = text.getText().toString();
            if(a == "0"){
                text.setText(buttontext);
            }
            else{
                a += buttontext;
                text.setText(a);
            }
        }
    }
    fun Caculate(bbb:CheckBox)
    {
        //Toast.makeText(this, bbb.getId().toString(), Toast.LENGTH_LONG).show()
        bbb.setOnClickListener{
            var bb = bbb.getId().toString();
            Toast.makeText(this, bb, Toast.LENGTH_LONG).show()
//            var a = bbb.isSelected.toString();
//            Toast.makeText(this, a, Toast.LENGTH_LONG).show()
            var buttontext = bbb.getText().toString();
            var btn_plus = findViewById<CheckBox>(R.id.button_plus);
            var btn_minus = findViewById<CheckBox>(R.id.button_minus);
            var btn_multiplied = findViewById<CheckBox>(R.id.button_multiplied);
            //var btn_division = findViewById<Button>(R.id.button_division);
            var btn_percent = findViewById<Button>(R.id.button_percent);
            if(buttontext == "+")
            {
                //var a = bbb.onCheckIsTextEditor().toString();
                //var a = bbb.isTextSelectable.toString();
                //var a = bbb.stateListAnimator.toString();
                //var a = bbb.measuredState.toString();
                //var a = bbb.isDuplicateParentStateEnabled.toString();
                //var a = bbb.hasTransientState().toString();
                var a = bbb.isSelected.toString();
                btn_minus.setSelected(false);
                btn_multiplied.setSelected(false);
                //btn_division.setPressed(false);
                btn_percent.setSelected(false);
                Toast.makeText(this, a, Toast.LENGTH_LONG).show()
            }
            else if(buttontext == "-")
            {
                btn_plus.setPressed(false);
                btn_multiplied.setPressed(false);
                //btn_division.setPressed(false);
                btn_percent.setPressed(false);
                var a = bbb.drawableState.toString();
                Toast.makeText(this, a, Toast.LENGTH_LONG).show()
            }
            else if(buttontext == "×")
            {
                btn_minus.setPressed(false);
                btn_plus.setPressed(false);
                //btn_division.setPressed(false);
                btn_percent.setPressed(false);
                var a = bbb.drawableState.toString();
                Toast.makeText(this, a, Toast.LENGTH_LONG).show()
            }
            else if(buttontext == "÷")
            {
                btn_minus.setPressed(false);
                btn_multiplied.setPressed(false);
                btn_plus.setPressed(false);
                btn_percent.setPressed(false);
                var a = bbb.drawableState.toString();
                Toast.makeText(this, a, Toast.LENGTH_LONG).show()
            }
            else if(buttontext == "%")
            {
                btn_minus.setPressed(false);
                btn_multiplied.setPressed(false);
                //btn_division.setPressed(false);
                btn_plus.setPressed(false);
                var a = bbb.drawableState.toString();
                Toast.makeText(this, a, Toast.LENGTH_LONG).show()
            }
            else if(buttontext == "←")
            {
            }
        }
    }
    fun findButtonClick (Button:String){
        var text = findViewById<TextView>(R.id.tvInput);
        var a = text.getText().toString();

    }


}
