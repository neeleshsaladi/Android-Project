package com.example.befit;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class YogaClass extends Activity {

    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yogaclass);
        addListenerOnButton();
    }


    public void addListenerOnButton() {

        final Context context = this;

        button = (Button) findViewById(R.id.button);
        button = (Button) findViewById(R.id.button5);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, RateCard.class);
                startActivity(intent);

            }

        });

    }
}
