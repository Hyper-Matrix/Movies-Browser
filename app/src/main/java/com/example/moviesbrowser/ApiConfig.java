package com.example.moviesbrowser;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiConfig {
    String BASE_URL = "https://api.themoviedb.org/"; //the base URL

    @GET("3/trending/all/day") //The relative URL
    Call<Value> getMovies(@Query("api_key") String key); //API key passed as a query
}
