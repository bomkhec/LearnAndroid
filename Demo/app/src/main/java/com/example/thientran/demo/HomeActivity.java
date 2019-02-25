package com.example.thientran.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import com.example.thientran.demo.Adapters.MovieAdapter;
import com.example.thientran.demo.Models.Movie;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    private ListView lvMovies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Intent intent = getIntent();
        String userName = intent.getStringExtra(LoginActivity.EXTRA_USERNAME);
        String password = intent.getStringExtra(LoginActivity.EXTRA_PASSWORD);

        Log.i("data passing", userName);


        lvMovies = findViewById(R.id.lv_movies);

        ArrayList<Movie> movies = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Movie movie = new Movie("movie "+i, "description "+i, "Date "+i);
            movies.add(movie);
        }

        MovieAdapter moveAdapter = new MovieAdapter(this, R.layout.row_movie, movies);
        lvMovies.setAdapter(moveAdapter);
    }
}
