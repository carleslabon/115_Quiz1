package com.eslabon.eslabonquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String[] colleges;
    ListView usteColleges;
    CustomAdapter adapter;
    List<AndroidVersion> listColleges;
    String[] year;
    int[] logos;

    Button btnHome;
    Button btn1;
    Button btn2;
    Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colleges = getResources().getStringArray(R.array.Colleges);
        usteColleges = (ListView) findViewById(R.id.ustColleges);
        listColleges = new ArrayList<AndroidVersion>();
        year = getResources().getStringArray(R.array.Year);

        logos = new int[] {
                R.drawable.androidoreo, R.drawable.androidnougat, R.drawable.androidmarsh};

        for ( int i = 0; i < colleges.length; i++ ) {
            listColleges.add( new AndroidVersion( logos[i], year[i], colleges[i] ) );
        }

        adapter = new CustomAdapter(this, listColleges);
        usteColleges.setAdapter(adapter);
        usteColleges.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String msg = "You clicked " + colleges[i];
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            }
        });

        btnHome = (Button) findViewById(R.id.btnBack);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
    }

    public void goBackToMain (View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void goToOne (View view) {
        Intent intent = new Intent(this, OreoActivity.class);
        startActivity(intent);
    }

    public void goToTwo (View view) {
        Intent intent = new Intent(this, NougatActivity.class);
        startActivity(intent);
    }

    public void goToThree (View view) {
        Intent intent = new Intent(this, MarshmallowActivity.class);
        startActivity(intent);
    }

}