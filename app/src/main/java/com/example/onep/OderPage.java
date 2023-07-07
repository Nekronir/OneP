package com.example.onep;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.onep.model.Course;
import com.example.onep.model.Oder;

import java.util.ArrayList;
import java.util.List;

public class OderPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oder_page);

        ListView oders_list =  findViewById(R.id.Oders_list);
        List<String> coursesTitle = new ArrayList<>();
        for(Course c: MainActivity.fullCourseList){
            if(Oder.items_id.contains(c.getId()))
            coursesTitle.add(c.getTitle());
        }
        oders_list.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Oder.items_id.toArray()));
    }
}