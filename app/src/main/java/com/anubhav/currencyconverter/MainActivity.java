package com.anubhav.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ViewAnimator;

public class MainActivity extends AppCompatActivity {
    public void dollar(View view){
        EditText amountRupee = (EditText) findViewById(R.id.amountRupee) ;
        Double amountRupeeDouble= Double.parseDouble(amountRupee.getText().toString());
        Double dollarAmount= amountRupeeDouble / 72.76;
        Toast.makeText(this, "$ " + String.format("%.2f",dollarAmount), Toast.LENGTH_LONG).show();
    }
    public void pound(View view){
        EditText amountRupee = (EditText) findViewById(R.id.amountRupee) ;
        Double amountRupeeDouble= Double.parseDouble(amountRupee.getText().toString());
        Double poundAmount= amountRupeeDouble / 101.57;
        Toast.makeText(this, "£ " + String.format("%.2f",poundAmount), Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}