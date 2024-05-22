package com.example.baytalmal.activies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.baytalmal.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.w3c.dom.Text;

public class TasbihActivity extends AppCompatActivity {

    private LinearLayout counterButton;
    private TextView counterText;
    private LinearLayout resetBtn;
    private TextView text1;

    private int counter;

    LinearLayout dhikrBtn;

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.counter_button_layout:
                    addCounter();
                    break;
                case R.id.reset_btn:
                    initCounter();
                    break;

            }

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasbih);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            getWindow().setNavigationBarColor(getResources().getColor(R.color.white));
        }

        counterButton = findViewById(R.id.counter_button_layout);
        counterButton.setOnClickListener(clickListener);
        counterText = findViewById(R.id.counter_text);
        resetBtn = findViewById(R.id.reset_btn);
        resetBtn.setOnClickListener(clickListener);

        text1 = (TextView) findViewById(R.id.dhikr_display);
        String st1=getIntent().getStringExtra("Value");
        String st2=getIntent().getStringExtra("Value");
        String st3=getIntent().getStringExtra("Value");
        String st4=getIntent().getStringExtra("Value");
        String st5=getIntent().getStringExtra("Value");
        String st6=getIntent().getStringExtra("Value");
        String st7=getIntent().getStringExtra("Value");
        String st8=getIntent().getStringExtra("Value");
        String st9=getIntent().getStringExtra("Value");
        String st10=getIntent().getStringExtra("Value");
        String st11=getIntent().getStringExtra("Value");
        String st12=getIntent().getStringExtra("Value");
        String st13=getIntent().getStringExtra("Value");
        String st14=getIntent().getStringExtra("Value");
        text1.setText(st1);
        text1.setText(st2);
        text1.setText(st3);
        text1.setText(st4);
        text1.setText(st5);
        text1.setText(st6);
        text1.setText(st7);
        text1.setText(st8);
        text1.setText(st9);
        text1.setText(st10);
        text1.setText(st11);
        text1.setText(st12);
        text1.setText(st13);
        text1.setText(st14);





        dhikrBtn = findViewById(R.id.dhikr_btn);
        dhikrBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TasbihActivity.this, DhikrActivity.class);
                startActivity(intent);
            }
        });



        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.bottom_tasbih);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.bottom_home:
                    startActivity(new Intent(getApplicationContext(), HomeActivity.class));
                    finish();
                    return true;
                case R.id.bottom_books:
                    startActivity(new Intent(getApplicationContext(), LibraryActivity.class));
                    finish();
                    return true;
                case R.id.bottom_tasbih:
                    return true;
            }
            return false;
        });
    }

    private void initCounter(){
        counter = 0;
        counterText.setText(counter + "");
    }

    private void addCounter(){
        if (counter<500){
            counter++;
            counterText.setText(counter + "");
            Vibrator vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
            vibrator.vibrate(VibrationEffect.createOneShot(300, VibrationEffect.DEFAULT_AMPLITUDE));
        }
    }
}