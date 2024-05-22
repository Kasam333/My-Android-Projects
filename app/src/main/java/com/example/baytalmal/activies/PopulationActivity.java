package com.example.baytalmal.activies;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.baytalmal.R;
import com.example.baytalmal.adapter.CustomAdapter;
import com.example.baytalmal.model.Chapters;
import com.example.baytalmal.model.Topics;

import java.util.ArrayList;
import java.util.List;

public class PopulationActivity extends AppCompatActivity {

    ExpandableListView expandableListView;
    CustomAdapter customAdapter;
    List<Chapters>chaptersList;
    List<Topics>topicsList;

    FrameLayout backBtn;

    private EditText note1,note2,note3,note4,note5,note6,note7,note8,note9,note10,note11,note12;
    private FrameLayout saveBtn;

    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String TEXT_21 = "text21";
    public static final String TEXT_22 = "text22";
    public static final String TEXT_23 = "text23";
    public static final String TEXT_24 = "text24";
    public static final String TEXT_25 = "text25";
    public static final String TEXT_26 = "text26";
    public static final String TEXT_27 = "text27";
    public static final String TEXT_28 = "text28";
    public static final String TEXT_29 = "text29";
    public static final String TEXT_30 = "text30";
    public static final String TEXT_31 = "text31";
    public static final String TEXT_32 = "text32";

