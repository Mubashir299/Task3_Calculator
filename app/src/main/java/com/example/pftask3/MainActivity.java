package com.example.pftask3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {
    String finalResult = "";
    String seven = "";
    String eight = "";
    String min = "-";
    String plu = "+";
    String div = "/";
    String  mul = "x";
    String equ = "=";

String data;
int total=0;
TextView inputText,outputText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intView();
    }

    private void intView() {

        inputText = findViewById(R.id.input_text);
        outputText = findViewById(R.id.output_text);

    }



    public void zero(View view) {
           data = inputText.getText().toString();
           inputText.setText(data+ "0");
    }

    public void one(View view) {
        data = inputText.getText().toString();
        inputText.setText(data+ "1");
        data = inputText.getText().toString();
        data = data.replace("x","*");
        data = data.replace("%","/100");
        data = data.replace("/","/");
        Context rhino = Context.enter();
        rhino.setOptimizationLevel(-1);
        Scriptable scriptable= rhino.initStandardObjects();
        finalResult = rhino.evaluateString(scriptable, data, "javascript", 1, null).toString();
        outputText.setText(finalResult);

    }

    public void two(View view) {
        data = inputText.getText().toString();
        inputText.setText(data+ "2");
        data = inputText.getText().toString();
        data = data.replace("x","*");
        data = data.replace("%","/100");
        data = data.replace("/","/");
        Context rhino = Context.enter();
        rhino.setOptimizationLevel(-1);
        Scriptable scriptable= rhino.initStandardObjects();
        finalResult = rhino.evaluateString(scriptable, data, "javascript", 1, null).toString();
        outputText.setText(finalResult);
    }

    public void three(View view) {
        data = inputText.getText().toString();
        inputText.setText(data+ "3");
        data = inputText.getText().toString();
        data = data.replace("x","*");
        data = data.replace("%","/100");
        data = data.replace("/","/");
        Context rhino = Context.enter();
        rhino.setOptimizationLevel(-1);
        Scriptable scriptable= rhino.initStandardObjects();
        finalResult = rhino.evaluateString(scriptable, data, "javascript", 1, null).toString();
        outputText.setText(finalResult);
    }

    public void four(View view) {
        data = inputText.getText().toString();
        inputText.setText(data+ "4");
        data = inputText.getText().toString();
        data = data.replace("x","*");
        data = data.replace("%","/100");
        data = data.replace("/","/");
        Context rhino = Context.enter();
        rhino.setOptimizationLevel(-1);
        Scriptable scriptable= rhino.initStandardObjects();
        finalResult = rhino.evaluateString(scriptable, data, "javascript", 1, null).toString();
        outputText.setText(finalResult);
    }

    public void five(View view) {
        data = inputText.getText().toString();
        inputText.setText(data+ "5");
        data = inputText.getText().toString();
        data = data.replace("x","*");
        data = data.replace("%","/100");
        data = data.replace("/","/");
        Context rhino = Context.enter();
        rhino.setOptimizationLevel(-1);
        Scriptable scriptable= rhino.initStandardObjects();
        finalResult = rhino.evaluateString(scriptable, data, "javascript", 1, null).toString();
        outputText.setText(finalResult);
    }

    public void six(View view) {
        data = inputText.getText().toString();
        inputText.setText(data+ "6");
        data = inputText.getText().toString();
        data = data.replace("x","*");
        data = data.replace("%","/100");
        data = data.replace("/","/");
        Context rhino = Context.enter();
        rhino.setOptimizationLevel(-1);
        Scriptable scriptable= rhino.initStandardObjects();
        finalResult = rhino.evaluateString(scriptable, data, "javascript", 1, null).toString();
        outputText.setText(finalResult);
    }

    public void seven(View view) {
        data = inputText.getText().toString();
        inputText.setText(data+ "7");
        seven = "7";
        total = Integer.valueOf(seven);
        data = inputText.getText().toString();
        data = data.replace("x","*");
        data = data.replace("%","/100");
        data = data.replace("/","/");
        Context rhino = Context.enter();
        rhino.setOptimizationLevel(-1);
        Scriptable scriptable= rhino.initStandardObjects();
        finalResult = rhino.evaluateString(scriptable, data, "javascript", 1, null).toString();
        outputText.setText(finalResult);
    }

    public void eight(View view) {
        data = inputText.getText().toString();
        inputText.setText(data+ "8");
        eight = "8";

        data = inputText.getText().toString();
        data = data.replace("x","*");
        data = data.replace("%","/100");
        data = data.replace("/","/");
        Context rhino = Context.enter();
        rhino.setOptimizationLevel(-1);
        Scriptable scriptable= rhino.initStandardObjects();
        finalResult = rhino.evaluateString(scriptable, data, "javascript", 1, null).toString();
        outputText.setText(finalResult);
    }

    public void nine(View view) {
        data = inputText.getText().toString();
        inputText.setText(data+ "9");
        data = inputText.getText().toString();
        data = data.replace("x","*");
        data = data.replace("%","/100");
        data = data.replace("/","/");
        Context rhino = Context.enter();
        rhino.setOptimizationLevel(-1);
        Scriptable scriptable= rhino.initStandardObjects();
        finalResult = rhino.evaluateString(scriptable, data, "javascript", 1, null).toString();
        outputText.setText(finalResult);
    }

    public void dot(View view) {
        data = inputText.getText().toString();
        inputText.setText(data+ ".");
    }

    public void plus(View view) {
        data = inputText.getText().toString();
        inputText.setText(data+ "+");

    }

    public void minus(View view) {
        data = inputText.getText().toString();
        inputText.setText(data+ "-");
    }

    public void multiply(View view) {
        data = inputText.getText().toString();
        inputText.setText(data+ "x");
    }

    public void slash(View view) {
        data = inputText.getText().toString();
        inputText.setText(data+ "/");
    }



   public void clear(View view) {
       inputText.setText("");
       outputText.setText("");
   }


    public void equal(View view) {
        outputText.setTextSize(50);
       /* Intent intent = new Intent(MainActivity.this, LogInActivity.class);
        startActivity(intent);*/
        if(inputText.getText().toString().isEmpty()) {
            Toast.makeText(this, "please Inter the any number", Toast.LENGTH_SHORT).show();
        }
       else if(data.equals("+")&&data.equals("-")&&data.equals("x")&&data.equals("/")){
            Toast.makeText(this, "inter valid number..", Toast.LENGTH_SHORT).show();
        }else {
/*

*/
           /* Toast.makeText(this, data, Toast.LENGTH_SHORT).show();*/
            data = data.replace("x","*");
            data = data.replace("%","/100");
            data = data.replace("/","/");
            Context rhino = Context.enter();
            rhino.setOptimizationLevel(-1);

            Scriptable scriptable= rhino.initStandardObjects();
            finalResult = rhino.evaluateString(scriptable, data, "javascript", 1, null).toString();
             if(!outputText.getText().toString().isEmpty()) {
             }else if(outputText.getText().toString().equals("+")&&
                     outputText.getText().toString().equals("-")&&
                     outputText.getText().toString().equals("x")&&
                     outputText.getText().toString().equals("/")){
                 Toast.makeText(this, "inter valid number..", Toast.LENGTH_SHORT).show();
             }
            /*outputText.setText(finalResult);*/
             else {
                 outputText.setText(finalResult);
             }
        }

       /* data = inputText.getText().toString();*/
        /*Toast.makeText(this, data, Toast.LENGTH_SHORT).show();
        data = data.replace("x","*");
        data = data.replace("%","/100");
        data = data.replace("/","/");
        Context rhino = Context.enter();
        rhino.setOptimizationLevel(-1);

        Scriptable scriptable= rhino.initStandardObjects();
        finalResult = rhino.evaluateString(scriptable, data, "javascript", 1, null).toString();
        outputText.setText(finalResult);*/
        inputText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                   String abc = inputText.getText().toString();
                   outputText.setText(abc);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}