package misc;

import android.app.Application;

import timber.log.Timber;

/**
 * @author Vadym Oliinyk
 * @email vadim.welldone@gmail.com
 * @date April 17, 2018
 */
public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree());
    }
}
