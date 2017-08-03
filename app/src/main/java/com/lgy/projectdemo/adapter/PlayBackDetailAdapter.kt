package com.lgy.projectdemo.adapter

import android.content.Context
import com.lgy.projectdemo.Bean.CommentBean
import com.lgy.projectdemo.R
import com.zhy.base.adapter.ViewHolder
import com.zhy.base.adapter.recyclerview.CommonAdapter

/**
 * 作者：${李桂云} on 2017/8/3 21:04
 * 邮箱：1343168198.com
 */
class PlayBackDetailAdapter : CommonAdapter<CommentBean> {
    constructor(context: Context?, layoutId: Int, datas: MutableList<CommentBean>?) : super(context, layoutId, datas)

    override fun convert(holder: ViewHolder?, t: CommentBean?) {
        holder?.setText(R.id.tv_name, t?.name)
        holder?.setText(R.id.tv_content, t?.comment)
    }
}