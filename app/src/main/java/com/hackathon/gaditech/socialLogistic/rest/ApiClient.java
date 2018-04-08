package com.hackathon.gaditech.socialLogistic.rest;

import com.hackathon.gaditech.socialLogistic.model.UserList;
import com.hackathon.gaditech.socialLogistic.model.User_;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Habiba Abbasii on 31/03/2018.
 */


public class ApiClient {
//    https://api.coinmarketcap.com/v1/ticker/?limit=10
    public static final String BASE_URL = "http://54.200.164.45:8000/";
    public static Retrofit mInstance = null;

    public interface PostService{

//        @POST("user/verify_phone")
//        Call<User_> verify();
        @GET("user/get")
        Call<UserList> getNoticeDataData(@Query("company_no") int companyNo);

//        @POST("user/signin")
//        Call<User_> createUser(@Query("identifier") String id, @Query("token") );

    }

    //singleton method
    public static Retrofit getApiClient() {
        if (mInstance == null) {
            mInstance = new Retrofit.Builder().baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create()).build();

        }
        return mInstance;

    }
}
