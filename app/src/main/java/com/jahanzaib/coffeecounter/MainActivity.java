package com.jahanzaib.coffeecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int numOfCoffee;
    public void display(View view){
        increament(numOfCoffee);
    }

    private void increament(int num){
        numOfCoffee++;
    }
}
