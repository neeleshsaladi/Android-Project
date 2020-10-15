package com.example.befit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class logout extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logout_page);
    }
    public void onlogout(View v){
        startActivity(new Intent(logout.this, MainActivity.class));
        this.finish();

    }

}
