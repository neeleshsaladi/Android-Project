package com.example.befit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TimeSlots extends Activity implements View.OnClickListener {

    Button  b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1= (Button) findViewById(R.id.B8AM);
        b2= (Button) findViewById(R.id.B9AM);
        b3= (Button) findViewById(R.id.B10AM);
        b4= (Button) findViewById(R.id.B11AM);
        b5= (Button) findViewById(R.id.B12PM);
        b6= (Button) findViewById(R.id.B1PM);
        b7= (Button) findViewById(R.id.B2PM);
        b8= (Button) findViewById(R.id.B3PM);
        b9= (Button) findViewById(R.id.B4PM);
        b10= (Button) findViewById(R.id.B5PM);
        b11= (Button) findViewById(R.id.B6PM);
        b12= (Button) findViewById(R.id.B7PM);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b10.setOnClickListener(this);
        b11.setOnClickListener(this);
        b12.setOnClickListener(this);
    }


    @Override
    public void onClick(View v)
    {
        if(v.getId()==R.id.B8AM)
        {
            Intent intent=new Intent(getApplicationContext(),Gym.class);
            startActivity(intent);
        }
        else if (v.getId()==R.id.B9AM)
        {
            Intent in=new Intent(getApplicationContext(),Gym.class);
            startActivity(in);
        }
        else if (v.getId()==R.id.B10AM)
        {
<<<<<<< HEAD
            Intent in=new Intent(getApplicationContext(), Gym.class);
=======
            Intent in=new Intent(getApplicationContext(),Gym.class);
>>>>>>> 80e8e9774091e81f090ad9b8cb3cb1a600511ecd
            startActivity(in);
        }
        else if (v.getId()==R.id.B11AM)
        {
            Intent in=new Intent(getApplicationContext(), Gym.class);
            startActivity(in);
        }
        else if (v.getId()==R.id.B12PM)
        {
<<<<<<< HEAD
            Intent in=new Intent(getApplicationContext(),Gym.class);
=======
            Intent in=new Intent(getApplicationContext(), Gym.class);
>>>>>>> 80e8e9774091e81f090ad9b8cb3cb1a600511ecd
            startActivity(in);
        }
        else if (v.getId()==R.id.B1PM)
        {
<<<<<<< HEAD
            Intent in=new Intent(getApplicationContext(), Gym.class);
=======
            Intent in=new Intent(getApplicationContext(),Gym.class);
>>>>>>> 80e8e9774091e81f090ad9b8cb3cb1a600511ecd
            startActivity(in);
        }
        else if (v.getId()==R.id.B2PM)
        {
<<<<<<< HEAD
            Intent in=new Intent(getApplicationContext(), Gym.class);
=======
            Intent in=new Intent(getApplicationContext(),Gym.class);
>>>>>>> 80e8e9774091e81f090ad9b8cb3cb1a600511ecd
            startActivity(in);
        }
        else if (v.getId()==R.id.B3PM)
        {
            Intent in=new Intent(getApplicationContext(),Gym.class);
            startActivity(in);
        }
        else if (v.getId()==R.id.B4PM)
        {
<<<<<<< HEAD
            Intent in=new Intent(getApplicationContext(), Gym.class);
=======
            Intent in=new Intent(getApplicationContext(),Gym.class);
>>>>>>> 80e8e9774091e81f090ad9b8cb3cb1a600511ecd
            startActivity(in);
        }
        else if (v.getId()==R.id.B5PM)
        {
<<<<<<< HEAD
            Intent in=new Intent(getApplicationContext(), Gym.class);
=======
            Intent in=new Intent(getApplicationContext(),Gym.class);
>>>>>>> 80e8e9774091e81f090ad9b8cb3cb1a600511ecd
            startActivity(in);
        }
        else if (v.getId()==R.id.B6PM)
        {
<<<<<<< HEAD
            Intent in=new Intent(getApplicationContext(), Gym.class);
=======
            Intent in=new Intent(getApplicationContext(),Gym.class);
>>>>>>> 80e8e9774091e81f090ad9b8cb3cb1a600511ecd
            startActivity(in);
        }
        else if (v.getId()==R.id.B7PM)
        {
<<<<<<< HEAD
            Intent in=new Intent(getApplicationContext(), Gym.class);
=======
            Intent in=new Intent(getApplicationContext(),Gym.class);
>>>>>>> 80e8e9774091e81f090ad9b8cb3cb1a600511ecd
            startActivity(in);
        }
    }
}
