/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ranadudukabak
 */
public class Sarki {
    
    int sarkiID;
    String sarkiAd;
    String sarkiTarih;
    String sarkiSanatci;
    String sarkiAlbum;
    String sarkiTur;
    float sarkiSure;   
    int dinlenmeSayisi;

    public Sarki(int sarkiID, String sarkiAd, String sarkiTarih, String sarkiSanatci, String sarkiAlbum, String sarkiTur, float sarkiSure, int dinlenmeSayisi) {
        this.sarkiID = sarkiID;
        this.sarkiAd = sarkiAd;
        this.sarkiTarih = sarkiTarih;
        this.sarkiSanatci = sarkiSanatci;
        this.sarkiAlbum = sarkiAlbum;
        this.sarkiTur = sarkiTur;
        this.sarkiSure = sarkiSure;
        this.dinlenmeSayisi = dinlenmeSayisi;
    }

    public int getSarkiID() {
        return sarkiID;
    }

    public void setSarkiID(int sarkiID) {
        this.sarkiID = sarkiID;
    }

    public String getSarkiAd() {
        return sarkiAd;
    }

    public void setSarkiAd(String sarkiAd) {
        this.sarkiAd = sarkiAd;
    }

    public String getSarkiTarih() {
        return sarkiTarih;
    }

    public void setSarkiTarih(String sarkiTarih) {
        this.sarkiTarih = sarkiTarih;
    }

    public String getSarkiSanatci() {
        return sarkiSanatci;
    }

    public void setSarkiSanatci(String sarkiSanatci) {
        this.sarkiSanatci = sarkiSanatci;
    }

    public String getSarkiAlbum() {
        return sarkiAlbum;
    }

    public void setSarkiAlbum(String sarkiAlbum) {
        this.sarkiAlbum = sarkiAlbum;
    }

    public String getSarkiTur() {
        return sarkiTur;
    }

    public void setSarkiTur(String sarkiTur) {
        this.sarkiTur = sarkiTur;
    }

    public float getSarkiSure() {
        return sarkiSure;
    }

    public void setSarkiSure(float sarkiSure) {
        this.sarkiSure = sarkiSure;
    }

    public int getDinlenmeSayisi() {
        return dinlenmeSayisi;
    }

    public void setDinlenmeSayisi(int dinlenmeSayisi) {
        this.dinlenmeSayisi = dinlenmeSayisi;
    }
    
    
                            
}
