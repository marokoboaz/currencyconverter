package com.example.currencyconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Set;

public class MainActivity extends AppCompatActivity {

    TextView Doller;
    EditText Shilling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }


    public void TheButton(View view){




        EditText Shilling = (EditText) findViewById(R.id.EditTextMain);
        TextView Doller = (TextView) findViewById(R.id.TextViewMain);



       double TextViewMain = Double.parseDouble(Shilling.getText().toString());
       double dolleramout = TextViewMain / 100.77;



      // Doller.setText("$ "+ dolleramout+"""" );

       Doller.setText("$ " + String.format("%.4f", dolleramout));





    }



}
