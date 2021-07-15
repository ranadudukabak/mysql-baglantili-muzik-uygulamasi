
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
public class Gecis_Islemleri {
    String normal_kullanici_adi = Giris_Paneli.normal_kullanici_adi;

    private Connection con = null;

    private Statement statement = null;
    private PreparedStatement preparedStatement = null;

    public Gecis_Islemleri() {

        String url = "jdbc:mysql://" + Java_DB_Baglanti.localHost + ":" + Java_DB_Baglanti.port + "/" + Java_DB_Baglanti.dbIsmi + "?useUnicode=true&characterEncoding=utf8";

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

  //gamze için
    public ArrayList<Sarki> KullaniciKlasikSarkilariGetir() {
        
        ArrayList<Sarki> cikti = new ArrayList<Sarki>();
        
        try {
            String sorgu =  "Select * From gamze_dinç where şarkıTür = 'Klasik'"; //SORGUYU DÜZELT!!!!!!!!!!!!!
            
            statement =  con.createStatement();
            
//            preparedStatement = con.prepareStatement(sorgu);
//            preparedStatement.setString(1, albumAd);
            
            ResultSet rs =  statement.executeQuery(sorgu);
//            preparedStatement.executeUpdate();
            
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
            Logger.getLogger(Admin_Album_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
            
        }
    }
    
    public ArrayList<Sarki> KullaniciJazzSarkilariGetir() {
        
        ArrayList<Sarki> cikti = new ArrayList<Sarki>();
        
        try {
            String sorgu =  "Select * From gamze_dinç where şarkıTür = 'Jazz'"; //SORGUYU DÜZELT!!!!!!!!!!!!!
            
            statement =  con.createStatement();
            
//            preparedStatement = con.prepareStatement(sorgu);
//            preparedStatement.setString(1, albumAd);
            
            ResultSet rs =  statement.executeQuery(sorgu);
//            preparedStatement.executeUpdate();
            
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
            Logger.getLogger(Admin_Album_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
            
        }
    }
    
    public ArrayList<Sarki> KullaniciPopSarkilariGetir() {
        
        ArrayList<Sarki> cikti = new ArrayList<Sarki>();
        
        try {
            String sorgu =  "Select * From gamze_dinç where şarkıTür = 'Pop'"; //SORGUYU DÜZELT!!!!!!!!!!!!!
            
            statement =  con.createStatement();
            
//            preparedStatement = con.prepareStatement(sorgu);
//            preparedStatement.setString(1, albumAd);
            
            ResultSet rs =  statement.executeQuery(sorgu);
//            preparedStatement.executeUpdate();
            
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
            Logger.getLogger(Admin_Album_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////
    //etkacure için tablo adi etka_cüre
    
    
    
      
    public ArrayList<Sarki> etkaKullaniciKlasikSarkilariGetir() {
        
        ArrayList<Sarki> cikti = new ArrayList<Sarki>();
        
        try {
            String sorgu =  "Select * From etka_cüre where şarkıTür = 'Klasik'"; //SORGUYU DÜZELT!!!!!!!!!!!!!
            
            statement =  con.createStatement();
            
//            preparedStatement = con.prepareStatement(sorgu);
//            preparedStatement.setString(1, albumAd);
            
            ResultSet rs =  statement.executeQuery(sorgu);
//            preparedStatement.executeUpdate();
            
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
            Logger.getLogger(Admin_Album_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
            
        }
    }
    
    public ArrayList<Sarki> etkaKullaniciJazzSarkilariGetir() {
        
        ArrayList<Sarki> cikti = new ArrayList<Sarki>();
        
        try {
            String sorgu =  "Select * From etka_cüre where şarkıTür = 'Jazz'"; //SORGUYU DÜZELT!!!!!!!!!!!!!
            
            statement =  con.createStatement();
            
//            preparedStatement = con.prepareStatement(sorgu);
//            preparedStatement.setString(1, albumAd);
            
            ResultSet rs =  statement.executeQuery(sorgu);
//            preparedStatement.executeUpdate();
            
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
            Logger.getLogger(Admin_Album_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
            
        }
    }
    
    public ArrayList<Sarki> etkaKullaniciPopSarkilariGetir() {
        
        ArrayList<Sarki> cikti = new ArrayList<Sarki>();
        
        try {
            String sorgu =  "Select * From etka_cüre where şarkıTür = 'Pop'"; //SORGUYU DÜZELT!!!!!!!!!!!!!
            
            statement =  con.createStatement();
            
//            preparedStatement = con.prepareStatement(sorgu);
//            preparedStatement.setString(1, albumAd);
            
            ResultSet rs =  statement.executeQuery(sorgu);
//            preparedStatement.executeUpdate();
            
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
            Logger.getLogger(Admin_Album_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
 //////////////////////////////////////////////////////////////////////////////////////////////
    //furkan için 
        
      
    public ArrayList<Sarki> furkanKullaniciKlasikSarkilariGetir() {
        
        ArrayList<Sarki> cikti = new ArrayList<Sarki>();
        
        try {
            String sorgu =  "Select * From furkan_yavuz where şarkıTür = 'Klasik'"; //SORGUYU DÜZELT!!!!!!!!!!!!!
            
            statement =  con.createStatement();
            
//            preparedStatement = con.prepareStatement(sorgu);
//            preparedStatement.setString(1, albumAd);
            
            ResultSet rs =  statement.executeQuery(sorgu);
//            preparedStatement.executeUpdate();
            
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
            Logger.getLogger(Admin_Album_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
            
        }
    }
    
    public ArrayList<Sarki> furkanKullaniciJazzSarkilariGetir() {
        
        ArrayList<Sarki> cikti = new ArrayList<Sarki>();
        
        try {
            String sorgu =  "Select * From furkan_yavuz where şarkıTür = 'Jazz'"; //SORGUYU DÜZELT!!!!!!!!!!!!!
            
            statement =  con.createStatement();
            
//            preparedStatement = con.prepareStatement(sorgu);
//            preparedStatement.setString(1, albumAd);
            
            ResultSet rs =  statement.executeQuery(sorgu);
//            preparedStatement.executeUpdate();
            
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
            Logger.getLogger(Admin_Album_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
            
        }
    }
    
    public ArrayList<Sarki> furkanKullaniciPopSarkilariGetir() {
        
        ArrayList<Sarki> cikti = new ArrayList<Sarki>();
        
        try {
            String sorgu =  "Select * From furkan_yavuz where şarkıTür = 'Pop'"; //SORGUYU DÜZELT!!!!!!!!!!!!!
            
            statement =  con.createStatement();
            
//            preparedStatement = con.prepareStatement(sorgu);
//            preparedStatement.setString(1, albumAd);
            
            ResultSet rs =  statement.executeQuery(sorgu);
//            preparedStatement.executeUpdate();
            
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
            Logger.getLogger(Admin_Album_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    /////////////////////////////////////////////////////////////////////////
    //melisa için
    public ArrayList<Sarki> melisaKullaniciKlasikSarkilariGetir() {
        
        ArrayList<Sarki> cikti = new ArrayList<Sarki>();
        
        try {
            String sorgu =  "Select * From melisa_yılmaz where şarkıTür = 'Klasik'"; //SORGUYU DÜZELT!!!!!!!!!!!!!
            
            statement =  con.createStatement();
            
//            preparedStatement = con.prepareStatement(sorgu);
//            preparedStatement.setString(1, albumAd);
            
            ResultSet rs =  statement.executeQuery(sorgu);
//            preparedStatement.executeUpdate();
            
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
            Logger.getLogger(Admin_Album_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
            
        }
    }
    
    public ArrayList<Sarki> melisaKullaniciJazzSarkilariGetir() {
        
        ArrayList<Sarki> cikti = new ArrayList<Sarki>();
        
        try {
            String sorgu =  "Select * From melisa_yılmaz where şarkıTür = 'Jazz'"; //SORGUYU DÜZELT!!!!!!!!!!!!!
            
            statement =  con.createStatement();
            
//            preparedStatement = con.prepareStatement(sorgu);
//            preparedStatement.setString(1, albumAd);
            
            ResultSet rs =  statement.executeQuery(sorgu);
//            preparedStatement.executeUpdate();
            
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
            Logger.getLogger(Admin_Album_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
            
        }
    }
    
    public ArrayList<Sarki> melisaKullaniciPopSarkilariGetir() {
        
        ArrayList<Sarki> cikti = new ArrayList<Sarki>();
        
        try {
            String sorgu =  "Select * From melisa_yılmaz where şarkıTür = 'Pop'"; //SORGUYU DÜZELT!!!!!!!!!!!!!
            
            statement =  con.createStatement();
            
//            preparedStatement = con.prepareStatement(sorgu);
//            preparedStatement.setString(1, albumAd);
            
            ResultSet rs =  statement.executeQuery(sorgu);
//            preparedStatement.executeUpdate();
            
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
            Logger.getLogger(Admin_Album_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////
    //murat için
    public ArrayList<Sarki> muratKullaniciKlasikSarkilariGetir() {
        
        ArrayList<Sarki> cikti = new ArrayList<Sarki>();
        
        try {
            String sorgu =  "Select * From murat_gündüz where şarkıTür = 'Klasik'"; //SORGUYU DÜZELT!!!!!!!!!!!!!
            
            statement =  con.createStatement();
            
//            preparedStatement = con.prepareStatement(sorgu);
//            preparedStatement.setString(1, albumAd);
            
            ResultSet rs =  statement.executeQuery(sorgu);
//            preparedStatement.executeUpdate();
            
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
            Logger.getLogger(Admin_Album_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
            
        }
    }
    
    public ArrayList<Sarki> muratKullaniciJazzSarkilariGetir() {
        
        ArrayList<Sarki> cikti = new ArrayList<Sarki>();
        
        try {
            String sorgu =  "Select * From murat_gündüz where şarkıTür = 'Jazz'"; //SORGUYU DÜZELT!!!!!!!!!!!!!
            
            statement =  con.createStatement();
            
//            preparedStatement = con.prepareStatement(sorgu);
//            preparedStatement.setString(1, albumAd);
            
            ResultSet rs =  statement.executeQuery(sorgu);
//            preparedStatement.executeUpdate();
            
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
            Logger.getLogger(Admin_Album_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
            
        }
    }
    
    public ArrayList<Sarki> muratKullaniciPopSarkilariGetir() {
        
        ArrayList<Sarki> cikti = new ArrayList<Sarki>();
        
        try {
            String sorgu =  "Select * From murat_gündüz where şarkıTür = 'Pop'"; //SORGUYU DÜZELT!!!!!!!!!!!!!
            
            statement =  con.createStatement();
            
//            preparedStatement = con.prepareStatement(sorgu);
//            preparedStatement.setString(1, albumAd);
            
            ResultSet rs =  statement.executeQuery(sorgu);
//            preparedStatement.executeUpdate();
            
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
            Logger.getLogger(Admin_Album_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    
    
    
    
    
    
    
        
      public ArrayList<Sarki> zehraKullaniciKlasikSarkilariGetir() {
        
        ArrayList<Sarki> cikti = new ArrayList<Sarki>();
        
        try {
            String sorgu =  "Select * From zehra_çelik where şarkıTür = 'Klasik'"; //SORGUYU DÜZELT!!!!!!!!!!!!!
            
            statement =  con.createStatement();
            
//            preparedStatement = con.prepareStatement(sorgu);
//            preparedStatement.setString(1, albumAd);
            
            ResultSet rs =  statement.executeQuery(sorgu);
//            preparedStatement.executeUpdate();
            
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
            Logger.getLogger(Admin_Album_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
            
        }
    }
    
    public ArrayList<Sarki> zehraKullaniciJazzSarkilariGetir() {
        
        ArrayList<Sarki> cikti = new ArrayList<Sarki>();
        
        try {
            String sorgu =  "Select * From zehra_çelik where şarkıTür = 'Jazz'"; //SORGUYU DÜZELT!!!!!!!!!!!!!
            
            statement =  con.createStatement();
            
//            preparedStatement = con.prepareStatement(sorgu);
//            preparedStatement.setString(1, albumAd);
            
            ResultSet rs =  statement.executeQuery(sorgu);
//            preparedStatement.executeUpdate();
            
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
            Logger.getLogger(Admin_Album_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
            
        }
    }
    
    public ArrayList<Sarki> zehraKullaniciPopSarkilariGetir() {
        
        ArrayList<Sarki> cikti = new ArrayList<Sarki>();
        
        try {
            String sorgu =  "Select * From zehra_çelik where şarkıTür = 'Pop'"; //SORGUYU DÜZELT!!!!!!!!!!!!!
            
            statement =  con.createStatement();
            
//            preparedStatement = con.prepareStatement(sorgu);
//            preparedStatement.setString(1, albumAd);
            
            ResultSet rs =  statement.executeQuery(sorgu);
//            preparedStatement.executeUpdate();
            
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
            Logger.getLogger(Admin_Album_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////
    //etkacure için tablo adi etka_cüre
    
    
    
      
    public ArrayList<Sarki> sezenKullaniciKlasikSarkilariGetir() {
        
        ArrayList<Sarki> cikti = new ArrayList<Sarki>();
        
        try {
            String sorgu =  "Select * From sezen_kaya  where şarkıTür = 'Klasik'"; //SORGUYU DÜZELT!!!!!!!!!!!!!
            
            statement =  con.createStatement();
            
//            preparedStatement = con.prepareStatement(sorgu);
//            preparedStatement.setString(1, albumAd);
            
            ResultSet rs =  statement.executeQuery(sorgu);
//            preparedStatement.executeUpdate();
            
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
            Logger.getLogger(Admin_Album_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
            
        }
    }
    
    public ArrayList<Sarki> sezenKullaniciJazzSarkilariGetir() {
        
        ArrayList<Sarki> cikti = new ArrayList<Sarki>();
        
        try {
            String sorgu =  "Select * From sezen_kaya  where şarkıTür = 'Jazz'"; //SORGUYU DÜZELT!!!!!!!!!!!!!
            
            statement =  con.createStatement();
            
//            preparedStatement = con.prepareStatement(sorgu);
//            preparedStatement.setString(1, albumAd);
            
            ResultSet rs =  statement.executeQuery(sorgu);
//            preparedStatement.executeUpdate();
            
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
            Logger.getLogger(Admin_Album_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
            
        }
    }
    
    public ArrayList<Sarki> sezenKullaniciPopSarkilariGetir() {
        
        ArrayList<Sarki> cikti = new ArrayList<Sarki>();
        
        try {
            String sorgu =  "Select * From sezen_kaya  where şarkıTür = 'Pop'"; //SORGUYU DÜZELT!!!!!!!!!!!!!
            
            statement =  con.createStatement();
            
//            preparedStatement = con.prepareStatement(sorgu);
//            preparedStatement.setString(1, albumAd);
            
            ResultSet rs =  statement.executeQuery(sorgu);
//            preparedStatement.executeUpdate();
            
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
            Logger.getLogger(Admin_Album_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
 //////////////////////////////////////////////////////////////////////////////////////////////
    //furkan için 
        
      
    public ArrayList<Sarki> serraKullaniciKlasikSarkilariGetir() {
        
        ArrayList<Sarki> cikti = new ArrayList<Sarki>();
        
        try {
            String sorgu =  "Select * From serra_şevval_kabak  where şarkıTür = 'Klasik'"; //SORGUYU DÜZELT!!!!!!!!!!!!!
            
            statement =  con.createStatement();
            
//            preparedStatement = con.prepareStatement(sorgu);
//            preparedStatement.setString(1, albumAd);
            
            ResultSet rs =  statement.executeQuery(sorgu);
//            preparedStatement.executeUpdate();
            
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
            Logger.getLogger(Admin_Album_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
            
        }
    }
    
    public ArrayList<Sarki> serraKullaniciJazzSarkilariGetir() {
        
        ArrayList<Sarki> cikti = new ArrayList<Sarki>();
        
        try {
            String sorgu =  "Select * From serra_şevval_kabak  where şarkıTür = 'Jazz'"; //SORGUYU DÜZELT!!!!!!!!!!!!!
            
            statement =  con.createStatement();
            
//            preparedStatement = con.prepareStatement(sorgu);
//            preparedStatement.setString(1, albumAd);
            
            ResultSet rs =  statement.executeQuery(sorgu);
//            preparedStatement.executeUpdate();
            
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
            Logger.getLogger(Admin_Album_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
            
        }
    }
    
    public ArrayList<Sarki> serraKullaniciPopSarkilariGetir() {
        
        ArrayList<Sarki> cikti = new ArrayList<Sarki>();
        
        try {
            String sorgu =  "Select * From serra_şevval_kabak where şarkıTür = 'Pop'"; //SORGUYU DÜZELT!!!!!!!!!!!!!
            
            statement =  con.createStatement();
            
//            preparedStatement = con.prepareStatement(sorgu);
//            preparedStatement.setString(1, albumAd);
            
            ResultSet rs =  statement.executeQuery(sorgu);
//            preparedStatement.executeUpdate();
            
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
            Logger.getLogger(Admin_Album_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    /////////////////////////////////////////////////////////////////////////
    //melisa için
    public ArrayList<Sarki> onurKullaniciKlasikSarkilariGetir() {
        
        ArrayList<Sarki> cikti = new ArrayList<Sarki>();
        
        try {
            String sorgu =  "Select * From onur_aksoy  where şarkıTür = 'Klasik'"; //SORGUYU DÜZELT!!!!!!!!!!!!!
            
            statement =  con.createStatement();
            
//            preparedStatement = con.prepareStatement(sorgu);
//            preparedStatement.setString(1, albumAd);
            
            ResultSet rs =  statement.executeQuery(sorgu);
//            preparedStatement.executeUpdate();
            
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
            Logger.getLogger(Admin_Album_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
            
        }
    }
    
    public ArrayList<Sarki> onurKullaniciJazzSarkilariGetir() {
        
        ArrayList<Sarki> cikti = new ArrayList<Sarki>();
        
        try {
            String sorgu =  "Select * From onur_aksoy  where şarkıTür = 'Jazz'"; //SORGUYU DÜZELT!!!!!!!!!!!!!
            
            statement =  con.createStatement();
            
//            preparedStatement = con.prepareStatement(sorgu);
//            preparedStatement.setString(1, albumAd);
            
            ResultSet rs =  statement.executeQuery(sorgu);
//            preparedStatement.executeUpdate();
            
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
            Logger.getLogger(Admin_Album_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
            
        }
    }
    
    public ArrayList<Sarki> onurKullaniciPopSarkilariGetir() {
        
        ArrayList<Sarki> cikti = new ArrayList<Sarki>();
        
        try {
            String sorgu =  "Select * From onur_aksoy where şarkıTür = 'Pop'"; //SORGUYU DÜZELT!!!!!!!!!!!!!
            
            statement =  con.createStatement();
            
//            preparedStatement = con.prepareStatement(sorgu);
//            preparedStatement.setString(1, albumAd);
            
            ResultSet rs =  statement.executeQuery(sorgu);
//            preparedStatement.executeUpdate();
            
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
            Logger.getLogger(Admin_Album_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////
    //murat için onur_aksoy serra_şevval_kabak sezen_kaya zehra_çelik
    public ArrayList<Sarki> okanKullaniciKlasikSarkilariGetir() {
        
        ArrayList<Sarki> cikti = new ArrayList<Sarki>();
        
        try {
            String sorgu =  "Select * From okan_demir where şarkıTür = 'Klasik'"; //SORGUYU DÜZELT!!!!!!!!!!!!!
            
            statement =  con.createStatement();
            
//            preparedStatement = con.prepareStatement(sorgu);
//            preparedStatement.setString(1, albumAd);
            
            ResultSet rs =  statement.executeQuery(sorgu);
//            preparedStatement.executeUpdate();
            
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
            Logger.getLogger(Admin_Album_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
            
        }
    }
    
    public ArrayList<Sarki> okanKullaniciJazzSarkilariGetir() {
        
        ArrayList<Sarki> cikti = new ArrayList<Sarki>();
        
        try {
            String sorgu =  "Select * From okan_demir where şarkıTür = 'Jazz'"; //SORGUYU DÜZELT!!!!!!!!!!!!!
            
            statement =  con.createStatement();
            
//            preparedStatement = con.prepareStatement(sorgu);
//            preparedStatement.setString(1, albumAd);
            
            ResultSet rs =  statement.executeQuery(sorgu);
//            preparedStatement.executeUpdate();
            
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
            Logger.getLogger(Admin_Album_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
            
        }
    }
    
    public ArrayList<Sarki> okanKullaniciPopSarkilariGetir() {
        
        ArrayList<Sarki> cikti = new ArrayList<Sarki>();
        
        try {
            String sorgu =  "Select * From okan_demir where şarkıTür = 'Pop'"; //SORGUYU DÜZELT!!!!!!!!!!!!!
            
            statement =  con.createStatement();
            
//            preparedStatement = con.prepareStatement(sorgu);
//            preparedStatement.setString(1, albumAd);
            
            ResultSet rs =  statement.executeQuery(sorgu);
//            preparedStatement.executeUpdate();
            
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
            Logger.getLogger(Admin_Album_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    
    
    
    
    
    
    
 
//    
//  



/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void gamzeKullaniciFavorilereMuzikEkle(String sarkiAd, String sarkiTarih, String sarkiSanatci, String sarkiAlbum, String sarkiTur, String sarkiSure, String sarkiDinlenmeSayisi) {

        String sorgu = "Insert Into gamze_dinç (şarkıAd, şarkıTarih, şarkıSanatçı, şarkıAlbüm, şarkıTür, şarkıSüre, şarkıDinlenmeSayısı) VALUES(?, ?, ?, ?, ?, ?, ?)";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1, sarkiAd);
            preparedStatement.setString(2, sarkiTarih);
            preparedStatement.setString(3, sarkiSanatci);
            preparedStatement.setString(4, sarkiAlbum);
            preparedStatement.setString(5, sarkiTur);
            preparedStatement.setString(6, sarkiSure);
            preparedStatement.setString(7, sarkiDinlenmeSayisi);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Gecis_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void etkaKullaniciFavorilereMuzikEkle(String sarkiAd, String sarkiTarih, String sarkiSanatci, String sarkiAlbum, String sarkiTur, String sarkiSure, String sarkiDinlenmeSayisi) {

        String sorgu = "Insert Into etka_cüre (şarkıAd, şarkıTarih, şarkıSanatçı, şarkıAlbüm, şarkıTür, şarkıSüre, şarkıDinlenmeSayısı) VALUES(?, ?, ?, ?, ?, ?, ?)";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1, sarkiAd);
            preparedStatement.setString(2, sarkiTarih);
            preparedStatement.setString(3, sarkiSanatci);
            preparedStatement.setString(4, sarkiAlbum);
            preparedStatement.setString(5, sarkiTur);
            preparedStatement.setString(6, sarkiSure);
            preparedStatement.setString(7, sarkiDinlenmeSayisi);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Gecis_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void furkanKullaniciFavorilereMuzikEkle(String sarkiAd, String sarkiTarih, String sarkiSanatci, String sarkiAlbum, String sarkiTur, String sarkiSure, String sarkiDinlenmeSayisi) {

        String sorgu = "Insert Into furkan_yavuz (şarkıAd, şarkıTarih, şarkıSanatçı, şarkıAlbüm, şarkıTür, şarkıSüre, şarkıDinlenmeSayısı) VALUES(?, ?, ?, ?, ?, ?, ?)";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1, sarkiAd);
            preparedStatement.setString(2, sarkiTarih);
            preparedStatement.setString(3, sarkiSanatci);
            preparedStatement.setString(4, sarkiAlbum);
            preparedStatement.setString(5, sarkiTur);
            preparedStatement.setString(6, sarkiSure);
            preparedStatement.setString(7, sarkiDinlenmeSayisi);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Gecis_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       public void melisaKullaniciFavorilereMuzikEkle(String sarkiAd, String sarkiTarih, String sarkiSanatci, String sarkiAlbum, String sarkiTur, String sarkiSure, String sarkiDinlenmeSayisi) {

        String sorgu = "Insert Into melisa_yılmaz (şarkıAd, şarkıTarih, şarkıSanatçı, şarkıAlbüm, şarkıTür, şarkıSüre, şarkıDinlenmeSayısı) VALUES(?, ?, ?, ?, ?, ?, ?)";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1, sarkiAd);
            preparedStatement.setString(2, sarkiTarih);
            preparedStatement.setString(3, sarkiSanatci);
            preparedStatement.setString(4, sarkiAlbum);
            preparedStatement.setString(5, sarkiTur);
            preparedStatement.setString(6, sarkiSure);
            preparedStatement.setString(7, sarkiDinlenmeSayisi);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Gecis_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
           public void muratKullaniciFavorilereMuzikEkle(String sarkiAd, String sarkiTarih, String sarkiSanatci, String sarkiAlbum, String sarkiTur, String sarkiSure, String sarkiDinlenmeSayisi) {

        String sorgu = "Insert Into murat_gündüz (şarkıAd, şarkıTarih, şarkıSanatçı, şarkıAlbüm, şarkıTür, şarkıSüre, şarkıDinlenmeSayısı) VALUES(?, ?, ?, ?, ?, ?, ?)";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1, sarkiAd);
            preparedStatement.setString(2, sarkiTarih);
            preparedStatement.setString(3, sarkiSanatci);
            preparedStatement.setString(4, sarkiAlbum);
            preparedStatement.setString(5, sarkiTur);
            preparedStatement.setString(6, sarkiSure);
            preparedStatement.setString(7, sarkiDinlenmeSayisi);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Gecis_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
      
    
    
        public void gamzeKullaniciMuzikSil(int id) {
        
       String sorgu = "Delete from gamze_dinç where şarkıID = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Admin_Muzik_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void melisaKullaniciMuzikSil(int id) {
        
       String sorgu = "Delete from melisa_yılmaz where şarkıID = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Admin_Muzik_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void furkanKullaniciMuzikSil(int id) {
        
       String sorgu = "Delete from furkan_yavuz where şarkıID = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Admin_Muzik_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public void muratKullaniciMuzikSil(int id) {
        
       String sorgu = "Delete from murat_gündüz where şarkıID = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Admin_Muzik_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            public void etkaKullaniciMuzikSil(int id) {
        
       String sorgu = "Delete from etka_cüre where şarkıID = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Admin_Muzik_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

