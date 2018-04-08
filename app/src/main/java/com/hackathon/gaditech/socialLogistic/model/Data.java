package com.hackathon.gaditech.socialLogistic.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Habiba Abbasii on 08/04/2018.
 */

public class Data {


    @SerializedName("verification_method")
    @Expose
    private String verificationMethod;
    @SerializedName("registered")
    @Expose
    private String registered;
    @SerializedName("user")
    @Expose
    private User_ user;

    public String getVerificationMethod() {
        return verificationMethod;
    }

    public void setVerificationMethod(String verificationMethod) {
        this.verificationMethod = verificationMethod;
    }

    public String getRegistered() {
        return registered;
    }

    public void setRegistered(String registered) {
        this.registered = registered;
    }

    public User_ getUser() {
        return user;
    }

    public void setUser(User_ user) {
        this.user = user;
    }
}
