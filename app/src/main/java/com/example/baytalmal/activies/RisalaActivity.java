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

public class RisalaActivity extends AppCompatActivity {

    ExpandableListView expandableListView;
    CustomAdapter customAdapter;
    List<Chapters> chaptersList;
    List<Topics>topicsList;
    FrameLayout backBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_risala);
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
        topicsList.add(new Topics("View:- Namaz-e-Ayat", "namazeaayat"));
        chaptersList.add(new Chapters("1. Namaz-e-Ayat", topicsList));


        //chapter2
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("View:- Namaz-e-Eiden", "namazeeden"));
        chaptersList.add(new Chapters("2. Namaz-e-Eiden", topicsList));


        //chapter3
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("View:- Namaz-e-Walidain", "namazehadiyaevalidain"));
        chaptersList.add(new Chapters("3. Namaz-e-Walidain", topicsList));


        //chapter4
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("View:- Namaz-e-Ijarah", "namazeijara"));
        chaptersList.add(new Chapters("4. Namaz-e-Ijarah", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("View:- Namaz-e-Jummah", "namazejumma"));
        chaptersList.add(new Chapters("5. Namaz-e-Jummah", topicsList));

        //chapter6
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("View:- Namaz-e-kasr", "namazekasr"));
        chaptersList.add(new Chapters("6. Namaz-e-kasr", topicsList));

        //chapter7
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("View:- Namaz-e-Tahajjud", "namazeshab"));
        chaptersList.add(new Chapters("7. Namaz-e-Tahajjud", topicsList));

        //chapter8
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("View:- Namaz-e-Shab", "namazetahajjud"));
        chaptersList.add(new Chapters("8. Namaz-e-Shab", topicsList));

        //chapter9
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("View:- Namaz-e-Wahshat", "namazevaheshat"));
        chaptersList.add(new Chapters("9. Namaz-e-Wahshat", topicsList));

        sendData();
    }

    void sendData(){
        customAdapter=new CustomAdapter(chaptersList, RisalaActivity.this);
        expandableListView.setAdapter(customAdapter);
    }
}