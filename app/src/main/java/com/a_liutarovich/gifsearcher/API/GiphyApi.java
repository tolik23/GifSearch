package com.a_liutarovich.gifsearcher.API;

import com.a_liutarovich.gifsearcher.Models.Gifs;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GiphyApi {

    @GET("v1/gifs/trending")
    Call<Gifs> trendingGif(
            @Query("api_key") String key
    );


    @GET("v1/gifs/search")
    Call<Gifs> searchGif(
            @Query("q") String q,
            @Query("api_key") String key
    );
}
