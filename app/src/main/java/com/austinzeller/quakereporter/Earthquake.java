package com.austinzeller.quakereporter;

class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private String mDate;
    private long mTimeInMilliseconds;
    private String mUrl;

    public Earthquake(double mMagnitude, String mLocation, long mTimeInMilliseconds){
        this.mMagnitude=mMagnitude;
        this.mLocation=mLocation;
        this.mTimeInMilliseconds=mTimeInMilliseconds;
        this.mUrl=null;
    }

    Earthquake(double mMagnitude, String mLocation, long mTimeInMilliseconds, String mUrl){
        this.mMagnitude=mMagnitude;
        this.mLocation=mLocation;
        this.mTimeInMilliseconds=mTimeInMilliseconds;
        this.mUrl=mUrl;
    }

    double getMagnitude(){
        return mMagnitude;
    }

    String getLocation(){
        return mLocation;
    }

    long getTimeInMilliseconds(){
        return mTimeInMilliseconds;
    }

    String getUrl(){
        return mUrl;
    }
}
