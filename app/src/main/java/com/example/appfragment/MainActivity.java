package com.example.appfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button botonA;
    Button botonB;
    Button botonC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonA = findViewById(R.id.buttonA);
        botonB = findViewById(R.id.buttonB);
        botonC = findViewById(R.id.buttonC);

        /**getSupportFragmentManager().beginTransaction().add(R.id.containerA, new FragmentA()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.containerB,new FragmentB()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.containerC,new FragmentC()).commit();*/
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.buttonA){
            getSupportFragmentManager().beginTransaction().replace(R.id.containerA,new FragmentA()).commit();
        }if (v.getId()==R.id.buttonB){
            getSupportFragmentManager().beginTransaction().replace(R.id.containerB,new FragmentB()).commit();
        }if (v.getId()==R.id.buttonC){
            getSupportFragmentManager().beginTransaction().replace(R.id.containerC,new FragmentC()).commit();
        }
    }
}