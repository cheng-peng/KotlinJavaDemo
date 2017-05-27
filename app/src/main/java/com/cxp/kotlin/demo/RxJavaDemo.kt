package com.cxp.kotlin.demo

import rx.Observable


/**
 * 文 件 名: RxJavaDemo
 * 创 建 人: CXP
 * 创建日期: 2017-05-19 10:10
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
fun main(args: Array<String>) {
    val text="1 2 3 4 5 6 7 8 9 10 11 12 13 14 15"
    Observable.from(text.toCharArray().asIterable()).filter { !it.isWhitespace() }.groupBy { it }.map{
        o->o.count().subscribe{
            println("${o.key} -> $it ")
        }
    }.subscribe()
}