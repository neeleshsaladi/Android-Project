package com.example.befit;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import java.util.Calendar;

public class YogaClass extends Activity {

    Button button;
    Calendar calendar;
    CalendarView calender_slots;

    TextView tvSelectedSlots,tv_total_price,textView5;
    ImageView ivSelectedRemove,ivSelectedAdd;

    LinearLayout ll_slot_selection,ll_checkout_part;

    int slotValue = 1;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yogaclass);
        initView();
        addListenerOnButton();
    }


    private void initView() {

        tvSelectedSlots = (TextView) findViewById(R.id.tvSelectedSlots);
        ivSelectedRemove =  findViewById(R.id.ivSelectedRemove);
        ivSelectedAdd =  findViewById(R.id.ivSelectedAdd);
        textView5 = findViewById(R.id.textView5);
        tv_total_price = findViewById(R.id.tv_total_price);
        ll_slot_selection = findViewById(R.id.ll_slot_selection);
        ll_checkout_part = findViewById(R.id.ll_checkout_part);

        tvSelectedSlots.setText(""+slotValue);

        slotValue = 1;
        tvSelectedSlots.setText(""+slotValue);
        tv_total_price.setText("Total Price $20* "+""+slotValue+" = "+slotValue*20);

        calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, Calendar.NOVEMBER);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.YEAR, 2020);


        calendar.add(Calendar.DAY_OF_MONTH, 1);
        calendar.add(Calendar.YEAR, 1);

        calender_slots = findViewById(R.id.calender_slots);
        calender_slots.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                String msg = "Selected date Day: " + i2 + " Month : " + (i1 + 1) + " Year " + i;
                checkSlots(i2);
                slotValue = 1;
                tvSelectedSlots.setText(""+slotValue);
                tv_total_price.setText("Total Price $20* "+""+slotValue+" = "+slotValue*20);
                //  Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
            }
        });


    }

    private void checkSlots(int i2) {
        if(i2%2==0){
            Toast.makeText(getApplicationContext(), "Slots Available", Toast.LENGTH_SHORT).show();
            textView5.setText("Slots Available");
            ll_checkout_part.setVisibility(View.VISIBLE);
            ll_slot_selection.setVisibility(View.VISIBLE);
        }else {
            Toast.makeText(getApplicationContext(), "Sorry all Slots are booked", Toast.LENGTH_SHORT).show();
            textView5.setText("Sorry all Slots are booked");
            ll_checkout_part.setVisibility(View.GONE);
            ll_slot_selection.setVisibility(View.GONE);
        }
    }

    public void addListenerOnButton() {

        final Context context = this;

        button = (Button) findViewById(R.id.tv_book);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, RateCard.class);
                Bundle bundle = new Bundle();
                bundle.putString("TYPE","Yoga Class");
                bundle.putString("SLOTS", String.valueOf(slotValue));
                bundle.putString("PRICE", String.valueOf(20));
                intent.putExtras(bundle);
                startActivity(intent);


            }

        });

        ivSelectedAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(slotValue>0){
                    slotValue =  ++slotValue;
                    tvSelectedSlots.setText(""+slotValue);
                    tv_total_price.setText("Total Price $20* "+""+slotValue+" = "+slotValue*20);
                }
            }
        });

        ivSelectedRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(slotValue>1){
                    slotValue =  --slotValue;
                    tvSelectedSlots.setText(""+slotValue);
                    tvSelectedSlots.setText(""+slotValue);
                    tv_total_price.setText("Total Price $20* "+""+slotValue+" = "+slotValue*20);
                }
            }
        });

    }
}
