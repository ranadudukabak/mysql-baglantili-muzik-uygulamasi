
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ranadudukabak
 */
public class Admin_Top_10_Islemleri {
    
    private Connection con = null;
    
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;

    public Admin_Top_10_Islemleri() {
        
        String url = "jdbc:mysql://" + Java_DB_Baglanti.localHost + ":" + Java_DB_Baglanti.port + "/" + Java_DB_Baglanti.dbIsmi+ "?useUnicode=true&characterEncoding=utf8";
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadı....");
        }
        
        try {
            con = DriverManager.getConnection(url, Java_DB_Baglanti.kullaniciAdi, Java_DB_Baglanti.parola);
            System.out.println("Bağlantı Başarılı...");
            
            
        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız...");
            //ex.printStackTrace();
        }
    }
     
    public ArrayList<Sarki> DinlenmeSayisiTop10Getir() {
        
        ArrayList<Sarki> cikti = new ArrayList<Sarki>();
        
        try {
            statement =  con.createStatement();
            String sorgu =  "Select * From şarkı Order By şarkıDinlenmeSayısı DESC";
            
            ResultSet rs =  statement.executeQuery(sorgu);
            
            while(rs.next()) {
                int sarkiID = rs.getInt("şarkıID");
                String sarkiAd = rs.getString("şarkıAd");
                String sarkiTarih = rs.getString("şarkıTarih");
                String sarkiSanatci  = rs.getString("şarkıSanatçı");
                String sarkiAlbum = rs.getString("şarkıAlbüm");
                String sarkiTur = rs.getString("şarkıTür");
                float sarkiSure = rs.getFloat("şarkıSüre");
                int dinlenmeSayisi = rs.getInt("şarkıDinlenmeSayısı");
                
                cikti.add(new Sarki(sarkiID, sarkiAd, sarkiTarih, sarkiSanatci, sarkiAlbum, sarkiTur, sarkiSure, dinlenmeSayisi));
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(Admin_Muzik_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
            
        }
    }
    
    public ArrayList<Sarki> KlasikDinlenmeSayisiTop10Getir() {
        
        ArrayList<Sarki> cikti = new ArrayList<Sarki>();
        
        try {
            statement =  con.createStatement();
            String sorgu =  "Select * From şarkı Where şarkıTür = 'Klasik' Order By şarkıDinlenmeSayısı DESC";
            
            ResultSet rs =  statement.executeQuery(sorgu);
            
            while(rs.next()) {
                int sarkiID = rs.getInt("şarkıID");
                String sarkiAd = rs.getString("şarkıAd");
                String sarkiTarih = rs.getString("şarkıTarih");
                String sarkiSanatci  = rs.getString("şarkıSanatçı");
                String sarkiAlbum = rs.getString("şarkıAlbüm");
                String sarkiTur = rs.getString("şarkıTür");
                float sarkiSure = rs.getFloat("şarkıSüre");
                int dinlenmeSayisi = rs.getInt("şarkıDinlenmeSayısı");
                
                cikti.add(new Sarki(sarkiID, sarkiAd, sarkiTarih, sarkiSanatci, sarkiAlbum, sarkiTur, sarkiSure, dinlenmeSayisi));
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(Admin_Muzik_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
            
        }
    }
    
    public ArrayList<Sarki> JazzDinlenmeSayisiTop10Getir() {
        
        ArrayList<Sarki> cikti = new ArrayList<Sarki>();
        
        try {
            statement =  con.createStatement();
            String sorgu =  "Select * From şarkı Where şarkıTür = 'Jazz' Order By şarkıDinlenmeSayısı DESC";
            
            ResultSet rs =  statement.executeQuery(sorgu);
            
            while(rs.next()) {
                int sarkiID = rs.getInt("şarkıID");
                String sarkiAd = rs.getString("şarkıAd");
                String sarkiTarih = rs.getString("şarkıTarih");
                String sarkiSanatci  = rs.getString("şarkıSanatçı");
                String sarkiAlbum = rs.getString("şarkıAlbüm");
                String sarkiTur = rs.getString("şarkıTür");
                float sarkiSure = rs.getFloat("şarkıSüre");
                int dinlenmeSayisi = rs.getInt("şarkıDinlenmeSayısı");
                
                cikti.add(new Sarki(sarkiID, sarkiAd, sarkiTarih, sarkiSanatci, sarkiAlbum, sarkiTur, sarkiSure, dinlenmeSayisi));
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(Admin_Muzik_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
            
        }
    }
    
    public ArrayList<Sarki> PopDinlenmeSayisiTop10Getir() {
        
        ArrayList<Sarki> cikti = new ArrayList<Sarki>();
        
        try {
            statement =  con.createStatement();
            String sorgu =  "Select * From şarkı Where şarkıTür = 'Pop' Order By şarkıDinlenmeSayısı DESC";
            
            ResultSet rs =  statement.executeQuery(sorgu);
            
            while(rs.next()) {
                int sarkiID = rs.getInt("şarkıID");
                String sarkiAd = rs.getString("şarkıAd");
                String sarkiTarih = rs.getString("şarkıTarih");
                String sarkiSanatci  = rs.getString("şarkıSanatçı");
                String sarkiAlbum = rs.getString("şarkıAlbüm");
                String sarkiTur = rs.getString("şarkıTür");
                float sarkiSure = rs.getFloat("şarkıSüre");
                int dinlenmeSayisi = rs.getInt("şarkıDinlenmeSayısı");
                
                cikti.add(new Sarki(sarkiID, sarkiAd, sarkiTarih, sarkiSanatci, sarkiAlbum, sarkiTur, sarkiSure, dinlenmeSayisi));
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(Admin_Muzik_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
            
        }
    }
}
