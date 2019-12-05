package com.example.apicalling;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.POST;

public interface Apiinterface {
    @POST("readcontacts.php")
     Call<List<contact>> getcontacts();
}