    private String text_21,text_22,text_23,text_24,text_25,text_26,text_27,text_28,text_29,text_30,text_31,text_32;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_population);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            getWindow().setNavigationBarColor(getResources().getColor(R.color.white));
        }

        note1 = (EditText) findViewById(R.id.note_1);
        note2 = (EditText) findViewById(R.id.note_2);
        note3 = (EditText) findViewById(R.id.note_3);
        note4 = (EditText) findViewById(R.id.note_4);
        note5 = (EditText) findViewById(R.id.note_5);
        note6 = (EditText) findViewById(R.id.note_6);
        note7 = (EditText) findViewById(R.id.note_7);
        note8 = (EditText) findViewById(R.id.note_8);
        note9 = (EditText) findViewById(R.id.note_9);
        note10 = (EditText) findViewById(R.id.note_10);
        note11 = (EditText) findViewById(R.id.note_11);
        note12 = (EditText) findViewById(R.id.note_12);
        saveBtn = (FrameLayout) findViewById(R.id.save_btn);
        backBtn = findViewById(R.id.back_btn);


        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveData();
            }
        });

        loadData();
        updateView();

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });

        expandableListView=findViewById(R.id.expandableListView);

        adddata();


    }

    public void saveData(){
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString(TEXT_21, note1.getText().toString());
        editor.putString(TEXT_22, note2.getText().toString());
        editor.putString(TEXT_23, note3.getText().toString());
        editor.putString(TEXT_24, note4.getText().toString());
        editor.putString(TEXT_25, note5.getText().toString());
        editor.putString(TEXT_26, note6.getText().toString());
        editor.putString(TEXT_27, note7.getText().toString());
        editor.putString(TEXT_28, note8.getText().toString());
        editor.putString(TEXT_29, note9.getText().toString());
        editor.putString(TEXT_30, note10.getText().toString());
        editor.putString(TEXT_31, note11.getText().toString());
        editor.putString(TEXT_32, note12.getText().toString());

        editor.apply();
        Toast.makeText(this, "Saved",Toast.LENGTH_SHORT).show();

    }

    public void loadData(){
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);

        text_21 = sharedPreferences.getString(TEXT_21, "");
        text_22 = sharedPreferences.getString(TEXT_22, "");
        text_23 = sharedPreferences.getString(TEXT_23, "");
        text_24 = sharedPreferences.getString(TEXT_24, "");
        text_25 = sharedPreferences.getString(TEXT_25, "");
        text_26 = sharedPreferences.getString(TEXT_26, "");
        text_27 = sharedPreferences.getString(TEXT_27, "");
        text_28 = sharedPreferences.getString(TEXT_28, "");
        text_29 = sharedPreferences.getString(TEXT_29, "");
        text_30 = sharedPreferences.getString(TEXT_30, "");
        text_31 = sharedPreferences.getString(TEXT_31, "");
        text_32 = sharedPreferences.getString(TEXT_32, "");
    }

    public void updateView(){
        note1.setText(text_21);
        note2.setText(text_22);
        note3.setText(text_23);
        note4.setText(text_24);
        note5.setText(text_25);
        note6.setText(text_26);
        note7.setText(text_27);
        note8.setText(text_28);
        note9.setText(text_29);
        note10.setText(text_30);
        note11.setText(text_31);
        note12.setText(text_32);
    }

    void adddata(){
        chaptersList=new ArrayList<>();
        topicsList=new ArrayList<>();

        //chapter1
        topicsList.add(new Topics("Akhlaq (اخلاق) 4 years", "akhlaq4"));
        topicsList.add(new Topics("Akhlaq (اخلاق) 5 years", "akhlaq5"));
        topicsList.add(new Topics("Akhlaq (اخلاق) 6 years", "akhlaq6"));
        topicsList.add(new Topics("Akhlaq (اخلاق) 7 years", "akhlaq7"));
        topicsList.add(new Topics("Akhlaq (اخلاق) 8 years", "akhlaq8"));
        topicsList.add(new Topics("Akhlaq (اخلاق) 9 years", "akhlaq9"));
        topicsList.add(new Topics("Akhlaq (اخلاق) 10 years", "akhlaq10"));
        topicsList.add(new Topics("Akhlaq (اخلاق) 11 years", "akhlaq11"));
        topicsList.add(new Topics("Akhlaq (اخلاق) 12 years", "akhlaq12"));
        topicsList.add(new Topics("Akhlaq (اخلاق) 13 years", "akhlaq13"));
        topicsList.add(new Topics("Akhlaq (اخلاق) 14 years", "akhlaq14"));
        chaptersList.add(new Chapters("Akhlaq - اخلاق", topicsList));


        //chapter2
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Tarikh (تاریخ) 4 years", "tarikh4"));
        topicsList.add(new Topics("Tarikh (تاریخ) 5 years", "tarikh5"));
        topicsList.add(new Topics("Tarikh (تاریخ) 6 years", "tarikh6"));
        topicsList.add(new Topics("Tarikh (تاریخ) 7 years", "tarikh7"));
        topicsList.add(new Topics("Tarikh (تاریخ) 8 years", "tarikh8"));
        topicsList.add(new Topics("Tarikh (تاریخ) 9 years", "tarikh9"));
        topicsList.add(new Topics("Tarikh (تاریخ) 10 years", "tarikh10"));
        topicsList.add(new Topics("Tarikh (تاریخ) 11 years", "tarikh11"));
        topicsList.add(new Topics("Tarikh (تاریخ) 12 years", "tarikh12"));
        topicsList.add(new Topics("Tarikh (تاریخ) 13 years", "tarikh13"));
        topicsList.add(new Topics("Tarikh (تاریخ) 14 years", "tarikh14"));
        chaptersList.add(new Chapters("Tarikh - تاریخ", topicsList));


        //chapter3
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Fiqh (فقہ) 4 years", "fiqh4"));
        topicsList.add(new Topics("Fiqh (فقہ) 5 years", "fiqh5"));
        topicsList.add(new Topics("Fiqh (فقہ) 6 years", "fiqh6"));
        topicsList.add(new Topics("Fiqh (فقہ) 7 years", "fiqh7"));
        topicsList.add(new Topics("Fiqh (فقہ) 8 years", "fiqh8"));
        topicsList.add(new Topics("Fiqh (فقہ) 9 years", "fiqh9"));
        topicsList.add(new Topics("Fiqh (فقہ) 10 years", "fiqh10"));
        topicsList.add(new Topics("Fiqh (فقہ) 11 years", "fiqh11"));
        topicsList.add(new Topics("Fiqh (فقہ) 12 years", "fiqh12"));
        topicsList.add(new Topics("Fiqh (فقہ) 13 years", "fiqh13"));
        topicsList.add(new Topics("Fiqh (فقہ) 14 years", "fiqh14"));
        chaptersList.add(new Chapters("Fiqh - فقہ", topicsList));


        //chapter4
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Quran (قرآن) 4 years", "quran4"));
        topicsList.add(new Topics("Quran (قرآن) 5 years", "quran5"));
        topicsList.add(new Topics("Quran (قرآن) 6 years", "quran6"));
        topicsList.add(new Topics("Quran (قرآن) 7 years", "quran7"));
        topicsList.add(new Topics("Quran (قرآن) 8 years", "quran8"));
        topicsList.add(new Topics("Quran (قرآن) 9 years", "quran9"));
        topicsList.add(new Topics("Quran (قرآن) 10 years", "quran10"));
        topicsList.add(new Topics("Quran (قرآن) 11 years", "quran11"));
        topicsList.add(new Topics("Quran (قرآن) 12 years", "quran12"));
        topicsList.add(new Topics("Quran (قرآن) 13 years", "quran13"));
        topicsList.add(new Topics("Quran (قرآن) 14 years", "quran14"));
        chaptersList.add(new Chapters("Quran - قرآن", topicsList));

        sendData();
    }

    void sendData(){
        customAdapter=new CustomAdapter(chaptersList, PopulationActivity.this);
        expandableListView.setAdapter(customAdapter);
    }
}