package sg.edu.rp.c346.id21035817.movies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView tvMovieID, tvTitle, tvGenre, tvYear, tvRating;
    EditText etMovieID, etTitle, etGenre, etYear;
    Spinner spinnerRating;
    Button btnUpdate, btnDelete, btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        etMovieID = findViewById(R.id.editTextMovieID);
        etTitle = findViewById(R.id.editTextMovieTitle);
        etGenre = findViewById(R.id.editTextMovieGenre);
        etYear = findViewById(R.id.editTextMovieYear);
        btnUpdate = findViewById(R.id.buttonUpdate);
        btnDelete = findViewById(R.id.buttonDelete);
        btnCancel = findViewById(R.id.buttonCancel);
    }
}