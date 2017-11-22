package com.er.sjdb.shiyan2;

import android.app.Application;
import android.content.Context;

/**
 * Created by sjdb on 2017/11/15.
 */

public class WordsApplication extends Application {
    private static Context context;
    public static Context getContext(){
        return WordsApplication.context;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        WordsApplication.context=getApplicationContext();
    }
}