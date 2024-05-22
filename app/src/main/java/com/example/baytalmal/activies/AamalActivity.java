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

public class AamalActivity extends AppCompatActivity {

    ExpandableListView expandableListView;
    CustomAdapter customAdapter;
    List<Chapters> chaptersList;
    List<Topics>topicsList;

    FrameLayout backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aamal);
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
        topicsList.add(new Topics("ઈદે ગદીરના આમાલ", "eideghadir"));
        chaptersList.add(new Chapters("1. Eid al-Ghadir A'mal", topicsList));

        //chapter1
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("માહે સફરના અમલ", "mahesafar"));
        chaptersList.add(new Chapters("2. Mahe Safar A'mal", topicsList));


        //chapter3
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("19મી રાતના અમલ", "amal19"));
        topicsList.add(new Topics("21મી રાતના અમલ", "amal21"));
        topicsList.add(new Topics("23મી રાતના અમલ", "amal23"));
        chaptersList.add(new Chapters("3. Shab-e-qadr A'mal", topicsList));


        //chapter4
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("શબે બારાતના અમલ", "shaban15"));
        chaptersList.add(new Chapters("4. Shab-e-Barat A'mal", topicsList));

        topicsList=new ArrayList<>();
        topicsList.add(new Topics("માહે મોહરમના અમલ", "mahemuharram"));
        chaptersList.add(new Chapters("5. Mahe Muharram A'mal", topicsList));




        sendData();
    }

    void sendData(){
        customAdapter=new CustomAdapter(chaptersList, AamalActivity.this);
        expandableListView.setAdapter(customAdapter);
    }
}