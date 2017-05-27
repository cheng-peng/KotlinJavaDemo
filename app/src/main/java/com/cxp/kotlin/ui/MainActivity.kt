package com.cxp.kotlin.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.cxp.kotlin.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        main_bt1.text = "点我"
        main_bt1.setOnClickListener { bt1() }

//        alert("确定要退出么？") {
//            title("提示框")
//            negativeButton("取消") { toast("取消") }
//            positiveButton("确定") { toast("确定") }
//
//        }.show()
    }

    private fun bt1() {
        toast("点我干啥!~")
    }
}
