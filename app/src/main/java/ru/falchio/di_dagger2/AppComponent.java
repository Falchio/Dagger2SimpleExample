package ru.falchio.di_dagger2;

import javax.inject.Singleton;

import dagger.Component;
import ru.falchio.di_dagger2.dagger2.DaggerActivity;
import ru.falchio.di_dagger2.dagger2.Red;
import ru.falchio.di_dagger2.dagger2.White;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(DaggerActivity daggerActivity);

    void inject(Red red);

    void inject(White white);
}
