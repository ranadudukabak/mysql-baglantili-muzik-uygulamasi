import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ranadudukabak
 */
public class Java_DB_Baglanti {
    
    public static String kullaniciAdi = "root";
    public static String parola = "";
    
    public static String dbIsmi = "prolab_2_proje_3";
    
    public static String localHost = "localhost";
    
    public static int port = 3306;
    
    public static Connection connection = null;
    
    public static Statement statement = null;
    public static PreparedStatement preparedStatement = null;
    
    public Java_DB_Baglanti() {
        
        String url = "jdbc:mysql://" + localHost + ":" + port + "/" + dbIsmi + "?useUnicode=true&characterEncoding=utf8";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch(ClassNotFoundException ex) {
            System.out.println("Driver bulunamadi.");
        }
        
        try {
            connection = DriverManager.getConnection(url, kullaniciAdi, parola);
            System.out.println("Baglanti basarili!\n");
        } catch(SQLException ex) {
            System.out.println("Baglanti basarisiz.\n");
        }
    }
}
