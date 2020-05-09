package ru.falchio.di_dagger2.nodiactivity;

import android.util.Log;

public class White {
    public White(){
        Log.d("TAG", "White: "  + new Green().show() );
    }
}
