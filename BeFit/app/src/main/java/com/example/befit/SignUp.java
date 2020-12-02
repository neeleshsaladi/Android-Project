package com.example.befit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class SignUp extends AppCompatActivity {
    Button signup;
    EditText firstname,lastname,email,password,cpassword;
    String customerID;
    private FirebaseAuth mAuth;
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        mAuth = FirebaseAuth.getInstance();
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
                    try {
                        

                            mAuth.createUserWithEmailAndPassword(email.getText().toString(), password.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()) {
                                        customerID = mAuth.getCurrentUser().getUid();
                                        DocumentReference documentReference = db.collection("users").document(customerID);
                                        Map<String, Object> user = new HashMap<>();
                                        user.put("firstName", firstname.getText().toString());
                                        user.put("lastName", lastname.getText().toString());
                                        user.put("email", email.getText().toString());
                                        user.put("password", password.getText().toString());

                                        documentReference.set(user).addOnSuccessListener(new OnSuccessListener<Void>() {
                                            @Override
                                            public void onSuccess(Void aVoid) {
                                                Toast.makeText(getApplicationContext(), "success", Toast.LENGTH_SHORT).show();
                                                Intent i = new Intent(SignUp.this, LoginActivity.class);
                                                startActivity(i);
                                            }
                                        }).addOnFailureListener(new OnFailureListener() {
                                            @Override
                                            public void onFailure(@NonNull Exception e) {
                                                Toast.makeText(getApplicationContext(), "failure", Toast.LENGTH_SHORT).show();
                                            }
                                        });

//                                mAuth.getCurrentUser().sendEmailVerification().addOnCompleteListener(new OnCompleteListener<Void>() {
//                                    @Override
//                                    public void onComplete(@NonNull Task<Void> task) {
//                                        if(task.isSuccessful()){
//                                            Toast.makeText(getApplicationContext(),"check the email",Toast.LENGTH_SHORT).show();
//                                            Intent i = new Intent(SignUp.this,LoginActivity.class);
//                                            startActivity(i);
//                                        }
//                                        else{
//                                            Toast.makeText(getApplicationContext(),"error",Toast.LENGTH_SHORT).show();
//                                        }
//                                    }
//                                });
                                    }
                                }
                            });
                    }
                    catch(Exception e){
                    }
                }

            }
        });
    }

    private boolean validationsProfile(){

        if (firstname.length() == 0 || lastname.length() == 0 ||
                email.length() == 0 || (!password.equals(cpassword)))
        {
            firstname.setError("First name is required");
            lastname.setError("Last name is required");
            email.setError("Email Id is required");
            password.setError("Both passwords must match");
            cpassword.setError("Both passwords must match");
            return false;
        } else {
            return true;
        }
    }
}