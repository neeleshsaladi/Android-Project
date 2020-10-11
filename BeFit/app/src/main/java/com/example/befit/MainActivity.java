package com.example.befit;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1= (Button) findViewById(R.id.Login);
        b2= (Button) findViewById(R.id.Signup);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);

    }



    public void onClick(View v)
    {
        if(v.getId()==R.id.Login)
        {
            Intent intent=new Intent(getApplicationContext(),LoginActivity.class);
            startActivity(intent);
        }
        else if (v.getId()==R.id.Signup)
        {
            Intent in=new Intent(getApplicationContext(),SignUp.class);
            startActivity(in);
        }

    }
}