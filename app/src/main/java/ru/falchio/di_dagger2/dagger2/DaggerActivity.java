package ru.falchio.di_dagger2.dagger2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.WindowDecorActionBar;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

import ru.falchio.di_dagger2.App;
import ru.falchio.di_dagger2.R;

public class DaggerActivity extends AppCompatActivity {

    @Inject
    Green green;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger);

        App.getAppComponent().inject(this);
        White white = new White();
        Red red = new Red();

        Log.d("TAG", "onCreate: " + green.show());
    }
}
