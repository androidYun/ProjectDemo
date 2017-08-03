package com.lgy.projectdemo.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.lgy.projectdemo.Bean.CommentBean
import com.lgy.projectdemo.R
import com.lgy.projectdemo.adapter.PlayBackDetailAdapter
import java.util.*

/**
 * 作者：${李桂云} on 2017/8/3 21:00
 * 邮箱：1343168198.com
 */
class PlayBackActivity : AppCompatActivity() {
    var mDataList: ArrayList<CommentBean>? = null
    var rvComment: RecyclerView? = null
    var palyBackAdapter: PlayBackDetailAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playback_detail)
        rvComment = findViewById(R.id.rv_comment) as RecyclerView?
        mDataList = ArrayList<CommentBean>()
        for (i in 0..20) {
            mDataList?.add(CommentBean("李桂云$i", "我是李前进我最开心了啊$i"))
        }
        palyBackAdapter = PlayBackDetailAdapter(this, R.layout.item_playbacl_comment, mDataList)
        rvComment?.layoutManager =LinearLayoutManager(this)
        rvComment?.adapter = palyBackAdapter
    }
}