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

public class AadabeAzadariActivity extends AppCompatActivity {

    ExpandableListView expandableListView;
    CustomAdapter customAdapter;
    List<Chapters> chaptersList;
    List<Topics>topicsList;
    FrameLayout backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aadabe_azadari);
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
        topicsList.add(new Topics("માહે મોહર્રમની ફઝીલત અને ટૂંકી રૂપરેખા", "azadari1"));
        chaptersList.add(new Chapters("Azadari Fazilat", topicsList));


        //chapter2
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("પહેલી મોહર્રમ (ચાંદરાત)", "azadari2"));
        chaptersList.add(new Chapters("1. Aadabe Azadari", topicsList));


        //chapter3
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("બીજી મોહર્રમ", "azadari41"));
        chaptersList.add(new Chapters("2. Aadabe Azadari", topicsList));


        //chapter4
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("ત્રીજી મોહર્રમ", "azadari42"));
        chaptersList.add(new Chapters("3. Aadabe Azadari", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("ચોથી મોહર્રમ", "azadari43"));
        chaptersList.add(new Chapters("4. Aadabe Azadari", topicsList));

        //chapter6
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("પાંચમી મોહર્રમ", "azadari51"));
        chaptersList.add(new Chapters("5. Aadabe Azadari", topicsList));

        //chapter7
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("છઠ્ઠી મોહર્રમ", "azadari52"));
        chaptersList.add(new Chapters("6. Aadabe Azadari", topicsList));

        //chapter7
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("સાતમી મોહર્રમ", "azadari5"));
        chaptersList.add(new Chapters("7. Aadabe Azadari", topicsList));

        //chapter7
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("આઠમી મોહર્રમ", "azadari6"));
        chaptersList.add(new Chapters("8. Aadabe Azadari", topicsList));

        //chapter7
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("નવમી મોહર્રમ", "azadari7"));
        chaptersList.add(new Chapters("9. Aadabe Azadari", topicsList));

        //chapter7
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("દસમી મોહર્રમ", "azadari8"));
        chaptersList.add(new Chapters("10. Aadabe Azadari", topicsList));

        //chapter7
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("અગિયારમી મોહર્રમ (શામે ગરીબાં)", "azadari9"));
        chaptersList.add(new Chapters("11. Aadabe Azadari", topicsList));

        //chapter7
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("બારમી મોહર્રમ", "azadari10"));
        chaptersList.add(new Chapters("12. Aadabe Azadari", topicsList));

        //chapter7
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("ત્રીજી સફરના આમાલ", "azadari11"));
        chaptersList.add(new Chapters("13. Aadabe Azadari", topicsList));

        //chapter7
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("ચહેલુમ", "azadari12"));
        chaptersList.add(new Chapters("14. Aadabe Azadari", topicsList));

        //chapter7
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("ઝિયારતે શોહદાએ કરબલા", "azadari13"));
        chaptersList.add(new Chapters("15. Aadabe Azadari", topicsList));

        sendData();
    }

    void sendData(){
        customAdapter=new CustomAdapter(chaptersList, AadabeAzadariActivity.this);
        expandableListView.setAdapter(customAdapter);
    }
}