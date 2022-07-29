package sg.edu.rp.c346.id21035817.movies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lvMovie;
    Button btnShow;
    ArrayList<Movies> alMovieList;
    CustomAdapter caMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setTitle(getTitle().toString() + " ~ " + "Show Movies");

        lvMovie = findViewById(R.id.listViewMovies);
        btnShow = findViewById(R.id.buttonShow);

        DBHelper dbh = new DBHelper(this);
        alMovieList = dbh.getAllMovie();
        dbh.close();

        caMovie = new CustomAdapter(SecondActivity.this, lvMovie.setAdapter(caMovie);

        lvMovie.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent i = new Intent(SecondActivity.this, MainActivity.class);
                i.putExtra("movie", alMovieList);
                startActivity(i);
            }
        });

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DBHelper dbh = new DBHelper((SecondActivity.this));
                alMovieList.clear();
                alMovieList.addAll(dbh.getAllMovie());

            }
        });

    }
}