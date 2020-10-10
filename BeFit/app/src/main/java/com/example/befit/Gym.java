package com.example.befit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;


public class Gym extends AppCompatActivity implements OnClickListener {
    Button  b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gym);
        b1= (Button) findViewById(R.id.Weight);
        b2= (Button) findViewById(R.id.cardio);
        b3= (Button) findViewById(R.id.yoga);
        b4= (Button) findViewById(R.id.power);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v)

    {
        if(v.getId()==R.id.Weight)
        {
            Intent intent=new Intent(getApplicationContext(),WeightTraining.class);
            startActivity(intent);
        }
        else if (v.getId()==R.id.cardio)
        {
            Intent in=new Intent(getApplicationContext(),Cardio.class);
            startActivity(in);
        }
        else if (v.getId()==R.id.yoga)
        {
            Intent in=new Intent(getApplicationContext(), YogaClass.class);
            startActivity(in);
        }
        else if (v.getId()==R.id.power)
        {
            Intent in=new Intent(getApplicationContext(), PowerTraining.class);
            startActivity(in);
        }
    }
}