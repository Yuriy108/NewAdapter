package com.example.newadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String [] month={"Январь", "Февраль","Март","Январь", "Февраль","Март","Январь", "Февраль","Март","Январь", "Февраль","Март","Январь", "Февраль","Март","Январь", "Февраль","Март","Январь", "Февраль","Март","Январь", "Февраль","Март"};
    ListView listView;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.list);
        text=findViewById(R.id.text);
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,month);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String num=month[position];
                text.setText(num);


            }
        });
    }
}
