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
public class Admin_Sanatci_Islemleri {
    
    private Connection con = null;
    
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    
    public Admin_Sanatci_Islemleri() {
        
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
    
    public ArrayList<Sanatci> SanatcilariGetir() {
        
        ArrayList<Sanatci> cikti = new ArrayList<Sanatci>();
        
        try {
            statement =  con.createStatement();
            String sorgu =  "Select * From sanatçı";
            
            ResultSet rs =  statement.executeQuery(sorgu);
            
            while(rs.next()) {
                int sanatciID = rs.getInt("sanatçıID");
                String sanatciAd = rs.getString("sanatçıAd");
                String sanatciUlke = rs.getString("sanatçıÜlke");
                
                cikti.add(new Sanatci(sanatciID, sanatciAd, sanatciUlke));
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(Admin_Sanatci_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
            
        }
    }
    
    public void SanatciEkle(String sanatciAd,String sanatciUlke) {
    
        String sorgu2 = "Insert Into sanatçı (sanatçıAd, sanatçıÜlke) VALUES(?, ?)";

        try {
            preparedStatement = con.prepareStatement(sorgu2);

            preparedStatement.setString(1, sanatciAd);
            preparedStatement.setString(2, sanatciUlke);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Admin_Sanatci_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void SanatciGuncelle(int sanatciID, String yeni_sanatciAd,String yeni_sanatciUlke) {
        
       String sorgu = "Update sanatçı set sanatçıAd = ?, sanatçıÜlke = ? where sanatçıID = ?";

       try {
           preparedStatement = con.prepareStatement(sorgu);

           preparedStatement.setString(1, yeni_sanatciAd);
           preparedStatement.setString(2, yeni_sanatciUlke);

           preparedStatement.setInt(3, sanatciID);

           preparedStatement.executeUpdate();
       } catch (SQLException ex) {
           Logger.getLogger(Admin_Sanatci_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
    public void SanatciSil(int id) {
        
       String sorgu = "Delete from sanatçı where sanatçıID = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Admin_Sanatci_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
