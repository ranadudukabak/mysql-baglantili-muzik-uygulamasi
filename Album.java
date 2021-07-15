/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ranadudukabak
 */
public class Album {
    
    int albumID;
    String albumAd;
    String albumSanatci;
    String albumTarih;
    String albumTur;

    public Album(int albumID, String albumAd, String albumSanatci, String albumTarih, String albumTur) {
        this.albumID = albumID;
        this.albumAd = albumAd;
        this.albumSanatci = albumSanatci;
        this.albumTarih = albumTarih;
        this.albumTur = albumTur;
    }

    public int getAlbumID() {
        return albumID;
    }

    public void setAlbumID(int albumID) {
        this.albumID = albumID;
    }

    public String getAlbumAd() {
        return albumAd;
    }

    public void setAlbumAd(String albumAd) {
        this.albumAd = albumAd;
    }

    public String getAlbumSanatci() {
        return albumSanatci;
    }

    public void setAlbumSanatci(String albumSanatci) {
        this.albumSanatci = albumSanatci;
    }

    public String getAlbumTarih() {
        return albumTarih;
    }

    public void setAlbumTarih(String albumTarih) {
        this.albumTarih = albumTarih;
    }

    public String getAlbumTur() {
        return albumTur;
    }

    public void setAlbumTur(String albumTur) {
        this.albumTur = albumTur;
    }
    
    
}
