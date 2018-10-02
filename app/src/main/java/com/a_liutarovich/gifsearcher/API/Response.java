package com.a_liutarovich.gifsearcher.API;

import android.content.Context;
import android.widget.Toast;

import com.a_liutarovich.gifsearcher.API.GiphyApi;
import com.a_liutarovich.gifsearcher.Models.Gifs;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Response {

    public static final String BASE_URL = "http://api.giphy.com/";

    Gifs mGifs = null;

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    GiphyApi service = retrofit.create(GiphyApi.class);

    public Gifs callTrendingGif(Context context, String key) {
        try {
            Call<Gifs> call = service.trendingGif(key);
            retrofit2.Response<Gifs> response = null;
            response = call.execute();
            mGifs = response.body();
            return mGifs;
        } catch (IOException e) {
            Toast.makeText(context,"Ошибка сервера.",Toast.LENGTH_SHORT).show();
            e.printStackTrace();
            return mGifs;
        }
    }

    public Gifs callSearchGif(Context context, String q, String key) {
        try {
            Call<Gifs> call = service.searchGif(q ,key);
            retrofit2.Response<Gifs> response = null;
            response = call.execute();
            mGifs = response.body();
            return mGifs;
        } catch (IOException e) {
            Toast.makeText(context,"Ошибка сервера.",Toast.LENGTH_SHORT).show();
            e.printStackTrace();
            return mGifs;
        }
    }
}
