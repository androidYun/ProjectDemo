package com.lgy.projectdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.lgy.projectdemo.Bean.ItemBean;
import com.lgy.projectdemo.Bean.TestBean;
import com.lgy.projectdemo.adapter.ComTestAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：${李桂云} on 2017/8/2 21:28
 * 邮箱：1343168198.com
 */
public class Maintivity2 extends AppCompatActivity {
    private RecyclerView rvTest;

    private TextView tvSvRv;

    private TextView tvPlayBack;

    private ComTestAdapter testAdapter;

    private List<TestBean> mDataList = new ArrayList();

    private List<ItemBean> mItemDataList = new ArrayList();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvTest = (RecyclerView) findViewById(R.id.rv_test);
        tvSvRv = (TextView) findViewById(R.id.tv_sv_rv);
        tvPlayBack = (TextView) findViewById(R.id.tv_playback);
        for (int i = 0; i < 2; i++) {
            TestBean testBean = new TestBean();
            mItemDataList.clear();
            for (int j = 0; j < 4; j++) {
                ItemBean itemBean = new ItemBean();
                itemBean.setName("开心最重要");
                mItemDataList.add(itemBean);
            }
            testBean.setItemBeanList(mItemDataList);
            mDataList.add(testBean);
        }
        testAdapter = new ComTestAdapter(this, R.layout.item_first_test_view, mDataList);
        rvTest.setLayoutManager(new LinearLayoutManager(this));
        rvTest.setAdapter(testAdapter);
        tvSvRv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Maintivity2.this, ScroOrRecyActivity.class));
            }
        });
        tvPlayBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  startActivity(new Intent(Maintivity2.this, PlayBackDetailActivity.class));
            }
        });

    }
}
