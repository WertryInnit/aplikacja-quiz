package com.example.myapplication;

import com.google.gson.annotations.SerializedName;

public class Pytanie {
    @SerializedName("tresc")
    private String trescpytania;
    @SerializedName("odp_a")
    private String odpa;
    @SerializedName("odp_b")
    private String odpb;
    @SerializedName("odp_c")
    private String odpc;
    private String odp_poprawna;
}
