package com.cxp.kotlin.demo

/**
 * 文 件 名: User
 * 创 建 人: CXP
 * 创建日期: 2017-05-19 10:51
 * 描    述: 普通实体类
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
data class User(val login:String,val id:Long,val avatar_url:String){
    override fun toString(): String {
        return login
    }
}