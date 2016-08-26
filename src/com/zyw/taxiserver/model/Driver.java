package com.zyw.taxiserver.model;

/**
 * Created by zyw on 2015/11/10.
 */
public class Driver extends User {

    /**
     * 司机已经接单
     */
    protected boolean mHasOrdered = false;

    public Driver(String name, String phoneNumber) {
        super(name, phoneNumber);
    }

    public void setHasOrdered(boolean hasOrdered) {
        mHasOrdered = hasOrdered;
    }

    public boolean isHasOrdered() {
        return mHasOrdered;
    }
}
