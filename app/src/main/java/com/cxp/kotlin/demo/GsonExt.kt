package com.cxp.kotlin.demo

import com.google.gson.Gson

/**
 * 文 件 名: GsonExt
 * 创 建 人: CXP
 * 创建日期: 2017-05-19 11:42
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
inline fun <reified T> Gson.fromJson(json:String):T{
    return fromJson(json,T::class.java)
}