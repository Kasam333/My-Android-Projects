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

public class ZiyaratActivity extends AppCompatActivity {

    ExpandableListView expandableListView;
    CustomAdapter customAdapter;
    List<Chapters> chaptersList;
    List<Topics>topicsList;

    FrameLayout backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ziyarat);
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
        topicsList.add(new Topics("1). નમાઝે સુબ્હની તા’કીબાત", "tak2"));
        topicsList.add(new Topics("2). રિવાયત કરવામાં આવી છે કે દુનિયા અને આખેરતની કામિયાબી અને બીમારીને દૂર કરવા માટે નમાઝે સુહ અને મગરિબ પછી આ દુઆ પઢે", "tak3"));
        topicsList.add(new Topics("3). હઝરત ઈમામ જાફર સાદિક (અ.)થી મકૂલ છે કે સવાર અને સાંજના સમયે આ દુઆ પઢ્યા કરો", "tak4"));
        topicsList.add(new Topics("4). હઝરત ઈમામ જાફર સાદિક (અ.)થી મકૂલ છે કે સવાર અને સાંજના સમયે આ દુઆ પઢ્યા કરો", "tak5"));
        topicsList.add(new Topics("5). નમાઝે ઝોહરની તા'કીબાત", "tak6"));
        topicsList.add(new Topics("6). નમાઝે અસની તા'કીબાત", "tak7"));
        topicsList.add(new Topics("7). નમાઝે મગરિબની તા'કીબાત", "tak8"));
        topicsList.add(new Topics("8). નમાઝે મગરિબની નાફેલા નમાઝથી ફારેગ થયા પછી જે ચાહો તે તાકીબાત પઢો પછી દસ વખત આ મુજબ પઢો", "tak9"));
        topicsList.add(new Topics("9). નમાઝે ફજ તથા મગરિબની તા'ફીબાત અને સવાર સાંજ પઢવામાં આવતી દુઆ", "tak10"));
        topicsList.add(new Topics("10). નમાઝે ઈશાની તા'કીબાત", "tak11"));
        topicsList.add(new Topics("11). નમાઝે જુઆની તા'કીબાત", "tak12"));
        topicsList.add(new Topics("12). સંયુક્ત તાફીબાત - જ્યારે તસ્બીહે જનાબે ફાતેમા ઝહરા સલામુલ્લાહ અલૈહા પઢી લો પછી આ દુઆ પઢો", "tak13"));
        topicsList.add(new Topics("13). સહીફાએ અલવિયામાં છે કે દરેક વાજિબ નમાઝ પછી આ દુઆ પઢે", "tak14"));
        topicsList.add(new Topics("14). સંયુક્ત તા'ફીબાત – કોઈપણ નમાઝ પછી આ દુઆ પઢી શકાય છે", "tak15"));
        chaptersList.add(new Chapters("1. Taqibat", topicsList));

        //chapter1
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("1. શનિવારના દિવસે હઝરત રસૂલલ્લાહ (સ.)ની ઝિયારત", "zt1"));
        topicsList.add(new Topics("2. શનિવારના દિવસે હઝરત રસૂલલ્લાહ (સ.)ની ઝિયારત", "zt2"));
        topicsList.add(new Topics("3. રવિવારના દિવસે હઝરત અલી(અ.)ની ઝિયારત", "zt3"));
        topicsList.add(new Topics("4. રવિવારના દિવસે હઝરત ફાતેમા ઝહરા (સ.)ની ઝિયારત", "zt4"));
        topicsList.add(new Topics("5. રવિવારના દિવસે હઝરત ફાતેમા ઝહરા (સ.)ની ઝિયારત", "zt5"));
        topicsList.add(new Topics("6. સોમવારના દિવસે હઝરત ઇમામ હસન (અ.)ની ઝિયારત", "zt6"));
        topicsList.add(new Topics("7. સોમવારના દિવસે હઝરત ઇમામ હુસૈન (અ.)ની ઝિયારત", "zt7"));
        topicsList.add(new Topics("8. મંગળવારના દિવસે હઝરત ઇમામ ઝયનુલ આબેદીન (અ.), ઇમામ મોહંમદ બાકિર (અ.) અને ઇમામ જા'ફર સાદિક (અ.)ની સંયુકત ઝિયારત", "zt8"));
        topicsList.add(new Topics("9. બુધવારના દિવસે ઇમામ મૂસા કાઝિમ (અ.), ઇમામ અલી રઝા (અ.), ઈમામ મોહંમદ તકી (અ.) અને ઇમામ અલી નકી (અ.)ની સંયુકત ઝિયારત", "zt9"));
        topicsList.add(new Topics("10. ગુરૂવારના દિવસની ઇમામ હસન અસ્કરી(અ.)ની ઝિયારત", "zt10"));
        topicsList.add(new Topics("11. શુક્રવારના દિવસની ઈમામ સાહેબુઝ્ઝમાન (અ.)ની ઝિયારત", "zt11"));
        chaptersList.add(new Chapters("2. Ziyarat", topicsList));


        //chapter3
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("ઝીયારતે આશુરા", "ziyarateaashura"));
        chaptersList.add(new Chapters("3. Ziyarat-e-Ashura", topicsList));


        //chapter4
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("પ્રસ્તાવના", "ziyaratenahiya1"));
        topicsList.add(new Topics("ઝીયારતે નાહીયા", "ziyaratenahiya2"));
        chaptersList.add(new Chapters("4. Ziyarat-e-Nahiya", topicsList));

        topicsList=new ArrayList<>();
        topicsList.add(new Topics("ઝીયારતે અરબઇન", "ziyaratearbaeen"));
        chaptersList.add(new Chapters("5. Ziyarat-e-Arbaeen", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("ઝિયારતે ઈમામ ઝમાના(અ.સ)", "ziyarateimam"));
        chaptersList.add(new Chapters("6. Ziyarat-e-Imam\n" +
                "\tZamana(a.s)", topicsList));

        //chapter7
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("ઝિયારતે શોહદાએ કરબલા", "azadari13"));
        chaptersList.add(new Chapters("7. Shohda-e karbala", topicsList));




        sendData();
    }

    void sendData(){
        customAdapter=new CustomAdapter(chaptersList, ZiyaratActivity.this);
        expandableListView.setAdapter(customAdapter);
    }
}