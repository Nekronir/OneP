package com.example.onep;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.onep.model.Oder;

public class CoursePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_page);

        ConstraintLayout courseBg = findViewById(R.id.coursePageBg);
        ImageView courseImage = findViewById(R.id.coursePageImage);
        TextView courseTitle = findViewById(R.id.coursePageTitle);
        TextView courseDate = findViewById(R.id.coursePageDate);
        TextView courseLevel = findViewById(R.id.coursePageLevel);
        TextView courseText = findViewById(R.id.coursePageJava);

        courseBg.setBackgroundColor(getIntent().getIntExtra("courseBg",0));
        courseImage.setImageResource(getIntent().getIntExtra("courseImage",0));
        courseTitle.setText(getIntent().getStringExtra("courseTitle"));
        courseDate.setText(getIntent().getStringExtra("courseDate"));
        courseLevel.setText(getIntent().getStringExtra("courseLevel"));
        courseText.setText(getIntent().getStringExtra("courseText"));


    }
    public void addToCard(View view){
        int item_id =getIntent().getIntExtra("courseId",0);
        Oder.items_id.add(item_id);
        Toast.makeText(this,"Добавленно! 0_0",Toast.LENGTH_LONG).show();


    }
}