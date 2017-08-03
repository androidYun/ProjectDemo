package com.lgy.projectdemo;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.lgy.projectdemo.adapter.TestItemAdapter;
import com.lgy.projectdemo.recycleview.DividerGridItemDecoration;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvTest;

    private TestItemAdapter testAdapter;

    private List<String> mDataList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvTest = (RecyclerView) findViewById(R.id.rv_test);
        for (int i = 0; i < 20; i++) {
            mDataList.add("最开心" + i);
        }
      //  testAdapter = new TestItemAdapter(this, mDataList);
        /**
         * 测试RecycleView边距
         */
        rvTest.setLayoutManager(new GridLayoutManager(this, 3));
        Drawable drawable = getDrawable(R.drawable.test);
        rvTest.addItemDecoration(new DividerGridItemDecoration(drawable, GridLayoutManager.HORIZONTAL));
//        rvTest.setLayoutManager(new FullyLinearLayoutManager(this));
        rvTest.setAdapter(testAdapter);
    }
}
