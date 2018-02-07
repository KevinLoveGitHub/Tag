package org.lovedev.tag;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TagTextView tv_with_tags = findViewById(R.id.tag);
        //  头部标签
        List<String> tags = new ArrayList<>();
        tags.add("标签1");
        tags.add("标签2");
        List<Integer> drawables = new ArrayList<>();
        drawables.add(R.drawable.ic_category_five);
        drawables.add(R.drawable.ic_category_four);
        tv_with_tags.setMultiTagAndContent(tags, drawables, "这是一个带有多个tag的TextView这是一个带有多个tag的TextView这是一个带有多个tag的TextView这是一个带有多个tag的TextView这是一个带有多个tag的TextView");
    }
}
