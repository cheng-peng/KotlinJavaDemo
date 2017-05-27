package com.cxp.kotlin.demo

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

/**
 * 文 件 名: Service
 * 创 建 人: CXP
 * 创建日期: 2017-05-19 10:46
 * 描    述: 网络请求
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
interface  GitHubService {

    @GET("repos/enbandari/Kotlin-Tutorials/stargazers")
    fun getStarGazers(): Call<List<User>>
}

object Service{
    val gitHubService:GitHubService by lazy{
        Retrofit.Builder().baseUrl("https://api.github.com/").addConverterFactory(GsonConverterFactory.create()).build().create(GitHubService::class.java)
    }
}

fun main(args: Array<String>) {
    Service.gitHubService.getStarGazers().execute().body().map (::println)
}