package com.austinzeller.quakereporter;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;

import java.util.List;

class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {

    private String url;
    EarthquakeLoader(Context context, String url) {
        super(context);
        this.url=url;
    }

    @Override
    protected void onStartLoading(){
        forceLoad();
    }

    @Override
    public List<Earthquake> loadInBackground() {
        if(this.url==null)
            return null;
        //return here
        return QueryUtils.extractEarthquakes(this.url);
    }
}
