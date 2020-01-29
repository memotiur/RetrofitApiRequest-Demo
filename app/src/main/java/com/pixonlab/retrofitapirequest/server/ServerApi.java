package com.pixonlab.retrofitapirequest.server;

import com.pixonlab.retrofitapirequest.model.PersonalInformation;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ServerApi {

    String BASE_URL =  "https://app.thebrainfactoryy.com";

    @GET("/api/wmm/test")
    Call<PersonalInformation> getPersonalInformation();

}
