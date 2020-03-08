package com.example.majoractivity1;



import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ListViewActivity extends AppCompatActivity  {

    String [] cards = new String[]{
            "Someone You Loved - Lewis Capaldi",
            "Bad Guy - Billie Eillish",
            "Old Town Road - Lil Nas X",
            "I Don't Care - Justin Bieber",
            "Despacito -Luis Fonsi",
            "Thinking Out Loud - Ed Sheeran",
            "Sunflower - Post Malone",
            "All of Me - Johnny Legend",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ArrayAdapter adapter = new ArrayAdapter<>(this, R.layout.activity_listview, cards);
        ListView listView =  findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        List<String> cardList = Arrays.asList(cards);
        Collections.shuffle(cardList);
        cards = cardList.toArray(new String[cardList.size()]);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast toast = Toast.makeText(getApplicationContext(), cards[position], Toast.LENGTH_SHORT);
                View toastView = toast.getView();
                toastView.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                toast.show();
            }
        });

    }
    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        this.finish();

    }
}
