package com.example.baytalmal.activies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.baytalmal.R;
import com.example.baytalmal.adapter.CustomAdapter;
import com.example.baytalmal.model.Chapters;
import com.example.baytalmal.model.Topics;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class LibraryActivity extends AppCompatActivity {

    ExpandableListView expandableListView;
    CustomAdapter customAdapter;
    List<Chapters> chaptersList;
    List<Topics>topicsList;

    ImageView settingBtn;
    LinearLayout ziyatatLayout,amalLayout,muharramLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            getWindow().setNavigationBarColor(getResources().getColor(R.color.white));
        }

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.bottom_books);
        settingBtn = findViewById(R.id.setting_btn);
        ziyatatLayout = findViewById(R.id.ziyaratLayout);
        amalLayout = findViewById(R.id.amal_layout);
        muharramLayout = findViewById(R.id.muharram_layout);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.bottom_home:
                    startActivity(new Intent(getApplicationContext(), HomeActivity.class));
                    finish();
                    return true;
                case R.id.bottom_books:
                    return true;
                case R.id.bottom_tasbih:
                    startActivity(new Intent(getApplicationContext(), TasbihActivity.class));
                    finish();
                    return true;
            }
            return false;
        });

        expandableListView=findViewById(R.id.expandableListView);

        adddata();

        settingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LibraryActivity.this, SettingActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

            }
        });

        ziyatatLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LibraryActivity.this, ZiyaratActivity.class);
                startActivity(intent);

            }
        });

        amalLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LibraryActivity.this, AamalActivity.class);
                startActivity(intent);

            }
        });

        muharramLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LibraryActivity.this, MuharramActivity.class);
                startActivity(intent);

            }
        });
    }
    void adddata(){
        chaptersList=new ArrayList<>();
        topicsList=new ArrayList<>();

        //chapter1
        topicsList.add(new Topics("View:- અવસાફે ઔલિયા", "k1"));
        chaptersList.add(new Chapters("1. Awsafe Auliya", topicsList));


        //chapter2
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("View:- અહકામે મય્યત", "k2"));
        chaptersList.add(new Chapters("2. Ahkame Mayyat", topicsList));


        //chapter3
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("View:- આદાબે અઝાદારી", "k3"));
        chaptersList.add(new Chapters("3. Aadaab-e-Azadari", topicsList));


        //chapter4
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("View:- ગુલશને હિદાયત", "k4"));
        chaptersList.add(new Chapters("4. Gulshan-e-Hidayat", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("View:- તિબ્બે ઇમામ રઝા (અ.)", "k5"));
        chaptersList.add(new Chapters("5. Tibbe Imam-e-Raza(a.s)", topicsList));

        //chapter6
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("View:- નિકાહનું  રિસર્ચ & તલાક વિશે", "k6"));
        chaptersList.add(new Chapters("6. Nikah Research & Talaq", topicsList));

        //chapter7
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("View:- નુક્તએ હિદાયત", "k7"));
        chaptersList.add(new Chapters("7. Nukta-e-Hidayat", topicsList));

        //chapter8
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("View:- ફાતેહા પઢાવવાની રીત", "k8"));
        chaptersList.add(new Chapters("8. Fateha", topicsList));

        //chapter9
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("View:- રહમાનના બંદાઓની સિફતો", "k9"));
        chaptersList.add(new Chapters("9. Servants of Rahman", topicsList));


        sendData();
    }

    void sendData(){
        customAdapter=new CustomAdapter(chaptersList, LibraryActivity.this);
        expandableListView.setAdapter(customAdapter);
    }
}