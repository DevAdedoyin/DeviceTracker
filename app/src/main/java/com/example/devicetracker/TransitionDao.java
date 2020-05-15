package com.example.devicetracker;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.google.android.gms.tasks.Task;

import java.util.List;

@Dao
public interface TransitionDao {
        @Query("SELECT * FROM transitionentity")
        List<TransitionEntity> getAll();

        @Insert
        void insert(TransitionEntity transitionEntity);

        @Delete
        void delete(TransitionEntity transitionEntity);

        @Update
        void update(TransitionEntity transitionEntity);
}
