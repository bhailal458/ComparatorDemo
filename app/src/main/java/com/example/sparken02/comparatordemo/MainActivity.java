package com.example.sparken02.comparatordemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    private ListView ls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ls = (ListView)findViewById(R.id.ls);

        ArrayList<Student> studentArrayList = new ArrayList<Student>();


        studentArrayList.add(new Student(101,"Vijay",23));
        studentArrayList.add(new Student(106,"Ajay",27));
        studentArrayList.add(new Student(105,"Jay",21));

        Collections.sort(studentArrayList,new NameComparator());

        CustomAdapter adapter = new CustomAdapter(this,studentArrayList);
        ls.setAdapter(adapter);
    }
}
