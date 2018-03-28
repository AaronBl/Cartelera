package com.example.abautista.cartelera;

import android.graphics.ColorSpace;

import com.example.abautista.cartelera.Model.ModelMovie;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

/**
 * Created by abautista on 3/27/2018.
 */

public interface ApiCartelera {
    @Headers({"api_key:es_cinepolis_test_android"})
    @GET("v2/schedules?country_code=ES&cities=32&include_cinemas=true&include_movies=true")
    Call<ModelMovie>getCartelera();


}
