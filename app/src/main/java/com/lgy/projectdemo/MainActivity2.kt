package com.lgy.projectdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import java.util.*

/**
 * 作者：${李桂云} on 2017/8/3 00:15
 * 邮箱：1343168198.com
 */
class MainActivity2 : AppCompatActivity() {
    var mDataList = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        for (i in 1..23) {
            mDataList.add("开心最好" + i)
        }
    }
}