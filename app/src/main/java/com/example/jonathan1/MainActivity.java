package com.example.jonathan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button1; //按鈕物件
    String a = "你按了!";
    String b = "Click me!!!";
    TextView textview1;
    int c;
    EditText editText1;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //設定UI (User INterface)
        button1 = findViewById(R.id.button1);
        textview1 = findViewById(R.id.textview1);
        editText1 = findViewById(R.id.edittext1);
        button2 = findViewById(R.id.button2);
        button2.setText("輸入");
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s;
                s = editText1.getText().toString();
                textview1.setText(s);
                c = 0;
            }
        });
        c = 0;
        button1.setText(b);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonclick();
            }
        });
    }

    public void buttonclick() {
        //DEbug
        Log.v("Jonathan_hahaha","BUTTONCLICK!!!");
        //Toast message
        Toast t = Toast.makeText(this,"按鈕遭到觸發",Toast.LENGTH_LONG);//提示字串
        t.show();

        // 修改button text
        //button1.setText("你按了!");
        if(button1.getText().equals(a)){
            button1.setText(b);
        }else{
            button1.setText(a);
        }
        c = c + 1;
        textview1.setText(""+c);
    }
}