package com.example.apicalling;

import com.google.gson.annotations.SerializedName;

public class contact {
    @SerializedName("name")
    private String Name;
    @SerializedName("email")
    private String Email;

    public String getEmail() {
        return Email;
    }

    public String getName() {
        return Name;
    }
}
