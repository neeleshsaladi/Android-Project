package com.example.befit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {
    Button signup;
    EditText firstname,lastname,email,password,cpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        cpassword = findViewById(R.id.cpassword);
        password = findViewById(R.id.password);
        email = findViewById(R.id.email);
        lastname = findViewById(R.id.lastname);
        firstname = findViewById(R.id.firstname);
        signup =findViewById(R.id.signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Intent i = new Intent(SignUp.this,LoginActivity.class);
                startActivity(i);*/
                if(firstname.getText().toString().equalsIgnoreCase("")){
                    Toast.makeText(getApplicationContext(), "Please enter First Name", Toast.LENGTH_SHORT).show();
                }else if(lastname.getText().toString().equalsIgnoreCase("")){
                    Toast.makeText(getApplicationContext(), "Please enter Last Name", Toast.LENGTH_SHORT).show();
                }else if(email.getText().toString().equalsIgnoreCase("")){
                    Toast.makeText(getApplicationContext(), "Please enter Email-id", Toast.LENGTH_SHORT).show();
                }else if(password.getText().toString().equalsIgnoreCase("")){
                    Toast.makeText(getApplicationContext(), "Please enter Password", Toast.LENGTH_SHORT).show();
                }else if(cpassword.getText().toString().equalsIgnoreCase("")){
                    Toast.makeText(getApplicationContext(), "Please enter Confirm Password", Toast.LENGTH_SHORT).show();
                }else if(!password.getText().toString().equals(cpassword.getText().toString())){
                    Toast.makeText(getApplicationContext(), "Password and Confirm Password didn't match", Toast.LENGTH_SHORT).show();
                }else {
                    Intent i = new Intent(SignUp.this,DashboardActivity.class);
                    startActivity(i);
                }
            }
        });
    }
}