package com.example.week9;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity2);
        Intent intent = getIntent();
        Students student = (Students) intent.getSerializableExtra("student");
        Log.d("output", "onCreate:"+student.toString());
        TextView textView = findViewById(R.id.textView);
        textView.setText(student.toString());



    }
}
