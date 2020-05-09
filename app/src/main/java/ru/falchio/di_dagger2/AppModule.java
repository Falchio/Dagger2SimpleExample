package ru.falchio.di_dagger2;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ru.falchio.di_dagger2.dagger2.Green;

@Module
public class AppModule {
    private final Application application;

    public AppModule(Application application) {
        this.application=application;
    }

    @Singleton
    @Provides
    Green provideGreen(){
        return new Green();
    }
}
