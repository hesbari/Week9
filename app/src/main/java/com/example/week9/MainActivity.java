package com.example.week9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    List<Students> studentList;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        studentList = new ArrayList<>();
        float [] marks ;
        listView = findViewById(R.id.listView);
        for (int i = 1; i<= 100; i++){
            marks = new float[]{1*i,2*i,3*i,4*i,5*i};


            Students student = new Students("C077777"+i,"student"+i,"student"+i+"@gmail.com",marks);
            studentList.add(student);
            Log.d("studentObject", "onCreate: "+student);
        }

        StudentAdapter studentAdapter = new StudentAdapter(this,R.layout.student_layout,studentList);
        listView.setAdapter(studentAdapter);

        Button btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Students std = studentList.get(new Random().nextInt(studentList.size()));
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("student", std);
                startActivity(intent);
            }
        });
    }
}