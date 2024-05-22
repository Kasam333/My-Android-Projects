package com.example.baytalmal.activies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.baytalmal.R;

public class DhikrActivity extends AppCompatActivity {

    FrameLayout backBtn;
    LinearLayout layout1,layout2,layout3,layout4,layout5,layout6,layout7,layout8,layout9,layout10,layout11,layout12,layout13,layout14;
    TextView text1,text2,text3,text4,text5,text6,text7,text8,text9,text10,text11,text12,text13,text14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhikr);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            getWindow().setNavigationBarColor(getResources().getColor(R.color.white));
        }

        layout1 = findViewById(R.id.layout_1);
        layout2 = findViewById(R.id.layout_2);
        layout3 = findViewById(R.id.layout_3);
        layout4 = findViewById(R.id.layout_4);
        layout5 = findViewById(R.id.layout_5);
        layout6 = findViewById(R.id.layout_6);
        layout7 = findViewById(R.id.layout_7);
        layout8 = findViewById(R.id.layout_8);
        layout9 = findViewById(R.id.layout_9);
        layout10 = findViewById(R.id.layout_10);
        layout11 = findViewById(R.id.layout_11);
        layout12 = findViewById(R.id.layout_12);
        layout13 = findViewById(R.id.layout_13);
        layout14 = findViewById(R.id.layout_14);

        text1 = findViewById(R.id.dhikr1);
        text2 = findViewById(R.id.dhikr2);
        text3 = findViewById(R.id.dhikr3);
        text4 = findViewById(R.id.dhikr4);
        text5 = findViewById(R.id.dhikr5);
        text6 = findViewById(R.id.dhikr6);
        text7 = findViewById(R.id.dhikr7);
        text8 = findViewById(R.id.dhikr8);
        text9 = findViewById(R.id.dhikr9);
        text10 = findViewById(R.id.dhikr10);
        text11 = findViewById(R.id.dhikr11);
        text12 = findViewById(R.id.dhikr12);
        text13 = findViewById(R.id.dhikr13);
        text14 = findViewById(R.id.dhikr14);
        backBtn = findViewById(R.id.back_btn);


        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });


        layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DhikrActivity.this,TasbihActivity.class);
                String st1=text1.getText().toString();
                intent.putExtra("Value",st1);
                startActivity(intent);
            }
        });
        layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DhikrActivity.this,TasbihActivity.class);
                String st2=text2.getText().toString();
                intent.putExtra("Value",st2);
                startActivity(intent);
            }
        });
        layout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DhikrActivity.this,TasbihActivity.class);
                String st3=text3.getText().toString();
                intent.putExtra("Value",st3);
                startActivity(intent);
            }
        });
        layout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DhikrActivity.this,TasbihActivity.class);
                String st4=text4.getText().toString();
                intent.putExtra("Value",st4);
                startActivity(intent);
            }
        });
        layout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DhikrActivity.this,TasbihActivity.class);
                String st5=text5.getText().toString();
                intent.putExtra("Value",st5);
                startActivity(intent);

            }
        });
        layout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DhikrActivity.this,TasbihActivity.class);
                String st6=text6.getText().toString();
                intent.putExtra("Value",st6);
                startActivity(intent);
            }
        });
        layout7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DhikrActivity.this,TasbihActivity.class);
                String st7=text7.getText().toString();
                intent.putExtra("Value",st7);
                startActivity(intent);
            }
        });
        layout8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DhikrActivity.this,TasbihActivity.class);
                String st8=text8.getText().toString();
                intent.putExtra("Value",st8);
                startActivity(intent);

            }
        });
        layout9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DhikrActivity.this,TasbihActivity.class);
                String st9=text9.getText().toString();
                intent.putExtra("Value",st9);
                startActivity(intent);
            }
        });
        layout10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DhikrActivity.this,TasbihActivity.class);
                String st10=text10.getText().toString();
                intent.putExtra("Value",st10);
                startActivity(intent);
            }
        });
        layout11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DhikrActivity.this,TasbihActivity.class);
                String st11=text11.getText().toString();
                intent.putExtra("Value",st11);
                startActivity(intent);
            }
        });
        layout12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DhikrActivity.this,TasbihActivity.class);
                String st12=text12.getText().toString();
                intent.putExtra("Value",st12);
                startActivity(intent);
            }
        });
        layout13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DhikrActivity.this,TasbihActivity.class);
                String st13=text13.getText().toString();
                intent.putExtra("Value",st13);
                startActivity(intent);
            }
        });
        layout14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DhikrActivity.this,TasbihActivity.class);
                String st14=text14.getText().toString();
                intent.putExtra("Value",st14);
                startActivity(intent);
            }
        });
    }
}