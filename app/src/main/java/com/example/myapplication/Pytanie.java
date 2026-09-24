package com.example.myapplication;

import com.google.gson.annotations.SerializedName;

public class Pytanie {
    @SerializedName("tresc")
    private String trescpytania;
    @SerializedName("odp_a")
    private String odpa;
    @SerializedName("odp_b")
    private String odpb;

    public Pytanie(String odpb, String odp_poprawna, String odpc, String odpa, String trescpytania) {
        this.odpb = odpb;
        this.odp_poprawna = odp_poprawna;
        this.odpc = odpc;
        this.odpa = odpa;
        this.trescpytania = trescpytania;
    }

    public String getTrescpytania() {
        return trescpytania;
    }

    public void setTrescpytania(String trescpytania) {
        this.trescpytania = trescpytania;
    }

    public String getOdpa() {
        return odpa;
    }

    public void setOdpa(String odpa) {
        this.odpa = odpa;
    }

    public String getOdpb() {
        return odpb;
    }

    public void setOdpb(String odpb) {
        this.odpb = odpb;
    }

    public String getOdpc() {
        return odpc;
    }

    public void setOdpc(String odpc) {
        this.odpc = odpc;
    }

    public String getOdp_poprawna() {
        return odp_poprawna;
    }

    public void setOdp_poprawna(String odp_poprawna) {
        this.odp_poprawna = odp_poprawna;
    }

    @SerializedName("odp_c")
    private String odpc;
    private String odp_poprawna;
}
