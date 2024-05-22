package com.example.baytalmal.activies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.baytalmal.R;
import com.example.baytalmal.adapter.CustomAdapter;
import com.example.baytalmal.model.Chapters;
import com.example.baytalmal.model.Topics;

import java.util.ArrayList;
import java.util.List;

public class PagdiActivity extends AppCompatActivity {

    ExpandableListView expandableListView;
    CustomAdapter customAdapter;
    List<Chapters> chaptersList;
    List<Topics>topicsList;
    FrameLayout backBtn;

    private TextView note1,note2,note3;
    private FrameLayout saveBtn;

    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String TEXT_11 = "text11";
    public static final String TEXT_12 = "text12";
    public static final String TEXT_13 = "text13";

    private String text_11,text_12,text_13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagdi);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            getWindow().setNavigationBarColor(getResources().getColor(R.color.white));
        }

        note1 = (TextView) findViewById(R.id.note_1);
        note2 = (TextView) findViewById(R.id.note_2);
        note3 = (TextView) findViewById(R.id.note_3);
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

        editor.putString(TEXT_11, note1.getText().toString());
        editor.putString(TEXT_12, note2.getText().toString());
        editor.putString(TEXT_13, note3.getText().toString());

        editor.apply();
        Toast.makeText(this, "Saved",Toast.LENGTH_SHORT).show();

    }

    public void loadData(){
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);

        text_11 = sharedPreferences.getString(TEXT_11, "");
        text_12 = sharedPreferences.getString(TEXT_12, "");
        text_13 = sharedPreferences.getString(TEXT_13, "");
    }

    public void updateView(){
        note1.setText(text_11);
        note2.setText(text_12);
        note3.setText(text_13);
    }

    void adddata(){
        chaptersList=new ArrayList<>();
        topicsList=new ArrayList<>();

        //chapter1
        topicsList.add(new Topics("Al-Fatihah\t (The Opening of the Book)\t (Ayat:7)", "s1"));
        chaptersList.add(new Chapters("1. Surah Al-Fatihah", topicsList));


        //chapter2
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Baqarah\t (The Cow)\t (Ayat:286)", "s2"));
        chaptersList.add(new Chapters("2. Surah Al-Baqarah", topicsList));


        //chapter3
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al Imran\t (The House of Imran)\t (Ayat:200)", "s3"));
        chaptersList.add(new Chapters("3. Surah Al Imran", topicsList));


        //chapter4
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("An-Nisa\t (Women)\t (Ayat:176)", "s4"));
        chaptersList.add(new Chapters("4. Surah An-Nisa", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Ma’idah\t (The Table)\t (Ayat:120)", "s5"));
        chaptersList.add(new Chapters("5. Surah Al-Ma’idah", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Anam\t (Cattle)\t (Ayat:165)", "s6"));
        chaptersList.add(new Chapters("6. Surah Al-Anam", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-A’raf\t (The Battlements)\t (Ayat:206)", "s7"));
        chaptersList.add(new Chapters("7. Surah Al-A’raf", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Anfal\t (The Spoils)\t (Ayat:75)", "s8"));
        chaptersList.add(new Chapters("8. Surah Al-Anfal", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Taubah\t (Repentance)\t (Ayat:129)", "s9"));
        chaptersList.add(new Chapters("9. Surah At-Taubah", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Yunus\t (Jonah)\t (Ayat:109)", "s10"));
        chaptersList.add(new Chapters("10. Surah Yunus", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Hud\t (Hood)\t (Ayat:123)", "s11"));
        chaptersList.add(new Chapters("11. Surah Hud", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Yusuf\t (Joseph)\t (Ayat:111)", "s12"));
        chaptersList.add(new Chapters("12. Surah Yusuf", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Ar-Ra’d\t (Thunder)\t (Ayat:43)", "s13"));
        chaptersList.add(new Chapters("13. Surah Ar-Ra’d", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Ibrahim\t (Abraham)\t (Ayat:52)", "s14"));
        chaptersList.add(new Chapters("14. Surah Ibrahim", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Hijr\t (El-Hijr)\t (Ayat:99)", "s15"));
        chaptersList.add(new Chapters("15. Surah Al-Hijr", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("An-Nahl\t (The Bee)\t (Ayat:128)", "s16"));
        chaptersList.add(new Chapters("16. Surah An-Nahl", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Isra\t (The Night Journey)\t (Ayat:111)", "s17"));
        chaptersList.add(new Chapters("17. Surah Al-Isra", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Kahf\t (The Cave)\t (Ayat:110)", "s18"));
        chaptersList.add(new Chapters("18. Surah Al-Kahf", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Maryam\t (Mary)\t (Ayat:98)", "s19"));
        chaptersList.add(new Chapters("19. Surah Maryam", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Taha\t (Ta Ha)\t (Ayat:135)", "s20"));
        chaptersList.add(new Chapters("20. Surah Taha", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Anbya (Prophets),(Ayat:112)", "s21"));
        chaptersList.add(new Chapters("21. Surah Al-Anbya", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Hajj (The Pilgrimage),(Ayat:78)", "s22"));
        chaptersList.add(new Chapters("22. Surah Al-Hajj", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Mu’minun (The Believers),(Ayat:118)", "s23"));
        chaptersList.add(new Chapters("23. Surah Al-Mu’minun", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("An-Nur (Light),(Ayat:64)", "s24"));
        chaptersList.add(new Chapters("24. Surah An-Nur", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Furqan (Discrimination),(Ayat:77)", "s25"));
        chaptersList.add(new Chapters("25. Surah Al-Furqan", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Ash-Shu’ara (The Poets),(Ayat:227)", "s26"));
        chaptersList.add(new Chapters("26. Surah Ash-Shu’ara", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("An-Naml (The Ant),(Ayat:93)", "s27"));
        chaptersList.add(new Chapters("27. Surah An-Naml", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Qasas (The Stories),(Ayat:88)", "s28"));
        chaptersList.add(new Chapters("28. Surah Al-Qasas", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-‘Ankabut (The Spider),(Ayat:69)", "s29"));
        chaptersList.add(new Chapters("29. Surah Al-‘Ankabut", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Ar-Rum (The Greeks),(Ayat:60)", "s30"));
        chaptersList.add(new Chapters("30. Surah Ar-Rum", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Luqman (Lokman),(Ayat:34)", "s31"));
        chaptersList.add(new Chapters("31. Surah Luqman", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("As-Sajdah (Prostration),(Ayat:30)", "s32"));
        chaptersList.add(new Chapters("32. Surah As-Sajdah", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Ahzab (The Confederates),(Ayat:73)", "s33"));
        chaptersList.add(new Chapters("33. Surah Al-Ahzab", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Saba (Sheba),(Ayat:54)", "s34"));
        chaptersList.add(new Chapters("34. Surah Saba", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Fatir (The Angels),(Ayat:45)", "s35"));
        chaptersList.add(new Chapters("35. Surah Fatir", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Ya-Sin (Ya Sin),(Ayat:83)", "s36"));
        chaptersList.add(new Chapters("36. Surah Ya-Sin", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("As-Saffat (The Rangers),(Ayat:182)", "s37"));
        chaptersList.add(new Chapters("37. Surah As-Saffat", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Sad (Sad),(Ayat:88)", "s38"));
        chaptersList.add(new Chapters("38. Surah Sad", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Az-Zumar (The Companies),(Ayat:75)", "s39"));
        chaptersList.add(new Chapters("39. Surah Az-Zumar", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Ghafir (The Believer),(Ayat:85)", "s40"));
        chaptersList.add(new Chapters("40. Surah Ghafir", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Fussilat (Distinguished),(Ayat:54)", "s41"));
        chaptersList.add(new Chapters("41. Surah Fussilat", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Ash-Shuraa (Counsel),(Ayat:53)", "s42"));
        chaptersList.add(new Chapters("42. Surah Ash-Shuraa", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Az-Zukhruf (Ornaments),(Ayat:89)", "s43"));
        chaptersList.add(new Chapters("43. Surah Az-Zukhruf", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Ad-Dukhan (Smoke),(Ayat:59)", "s44"));
        chaptersList.add(new Chapters("44. Surah Ad-Dukhan", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Jathiyah (Hobbling),(Ayat:37)", "s45"));
        chaptersList.add(new Chapters("45. Surah Al-Jathiyah", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Ahqaf (The Sand-Dunes),(Ayat:35)", "s46"));
        chaptersList.add(new Chapters("46. Surah Al-Ahqaf", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Muhammad (Muhammad),(Ayat:38)", "s47"));
        chaptersList.add(new Chapters("47. Surah Muhammad", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Fath (Victory),(Ayat:29)", "s48"));
        chaptersList.add(new Chapters("48. Surah Al-Fath", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Hujurat (Apartments),(Ayat:18)", "s49"));
        chaptersList.add(new Chapters("49. Surah Al-Hujurat", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Qaf (Qaf),(Ayat:45)", "s50"));
        chaptersList.add(new Chapters("50. Surah Qaf", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Adh-Dhariyat (The Scatterers),(Ayat:60)", "s51"));
        chaptersList.add(new Chapters("51. Surah Adh-Dhariyat", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("At-Tur (The Mount),(Ayat:49)", "s52"));
        chaptersList.add(new Chapters("52. Surah At-Tur", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("An-Najm (The Star),(Ayat:62)", "s53"));
        chaptersList.add(new Chapters("53. Surah An-Najm", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Qamar (The Moon),(Ayat:55)", "s54"));
        chaptersList.add(new Chapters("54. Surah Al-Qamar", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Ar-Rahman (The All-merciful),(Ayat:78)", "s55"));
        chaptersList.add(new Chapters("55. Surah Ar-Rahman", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Waqi’ah (The Terror),(Ayat:96)", "s56"));
        chaptersList.add(new Chapters("56. Surah Al-Waqi’ah", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Hadid (Iron),(Ayat:29)", "s57"));
        chaptersList.add(new Chapters("57. Surah Al-Hadid", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Mujadila (The Disputer),(Ayat:22)", "s58"));
        chaptersList.add(new Chapters("58. Surah Al-Mujadila", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Hashr (The Mustering),(Ayat:24)", "s59"));
        chaptersList.add(new Chapters("59. Surah Al-Hashr", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Mumtahanah (The Woman Tested),(Ayat:13)", "s60"));
        chaptersList.add(new Chapters("60. Surah Al-Mumtahanah", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("As-Saf (The Ranks),(Ayat:14)", "s61"));
        chaptersList.add(new Chapters("61. Surah As-Saf", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Jumu’ah (Congregation),(Ayat:11)", "s62"));
        chaptersList.add(new Chapters("61. Surah Al-Jumu’ah", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Munafiqun (The Hypocrites),(Ayat:11)", "s63"));
        chaptersList.add(new Chapters("63. Surah Al-Munafiqun", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("At-Taghabun (Mutual Fraud),(Ayat:18)", "s64"));
        chaptersList.add(new Chapters("64. Surah At-Taghabun", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("At-Talaq (Divorce),(Ayat:12)", "s65"));
        chaptersList.add(new Chapters("65. Surah At-Talaq", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("At-Tahrim (The Forbidding),(Ayat:12)", "s66"));
        chaptersList.add(new Chapters("66. Surah At-Tahrim", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Mulk (The Kingdom),(Ayat:30)", "s67"));
        chaptersList.add(new Chapters("67. Surah Al-Mulk", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Qalam (The Pen),(Ayat:50)", "s68"));
        chaptersList.add(new Chapters("68. Surah Al-Qalam", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Haqqah (The Indubitable),(Ayat:52)", "s69"));
        chaptersList.add(new Chapters("69. Surah Al-Haqqah", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Maarij (The Stairways),(Ayat:42)", "s70"));
        chaptersList.add(new Chapters("70. Surah Al-Maarij", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Nuh (Noah),(Ayat:28)", "s71"));
        chaptersList.add(new Chapters("71. Surah Nuh", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Jinn (The Jinn),(Ayat:28)", "s72"));
        chaptersList.add(new Chapters("72. Surah Al-Jinn", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Muzzammil (Enwrapped),(Ayat:20)", "s73"));
        chaptersList.add(new Chapters("73. Surah Al-Muzzammil", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Muddaththir (Shrouded),(Ayat:56)", "s74"));
        chaptersList.add(new Chapters("74. Surah Al-Muddaththir", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Qiyamah (The Resurrection),(Ayat:40)", "s75"));
        chaptersList.add(new Chapters("75. Surah Al-Qiyamah", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Insan (The Man),(Ayat:31)", "s76"));
        chaptersList.add(new Chapters("76. Surah Al-Insan", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Mursalat (The Loosed Ones),(Ayat:50)", "s77"));
        chaptersList.add(new Chapters("77. Surah Al-Mursalat", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("An-Naba (The Tiding),(Ayat:40)", "s78"));
        chaptersList.add(new Chapters("78. Surah An-Naba", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("An-Nazi’at (The Pluckers),(Ayat:46)", "s79"));
        chaptersList.add(new Chapters("79. Surah An-Nazi’at", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("‘Abasa (He Frowned),(Ayat:42)", "s80"));
        chaptersList.add(new Chapters("80. Surah ‘Abasa", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("At-Takwi (The Darkening),(Ayat:29)r", "s81"));
        chaptersList.add(new Chapters("81. Surah At-Takwir", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Infitar (The Splitting),(Ayat:19)", "s82"));
        chaptersList.add(new Chapters("82. Surah Al-Infitar", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Mutaffifin (The Stinters),(Ayat:36)", "s83"));
        chaptersList.add(new Chapters("83. Surah Al-Mutaffifin", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Inshiqaq (The Rending),(Ayat:25)", "s84"));
        chaptersList.add(new Chapters("84. Surah Al-Inshiqaq", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Buruj (The Constellations),(Ayat:22)", "s85"));
        chaptersList.add(new Chapters("85. Surah Al-Buruj", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("At-Tariq (The Night-star),(Ayat:17)", "s86"));
        chaptersList.add(new Chapters("86. Surah At-Tariq", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-A’la (The Most High),(Ayat:19)", "s87"));
        chaptersList.add(new Chapters("87. Surah Al-A’la", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Ghashiyah (The Enveloper),(Ayat:26)", "s88"));
        chaptersList.add(new Chapters("88. Surah Al-Ghashiyah", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Fajr (The Dawn),(Ayat:30)", "s89"));
        chaptersList.add(new Chapters("89. Surah Al-Fajr", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Balad (The Land),(Ayat:20)", "s90"));
        chaptersList.add(new Chapters("90. Surah Al-Balad", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Ash-Shams (The Sun),(Ayat:15)", "s91"));
        chaptersList.add(new Chapters("91. Surah Ash-Shams", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Layl (The Night),(Ayat:21)", "s92"));
        chaptersList.add(new Chapters("92. Surah Al-Layl", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Ad-Duhaa (The Forenoon),(Ayat:11)", "s93"));
        chaptersList.add(new Chapters("93. Surah Ad-Duhaa", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Ash-Sharh (The Expanding),(Ayat:8)", "s94"));
        chaptersList.add(new Chapters("94. Surah Ash-Sharh", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("At-Tin (The Fig),(Ayat:8)", "s95"));
        chaptersList.add(new Chapters("95. Surah At-Tin", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-‘Alaq (The Blood-clot),(Ayat:19)", "s96"));
        chaptersList.add(new Chapters("96. Surah Al-‘Alaq", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Qadr (Power),(Ayat:5)", "s97"));
        chaptersList.add(new Chapters("97. Surah Al-Qadr", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Bayyinah (The Clear Sign),(Ayat:8)", "s98"));
        chaptersList.add(new Chapters("98. Surah Al-Bayyinah", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Az-Zalzalah (The Earthquake),(Ayat:8)", "s99"));
        chaptersList.add(new Chapters("99. Surah Az-Zalzalah", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-‘Adiyat (The Chargers),(Ayat:11)", "s100"));
        chaptersList.add(new Chapters("100. Surah Al-‘Adiyat", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Qari’ah (The Clatterer),(Ayat:11)", "s101"));
        chaptersList.add(new Chapters("101. Surah Al-Qari’ah", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("At-Takathur (Rivalry),(Ayat:8)", "s102"));
        chaptersList.add(new Chapters("102. Surah At-Takathur", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-‘Asr (Afternoon),(Ayat:3)", "s103"));
        chaptersList.add(new Chapters("103. Surah Al-‘Asr", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Humazah (The Backbiter),(Ayat:9)", "s104"));
        chaptersList.add(new Chapters("104. Surah Al-Humazah", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Fil (The Elephant),(Ayat:5)", "s105"));
        chaptersList.add(new Chapters("105. Surah Al-Fil", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Quraysh (Quraish),(Ayat:4)", "s106"));
        chaptersList.add(new Chapters("106. Surah Quraysh", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Ma’un (Charity),(Ayat:7)", "s107"));
        chaptersList.add(new Chapters("107. Surah Al-Ma’un", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Kawthar (Abundance),(Ayat:3)", "s108"));
        chaptersList.add(new Chapters("108. Surah Al-Kawthar", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Kafirun (The Unbelievers),(Ayat:6)", "s109"));
        chaptersList.add(new Chapters("109. Surah Al-Kafirun", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("An-Nasr (Help),(Ayat:3)", "s110"));
        chaptersList.add(new Chapters("110. Surah An-Nasr", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Masad (The Flame),(Ayat:5)", "s111"));
        chaptersList.add(new Chapters("111. Surah Al-Masad", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Ikhlas (Sincere Religion),(Ayat:4)", "s112"));
        chaptersList.add(new Chapters("112. Surah Al-Ikhlas", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("Al-Falaq (Daybreak),(Ayat:5)", "s113"));
        chaptersList.add(new Chapters("113. Surah Al-Falaq", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("An-Nas (Men),(Ayat:6)", "s114"));
        chaptersList.add(new Chapters("114. Surah An-Nas", topicsList));





        sendData();
    }

    void sendData(){
        customAdapter=new CustomAdapter(chaptersList, PagdiActivity.this);
        expandableListView.setAdapter(customAdapter);
    }
}