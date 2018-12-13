package com.example.goptimus.loubaiss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EmailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
    }

    public void suivant(View view){
        Intent intent = new Intent(EmailActivity.this,PwdActivity.class);
        startActivity(intent);
    }
}
