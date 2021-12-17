package com.example.moviesbrowser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import java.util.concurrent.TimeUnit;

public class ApiClient {

    private static  ApiClient instance = null;
    private ApiConfig myApi;

    private  ApiClient() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(ApiConfig.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        myApi = retrofit.create(ApiConfig.class);
    }

    public static synchronized  ApiClient getInstance() {
        if (instance == null) {
            instance = new  ApiClient();
        }
        return instance;
    }

    public ApiConfig getMyApi() {
        return myApi;
    }

}

