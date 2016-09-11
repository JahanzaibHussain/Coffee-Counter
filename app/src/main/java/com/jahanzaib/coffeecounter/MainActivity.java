package com.jahanzaib.coffeecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int quantity;

    public void submitOrder(View view) {
        int numOfCoffee = quantity;
        display(numOfCoffee);
        displayprice(numOfCoffee * 5);
    }
    public void display(int numOfCoffee) {
        TextView quantityTextView = (TextView) findViewById(R.id.numOfCoffee);
        quantityTextView.setText("" + numOfCoffee);
    }
    public void displayprice(int num){
        TextView pamount = (TextView) findViewById(R.id.amount);
        pamount.setText(NumberFormat.getCurrencyInstance().format(num));
    }

    public void inc(View view){
        quantity = quantity + 1 ;
        display(quantity);
    }
    public void dec(View view){
        quantity = quantity - 1 ;
        display(quantity);
    }
}
