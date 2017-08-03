package com.lgy.projectdemo.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lgy.projectdemo.Bean.TestBean;
import com.lgy.projectdemo.R;
import com.lgy.projectdemo.recycleview.DividerGridItemDecoration;

import java.util.List;

/**
 * 作者：${李桂云} on 2017/8/2 21:38
 * 邮箱：1343168198.com
 */
public class TestAdapter extends RecyclerView.Adapter<TestAdapter.ViewHodler> {
    private Drawable drawable;
    private Context mContext;

    private List<TestBean> mDataList;


    public TestAdapter(Context mContext, List<TestBean> mDataList) {
        this.mContext = mContext;
        this.mDataList = mDataList;

    }

    @Override
    public ViewHodler onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(mContext).inflate(R.layout.item_first_test_view, parent, false);
        return new ViewHodler(inflate);
    }

    @Override
    public void onBindViewHolder(ViewHodler holder, int position) {
        TestItemAdapter testItemAdapter = new TestItemAdapter(mContext, mDataList.get(position).getItemBeanList());
        holder.tvTestView.setLayoutManager(new GridLayoutManager(mContext, 3));

        holder.tvTestView.addItemDecoration(new DividerGridItemDecoration(drawable, GridLayoutManager.HORIZONTAL));
        holder.tvTestView.setAdapter(testItemAdapter);
    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    class ViewHodler extends RecyclerView.ViewHolder {
        private RecyclerView tvTestView;

        public ViewHodler(View itemView) {
            super(itemView);
            tvTestView = (RecyclerView) itemView.findViewById(R.id.rv_item_test);
        }
    }
}
