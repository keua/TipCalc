package com.oktacore.android.tipcalc;

import android.app.Application;

/**
 * Created by usuario on 5/06/16.
 */
public class TipCalcApp extends Application {
    private final static String ABOUT_URL = "http://oktacore.com";

    public String getAboutUrl() {
        return ABOUT_URL;
    }
}
