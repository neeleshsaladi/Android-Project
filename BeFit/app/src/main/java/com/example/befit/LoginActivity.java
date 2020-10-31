package com.example.befit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {
    Button login,usersignup;
    TextView forgot;

    EditText username,pswrd;

    ArrayList<String> login_list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        login_list.add("Johnalbert@gmail.com");
        login_list.add("test1@gmail.com");
        login_list.add("Carolineham@gmail.com");
        login_list.add("Mikytim@gmail.com");
        login_list.add("Mikegreg@gmail.com");
        login_list.add("Chrislunduk@gmail.com");
        login_list.add("Terryjack@gmail.com");
        login_list.add("Rohitha21@gmail.com");
        login_list.add("test@test.com");


        username = findViewById(R.id.username);
        pswrd = findViewById(R.id.pswrd);

        login = findViewById(R.id.login);
        forgot = findViewById(R.id.forgot);
        usersignup = findViewById(R.id.usersignup);
        usersignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(LoginActivity.this,SignUp.class);
                startActivity(a);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Intent intent = new Intent(LoginActivity.this,DashboardActivity.class);
                startActivity(intent);*/
                String password = pswrd.getText().toString();
                String mailId = username.getText().toString();
                if(!password.equals("") && !mailId.equalsIgnoreCase("")){

                    for(int i=1;i<login_list.size() ; i++){
                        if(mailId.equalsIgnoreCase(login_list.get(i))){
                            Intent intent = new Intent(LoginActivity.this,DashboardActivity.class);
                            startActivity(intent);
                            return;
                        }
                        Toast.makeText(getApplicationContext(), "User didn't registred with us.please do new Signup",
                                Toast.LENGTH_SHORT)
                                .show();
                    }


                }else {
                    Toast.makeText(getApplicationContext(), "Please enter Email-id and Password",
                            Toast.LENGTH_SHORT)
                            .show();
                }
            }
        });
        forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(LoginActivity.this,Forgotpassword.class);
                startActivity(c);
            }
        });
    }
}