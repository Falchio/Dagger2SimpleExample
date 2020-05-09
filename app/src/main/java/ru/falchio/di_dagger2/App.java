package ru.falchio.di_dagger2;

import android.app.Application;

public class App extends Application {
    private static AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = generateAppComponent();
    }

    private AppComponent generateAppComponent() {
        //чтобы подтянулся DaggerComponent надо build project
        return DaggerAppComponent
                .builder()
                .appModule(new AppModule(this))
                .build();
    }

    public static AppComponent getAppComponent(){
        return appComponent;
    }


}
