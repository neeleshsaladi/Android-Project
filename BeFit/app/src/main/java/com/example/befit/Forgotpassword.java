package com.example.befit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Forgotpassword extends AppCompatActivity {
    Button resetpswrd;

    EditText usrname,pswrd,confrimpswrd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotpassword);


        usrname = findViewById(R.id.usrname);
        pswrd = findViewById(R.id.pswrd);
        confrimpswrd = findViewById(R.id.confrimpswrd);

        resetpswrd = findViewById(R.id.resetpswrd);
        resetpswrd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(usrname.getText().toString().equalsIgnoreCase("")){
                    Toast.makeText(getApplicationContext(), "Please Email id", Toast.LENGTH_SHORT).show();
                }else if(pswrd.getText().toString().equalsIgnoreCase("")){
                    Toast.makeText(getApplicationContext(), "Please enter  Password", Toast.LENGTH_SHORT).show();
                }else if(confrimpswrd.getText().toString().equalsIgnoreCase("")){
                    Toast.makeText(getApplicationContext(), "Please enter Confirm Password", Toast.LENGTH_SHORT).show();
                } else if(!pswrd.getText().toString().equals(confrimpswrd.getText().toString())){
                    Toast.makeText(getApplicationContext(), "Password and Confirm Password didn't match", Toast.LENGTH_SHORT).show();
                }else {
                    Intent a = new Intent(getApplicationContext(), LoginActivity.class);
                    startActivity(a);
                }
            }
        });
    }
}