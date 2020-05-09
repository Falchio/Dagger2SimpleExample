package ru.falchio.di_dagger2.di;

import android.util.Log;

public class White {
    public White(Green green){
        Log.d("TAG", "White: "  + green.show() );
    }
}
