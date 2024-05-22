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

public class SahifaKamelaActivity extends AppCompatActivity {

    ExpandableListView expandableListView;
    CustomAdapter customAdapter;
    List<Chapters> chaptersList;
    List<Topics>topicsList;
    FrameLayout backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sahifa_kamela);
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



        //chapter2
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("જ્યારે આપ દુઆ માગતા તો તેનો પ્રારંભ અલ્લાહનાં સર્વશ્રેષ્ઠ વખાણ અને ગુણગાનથી કરતા.", "sk2"));
        chaptersList.add(new Chapters("1. SAHIFA-E-KAMILA", topicsList));


        //chapter3
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("અલ્લાહની પ્રશંસા પછી રસૂલિલ્લાહ (સ.) પર દુરૂદો સલામના સંદર્ભમાં આપની દુઆ", "sk3"));
        chaptersList.add(new Chapters("2. SAHIFA-E-KAMILA", topicsList));


        //chapter4
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("અર્શને ઉપાડનારા અને અન્ય નિકટવર્તી ફરિશ્તાઓ પર દુરૂદો સલાતના સંદર્ભમાં આપ (સ.)ની દુઆ", "sk4"));
        chaptersList.add(new Chapters("3. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("નબીઓ, તેમના અનુયાયીઓ અને તેમના ઉપર ઈમાન લાવનારાઓના હકમાં હઝરત (સ.)ની દુઆ", "sk5"));
        chaptersList.add(new Chapters("4. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("પોતાના માટે તથા પોતાના મિત્રોની દુઆ", "sk6"));
        chaptersList.add(new Chapters("5. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("સવાર - સાંજની દુઆ", "sk7"));
        chaptersList.add(new Chapters("6. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("જ્યારે કોઈ કપરું કાર્ય અથવા મુસીબત આવી પડતી અથવા કોઈ પ્રકારની બેચેની થતી તો હઝરત (અ.) આ દુઆ પઢતા.", "sk8"));
        chaptersList.add(new Chapters("7. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("આફતો, દુષ્ટાચાર તેમજ દુષ્કૃત્યોથી રક્ષણ મેળવવા માટે હઝરત (અ.)ની દુઆ", "sk9"));
        chaptersList.add(new Chapters("8. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("મફેરતના શોખમાં હઝરત (અ.)ની દુઆ", "sk10"));
        chaptersList.add(new Chapters("9. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("અલ્લાહ તઆલાનો આશરો માગવાના સંદર્ભમાં હઝરત (અ.)ની દુઆ", "sk11"));
        chaptersList.add(new Chapters("10. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("આકેબત સારી થવા માટેની દુઆ", "sk12"));
        chaptersList.add(new Chapters("11. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("ગુનાહનો સ્વીકાર અને તૌબા કરવા અંગે હઝરત (અ.)ની દુઆ", "sk13"));
        chaptersList.add(new Chapters("12. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("ખુદાવંદે આલમ સમક્ષ હાજત માગવા માટેની દુઆ", "sk14"));
        chaptersList.add(new Chapters("13. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("અત્યાચાર થાય કે અત્યાચારીઓ અણગમતું કૃત્ય કરે ત્યારે આ દુઆ પઢતા", "sk15"));
        chaptersList.add(new Chapters("14. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("બીમારી કે ભારે દુઃખમાં સપડાઈ પડે ત્યારે આ દુઆ પઢતા.", "sk16"));
        chaptersList.add(new Chapters("15. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("જ્યારે ગુનાહોની માફી ઇચ્છતા અથવા પોતાના દુર્ગુણોને માફ કરવાની યાચના કરતા તો આ દુઆ પઢતા હતા", "sk17"));
        chaptersList.add(new Chapters("16. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("શયતાન અને તેના છળકપટથી બચવા માટે આ દુઆ પઢતા.", "sk18"));
        chaptersList.add(new Chapters("17. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("જ્યારે કોઈ મુસીબત ટળી જતી અથવા કોઈ હાજત પૂરી થતી તો આ દુઆ પઢતા.", "sk19"));
        chaptersList.add(new Chapters("18. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("અનાવૃષ્ટિના પ્રસંગે વરસાદ માટેની દુઆ", "sk20"));
        chaptersList.add(new Chapters("19. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("પસદંગીપાત્ર અબ્લાક અને સુયોગ્ય આચરણની બાબતમાં હઝરત (અ.)ની દુઆ", "sk21"));
        chaptersList.add(new Chapters("20. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("જ્યારે કોઈ બાબતથી ગમગીન થતા અથવા તો ગુનાહોના કારણે પરેશાન થતા તો આ દુઆ પઢતા.", "sk22"));
        chaptersList.add(new Chapters("21. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("મુસીબતો અને મુશ્કેલીઓના પ્રસંગે આ દુઆ પઢતા.", "sk23"));
        chaptersList.add(new Chapters("22. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("સલામતીની માગણી અને તે માટે આભાર માનતા તો આ દુઆ પઢતા.", "sk24"));
        chaptersList.add(new Chapters("23. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("પોતાના મા-બાપ માટે હઝરત (અ.)ની દુઆ", "sk25"));
        chaptersList.add(new Chapters("24. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("સંતાનો માટે હઝરત (અ.)ની દુઆ", "sk26"));
        chaptersList.add(new Chapters("25. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("જ્યારે પડોશીઓને અને મિત્રોને યાદ કરતા તો તેમના માટે આ દુઆ પઢતા હતા.", "sk27"));
        chaptersList.add(new Chapters("26. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("સરહદોની સુરક્ષા કરનારાઓ માટે હઝરત (અ.)ની દુઆ", "sk28"));
        chaptersList.add(new Chapters("27. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("અલ્લાહ તઆલાથી મદદ માટેના પોકારની દુઆ", "sk29"));
        chaptersList.add(new Chapters("28. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("આજીવિકાની તંગી થતી ત્યારે આ દુઆ પઢતા.", "sk30"));
        chaptersList.add(new Chapters("29. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("દેવુ ચૂકવવા માટે અલ્લાહ તઆલા સમક્ષ માગવાની દુઆ", "sk31"));
        chaptersList.add(new Chapters("30. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("ગુનાહના સ્વીકારની બાબતમાં હઝરત (અ.)ની દુઆ કે જેને નમાઝે શબ પછી પઢતા હતા", "sk32"));
        chaptersList.add(new Chapters("31. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("દુઆએ ઈસ્તેખારા", "sk33"));
        chaptersList.add(new Chapters("32. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("જ્યારે આપ પોતે અથવા તો બીજા કોઈને ગુનાહોની બદનામીમાં ફસાયેલો જોતા તો આ દુઆ પઢતા હતા.", "sk34"));
        chaptersList.add(new Chapters("33. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("જ્યારે દુનિયાવાળાઓને જોતા તો અલ્લાહ રાજી અને પ્રસન્ન રહે તે માટે આ દુઆ પઢતા હતા.", "sk35"));
        chaptersList.add(new Chapters("34. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("વાદળ અને વીજળી જોતા અને મેઘગર્જના સાંભળતા ત્યારે આપ આ દુઆ પઢતા.", "sk36"));
        chaptersList.add(new Chapters("35. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("જ્યારે શુક્ર અદા કરવામાં ઓછપનો સ્વીકાર કરતા તો આ દુઆ પઢતા હતા.", "sk37"));
        chaptersList.add(new Chapters("36. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("બંદાઓના હક મારવા અને તેમના હકોમાં કમી કરવાથી બદલો માગવા અને દોઝખથી છુટકારા માટે આ દુઆ પઢતા હતા.", "sk38"));
        chaptersList.add(new Chapters("37. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("ક્ષમા અને રહેમતની યાચના માટે આ દુઆ પઢતા હતા.", "sk39"));
        chaptersList.add(new Chapters("38. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("કોઈના મૃત્યુના સમાચાર સાંભળતા કે મૃત્યુને યાદ કરતા ત્યારે આ દુઆ પઢતા.", "sk40"));
        chaptersList.add(new Chapters("39. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("પડદાપોશી, હિફાઝત અને નિગેહબાની માટે આ દુઆ પઢતા હતા", "sk41"));
        chaptersList.add(new Chapters("40. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("કુરઆન ખતમ કર્યા પછી પઢતાની દુઆ", "sk42"));
        chaptersList.add(new Chapters("41. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("બીજના ચંદ્રદર્શન વખતની દુઆ", "sk43"));
        chaptersList.add(new Chapters("42. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("માહે રમઝાનુલ મુબારકના સ્વાગત માટેની દુઆ", "sk44"));
        chaptersList.add(new Chapters("43. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("માહે રમઝાનુલ મુબારકની વિદાયની દુઆ", "sk45"));
        chaptersList.add(new Chapters("44. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("જ્યારે ઈદુલ ફિતરની નમાઝની ફારેગ થઈને પાછા જતા ત્યારે અને જુઆના દિવસે પણ આ દુઆ પઢતા હતા.", "sk46"));
        chaptersList.add(new Chapters("45. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("અરફાના દિવસની દુઆ", "sk47"));
        chaptersList.add(new Chapters("46. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("ઈદુઝઝોહા અને જુઓંની દુઆ", "sk48"));
        chaptersList.add(new Chapters("47. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("દુશ્મનોના છળકપટને દૂર કરવા અને તેમના અત્યાચારને નાબૂદ કરવા માટે હઝરત (અ.)ની દુઆ", "sk49"));
        chaptersList.add(new Chapters("48. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("અલ્લાહના ખૌફની બાબતમાં હઝરત (અ.)ની દુઆ", "sk50"));
        chaptersList.add(new Chapters("49. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("અલ્લાહના દરબારમાં આજીજી અને નમ્રતા પ્રગટ કરવા અંગે હઝરત (અ.)ની દુઆ", "sk51"));
        chaptersList.add(new Chapters("50. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("અલ્લાહ તઆલાની બારગાહમાં તાત્કાલિક દુઆ કબૂલ થાય તે સંદર્ભમાં હઝરત (અ.)ની દુઆ", "sk52"));
        chaptersList.add(new Chapters("51. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("અલ્લાહ તઆલાની બારગાહમાં આજીજી કરવાની બાબતમાં હઝરત (અ.)ની દુઆ", "sk53"));
        chaptersList.add(new Chapters("52. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("દુઃખ દૂર કરવા માટે હઝરત (અ.)ની દુઆ", "sk54"));
        chaptersList.add(new Chapters("53. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("અલ્લાહ તઆલાની તસ્બીહ અને શ્રેષ્ઠતાની બાબતમાં દુઆ", "sk55"));
        chaptersList.add(new Chapters("54. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("અલ્લાહની બુઝુર્ગી અને મહાનતાના વર્ણનમાં હઝરત (અ.)ની દુઆ", "sk56"));
        chaptersList.add(new Chapters("55. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("અલ્લાહ સામે પોતાની તુચ્છતા અને લાચારી દર્શાવતી ઈમામની દુઆ", "sk57"));
        chaptersList.add(new Chapters("56. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("હઝરત મોહંમદ (સ.)ના વંસજો માટે હઝરત (અ.)ની દુઆ", "sk58"));
        chaptersList.add(new Chapters("57. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("હઝરત આદમ (અ.) ઉપર દુરૂદો સલામની બાબતમાં હઝરત (અ.)ની દુઆ", "sk59"));
        chaptersList.add(new Chapters("58. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("બેચેની અને મુસીબતથી રક્ષણ અને ગુનાહોની માફી માટે હઝરત (અ.)ની દુઆ", "sk60"));
        chaptersList.add(new Chapters("59. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("ડર અને ખતરાના પ્રસંગે પઢવાની હઝરત (અ.)ની દુઆ", "sk61"));
        chaptersList.add(new Chapters("60. SAHIFA-E-KAMILA", topicsList));

        //chapter5
        topicsList=new ArrayList<>();
        topicsList.add(new Topics("61(1). શનિવારના દિવસની દુઆ", "sk62"));
        topicsList.add(new Topics("61(2). રવિવારના દિવસની દુઆ", "sk63"));
        topicsList.add(new Topics("61(3). સોમવારના દિવસની દુઆ", "sk64"));
        topicsList.add(new Topics("61(4). મંગળવારના દિવસની દુઆ", "sk65"));
        topicsList.add(new Topics("61(5). બુધવારના દિવસની દુઆ", "sk66"));
        topicsList.add(new Topics("61(6). ગુરુવારના દિવસની દુઆ", "sk67"));
        topicsList.add(new Topics("61(7). શુક્રવારના દિવસની દુઆ", "sk68"));
        chaptersList.add(new Chapters("61. SAHIFA-E-KAMILA", topicsList));







        sendData();
    }

    void sendData(){
        customAdapter=new CustomAdapter(chaptersList, SahifaKamelaActivity.this);
        expandableListView.setAdapter(customAdapter);
    }
}