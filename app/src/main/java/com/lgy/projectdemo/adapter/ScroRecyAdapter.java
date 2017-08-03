package com.lgy.projectdemo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lgy.projectdemo.R;

import java.util.List;

/**
 * 作者：${李桂云} on 2017/8/2 23:29
 * 邮箱：1343168198.com
 */
public class ScroRecyAdapter extends RecyclerView.Adapter<ScroRecyAdapter.ViewHodler> {

    private Context mContext;

    private List<String> mDataList;


    public ScroRecyAdapter(Context mContext, List<String> mDataList) {
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

    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    class ViewHodler extends RecyclerView.ViewHolder {
        private TextView tvScorRecy;

        public ViewHodler(View itemView) {
            super(itemView);
            tvScorRecy = (TextView) itemView.findViewById(R.id.tv_scro_recy);
        }
    }
}
