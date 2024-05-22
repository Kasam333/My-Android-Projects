package com.example.baytalmal.activies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;

import com.example.baytalmal.R;
import com.example.baytalmal.adapter.CustomAdapter;
import com.example.baytalmal.model.Chapters;
import com.example.baytalmal.model.Topics;

import java.util.ArrayList;
import java.util.List;

public class MarsiyaActivity extends AppCompatActivity {

    ExpandableListView expandableListView;
    CustomAdapter customAdapter;
    List<Chapters> chaptersList;
    List<Topics>topicsList;
    FrameLayout backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marsiya);
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


        topicsList.add(new Topics("ઈમામ હુસૈન (અ.)ની મદીનાથી વિદાય", "marsiya1"));
        chaptersList.add(new Chapters("1. Mir Anis Marsiya", topicsList));


        //chapter3
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("જનાબે મુસ્લિમ (અ.)ની શહાદત", "marsiya2"));
        chaptersList.add(new Chapters("2. Mir Anis Marsiya", topicsList));


        //chapter4
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("તશબે આશૂર", "marsiya3"));
        chaptersList.add(new Chapters("3. Mir Anis Marsiya", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("જનાબે હૂર (અ.)ની શહાદત", "marsiya4"));
        chaptersList.add(new Chapters("4. Mir Anis Marsiya", topicsList));

        //chapter6
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("ફરઝંદાને મુસ્લિમ (અ.)ની શહાદત", "marsiya5"));
        chaptersList.add(new Chapters("5. Mir Anis Marsiya", topicsList));

        //chapter7
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("ઓનો મોહંમદની શહાદત", "marsiya6"));
        chaptersList.add(new Chapters("6. Mir Anis Marsiya", topicsList));

        //chapter7
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("હઝરત અબ્બાસ અલમદારની શહાદત", "marsiya7"));
        chaptersList.add(new Chapters("7. Mir Anis Marsiya", topicsList));

        //chapter7
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("જનાબે કાસિમ (અ.)ની શહાદત", "marsiya8"));
        chaptersList.add(new Chapters("8. Mir Anis Marsiya", topicsList));

        //chapter7
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("જનાબે અલી અકબર (અ.)ની શહાદત", "marsiya9"));
        chaptersList.add(new Chapters("9. Mir Anis Marsiya", topicsList));

        //chapter7
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("ઇમામ હુસૈન (અ.)ની શહાદત", "marsiya10"));
        chaptersList.add(new Chapters("10. Mir Anis Marsiya", topicsList));




        sendData();
    }

    void sendData(){
        customAdapter=new CustomAdapter(chaptersList, MarsiyaActivity.this);
        expandableListView.setAdapter(customAdapter);
    }
}
