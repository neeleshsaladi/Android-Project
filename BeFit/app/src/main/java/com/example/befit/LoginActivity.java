package com.example.befit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {
    Button login,usersignup;
    TextView forgot;

    EditText username,pswrd;
    private FirebaseAuth mAuth;
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    ArrayList<String> login_list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mAuth = FirebaseAuth.getInstance();
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

                mAuth.signInWithEmailAndPassword(username.getText().toString(),pswrd.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(getApplicationContext(),"verified",Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(), DashboardActivity.class));
//                            if(mAuth.getCurrentUser().isEmailVerified()){
//
//                            }
//                            else{
//                                Toast.makeText(getApplicationContext(),"failed",Toast.LENGTH_SHORT).show();
//                            }
                        }
                        else{
                            Toast.makeText(getApplicationContext(),"incorrect",Toast.LENGTH_SHORT).show();
                        }
                    }
                });
//                String password = pswrd.getText().toString();
//                String mailId = username.getText().toString();
//                if(!password.equals("") && !mailId.equalsIgnoreCase("")){
//
//                    for(int i=1;i<login_list.size() ; i++){
//                        if(mailId.equalsIgnoreCase(login_list.get(i))){
//                            Intent intent = new Intent(LoginActivity.this,DashboardActivity.class);
//                            startActivity(intent);
//                            return;
//                        }
//                        Toast.makeText(getApplicationContext(), "User didn't registred with us.please do new Signup",
//                                Toast.LENGTH_SHORT)
//                                .show();
//                    }
//
//
//                }else {
//                    Toast.makeText(getApplicationContext(), "Please enter Email-id and Password",
//                            Toast.LENGTH_SHORT)
//                            .show();
//                }
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