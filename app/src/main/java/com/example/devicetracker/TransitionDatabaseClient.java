package com.example.devicetracker;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;

public class TransitionDatabaseClient {

    private Context mCtx;
    private static TransitionDatabaseClient mInstance;

    private TransitionDatabase appDatabase;

    private TransitionDatabaseClient(Context mCtx) {
        this.mCtx = mCtx;

        appDatabase = Room.databaseBuilder(mCtx, TransitionDatabase.class, "MyTransitions").build();
    }

    public static synchronized TransitionDatabaseClient getInstance(Context mCtx) {
        if (mInstance == null) {
            mInstance = new TransitionDatabaseClient(mCtx);
        }
        return mInstance;
    }

    public TransitionDatabase getAppDatabase() {
        return appDatabase;
    }
}
