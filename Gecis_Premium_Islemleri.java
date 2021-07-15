
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
public class Gecis_Premium_Islemleri {
    String premium_kullanici_adi = Giris_Paneli.premium_kullanici_adi;

    private Connection con = null;

    private Statement statement = null;
    private PreparedStatement preparedStatement = null;

    public Gecis_Premium_Islemleri() {

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

        
 public void okanKullaniciFavorilereMuzikEkle(String sarkiAd,String sarkiTarih,String sarkiSanatci,String sarkiAlbum, String sarkiTur, String sarkiSure, String sarkiDinlenmeSayisi) {

        String sorgu = "Insert Into okan_demir (şarkıAd, şarkıTarih, şarkıSanatçı, şarkıAlbüm, şarkıTür, şarkıSüre, şarkıDinlenmeSayısı) VALUES(?, ?, ?, ?, ?, ?, ?)";

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
            Logger.getLogger(Premium_Kullanici_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public void onurKullaniciFavorilereMuzikEkle(String sarkiAd,String sarkiTarih,String sarkiSanatci,String sarkiAlbum, String sarkiTur, String sarkiSure, String sarkiDinlenmeSayisi) {

        String sorgu = "Insert Into onur_aksoy (şarkıAd, şarkıTarih, şarkıSanatçı, şarkıAlbüm, şarkıTür, şarkıSüre, şarkıDinlenmeSayısı) VALUES(?, ?, ?, ?, ?, ?, ?)";

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
            Logger.getLogger(Premium_Kullanici_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            public void serraKullaniciFavorilereMuzikEkle(String sarkiAd,String sarkiTarih,String sarkiSanatci,String sarkiAlbum, String sarkiTur, String sarkiSure, String sarkiDinlenmeSayisi) {

        String sorgu = "Insert Into serra_şevval_kabak (şarkıAd, şarkıTarih, şarkıSanatçı, şarkıAlbüm, şarkıTür, şarkıSüre, şarkıDinlenmeSayısı) VALUES(?, ?, ?, ?, ?, ?, ?)";

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
            Logger.getLogger(Premium_Kullanici_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public void sezenKullaniciFavorilereMuzikEkle(String sarkiAd,String sarkiTarih,String sarkiSanatci,String sarkiAlbum, String sarkiTur, String sarkiSure, String sarkiDinlenmeSayisi) {

        String sorgu = "Insert Into sezen_kaya (şarkıAd, şarkıTarih, şarkıSanatçı, şarkıAlbüm, şarkıTür, şarkıSüre, şarkıDinlenmeSayısı) VALUES(?, ?, ?, ?, ?, ?, ?)";

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
            Logger.getLogger(Premium_Kullanici_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            public void zehraKullaniciFavorilereMuzikEkle(String sarkiAd,String sarkiTarih,String sarkiSanatci,String sarkiAlbum, String sarkiTur, String sarkiSure, String sarkiDinlenmeSayisi) {

        String sorgu = "Insert Into zehra_çelik (şarkıAd, şarkıTarih, şarkıSanatçı, şarkıAlbüm, şarkıTür, şarkıSüre, şarkıDinlenmeSayısı) VALUES(?, ?, ?, ?, ?, ?, ?)";

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
            Logger.getLogger(Premium_Kullanici_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
      public void zehraKullaniciMuzikSil(int id) {
        
       String sorgu = "Delete from zehra_çelik where şarkıID = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Premium_Kullanici_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void sezenKullaniciMuzikSil(int id) {
        
       String sorgu = "Delete from sezen_kaya where şarkıID = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Premium_Kullanici_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void serraKullaniciMuzikSil(int id) {
        
       String sorgu = "Delete from serra_şevval_kabak  where şarkıID = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Premium_Kullanici_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public void onurKullaniciMuzikSil(int id) {
        
       String sorgu = "Delete from onur_aksoy where şarkıID = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Admin_Muzik_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            public void okanKullaniciMuzikSil(int id) {
        
       String sorgu = "Delete from okan_demir where şarkıID = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Admin_Muzik_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    


}
