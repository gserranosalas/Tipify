package com.gcss.tipify;

import android.app.Application;

/**
 * Created by gserranosalas on 19-06-16.
 */
public class TipifyApp extends Application {
    private final static String ABOUT_URL ="https://www.linkedin.com/in/gserranosalas";

    public String getAboutUrl() {
        return ABOUT_URL;
    }
}
