package com.jyw.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {

    // 레트로핏 클라이언트 선언
    private var retrofitClient : Retrofit? = null

    // 레트로핏 클라이언트 가져오기
    fun getClient(baseUrl:String) :Retrofit? {

        if (retrofitClient == null) {

            // 레트로핏을 통해 인스턴스 설정
            retrofitClient = Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return retrofitClient
    }
}