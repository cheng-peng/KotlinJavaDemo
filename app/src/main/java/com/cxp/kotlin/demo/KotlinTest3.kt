package com.cxp.kotlin.demo

import java.math.BigInteger

/**
 * 文 件 名: KotlinTest3
 * 创 建 人: CXP
 * 创建日期: 2017-05-19 11:04
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */

class Result(var value:BigInteger=BigInteger.valueOf(1L))

tailrec fun factorial(num:Int,result: Result){
    if (num==0)result.value=result.value.times(BigInteger.valueOf(1L))
    else
    {
        result.value=result.value.times(BigInteger.valueOf(num.toLong()))
        factorial(num-1,result)
    }
}

fun main(args: Array<String>) {
    val result=Result()
    factorial(10000,result)
    println(result.value)
}