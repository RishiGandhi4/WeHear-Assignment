package com.rishi.weheareroomapiassignment.Network;


import com.rishi.weheareroomapiassignment.Modal.Actor;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    @GET("entries")
    Call<List<Actor>> getAllActors();
}
