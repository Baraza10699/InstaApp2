package com.example.instaapp;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("mKDgr2fgw0InIJyV30U0fvm6Kt0Txl85RtEXiYwc")
                .clientKey("NYyFt01DB1eeLLyRApqtHaT4G7QX43jxCcoKvcel")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
