package com.example.newsfinal;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiUtil {

    private static Retrofit retrofit = null;

    public static ApiInterface getApiInterface()
    {


        if(retrofit == null)
        {
            retrofit = new Retrofit.Builder().baseUrl(ApiInterface.base_url).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit.create(ApiInterface.class);
    }
}
