package com.example.baytalmal.activies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.baytalmal.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {

    CardView populationLayout, pagdiLayout, madarsaLayout, risalalayout;
    LinearLayout tafheemUlTarteel,qadha,hadith,sahifaKamila,translator;
    ImageView settingBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            getWindow().setNavigationBarColor(getResources().getColor(R.color.white));
        }



        populationLayout = findViewById(R.id.population_layout);
        pagdiLayout = findViewById(R.id.pagdi_layout);
        madarsaLayout = findViewById(R.id.madarsa_layout);
        risalalayout = findViewById(R.id.risala_layout);
        settingBtn = findViewById(R.id.setting_btn);
        tafheemUlTarteel = findViewById(R.id.tafeem_ul_tarteel);
        qadha = findViewById(R.id.qadha_layout);
        hadith = findViewById(R.id.hadith);
        sahifaKamila = findViewById(R.id.sahifa_kamila);
        translator = findViewById(R.id.translator_layout);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.bottom_home);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.bottom_home:
                    return true;
                case R.id.bottom_books:
                    startActivity(new Intent(getApplicationContext(), LibraryActivity.class));
                    finish();
                    return true;
                case R.id.bottom_tasbih:
                    startActivity(new Intent(getApplicationContext(), TasbihActivity.class));
                    finish();
                    return true;

            }
            return false;
        });






        populationLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, PopulationActivity.class);
                startActivity(intent);
            }
        });

        pagdiLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, PagdiActivity.class);
                startActivity(intent);

            }
        });

        madarsaLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, MadarsaActivity.class);
                startActivity(intent);

            }
        });

        risalalayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, RisalaActivity.class);
                startActivity(intent);

            }
        });

        settingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, SettingActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });

        tafheemUlTarteel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, TafheemUlTarteelActivity.class);
                startActivity(intent);
            }
        });

        qadha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, QadhaActivity.class);
                startActivity(intent);
            }
        });

        hadith.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, HadithActivity.class);
                startActivity(intent);
            }
        });

        sahifaKamila.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, SahifaKamelaActivity.class);
                startActivity(intent);
            }
        });

        translator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, TranslatorActivity.class);
                startActivity(intent);
            }
        });
    }

}