package com.cxp.kotlin.ui

import android.app.Activity
import android.widget.Toast

/**
 * 文 件 名: Utils
 * 创 建 人: CXP
 * 创建日期: 2017-05-18 17:58
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
fun  Activity.toast(message: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show()
}