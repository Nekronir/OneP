package com.example.onep;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

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
    private static CourseAdapter courseAdapter;
    private static List<Course> courseList = new ArrayList<>();
    static List<Course> fullCourseList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setCategoryRecycler(fetchDataToCategoryAdapter());
        setCourseRecycler(fetchDataToCourseAdapter());
    }

    private List<Course> fetchDataToCourseAdapter() {
        courseList.add(new Course(1, "ic_java", "Профессия Java\nразработчик", "1 октября", "начальний", "#424345", "test", 3));
        courseList.add(new Course(2, "ic_python", "Профессия Python\nразработчик", "7 декабря", "начальний", "#9FA52D", "test", 3));
        courseList.add(new Course(3, "ic_unity", "Профессия Unity \nразработчик", "10 января", "начальний", "#C03D3D", "test", 1));
        courseList.add(new Course(4, "ic_front_end", "Профессия Front-end \nразработчик", "15 января", "начальний", "#FA5252", "test", 2));
        courseList.add(new Course(5, "ic_csharp", "Профессия C# \nразработчик", "15 мая", "начальний", "#FA5252", "test", 2));
        courseList.add(new Course(6, "ic_csharp", "Профессия PHP \nразработчик", "16 января", "начальний", "#4476D6", "test", 4));
        fullCourseList.addAll(courseList);
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

    public void openShoppingCard(View view) {
        Intent intent = new Intent(this, OderPage.class);
        startActivity(intent);
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

    public static void showCoursesByCategory(int category) {
        courseList.clear();
        courseList.addAll(fullCourseList);
        List<Course> filterCourses = new ArrayList<>();
        for (Course c : courseList) {
            if (c.getCategory() == category)
                filterCourses.add(c);
        }
        courseList.clear();
        courseList.addAll(filterCourses);
        courseAdapter.notifyDataSetChanged();

    }
}