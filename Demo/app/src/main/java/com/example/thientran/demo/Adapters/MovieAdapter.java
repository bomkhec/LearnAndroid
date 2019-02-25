package com.example.thientran.demo.Adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.example.thientran.demo.Models.Movie;
import com.example.thientran.demo.R;
import java.util.ArrayList;

public class MovieAdapter extends ArrayAdapter<Movie> {
    public Context context;
    public int resource;
    private ArrayList<Movie> movies;

    public MovieAdapter(Context context, int resource, ArrayList<Movie> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.movies = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if (convertView == null) {
            viewHolder = new ViewHolder();

            convertView = LayoutInflater.from(context).inflate(R.layout.row_movie, parent, false);

            viewHolder.tvMovieName = convertView.findViewById(R.id.tv_movieName);
            viewHolder.tvMovieDesctiption = convertView.findViewById(R.id.tv_movieDescription);
            viewHolder.tvMovieReleaseDate = convertView.findViewById(R.id.tv_movieReleaseDate);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Movie movie = movies.get(position);

        viewHolder.tvMovieName.setText(movie.getName());
        viewHolder.tvMovieDesctiption.setText(movie.getDescription());
        viewHolder.tvMovieReleaseDate.setText(movie.getReleaseDate());

        return convertView;
    }

    public class ViewHolder {
        TextView tvMovieName;
        TextView tvMovieDesctiption;
        TextView tvMovieReleaseDate;
    }
}
