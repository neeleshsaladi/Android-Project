package com.example.befit;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RateCard extends Activity {

    Button button;

    String session,price,totalslot;
    TextView tv_ses,tv_per_ses,tv_tot_ses,tv_total_price;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ratecard);
        getData();
        initView();
        addListenerOnButton();
    }

    private void getData() {
        Bundle bundle = getIntent().getExtras();
        session = bundle.getString("TYPE");
        totalslot = bundle.getString("SLOTS");
        price = bundle.getString("PRICE");

    }

    private void initView() {
        tv_total_price = findViewById(R.id.tv_total_price);
        tv_ses = findViewById(R.id.tv_ses);
        tv_per_ses = findViewById(R.id.tv_per_ses);
        tv_tot_ses = findViewById(R.id.tv_tot_ses);

        button = (Button) findViewById(R.id.button3);

        tv_ses.setText(" -   "+session);
        tv_per_ses.setText(" -   "+"$"+price);
        tv_tot_ses.setText(" -   "+totalslot);

        int total = Integer.parseInt(price)*Integer.parseInt(totalslot);
        tv_total_price.setText(" -   "+"$"+total);
    }

    public void addListenerOnButton() {
        final Context context = this;

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DashboardActivity.class);
                startActivity(intent);
            }
        });
    }

}

