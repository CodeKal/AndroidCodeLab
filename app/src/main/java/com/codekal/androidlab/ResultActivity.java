package com.codekal.androidlab;

/**
 * Created by Deniz on 7.03.2018.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class ResultActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView name = (TextView)findViewById(R.id.textName);
        Intent i = getIntent();
        String nameFromMain = i.getStringExtra("NAME");
        name.setText(nameFromMain);
    }
}
