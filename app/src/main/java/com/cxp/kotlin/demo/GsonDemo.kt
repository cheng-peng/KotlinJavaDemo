package com.cxp.kotlin.demo

import com.google.gson.Gson

/**
 * 文 件 名: GsonDemo
 * 创 建 人: CXP
 * 创建日期: 2017-05-19 11:31
 * 描    述: Gson 解析 json
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
fun main(args: Array<String>) {
//    val json="{\"name\": \"张三\",\"age\": 18}"
    val json1 = "{\"desc\": \"成功\",\"ret\": \"00000\",\"result\": {\"name\": \"张三\",\"age\": 20} }"
//    val result=Gson().fromJson(json,GsonUser::class.java);
    val result: BaseResult = Gson().fromJson(json1)
    println(result)

}