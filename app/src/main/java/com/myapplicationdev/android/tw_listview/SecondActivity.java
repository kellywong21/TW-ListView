package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvYear;
    ArrayList<Module> module;
    ArrayAdapter aa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvYear = findViewById(R.id.tvYear);
        lv = findViewById(R.id.lvModules);

        // Create a few module objects in Module array
        module = new ArrayList<Module>();
        module.add(new Module("C208",true));
        module.add(new Module("C200",false));
        module.add(new Module("C346",true));


        // Link this Activity object, the row.xml layout for
        //  each row and the food String array together
        aa = new ModuleAdapter(this, R.layout.row, module);
        lv.setAdapter(aa);

        Intent i = getIntent();
        String year = i.getStringExtra("year");
        tvYear.setText(year);


    }

}
