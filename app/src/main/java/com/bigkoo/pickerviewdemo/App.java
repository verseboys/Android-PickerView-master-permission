package com.bigkoo.pickerviewdemo;

import android.app.Application;

import com.vise.xsnow.http.ViseHttp;


/**
 * Created by verseboys on 2018-01-31.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ViseHttp.init(this);


    }
}
