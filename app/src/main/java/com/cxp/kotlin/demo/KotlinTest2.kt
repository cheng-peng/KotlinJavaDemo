package com.cxp.kotlin.demo

/**
 * 文 件 名: KotlinTest2
 * 创 建 人: CXP
 * 创建日期: 2017-05-18 16:55
 * 描    述: flatMap 相当于数组  ${it.length}表达式
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
fun main(args: Array<String>) {
    args.flatMap {
        it.split("_")
    }.map {
        print("$it ${it.length}")
    }

}