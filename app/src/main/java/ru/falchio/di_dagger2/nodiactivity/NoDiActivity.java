package ru.falchio.di_dagger2.nodiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import ru.falchio.di_dagger2.R;

public class NoDiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_di);
        White white = new White();
        Red red = new Red();
    }
}
