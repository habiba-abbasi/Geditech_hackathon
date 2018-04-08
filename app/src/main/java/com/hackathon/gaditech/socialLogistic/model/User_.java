package com.hackathon.gaditech.socialLogistic.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Created by Habiba Abbasii on 08/04/2018.
 */

public class User_ {
    @SerializedName("is_verified")
    @Expose
    private Integer isVerified;
    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("last_name")
    @Expose
    private String lastName;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("access_token")
    @Expose
    private String accessToken;
    @SerializedName("trust_index")
    @Expose
    private Integer trustIndex;

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("identifier")
    @Expose
    private String identifier;
    @SerializedName("token")
    @Expose
    private String token;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(Integer isVerified) {
        this.isVerified = isVerified;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Integer getTrustIndex() {
        return trustIndex;
    }

    public void setTrustIndex(Integer trustIndex) {
        this.trustIndex = trustIndex;
    }



}
