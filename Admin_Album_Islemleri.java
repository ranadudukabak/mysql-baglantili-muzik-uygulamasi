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
public class Admin_Album_Islemleri {
    
    private Connection con = null;
    
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;

    public Admin_Album_Islemleri() {
        
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
    
    public ArrayList<Album> AlbumGetir() {
        
        ArrayList<Album> cikti = new ArrayList<Album>();
        
        try {
            statement =  con.createStatement();
            String sorgu =  "Select * From albüm";
            
            ResultSet rs =  statement.executeQuery(sorgu);
            
            while(rs.next()) {
                int albumID = rs.getInt("albümID");
                String albumAd = rs.getString("albümAd");
                String albumSanatci = rs.getString("albümSanatçı");
                String albumTarih  = rs.getString("albümTarih");
                String albumTur= rs.getString("albümTür");
                
                cikti.add(new Album(albumID, albumAd, albumSanatci, albumTarih, albumTur));
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(Admin_Album_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
            
        }
    }
    
    public void AlbumEkle(String albumAd,String albumSanatci,String albumTarih,String albumTur) {
    
        String sorgu = "Insert Into albüm (albümAd, albümSanatçı, albümTarih, albümTür) VALUES(?, ?, ?, ?)";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1, albumAd);
            preparedStatement.setString(2, albumSanatci);
            preparedStatement.setString(3, albumTarih);
            preparedStatement.setString(4, albumTur);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Admin_Album_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void AlbumGuncelle(int sarkiID, String yeni_albumAd,String yeni_albumSanatci,String yeni_albumTarih,String yeni_albumTur) {
        
       String sorgu = "Update albüm set albümAd = ? , albümSanatçı = ? , albümTarih = ? ,albümTür = ? where albümID = ?";

       try {
           preparedStatement = con.prepareStatement(sorgu);

           preparedStatement.setString(1, yeni_albumAd);
            preparedStatement.setString(2, yeni_albumSanatci);
            preparedStatement.setString(3, yeni_albumTarih);
            preparedStatement.setString(4, yeni_albumTur);

           preparedStatement.setInt(5, sarkiID);

           preparedStatement.executeUpdate();
       } catch (SQLException ex) {
           Logger.getLogger(Admin_Album_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
    public void AlbumSil(int id) {
        
       String sorgu = "Delete from albüm where albümID = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Admin_Album_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Sarki> SarkilariGetir(String albumAd) {
        
        ArrayList<Sarki> cikti = new ArrayList<Sarki>();
        
        try {
            String sorgu =  "Select * From şarkı where şarkıAlbüm = ?";
            
            
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, albumAd);
            
            ResultSet rs =  preparedStatement.executeQuery();
            
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
    
    public void MuzikEkle(String sarkiAd,String sarkiTarih,String sarkiSanatci,String sarkiAlbum, String sarkiTur, String sarkiSure, String sarkiDinlenmeSayisi) {
    
        String sorgu = "Insert Into şarkı (şarkıAd, şarkıTarih, şarkıSanatçı, şarkıAlbüm, şarkıTür, şarkıSüre, şarkıDinlenmeSayısı) VALUES(?, ?, ?, ?, ?, ?, ?)";

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
            Logger.getLogger(Admin_Album_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void MuzikGuncelle(int sarkiID, String yeni_sarkiAd,String yeni_sarkiTarih,String yeni_sarkiSanatci,String yeni_sarkiAlbum, String yeni_sarkiTur, String yeni_sarkiSure, String yeni_sarkiDinlenmeSayisi) {
        
       String sorgu = "Update şarkı set şarkıAd = ? , şarkıTarih = ? , şarkıSanatçı = ? , şarkıAlbüm = ?, şarkıTür = ?, şarkıSüre = ?, şarkıDinlenmeSayısı = ? where şarkıID = ?";

       try {
           preparedStatement = con.prepareStatement(sorgu);

           preparedStatement.setString(1, yeni_sarkiAd);
           preparedStatement.setString(2, yeni_sarkiTarih);
           preparedStatement.setString(3, yeni_sarkiSanatci);
           preparedStatement.setString(4, yeni_sarkiAlbum);
           preparedStatement.setString(5, yeni_sarkiTur);
           preparedStatement.setString(6, yeni_sarkiSure);
           preparedStatement.setString(7, yeni_sarkiDinlenmeSayisi);

           preparedStatement.setInt(8, sarkiID);

           preparedStatement.executeUpdate();
       } catch (SQLException ex) {
           Logger.getLogger(Admin_Album_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
    public void MuzikSil(int id) {
        
       String sorgu = "Delete from şarkı where şarkıID = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Admin_Album_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
