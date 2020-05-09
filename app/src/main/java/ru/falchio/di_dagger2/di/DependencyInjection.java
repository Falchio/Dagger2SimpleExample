package ru.falchio.di_dagger2.di;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import ru.falchio.di_dagger2.R;

public class DependencyInjection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dependency_injection);

        //Dependency injection без Dagger
        Green green = new Green();
        Red red = new Red(green);
        White white = new White(green);
    }
}
