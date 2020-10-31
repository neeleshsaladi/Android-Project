package com.example.befit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity implements OnClickListener {

    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        b1= (Button) findViewById(R.id.Gym);
        b2= (Button) findViewById(R.id.BMI);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);

    }



    public void onClick(View v)
    {
        if(v.getId()== R.id.Gym)
        {
            Intent intent=new Intent(getApplicationContext(),Gym.class);
            startActivity(intent);
        }
        else if (v.getId()== R.id.BMI)
        {
            Intent in=new Intent(getApplicationContext(), BMI.class);
            startActivity(in);
        }

    }
}