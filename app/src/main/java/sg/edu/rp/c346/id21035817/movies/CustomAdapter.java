package sg.edu.rp.c346.id21035817.movies;

import android.content.Context;
import android.graphics.Movie;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<Movies> movieList;

    public CustomAdapter(Context context, int resource, ArrayList<Movies> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        movieList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) parent_context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvTitle = rowView.findViewById(R.id.tvTitle);
        TextView tvGenre = rowView.findViewById(R.id.tvGenre);
        TextView tvYear = rowView.findViewById(R.id.tvYear);
        ImageView imageView = rowView.findViewById(R.id.imageView);

        Movies currentMovie = movies.get(position);

        tvTitle.setText(currentMovie.getTitle());
        tvGenre.setText(currentMovie.getGenre());
        String rating = currentMovie.getRating();
        tvYear.setText(currentMovie.getYear() + "");

        if(rating.equals("G")) {
            imageView.setImageResource(R.drawable.rating_g);
        } else if(rating.equals("PG")) {
            imageView.setImageResource(R.drawable.rating_pg);
        } else if(rating.equals("PG13")) {
            imageView.setImageResource(R.drawable.rating_pg13);
        } else if(rating.equals("NC16")) {
            imageView.setImageResource(R.drawable.rating_nc16);
        } else if(rating.equals("M18")) {
            imageView.setImageResource(R.drawable.rating_m18);
        } else {
            imageView.setImageResource(R.drawable.rating_r21);
        }

        return rowView;
    }
}
