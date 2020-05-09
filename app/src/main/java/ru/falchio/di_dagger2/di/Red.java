package ru.falchio.di_dagger2.di;

import android.util.Log;

public class Red {

    public Red(Green green){
        Log.d("TAG", "Red: "  + green.show());
    }
}
