package com.example.onep;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.onep.adapter.CategoryAdapter;
import com.example.onep.adapter.CourseAdapter;
import com.example.onep.model.Category;
import com.example.onep.model.Course;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView categoryRecycler, courseRecycler;
    private CategoryAdapter categoryAdapter;
    private CourseAdapter courseAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setCategoryRecycler(fetchDataToCategoryAdapter());
        setCourseRecycler(fetchDataToCourseAdapter());
    }

    private List<Course> fetchDataToCourseAdapter() {
        List<Course> courseList = new ArrayList<>();
        courseList.add(new Course(1, "ic_java", "Профессия Java\nразработчик", "1 октября", "начальний", "#424345","test"));
        courseList.add(new Course(2, "ic_python", "Профессия Python\nразработчик", "7 декабря", "начальний", "#9FA52D","test"));
        courseList.add(new Course(3, "ic_unity", "Профессия Unity \nразработчик", "10 января", "начальний", "#C03D3D","test"));
        courseList.add(new Course(4, "ic_front_end", "Профессия Front-end \nразработчик", "15 января", "начальний", "#VEC6D6D","test"));
        courseList.add(new Course(5, "ic_front_end", "Профессия C# \nразработчик", "15 мая", "начальний", "#FA5252","test"));
        return courseList;
    }



    private List<Category> fetchDataToCategoryAdapter() {
        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category(1, "Игры"));
        categoryList.add(new Category(2, "Сайты"));
        categoryList.add(new Category(3, "Языки"));
        categoryList.add(new Category(4, "Прочее"));
        return categoryList;
    }

    private void setCourseRecycler(List<Course> courseList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        courseRecycler = findViewById(R.id.courseRecycler);
        courseRecycler.setLayoutManager(layoutManager);
        courseAdapter = new CourseAdapter(this, courseList);
        courseRecycler.setAdapter(courseAdapter);
    }

    private void setCategoryRecycler(List<Category> categoryList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        categoryRecycler = findViewById(R.id.categoryRecycler);
        categoryRecycler.setLayoutManager(layoutManager);
        categoryAdapter = new CategoryAdapter(this, categoryList);
        categoryRecycler.setAdapter(categoryAdapter);
    }
}