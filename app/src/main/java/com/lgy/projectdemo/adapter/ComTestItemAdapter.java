package com.lgy.projectdemo.adapter;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.lgy.projectdemo.Bean.ItemBean;
import com.lgy.projectdemo.R;
import com.zhy.base.adapter.ViewHolder;
import com.zhy.base.adapter.recyclerview.CommonAdapter;

import java.util.List;

/**
 * 作者：${李桂云} on 2017/8/3 19:42
 * 邮箱：1343168198.com
 */
public class ComTestItemAdapter extends CommonAdapter<ItemBean> {
    DisplayMetrics dm;

    public ComTestItemAdapter(Context context, int layoutId, List<ItemBean> datas) {
        super(context, layoutId, datas);
        dm = new DisplayMetrics();
        ((Activity) mContext).getWindowManager().getDefaultDisplay().getMetrics(dm);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(mContext).inflate(R.layout.item_test_view, parent, false);
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(dm.widthPixels / 2, 300);
        inflate.setLayoutParams(lp);
        return new ViewHolder(mContext, inflate, parent, 0);
    }

    @Override
    public void convert(ViewHolder holder, ItemBean itemBean) {
        holder.setText(R.id.tv_content,itemBean.getName());
    }
}
