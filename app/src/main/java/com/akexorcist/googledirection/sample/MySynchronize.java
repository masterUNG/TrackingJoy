package com.akexorcist.googledirection.sample;

import android.content.Context;
import android.os.AsyncTask;

/**
 * Created by masterUNG on 1/31/2017 AD.
 */

public class MySynchronize extends AsyncTask<String, Void, String>{

    //Explicit
    private Context context;

    public MySynchronize(Context context) {
        this.context = context;
    }   // Constructor

    @Override
    protected String doInBackground(String... strings) {
        return null;
    }
}   // Main Class
