package com.lgy.projectdemo.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.lgy.projectdemo.Bean.ItemBean;
import com.lgy.projectdemo.R;

import java.util.List;

/**
 * 作者：${李桂云} on 2017/8/2 20:10
 * 邮箱：1343168198.com
 */
public class TestItemAdapter extends RecyclerView.Adapter<TestItemAdapter.ViewHodler> {
    private Context mContext;

    private List<ItemBean> mDataList;

    DisplayMetrics dm;

    public TestItemAdapter(Context mContext, List<ItemBean> mDataList) {
        this.mContext = mContext;
        this.mDataList = mDataList;
        dm = new DisplayMetrics();
        ((Activity) mContext).getWindowManager().getDefaultDisplay().getMetrics(dm);
    }

    @Override
    public ViewHodler onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(mContext).inflate(R.layout.item_test_view, parent, false);
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(dm.widthPixels / 2, 300);
        inflate.setLayoutParams(lp);
        return new ViewHodler(inflate);
    }

    @Override
    public void onBindViewHolder(ViewHodler holder, int position) {
        holder.tvContent.setText(mDataList.get(position).getName());
      //  Log.d("Main", "最开心" + mDataList.get(position));
    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    class ViewHodler extends RecyclerView.ViewHolder {
        private TextView tvContent;

        public ViewHodler(View itemView) {
            super(itemView);
            tvContent = (TextView) itemView.findViewById(R.id.tv_content);
        }
    }
}
