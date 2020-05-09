package ru.falchio.di_dagger2.nodiactivity;

import android.util.Log;

public class Red {

    public Red(){
        Log.d("TAG", "Red: "  + new Green().show());
    }
}
