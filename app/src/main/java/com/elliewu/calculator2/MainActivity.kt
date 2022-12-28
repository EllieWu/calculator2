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
//現在被暗下的計算紐
// 1 代表+ 2代表- 3代表* 4代表/
var NCCButton = 0;
var firstinput = 0.0;
var secondinput = 0.0;
var sum = 0.0;
var equalornot = false;
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
        firstinput = 0.0;
        secondinput = 0.0;
        var text = findViewById<TextView>(R.id.tvInput);
        text.setText("0");
        var button_AC = findViewById<Button>(R.id.button_AC);
        button_AC.setOnClickListener {
            text.setText("0");
            firstinput = 0.0;
            secondinput = 0.0;
            equalornot = false;
            var text2 = findViewById<TextView>(R.id.showOut)
            text2.setText("");
        }
        var button_arr = findViewById<Button>(R.id.button_arrow)
        button_arr.setOnClickListener {
            var aaa = text.getText();
            if(aaa.length >0){
                aaa = aaa.dropLast(1);
            }
            text.setText(aaa);
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

        var btn_plus = findViewById<CheckBox>(R.id.button_plus)
        var btn_minus = findViewById<CheckBox>(R.id.button_minus)
        var btn_multiplied = findViewById<CheckBox>(R.id.button_multiplied)
        var btn_division = findViewById<CheckBox>(R.id.button_division)
        Caculate(btn_plus);
        Caculate(btn_minus);
        Caculate(btn_multiplied);
        Caculate(btn_division);
        var btn_equal = findViewById<Button>(R.id.button_equal)
        btn_equal.setOnClickListener {
            if(equalornot == false){
                var text2 = findViewById<TextView>(R.id.showOut)
                text2.setText(text.getText().toString());
                secondinput = text2.getText().toString().toDouble();
            }
            else{
                firstinput = text.getText().toString().toDouble();
            }
            CaculateResult();
        }
    }
    fun Pikachutest(aaa:Button){
        aaa.setOnClickListener {
            if(NCCButton == 0){
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
            else{
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
    }
    fun Caculate(bbb:CheckBox)
    {
        var btn_plus = findViewById<CheckBox>(R.id.button_plus)
        var btn_minus = findViewById<CheckBox>(R.id.button_minus)
        var btn_multiplied = findViewById<CheckBox>(R.id.button_multiplied)
        var btn_division = findViewById<CheckBox>(R.id.button_division)
        var text = findViewById<TextView>(R.id.tvInput);
        //Toast.makeText(this, bbb.getId().toString(), Toast.LENGTH_LONG).show()
        bbb.setOnClickListener{
            if(bbb == findViewById<CheckBox>(R.id.button_plus)){
                if(bbb.isChecked){
                    bbb.setBackgroundResource(R.drawable.btn_plus_ed);
                    btn_minus.setChecked(false);
                    btn_minus.setBackgroundResource(R.drawable.btn_minus);
                    btn_multiplied.setChecked(false);
                    btn_multiplied.setBackgroundResource(R.drawable.btn_multi);
                    btn_division.setChecked(false);
                    btn_division.setBackgroundResource(R.drawable.btn_divison);
                    NCCButton = 1;
                    //Toast.makeText(this, text.toString(), Toast.LENGTH_LONG).show()
                    firstinput = text.getText().toString().toDouble();
                }
                else{
                    bbb.setBackgroundResource(R.drawable.btn_plus);
                    NCCButton = 0;
                    firstinput = 0.0;
                }
            }
            else if(bbb == findViewById<CheckBox>(R.id.button_minus)){
                if(bbb.isChecked){
                    bbb.setBackgroundResource(R.drawable.btn_minus_ed);
                    btn_plus.setChecked(false);
                    btn_plus.setBackgroundResource(R.drawable.btn_plus);
                    btn_multiplied.setChecked(false);
                    btn_multiplied.setBackgroundResource(R.drawable.btn_multi);
                    btn_division.setChecked(false);
                    btn_division.setBackgroundResource(R.drawable.btn_divison);
                    NCCButton = 2;
                    firstinput = text.getText().toString().toDouble();
                }
                else{
                    bbb.setBackgroundResource(R.drawable.btn_minus);
                    NCCButton = 0;
                    firstinput = 0.0;
                }
            }
            else if(bbb == findViewById<CheckBox>(R.id.button_multiplied)){
                if(bbb.isChecked){
                    bbb.setBackgroundResource(R.drawable.btn_multi_ed);
                    btn_plus.setChecked(false);
                    btn_plus.setBackgroundResource(R.drawable.btn_plus);
                    btn_minus.setChecked(false);
                    btn_minus.setBackgroundResource(R.drawable.btn_minus);
                    btn_division.setChecked(false);
                    btn_division.setBackgroundResource(R.drawable.btn_divison);
                    NCCButton = 3;
                    firstinput = text.getText().toString().toDouble();
                }
                else{
                    bbb.setBackgroundResource(R.drawable.btn_multi);
                    NCCButton = 0;
                    firstinput = 0.0;
                }
            }
            else if(bbb == findViewById<CheckBox>(R.id.button_division)){
                if(bbb.isChecked){
                    bbb.setBackgroundResource(R.drawable.btn_divison_ed);
                    btn_plus.setChecked(false);
                    btn_plus.setBackgroundResource(R.drawable.btn_plus);
                    btn_minus.setChecked(false);
                    btn_minus.setBackgroundResource(R.drawable.btn_minus);
                    btn_multiplied.setChecked(false);
                    btn_multiplied.setBackgroundResource(R.drawable.btn_multi);
                    NCCButton = 4;
                    firstinput = text.getText().toString().toDouble();
                }
                else{
                    bbb.setBackgroundResource(R.drawable.btn_divison);
                    NCCButton = 0;
                    firstinput = 0.0;
                }
            }
        }

    }
    fun CaculateResult()
    {
        var btn_plus = findViewById<CheckBox>(R.id.button_plus)
        var btn_minus = findViewById<CheckBox>(R.id.button_minus)
        var btn_multiplied = findViewById<CheckBox>(R.id.button_multiplied)
        var btn_division = findViewById<CheckBox>(R.id.button_division)
        var text = findViewById<TextView>(R.id.tvInput);
        when (NCCButton){
            1-> { sum = firstinput + secondinput;

                text.setText(sum.toString());
            }
            2-> { sum = firstinput - secondinput;
                text.setText(sum.toString());
            }
            3-> { sum = firstinput * secondinput;
                text.setText(sum.toString());
            }
            4-> { sum = firstinput / secondinput;
                text.setText(sum.toString());
            }
            else ->{
                text.setText("0");
            }
        }
        equalornot = true;
        //Toast.makeText(this, sum.toString(), Toast.LENGTH_SHORT).show()

    }
    fun findButtonClick (Button:String){
        var text = findViewById<TextView>(R.id.tvInput);
        var a = text.getText().toString();

    }


}
