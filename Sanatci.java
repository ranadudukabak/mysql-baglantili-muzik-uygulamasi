/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ranadudukabak
 */
public class Sanatci {
    
    int sanatciID;
    String sanatciAd;
    String sanatciUlke;

    public Sanatci(int sanatciID, String sanatciAd, String sanatciUlke) {
        this.sanatciID = sanatciID;
        this.sanatciAd = sanatciAd;
        this.sanatciUlke = sanatciUlke;
    }

    public int getSanatciID() {
        return sanatciID;
    }

    public void setSanatciID(int sanatciID) {
        this.sanatciID = sanatciID;
    }

    public String getSanatciAd() {
        return sanatciAd;
    }

    public void setSanatciAd(String sanatciAd) {
        this.sanatciAd = sanatciAd;
    }

    public String getSanatciUlke() {
        return sanatciUlke;
    }

    public void setSanatciUlke(String sanatciUlke) {
        this.sanatciUlke = sanatciUlke;
    }
    
    
}
