package com.cxp.kotlin.demo

/**
 * 文 件 名: SayHello
 * 创 建 人: CXP
 * 创建日期: 2017-05-18 17:07
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
enum class Lang(val hello:String){
    ENGLISH("英文"),
    CHINESE("中文"),
    JAPANESE("日文"),
    KOREAN("韩文");

    fun  sayHello(){
        println(hello)
    }

    companion object{
        fun parse(name:String): Lang {
            return Lang.valueOf(name.toUpperCase())
        }
    }
}

fun main(args: Array<String>) {
    if (args.size==0) return
    var lang= Lang.parse(args[0])
    println(lang)
    lang.sayHello()
    lang.sayBye()
}

fun Lang.sayBye(){
    val bye=when(this){

        Lang.ENGLISH -> "英语"
        Lang.CHINESE -> "汉语"
        Lang.JAPANESE -> "日语"
        Lang.KOREAN -> "韩语"
    }
    println(bye);
}