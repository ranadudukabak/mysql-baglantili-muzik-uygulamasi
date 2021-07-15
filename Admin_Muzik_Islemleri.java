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
public class Admin_Muzik_Islemleri {
    
    private Connection con = null;
    
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;

    public Admin_Muzik_Islemleri() {
        
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
    
    public boolean GirisYap(String kullanici_adi,String parola) {
        
        String sorgu =  "Select * From admin where adminEmail = ? and adminŞifre = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1,kullanici_adi);
            preparedStatement.setString(2,parola);
            
            ResultSet rs =  preparedStatement.executeQuery();
            
            return rs.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(Admin_Muzik_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
              
    public ArrayList<Sarki> KlasikSarkilariGetir() {
        
        ArrayList<Sarki> cikti = new ArrayList<Sarki>();
        
        try {
            statement =  con.createStatement();
            String sorgu =  "Select * From klasik_müzik";
            
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
    
    public ArrayList<Sarki> JazzSarkilariGetir() {
        
        ArrayList<Sarki> cikti = new ArrayList<Sarki>();
        
        try {
            statement =  con.createStatement();
            String sorgu =  "Select * From jazz_müzik";
            
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
    
    public ArrayList<Sarki> PopSarkilariGetir() {
        
        ArrayList<Sarki> cikti = new ArrayList<Sarki>();
        
        try {
            statement =  con.createStatement();
            String sorgu =  "Select * From pop_müzik";
            
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
    
    
    public String AdminAdiniGetir(String kullanici_adi) {
        
        String sorgu = "Select adminAd From admin Where adminEmail = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, kullanici_adi);
            
            ResultSet rs =  preparedStatement.executeQuery();
            
            return rs.getString("adminAd");
            
        } catch (SQLException ex) {
            Logger.getLogger(Admin_Muzik_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
            return "";
        }
    }
    
    public void MuzikEkle(String sarkiAd,String sarkiTarih,String sarkiSanatci,String sarkiAlbum, String sarkiTur, String sarkiSure, String sarkiDinlenmeSayisi) {
        
         String sorgu = "Insert Into şarkı(şarkıAd, şarkıTarih, şarkıSanatçı, şarkıAlbüm, şarkıTür, şarkıSüre, şarkıDinlenmeSayısı) VALUES(?, ?, ?, ?, ?, ?, ?)";

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
                Logger.getLogger(Admin_Muzik_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        
        if(sarkiTur.equalsIgnoreCase("Klasik")) {

            String sorgu2 = "Insert Into klasik_müzik (şarkıAd, şarkıTarih, şarkıSanatçı, şarkıAlbüm, şarkıTür, şarkıSüre, şarkıDinlenmeSayısı) VALUES(?, ?, ?, ?, ?, ?, ?)";

            try {
                preparedStatement = con.prepareStatement(sorgu2);

                preparedStatement.setString(1, sarkiAd);
                preparedStatement.setString(2, sarkiTarih);
                preparedStatement.setString(3, sarkiSanatci);
                preparedStatement.setString(4, sarkiAlbum);
                preparedStatement.setString(5, sarkiTur);
                preparedStatement.setString(6, sarkiSure);
                preparedStatement.setString(7, sarkiDinlenmeSayisi);

                preparedStatement.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(Admin_Muzik_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (sarkiTur.equalsIgnoreCase("Jazz")) {

            String sorgu2 = "Insert Into jazz_müzik (şarkıAd, şarkıTarih, şarkıSanatçı, şarkıAlbüm, şarkıTür, şarkıSüre, şarkıDinlenmeSayısı) VALUES(?, ?, ?, ?, ?, ?, ?)";

            try {
                preparedStatement = con.prepareStatement(sorgu2);

                preparedStatement.setString(1, sarkiAd);
                preparedStatement.setString(2, sarkiTarih);
                preparedStatement.setString(3, sarkiSanatci);
                preparedStatement.setString(4, sarkiAlbum);
                preparedStatement.setString(5, sarkiTur);
                preparedStatement.setString(6, sarkiSure);
                preparedStatement.setString(7, sarkiDinlenmeSayisi);

                preparedStatement.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(Admin_Muzik_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (sarkiTur.equalsIgnoreCase("Pop")) {

            String sorgu2 = "Insert Into pop_müzik (şarkıAd, şarkıTarih, şarkıSanatçı, şarkıAlbüm, şarkıTür, şarkıSüre, şarkıDinlenmeSayısı) VALUES(?, ?, ?, ?, ?, ?, ?)";

            try {
                preparedStatement = con.prepareStatement(sorgu2);

                preparedStatement.setString(1, sarkiAd);
                preparedStatement.setString(2, sarkiTarih);
                preparedStatement.setString(3, sarkiSanatci);
                preparedStatement.setString(4, sarkiAlbum);
                preparedStatement.setString(5, sarkiTur);
                preparedStatement.setString(6, sarkiSure);
                preparedStatement.setString(7, sarkiDinlenmeSayisi);

                preparedStatement.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(Admin_Muzik_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    

   public void KlasikMuzikGuncelle(int sarkiID, String yeni_sarkiAd,String yeni_sarkiTarih,String yeni_sarkiSanatci,String yeni_sarkiAlbum, String yeni_sarkiTur, String yeni_sarkiSure, String yeni_sarkiDinlenmeSayisi) {
       
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
           Logger.getLogger(Admin_Muzik_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       
       
       String sorgu2 = "Update klasik_müzik set şarkıAd = ? , şarkıTarih = ? , şarkıSanatçı = ? , şarkıAlbüm = ?, şarkıTür = ?, şarkıSüre = ?, şarkıDinlenmeSayısı = ? where şarkıID = ?";

       try {
           preparedStatement = con.prepareStatement(sorgu2);

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
           Logger.getLogger(Admin_Muzik_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
   
   public void JazzMuzikGuncelle(int sarkiID, String yeni_sarkiAd,String yeni_sarkiTarih,String yeni_sarkiSanatci,String yeni_sarkiAlbum, String yeni_sarkiTur, String yeni_sarkiSure, String yeni_sarkiDinlenmeSayisi) {
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
           Logger.getLogger(Admin_Muzik_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
       }
       String sorgu2 = "Update jazz_müzik set şarkıAd = ? , şarkıTarih = ? , şarkıSanatçı = ? , şarkıAlbüm = ?, şarkıTür = ?, şarkıSüre = ?, şarkıDinlenmeSayısı = ? where şarkıID = ?";

       try {
           preparedStatement = con.prepareStatement(sorgu2);

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
           Logger.getLogger(Admin_Muzik_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
   
   public void PopMuzikGuncelle(int sarkiID, String yeni_sarkiAd,String yeni_sarkiTarih,String yeni_sarkiSanatci,String yeni_sarkiAlbum, String yeni_sarkiTur, String yeni_sarkiSure, String yeni_sarkiDinlenmeSayisi) {
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
           Logger.getLogger(Admin_Muzik_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
       }
       String sorgu2 = "Update pop_müzik set şarkıAd = ? , şarkıTarih = ? , şarkıSanatçı = ? , şarkıAlbüm = ?, şarkıTür = ?, şarkıSüre = ?, şarkıDinlenmeSayısı = ? where şarkıID = ?";

       try {
           preparedStatement = con.prepareStatement(sorgu2);

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
           Logger.getLogger(Admin_Muzik_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
   
    public void KlasikMuzikSil(int id) {
        String sorgu = "Delete from şarkı where şarkıID = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Admin_Muzik_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       String sorgu2 = "Delete from klasik_müzik where şarkıID = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu2);
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Admin_Muzik_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void JazzMuzikSil(int id) {
        String sorgu = "Delete from şarkı where şarkıID = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Admin_Muzik_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
       String sorgu2 = "Delete from jazz_müzik where şarkıID = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu2);
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Admin_Muzik_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void PopMuzikSil(int id) {
          String sorgu = "Delete from şarkı where şarkıID = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Admin_Muzik_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
       String sorgu2 = "Delete from pop_müzik where şarkıID = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu2);
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Admin_Muzik_Islemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}