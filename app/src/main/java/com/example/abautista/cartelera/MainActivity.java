package com.example.abautista.cartelera;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.abautista.cartelera.Model.ModelMovie;
import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
TextView tvSynopisi;
ImageView imPoster;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        callRetrofit ();
    }

    public void callRetrofit () {
        String hostCartelera = getString(R.string.host);
        Retrofit retrofit = new Retrofit.Builder().baseUrl(hostCartelera)
                .addConverterFactory(GsonConverterFactory.create()).build();

        ApiCartelera apiCartelera = retrofit.create(ApiCartelera.class);

        apiCartelera.getCartelera().enqueue(new Callback<ModelMovie>() {
            // pregunta por que reciben un Sizes sizes en vez de un alista
            @Override
            public void onResponse(Call<ModelMovie> call, Response<ModelMovie> response) {
                Log.d("TAG", "Si hay datos de sinopsis"+ response.body().getMovies().get(1).getSynopsis());

                ModelMovie modelMovie = response.body();
                printInfo(modelMovie);

            }
            @Override
            public void onFailure(Call<ModelMovie> call, Throwable t) {

            }
        });
    }

    public void printInfo(ModelMovie modelMovie){
        tvSynopisi = findViewById(R.id.tvSynopisi);
        imPoster = findViewById(R.id.imPoster);
      /*  tvSynopisi.setText(modelMovie.getMovies().get(1).getSynopsis());*/
        String imageUrl = modelMovie.getRoutes().get(1).getSizes().getMedium()+modelMovie.getMovies().get(1).getMedia()
                .get(1).getResource();
        Log.d("TAG", "url " + imageUrl);
        tvSynopisi.setText(imageUrl);
        Picasso.get().load(imageUrl).into(imPoster);

    }
}
