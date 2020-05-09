package ru.falchio.di_dagger2.dagger2;

import android.util.Log;

import javax.inject.Inject;

import ru.falchio.di_dagger2.App;

public class Red {
    @Inject
    Green green;


    public Red(){
        App.getAppComponent().inject(this);
        Log.d("TAG", "Red: "  + green.show());
    }
}
