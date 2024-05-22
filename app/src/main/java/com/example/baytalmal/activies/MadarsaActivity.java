package com.example.baytalmal.activies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.example.baytalmal.R;
import com.example.baytalmal.adapter.CustomAdapter;
import com.example.baytalmal.model.Chapters;
import com.example.baytalmal.model.Topics;

import java.util.ArrayList;
import java.util.List;

public class MadarsaActivity extends AppCompatActivity {

    ExpandableListView expandableListView;
    CustomAdapter customAdapter;
    List<Chapters> chaptersList;
    List<Topics>topicsList;
    FrameLayout backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madarsa);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            getWindow().setNavigationBarColor(getResources().getColor(R.color.white));
        }

        backBtn = findViewById(R.id.back_btn);
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

    void adddata(){
        chaptersList=new ArrayList<>();
        topicsList=new ArrayList<>();

        //chapter1
        topicsList.add(new Topics("View:- Dua-e-Kumayl", "duaekumayl"));
        chaptersList.add(new Chapters("1. Dua-e-Kumayl", topicsList));


        //chapter2
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("View:- Dua-e-Nudba", "duaenudba"));
        chaptersList.add(new Chapters("2. Dua-e-Nudba", topicsList));


        //chapter3
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("View:- Dua-e-Tauba", "duaetauba"));
        chaptersList.add(new Chapters("3. Dua-e-Tauba", topicsList));


        //chapter4
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("View:- Dua-e-Arfa", "duaearfa"));
        chaptersList.add(new Chapters("4. Dua-e-Arfa", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("View:- Dua-e-Sabasab", "duaesabasab"));
        chaptersList.add(new Chapters("5. Dua-e-Sabasab", topicsList));

        //chapter6
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("View:- Dua-e-Ahad", "duaeahad"));
        chaptersList.add(new Chapters("6. Dua-e-Ahad", topicsList));

        //chapter7
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("View:- Dua-e-Mujeer", "duaemujeer"));
        chaptersList.add(new Chapters("7. Dua-e-Mujeer", topicsList));

        //chapter7
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("View:- Dua-e-Har Dard", "diseaseprayer"));
        chaptersList.add(new Chapters("8. Dua-e-Har Dard", topicsList));

        sendData();
    }

    void sendData(){
        customAdapter=new CustomAdapter(chaptersList, MadarsaActivity.this);
        expandableListView.setAdapter(customAdapter);
    }
}