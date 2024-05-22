package com.example.baytalmal.activies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.example.baytalmal.R;

public class QadhaActivity extends AppCompatActivity {

    private TextView value1,value2,value3,value4,value5,value6,value7;
    private FrameLayout saveBtn;

    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String TEXT_1 = "text1";
    public static final String TEXT_2 = "text2";
    public static final String TEXT_3 = "text3";
    public static final String TEXT_4 = "text4";
    public static final String TEXT_5 = "text5";
    public static final String TEXT_6 = "text6";
    public static final String TEXT_7 = "text7";

    private String text_1,text_2,text_3,text_4,text_5,text_6,text_7;
    int count1 = 0;
    int count2 = 0;
    int count3 = 0;
    int count4 = 0;
    int count5 = 0;
    int count6 = 0;
    int count7 = 0;
    FrameLayout backBtn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qadha);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            getWindow().setNavigationBarColor(getResources().getColor(R.color.white));
        }

        value1 = (TextView) findViewById(R.id.value1);
        value2 = (TextView) findViewById(R.id.value2);
        value3 = (TextView) findViewById(R.id.value3);
        value4 =  (TextView)findViewById(R.id.value4);
        value5 =  (TextView)findViewById(R.id.value5);
        value6 =  (TextView)findViewById(R.id.value6);
        value7 =  (TextView)findViewById(R.id.value7);
        saveBtn = (FrameLayout) findViewById(R.id.save_btn);


        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveData();
            }
        });

        loadData();
        updateView();

        backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });
    }

    public void saveData(){
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString(TEXT_1, value1.getText().toString());
        editor.putString(TEXT_2, value2.getText().toString());
        editor.putString(TEXT_3, value3.getText().toString());
        editor.putString(TEXT_4, value4.getText().toString());
        editor.putString(TEXT_5, value5.getText().toString());
        editor.putString(TEXT_6, value6.getText().toString());
        editor.putString(TEXT_7, value7.getText().toString());

        editor.apply();
        Toast.makeText(this, "Qadha prayer's saved",Toast.LENGTH_SHORT).show();

    }

    public void loadData(){
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);

        text_1 = sharedPreferences.getString(TEXT_1, "0");
        text_2 = sharedPreferences.getString(TEXT_2, "0");
        text_3 = sharedPreferences.getString(TEXT_3, "0");
        text_4 = sharedPreferences.getString(TEXT_4, "0");
        text_5 = sharedPreferences.getString(TEXT_5, "0");
        text_6 = sharedPreferences.getString(TEXT_6, "0");
        text_7 = sharedPreferences.getString(TEXT_7, "0");
    }

    public void updateView(){
        value1.setText(text_1);
        value2.setText(text_2);
        value3.setText(text_3);
        value4.setText(text_4);
        value5.setText(text_5);
        value6.setText(text_6);
        value7.setText(text_7);
    }


    public void increment1(View view){
        count1++;
        value1.setText(""+count1);
    }
    public void decrement1(View view){
        if(count1<=0) count1 = 0;
        else count1--;
        value1.setText(""+count1);
    }

    public void increment2(View view){
        count2++;
        value2.setText(""+count2);
    }
    public void decrement2(View view){
        if(count2<=0) count2 = 0;
        else count2--;
        value2.setText(""+count2);
    }

    public void increment3(View view){
        count3++;
        value3.setText(""+count3);
    }
    public void decrement3(View view){
        if(count3<=0) count3 = 0;
        else count3--;
        value3.setText(""+count3);
    }

    public void increment4(View view){
        count4++;
        value4.setText(""+count4);
    }
    public void decrement4(View view){
        if(count4<=0) count4 = 0;
        else count4--;
        value4.setText(""+count4);
    }

    public void increment5(View view){
        count5++;
        value5.setText(""+count5);
    }
    public void decrement5(View view){
        if(count5<=0) count5 = 0;
        else count5--;
        value5.setText(""+count5);
    }

    public void increment6(View view){
        count6++;
        value6.setText(""+count6);
    }
    public void decrement6(View view){
        if(count6<=0) count6 = 0;
        else count6--;
        value6.setText(""+count6);
    }

    public void increment7(View view){
        count7++;
        value7.setText(""+count7);
    }
    public void decrement7(View view){
        if(count7<=0) count7 = 0;
        else count7--;
        value7.setText(""+count7);
    }

}