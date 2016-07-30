package com.elyeproj.edittextleak;

import android.app.Application;
import android.os.StrictMode;

/**
 * Created by elye on 30/07/2016.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        StrictMode.setVmPolicy(
                new StrictMode.VmPolicy.Builder().detectAll()
                        .penaltyLog().penaltyDeath().build());
    }
}
