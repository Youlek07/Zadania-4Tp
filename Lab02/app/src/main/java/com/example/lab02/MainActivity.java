package com.example.lab02;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    Panel P;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        P = findViewById(R.id.panel);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.tworca:
                Toast toast = Toast.makeText(this, "Twórca: Julian Machowski 4TP", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM, 0, 100);
                toast.show();
                return true;

            case R.id.wyjscie:
                finish();
                return true;

            case R.id.kolor1:
                P.ustawKolory(Color.BLACK, Color.WHITE);
                return true;

            case R.id.kolor2:
                P.ustawKolory(Color.RED, Color.YELLOW);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
