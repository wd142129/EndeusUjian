package com.example.endeusujian.model;

import com.google.gson.annotations.SerializedName;

public class Country {
    @SerializedName("nama")
    private String nama;


    public Country(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
