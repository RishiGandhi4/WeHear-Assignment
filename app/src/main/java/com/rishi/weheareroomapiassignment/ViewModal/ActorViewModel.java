package com.rishi.weheareroomapiassignment.ViewModal;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.rishi.weheareroomapiassignment.Modal.Actor;
import com.rishi.weheareroomapiassignment.Repository.ActorRespository;

import java.util.List;

public class ActorViewModel extends AndroidViewModel {
    private ActorRespository actorRespository;
    private LiveData<List<Actor>> getAllActors;

    public ActorViewModel(@NonNull Application application) {
        super(application);
        actorRespository=new ActorRespository(application);
        getAllActors=actorRespository.getAllActors();
    }

    public void insert(List<Actor> list)
    {
        actorRespository.insert(list);
    }

    public LiveData<List<Actor>> getAllActor()
    {
        return getAllActors;
    }
}
