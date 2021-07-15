import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ranadudukabak
 */
public class Admin_Album_Paneli extends javax.swing.JDialog {

    DefaultTableModel modelAlbum;
    DefaultTableModel modelSarki;
    Admin_Album_Islemleri adminAlbumIslemleri = new Admin_Album_Islemleri();
    /**
     * Creates new form Admin_Album_Paneli
     */
    public Admin_Album_Paneli(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        modelAlbum = (DefaultTableModel) AlbumTablosu.getModel();
        Album_Goruntule();
        
        modelSarki = (DefaultTableModel) AlbumSarkiTablosu.getModel();
//        Sarki_Goruntule();
        
        String kullanici_adi  = Giris_Paneli.kullanici_adi;
        AdminAdiAlani.setText(kullanici_adi);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        AlbumTablosu = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        AlbumSarkiTablosu = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        AlbumAdiAlani = new javax.swing.JTextField();
        AlbumSanatciAlani = new javax.swing.JTextField();
        AlbumTarihAlani = new javax.swing.JTextField();
        AlbumTurAlani = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        SarkiAdiAlani = new javax.swing.JTextField();
        SarkiTarihAlani = new javax.swing.JTextField();
        SarkiSanatciAlani = new javax.swing.JTextField();
        SarkiAlbumAlani = new javax.swing.JTextField();
        SarkiTurAlani = new javax.swing.JTextField();
        SarkiSureAlani = new javax.swing.JTextField();
        SarkiDinlenmeSayisiAlani = new javax.swing.JTextField();
        GeriButonu = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        AdminAdiAlani = new javax.swing.JLabel();
        AlbumEkleButonu = new javax.swing.JButton();
        AlbumGuncelleButonu = new javax.swing.JButton();
        AlbumSilButonu = new javax.swing.JButton();
        SarkiEkleButonu = new javax.swing.JButton();
        SarkiSilButonu = new javax.swing.JButton();
        SarkiGuncelleButonu = new javax.swing.JButton();
        MesajYazisi = new javax.swing.JLabel();
        AlbumArama = new javax.swing.JTextField();
        SarkiArama = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        AlbumTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Albüm ID", "Albüm Ad", "Albüm Sanatçı", "Albüm Tarih", "Albüm Tür"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        AlbumTablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AlbumTablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(AlbumTablosu);
        if (AlbumTablosu.getColumnModel().getColumnCount() > 0) {
            AlbumTablosu.getColumnModel().getColumn(0).setResizable(false);
            AlbumTablosu.getColumnModel().getColumn(1).setResizable(false);
            AlbumTablosu.getColumnModel().getColumn(2).setResizable(false);
            AlbumTablosu.getColumnModel().getColumn(3).setResizable(false);
            AlbumTablosu.getColumnModel().getColumn(4).setResizable(false);
        }

        AlbumSarkiTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Şarkı ID", "Şarkı Ad", "Şarkı Tarih", "Şarkı Sanatçı", "Şarkı Albüm", "Şarkı Tür", "Şarkı Süre", "Şarkı Dinlenme Sayısı"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        AlbumSarkiTablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AlbumSarkiTablosuMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(AlbumSarkiTablosu);

        jLabel1.setText("Albüm Ad:");

        jLabel2.setText("Albüm Sanatçı:");

        jLabel3.setText("Albüm Tarih:");

        jLabel4.setText("Albüm Tür:");

        AlbumTarihAlani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlbumTarihAlaniActionPerformed(evt);
            }
        });

        jLabel5.setText("Şarkı Adı:");

        jLabel6.setText("Şarkı Tarihi:");

        jLabel7.setText("Şarkı Sanatçı:");

        jLabel8.setText("Şarkı Albüm:");

        jLabel9.setText("Şarkı Tür:");

        jLabel10.setText("Şarkı Süre:");

        jLabel11.setText("Şarkı Dinlenme Sayısı:");

        GeriButonu.setText("<-");
        GeriButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeriButonuActionPerformed(evt);
            }
        });

        jLabel12.setText("                    ADMIN");

        AlbumEkleButonu.setText("EKLE");
        AlbumEkleButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlbumEkleButonuActionPerformed(evt);
            }
        });

        AlbumGuncelleButonu.setText("GÜNCELLE");
        AlbumGuncelleButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlbumGuncelleButonuActionPerformed(evt);
            }
        });

        AlbumSilButonu.setText("SİL");
        AlbumSilButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlbumSilButonuActionPerformed(evt);
            }
        });

        SarkiEkleButonu.setText("EKLE");
        SarkiEkleButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SarkiEkleButonuActionPerformed(evt);
            }
        });

        SarkiSilButonu.setText("SİL");
        SarkiSilButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SarkiSilButonuActionPerformed(evt);
            }
        });

        SarkiGuncelleButonu.setText("GÜNCELLE");
        SarkiGuncelleButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SarkiGuncelleButonuActionPerformed(evt);
            }
        });

        MesajYazisi.setText("MESAJ YAZİSİ");

        AlbumArama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                AlbumAramaKeyReleased(evt);
            }
        });

        SarkiArama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SarkiAramaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(AlbumGuncelleButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155)
                        .addComponent(SarkiGuncelleButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142)
                        .addComponent(MesajYazisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AlbumSanatciAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(GeriButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(AlbumTarihAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(AlbumTurAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(AlbumAdiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(AlbumEkleButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(AlbumSilButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(AlbumArama))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(SarkiEkleButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(SarkiSilButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(SarkiAdiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(SarkiSanatciAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(SarkiTarihAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(SarkiAlbumAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(SarkiTurAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(SarkiSureAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(SarkiDinlenmeSayisiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(AdminAdiAlani, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(SarkiArama))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(AlbumAdiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(SarkiAdiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(GeriButonu))
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(AlbumSanatciAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(SarkiTarihAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdminAdiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(AlbumTarihAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(SarkiSanatciAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(AlbumTurAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(SarkiAlbumAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(SarkiTurAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(SarkiSureAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(SarkiDinlenmeSayisiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AlbumGuncelleButonu)
                    .addComponent(SarkiGuncelleButonu)
                    .addComponent(MesajYazisi))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AlbumSilButonu)
                    .addComponent(SarkiEkleButonu)
                    .addComponent(SarkiSilButonu)
                    .addComponent(AlbumEkleButonu))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AlbumArama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SarkiArama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AlbumSarkiTablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlbumSarkiTablosuMouseClicked
        // TODO add your handling code here:
        int selectedrow = AlbumSarkiTablosu.getSelectedRow();

        SarkiAdiAlani.setText(modelSarki.getValueAt(selectedrow, 1).toString());
        SarkiTarihAlani.setText(modelSarki.getValueAt(selectedrow, 2).toString());
        SarkiSanatciAlani.setText(modelSarki.getValueAt(selectedrow, 3).toString());
        SarkiAlbumAlani.setText(modelSarki.getValueAt(selectedrow, 4).toString());
        SarkiTurAlani.setText(modelSarki.getValueAt(selectedrow, 5).toString());
        SarkiSureAlani.setText(modelSarki.getValueAt(selectedrow, 6).toString());
        SarkiDinlenmeSayisiAlani.setText(modelSarki.getValueAt(selectedrow, 7).toString());
    }//GEN-LAST:event_AlbumSarkiTablosuMouseClicked

    private void AlbumTarihAlaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlbumTarihAlaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlbumTarihAlaniActionPerformed

    private void AlbumTablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlbumTablosuMouseClicked
        // TODO add your handling code here:
        int selectedrow = AlbumTablosu.getSelectedRow();

        AlbumAdiAlani.setText(modelAlbum.getValueAt(selectedrow, 1).toString());
        AlbumSanatciAlani.setText(modelAlbum.getValueAt(selectedrow, 2).toString());
        AlbumTarihAlani.setText(modelAlbum.getValueAt(selectedrow, 3).toString());
        AlbumTurAlani.setText(modelAlbum.getValueAt(selectedrow, 4).toString());
        
        Sarki_Goruntule();
    }//GEN-LAST:event_AlbumTablosuMouseClicked

    private void AlbumEkleButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlbumEkleButonuActionPerformed
        // TODO add your handling code here:
        String albumAd  =  AlbumAdiAlani.getText();
        String albumSanatci = AlbumSanatciAlani.getText();
        String albumTarih = AlbumTarihAlani.getText();
        String albumTur = AlbumTurAlani.getText();
        
        adminAlbumIslemleri.AlbumEkle(albumAd, albumSanatci, albumTarih, albumTur);
        
        Album_Goruntule(); 
    }//GEN-LAST:event_AlbumEkleButonuActionPerformed

    private void AlbumGuncelleButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlbumGuncelleButonuActionPerformed
        // TODO add your handling code here:
        String albumAd  =  AlbumAdiAlani.getText();
        String albumSanatci = AlbumSanatciAlani.getText();
        String albumTarih = AlbumTarihAlani.getText();
        String albumTur = AlbumTurAlani.getText();
        
        int flag = 0;
        
        int selectedrow = AlbumTablosu.getSelectedRow();
        int selectedrow2 = AlbumSarkiTablosu.getSelectedRow();
        
        if(selectedrow != -1) {
            flag = 1;
        } else if(selectedrow2 != -1) {
            flag = 2;
        }
        
        if(flag == 1) {
            int id = (int) modelAlbum.getValueAt(selectedrow, 0);
            adminAlbumIslemleri.AlbumGuncelle(id, albumAd, albumSanatci, albumTarih, albumTur);
            Album_Goruntule();
        } else if(flag == 2) {
//            int id2 = (int) modelJazz.getValueAt(selectedrow2, 0);
//            adminIslemleri.JazzMuzikGuncelle(id2, sarkiAd, sarkiTarih, sarkiSanatci, sarkiAlbum, sarkiTur, sarkiSure, sarkiDinlenmeSayisi);
//            Jazz_Muzikleri_Goruntule(); 
        }
    }//GEN-LAST:event_AlbumGuncelleButonuActionPerformed

    private void AlbumSilButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlbumSilButonuActionPerformed
        // TODO add your handling code here:
        String albumAd  =  AlbumAdiAlani.getText();
        String albumSanatci = AlbumSanatciAlani.getText();
        String albumTarih = AlbumTarihAlani.getText();
        String albumTur = AlbumTurAlani.getText();
        
        int flag = 0;
        
        int selectedrow = AlbumTablosu.getSelectedRow();
        int selectedrow2 = AlbumSarkiTablosu.getSelectedRow();
        
        if(selectedrow != -1) {
            flag = 1;
        } else if(selectedrow2 != -1) {
            flag = 2;
        }
        
        if(flag == 1) {
            int id = (int) modelAlbum.getValueAt(selectedrow, 0);
            adminAlbumIslemleri.AlbumSil(id);
            Album_Goruntule();
        } else if(flag == 2) {
//            int id2 = (int) modelJazz.getValueAt(selectedrow2, 0);
//            adminIslemleri.JazzMuzikGuncelle(id2, sarkiAd, sarkiTarih, sarkiSanatci, sarkiAlbum, sarkiTur, sarkiSure, sarkiDinlenmeSayisi);
//            Jazz_Muzikleri_Goruntule(); 
        }
    }//GEN-LAST:event_AlbumSilButonuActionPerformed

    private void GeriButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeriButonuActionPerformed
        // TODO add your handling code here:
        Giris_Paneli giris = new Giris_Paneli();
        
        Admin_Paneli adminPaneli = new Admin_Paneli(giris, true);
        setVisible(false);
            
        adminPaneli.setVisible(true);
        System.exit(0);
    }//GEN-LAST:event_GeriButonuActionPerformed

    private void SarkiEkleButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SarkiEkleButonuActionPerformed
        // TODO add your handling code here:
        String sarkiAd  =  SarkiAdiAlani.getText();
        String sarkiTarih = SarkiTarihAlani.getText();
        String sarkiSanatci = SarkiSanatciAlani.getText();
        String sarkiAlbum = SarkiAlbumAlani.getText();
        String sarkiTur = SarkiTurAlani.getText();
        String sarkiSure = SarkiSureAlani.getText();
        String sarkiDinlenmeSayisi = SarkiDinlenmeSayisiAlani.getText();
        
        adminAlbumIslemleri.MuzikEkle(sarkiAd, sarkiTarih, sarkiSanatci, sarkiAlbum, sarkiTur, sarkiSure, sarkiDinlenmeSayisi);
        
        Sarki_Goruntule(); 
    }//GEN-LAST:event_SarkiEkleButonuActionPerformed

    private void SarkiGuncelleButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SarkiGuncelleButonuActionPerformed
        // TODO add your handling code here:
        String sarkiAd  =  SarkiAdiAlani.getText();
        String sarkiTarih = SarkiTarihAlani.getText();
        String sarkiSanatci = SarkiSanatciAlani.getText();
        String sarkiAlbum = SarkiAlbumAlani.getText();
        String sarkiTur = SarkiTurAlani.getText();
        String sarkiSure = SarkiSureAlani.getText();
        String sarkiDinlenmeSayisi = SarkiDinlenmeSayisiAlani.getText();
        
        int flag = 0;
        
        int selectedrow = AlbumTablosu.getSelectedRow();
        int selectedrow2 = AlbumSarkiTablosu.getSelectedRow();
        
        if(selectedrow != -1) {
            flag = 1;
        } else if(selectedrow2 != -1) {
            flag = 2;
        }
        
        if(flag == 1) {
//            int id = (int) modelAlbum.getValueAt(selectedrow, 0);
//            adminAlbumIslemleri.MuzikGuncelle(id, sarkiAd, sarkiTarih, sarkiSanatci, sarkiAlbum, sarkiTur, sarkiSure, sarkiDinlenmeSayisi);
//            Klasik_Muzikleri_Goruntule();
        } else if(flag == 2) {
            int id2 = (int) modelSarki.getValueAt(selectedrow2, 0);
            adminAlbumIslemleri.MuzikGuncelle(id2, sarkiAd, sarkiTarih, sarkiSanatci, sarkiAlbum, sarkiTur, sarkiSure, sarkiDinlenmeSayisi);
            Sarki_Goruntule(); 
        }
    }//GEN-LAST:event_SarkiGuncelleButonuActionPerformed

    private void SarkiSilButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SarkiSilButonuActionPerformed
        // TODO add your handling code here:
        String sarkiAd  =  SarkiAdiAlani.getText();
        String sarkiTarih = SarkiTarihAlani.getText();
        String sarkiSanatci = SarkiSanatciAlani.getText();
        String sarkiAlbum = SarkiAlbumAlani.getText();
        String sarkiTur = SarkiTurAlani.getText();
        String sarkiSure = SarkiSureAlani.getText();
        String sarkiDinlenmeSayisi = SarkiDinlenmeSayisiAlani.getText();
        
        int flag = 0;
        
        int selectedrow = AlbumTablosu.getSelectedRow();
        int selectedrow2 = AlbumSarkiTablosu.getSelectedRow();
        
        if(selectedrow != -1) {
            flag = 1;
        } else if(selectedrow2 != -1) {
            flag = 2;
        }
        
        if(flag == 1) {
//            int id = (int) modelAlbum.getValueAt(selectedrow, 0);
//            adminAlbumIslemleri.MuzikGuncelle(id, sarkiAd, sarkiTarih, sarkiSanatci, sarkiAlbum, sarkiTur, sarkiSure, sarkiDinlenmeSayisi);
//            Klasik_Muzikleri_Goruntule();
        } else if(flag == 2) {
            int id2 = (int) modelSarki.getValueAt(selectedrow2, 0);
            adminAlbumIslemleri.MuzikSil(id2);
            Sarki_Goruntule(); 
        }
    }//GEN-LAST:event_SarkiSilButonuActionPerformed

    private void AlbumAramaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AlbumAramaKeyReleased
        // TODO add your handling code here:
        String ara = AlbumArama.getText();
        
        Album_Dinamik_Ara(ara);
    }//GEN-LAST:event_AlbumAramaKeyReleased

    private void SarkiAramaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SarkiAramaKeyReleased
        // TODO add your handling code here:
        String ara = SarkiArama.getText();
        
        Sarki_Dinamik_Ara(ara);
    }//GEN-LAST:event_SarkiAramaKeyReleased

    
     public void Album_Goruntule() {
        
        modelAlbum.setRowCount(0);
        
        ArrayList<Album> albumler = new ArrayList<Album>();
        
        albumler = adminAlbumIslemleri.AlbumGetir();
        
        if (albumler != null) {
            
            for (Album album : albumler) {
                Object[] eklenecek = {album.getAlbumID(), album.getAlbumAd(), album.getAlbumSanatci(), album.getAlbumTarih(), album.getAlbumTur()};
                
                modelAlbum.addRow(eklenecek);
            }
        }
    }
     
     public void Sarki_Goruntule() {
        
        modelSarki.setRowCount(0);
        
        ArrayList<Sarki> sarkilar = new ArrayList<Sarki>();
        
        
        String albumAd = AlbumAdiAlani.getText();
        sarkilar = adminAlbumIslemleri.SarkilariGetir(albumAd);
        
        if (sarkilar != null ) {
            
            for (Sarki sarki : sarkilar) {
                Object[] eklenecek = {sarki.getSarkiID(), sarki.getSarkiAd(), sarki.getSarkiTarih(), 
                                      sarki.getSarkiSanatci(), sarki.getSarkiAlbum(), sarki.getSarkiTur(), 
                                      sarki.getSarkiSure(), sarki.getDinlenmeSayisi()};
                
                modelSarki.addRow(eklenecek);
            }
        }
    }
     
     public void Album_Dinamik_Ara(String ara){
        
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(modelAlbum);
        
        AlbumTablosu.setRowSorter(tr);
        
        tr.setRowFilter(RowFilter.regexFilter(ara));
        
    }
     
     public void Sarki_Dinamik_Ara(String ara){
        
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(modelSarki);
        
        AlbumSarkiTablosu.setRowSorter(tr);
        
        tr.setRowFilter(RowFilter.regexFilter(ara));
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin_Album_Paneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Album_Paneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Album_Paneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Album_Paneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Admin_Album_Paneli dialog = new Admin_Album_Paneli(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminAdiAlani;
    private javax.swing.JTextField AlbumAdiAlani;
    private javax.swing.JTextField AlbumArama;
    private javax.swing.JButton AlbumEkleButonu;
    private javax.swing.JButton AlbumGuncelleButonu;
    private javax.swing.JTextField AlbumSanatciAlani;
    private javax.swing.JTable AlbumSarkiTablosu;
    private javax.swing.JButton AlbumSilButonu;
    private javax.swing.JTable AlbumTablosu;
    private javax.swing.JTextField AlbumTarihAlani;
    private javax.swing.JTextField AlbumTurAlani;
    private javax.swing.JButton GeriButonu;
    private javax.swing.JLabel MesajYazisi;
    private javax.swing.JTextField SarkiAdiAlani;
    private javax.swing.JTextField SarkiAlbumAlani;
    private javax.swing.JTextField SarkiArama;
    private javax.swing.JTextField SarkiDinlenmeSayisiAlani;
    private javax.swing.JButton SarkiEkleButonu;
    private javax.swing.JButton SarkiGuncelleButonu;
    private javax.swing.JTextField SarkiSanatciAlani;
    private javax.swing.JButton SarkiSilButonu;
    private javax.swing.JTextField SarkiSureAlani;
    private javax.swing.JTextField SarkiTarihAlani;
    private javax.swing.JTextField SarkiTurAlani;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}