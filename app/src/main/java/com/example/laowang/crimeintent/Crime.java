package com.example.laowang.crimeintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by laowang on 2017/12/1.
 */

public class Crime {
    private UUID mId;
    private String mTile;
    private Date mDate;
    private boolean mSolved;

    public Crime(){
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getmId() {
        return mId;
    }

    public void setmId(UUID mId) {
        this.mId = mId;
    }

    public String getmTile() {
        return mTile;
    }

    public void setmTile(String mTile) {
        this.mTile = mTile;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean ismSolved() {
        return mSolved;
    }

    public void setmSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }
}
