package com.example.endeusujian.retrofit;


import com.example.endeusujian.model.Country;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataServices {

    @GET("/endeus.json")
    public Call<List<Country>> getCountries();

}
