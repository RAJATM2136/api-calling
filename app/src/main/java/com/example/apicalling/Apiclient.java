package com.example.apicalling;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Apiclient {
public static final String BASEURL="http://10.0.0.2/contactapp/";
public static Retrofit retrofit=null;

public static Retrofit getApiclient()
{
    if (retrofit==null)
    {
        retrofit=new Retrofit.Builder().baseUrl(BASEURL).addConverterFactory(GsonConverterFactory.create()).build();

    }
    return retrofit;
}

}
