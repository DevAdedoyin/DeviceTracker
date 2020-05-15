package com.example.devicetracker;

import androidx.room.Database;
import androidx.room.RoomDatabase;


@Database(entities = {TransitionEntity.class}, version = 1)
public abstract class TransitionDatabase extends RoomDatabase {
    public abstract TransitionDao transitionDao();
}
