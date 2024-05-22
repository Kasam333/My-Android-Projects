package com.example.baytalmal.activies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;

import com.example.baytalmal.R;
import com.example.baytalmal.adapter.CustomAdapter;
import com.example.baytalmal.model.Chapters;
import com.example.baytalmal.model.Topics;

import java.util.ArrayList;
import java.util.List;

public class TafheemUlTarteelActivity extends AppCompatActivity {

    ExpandableListView expandableListView;
    CustomAdapter customAdapter;
    List<Chapters> chaptersList;
    List<Topics>topicsList;
    FrameLayout backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tafheem_ul_tarteel);
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
        topicsList.add(new Topics("કુરઆને મજીદની કિરઅતનું મહત્વ અને તેનો સવાબ", "taf1"));
        chaptersList.add(new Chapters("Chapter-1", topicsList));


        //chapter2
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("કુરઆને મજીદની તિલાવતના ફાયદા", "taf2"));
        chaptersList.add(new Chapters("Chapter-2", topicsList));


        //chapter3
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("કુરઆને મજીદની અદબ અને તિલાવતના આદાબ", "taf3"));
        chaptersList.add(new Chapters("Chapter-3", topicsList));


        //chapter4
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("તજવીદ એટલે શું", "taf4"));
        chaptersList.add(new Chapters("Chapter-4", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("અરબી હુરૂફ (મૂળાક્ષરો)ના મખારિજ", "taf5"));
        chaptersList.add(new Chapters("Chapter-5", topicsList));

        //chapter6
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("અરબી હુરૂફના પ્રકારો", "taf6"));
        chaptersList.add(new Chapters("Chapter-6", topicsList));

        //chapter7
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("ભારે અને હલકા હુરૂફ", "taf7"));
        chaptersList.add(new Chapters("Chapter-7", topicsList));

        //chapter7
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("તજવીદના નિયમો:- Rule No.1", "taf81"));
        topicsList.add(new Topics("તજવીદના નિયમો:- Rule No.2", "taf82"));
        topicsList.add(new Topics("તજવીદના નિયમો:- Rule No.3", "taf83"));
        topicsList.add(new Topics("તજવીદના નિયમો:- Rule No.4", "taf84"));
        topicsList.add(new Topics("તજવીદના નિયમો:- Rule No.5", "taf85"));
        topicsList.add(new Topics("તજવીદના નિયમો:- Rule No.6", "taf86"));
        topicsList.add(new Topics("તજવીદના નિયમો:- Rule No.7", "taf87"));
        topicsList.add(new Topics("તજવીદના નિયમો:- Rule No.8", "taf88"));
        topicsList.add(new Topics("તજવીદના નિયમો:- Rule No.9", "taf89"));
        chaptersList.add(new Chapters("Chapter-8", topicsList));

        //chapter7
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("વુકૂફ નાં ચિહ્નો", "taf9"));
        chaptersList.add(new Chapters("Chapter-9", topicsList));

        //chapter7
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("કુરઆને મજીદના સૂરાઓની સ્વાધ્યાય", "taf10"));
        chaptersList.add(new Chapters("Chapter-10", topicsList));

        //chapter7
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("કુરઆને મજીદની આયતોની સ્વાધ્યાય", "taf11"));
        chaptersList.add(new Chapters("Chapter-11", topicsList));



        sendData();
    }

    void sendData(){
        customAdapter=new CustomAdapter(chaptersList, TafheemUlTarteelActivity.this);
        expandableListView.setAdapter(customAdapter);
    }
}