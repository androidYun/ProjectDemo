package com.lgy.projectdemo.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.lgy.projectdemo.Bean.TestBean;
import com.lgy.projectdemo.R;
import com.lgy.projectdemo.recycleview.DividerGridItemDecoration;
import com.zhy.base.adapter.ViewHolder;
import com.zhy.base.adapter.recyclerview.CommonAdapter;

import java.util.List;

/**
 * 作者：${李桂云} on 2017/8/3 19:32
 * 邮箱：1343168198.com
 */
public class ComTestAdapter extends CommonAdapter<TestBean> {
    public ComTestAdapter(Context context, int layoutId, List<TestBean> datas) {
        super(context, R.layout.item_first_test_view, datas);
    }

    @Override
    public void convert(ViewHolder holder, TestBean testBean) {
        ComTestItemAdapter comTestItemAdapter = new ComTestItemAdapter(mContext, R.layout.item_test_view, testBean.getItemBeanList());
        RecyclerView tvTestView = holder.getView(R.id.rv_item_test);
        tvTestView.setLayoutManager(new GridLayoutManager(mContext, 2));
        Drawable drawable = mContext.getDrawable(R.drawable.test);
        tvTestView.addItemDecoration(new DividerGridItemDecoration(drawable, GridLayoutManager.HORIZONTAL));
        tvTestView.setAdapter(comTestItemAdapter);
    }
}
