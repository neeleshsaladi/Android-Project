package com.example.befit;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class DashboardActivity extends AppCompatActivity implements OnClickListener {

    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        b1= (Button) findViewById(R.id.Gym);
        b2= (Button) findViewById(R.id.BMI);

//        b1.setOnClickListener(this);
//        b2.setOnClickListener(this);

    }



    public void onClick(View v)
    {
        if(v.getId()==R.id.Gym)
        {
            Intent intent=new Intent(getApplicationContext(),TimeSlots.class);
            startActivity(intent);
        }
        else if (v.getId()==R.id.BMI)
        {
            Intent in=new Intent(getApplicationContext(),BMI.class);
            startActivity(in);
        }

    }
}