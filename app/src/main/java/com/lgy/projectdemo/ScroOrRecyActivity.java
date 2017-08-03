package com.lgy.projectdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.lgy.projectdemo.adapter.ScroRecyAdapter;
import com.lgy.projectdemo.recycleview.FullyLinearLayoutManager;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：${李桂云} on 2017/8/2 23:27
 * 邮箱：1343168198.com
 */
public class ScroOrRecyActivity extends AppCompatActivity {
    private RecyclerView rvTest;
    private ScroRecyAdapter scroRecyAdapter;
    private List<String> mDataList = new ArrayList();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        for (int i = 0; i < 50; i++) {
            mDataList.add("李桂云最帅" + 1);
        }
        setContentView(R.layout.activity_scro_recy_view);
        rvTest = (RecyclerView) findViewById(R.id.rv_test);
        scroRecyAdapter = new ScroRecyAdapter(this, mDataList);
        rvTest.setNestedScrollingEnabled(false);
        rvTest.setLayoutManager(new FullyLinearLayoutManager(this));
        rvTest.setAdapter(scroRecyAdapter);
    }
}
