package ru.falchio.di_dagger2.dagger2;

import android.util.Log;

import javax.inject.Inject;

import ru.falchio.di_dagger2.App;

public class White {
    @Inject
    Green green;

    public White(){
        App.getAppComponent().inject(this);
        Log.d("TAG", "White: "  + green.show() );
    }
}
