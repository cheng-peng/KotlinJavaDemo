package com.cxp.kotlin.demo

/**
 * 文 件 名: GsonUser
 * 创 建 人: CXP
 * 创建日期: 2017-05-19 11:39
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
data class BaseResult(val desc: String, val ret: String, val result: GsonUser)

data class GsonUser(val name: String, val age: Int = 18) {
    override fun toString(): String {
        return "$name -> $age"
    }
}