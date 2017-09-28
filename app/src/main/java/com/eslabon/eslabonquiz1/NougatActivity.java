package com.eslabon.eslabonquiz1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class NougatActivity extends AppCompatActivity {

    Button btnHome;
    Button btn1;
    Button btn2;
    Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nougat_activity);

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
