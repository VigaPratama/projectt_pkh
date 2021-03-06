/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pkh;
import java.awt.Color;
import java.awt.event.*;

/**
 *
 * @author Me
 */

public class MainPage extends javax.swing.JFrame {

    /**
     * Creates new form MainPage
     */
    static String a,b,c;
    Color DefaultColor,ClickedColor,Defaultlabelcolor,Clickedlabelcolor;
    
    public MainPage() {
        initComponents();
        DefaultColor = new Color(51,51,51); 
        ClickedColor = new Color (255,255,255);
        Defaultlabelcolor = new Color(255,255,255);
        Clickedlabelcolor = new Color(0,0,0);
        mainpagebtn.setBackground(DefaultColor);
        pesertabtn.setBackground(DefaultColor);
        pendampingbtn.setBackground(DefaultColor);
        rumahpesertabtn.setBackground(DefaultColor);
         laporankegiatanbtn.setBackground(DefaultColor);
         logout.setBackground(DefaultColor);
         label1.setForeground(Defaultlabelcolor);
         label2.setForeground(Defaultlabelcolor);
         label3.setForeground(Defaultlabelcolor);
         label4.setForeground(Defaultlabelcolor);
         label5.setForeground(Defaultlabelcolor);
         label6.setForeground(Defaultlabelcolor);

        ActionListener ac1=new ActionListener(){
           @Override public void actionPerformed(ActionEvent e){
             a=lb1MovingText.getText();
             b=a.substring(0, 1);
             c=a.substring(1, a.length());
             lb1MovingText.setText(c+b);
           }
        }; new javax.swing.Timer(400, ac1).start();
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lb1MovingText = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        mainpagebtn = new javax.swing.JPanel();
        label1 = new javax.swing.JLabel();
        pesertabtn = new javax.swing.JPanel();
        label2 = new javax.swing.JLabel();
        rumahpesertabtn = new javax.swing.JPanel();
        label4 = new javax.swing.JLabel();
        pendampingbtn = new javax.swing.JPanel();
        label3 = new javax.swing.JLabel();
        laporankegiatanbtn = new javax.swing.JPanel();
        label5 = new javax.swing.JLabel();
        logout = new javax.swing.JPanel();
        label6 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                WindowOpen(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 37, -1, 505));

        lb1MovingText.setBackground(new java.awt.Color(204, 204, 204));
        lb1MovingText.setFont(new java.awt.Font("BIZ UDMincho Medium", 1, 18)); // NOI18N
        lb1MovingText.setForeground(new java.awt.Color(255, 0, 0));
        lb1MovingText.setText("                                                                                                          Selamat Datang Di Program Keluarga Harapan");
        jPanel1.add(lb1MovingText, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 5, 1360, 30));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setPreferredSize(new java.awt.Dimension(500, 513));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 365, 125, -1));

        mainpagebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainpagebtnMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mainpagebtnMousePressed(evt);
            }
        });
        mainpagebtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mainpagebtnKeyPressed(evt);
            }
        });
        mainpagebtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Mainpagelogo3.jpg"))); // NOI18N
        label1.setText("  Beranda");
        mainpagebtn.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 0, 180, 50));

        jPanel3.add(mainpagebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, -1));

        pesertabtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pesertabtnMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pesertabtnMousePressed(evt);
            }
        });

        label2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/kotaklogo3.PNG"))); // NOI18N
        label2.setText("  Data Peserta PKH");

        javax.swing.GroupLayout pesertabtnLayout = new javax.swing.GroupLayout(pesertabtn);
        pesertabtn.setLayout(pesertabtnLayout);
        pesertabtnLayout.setHorizontalGroup(
            pesertabtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesertabtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        pesertabtnLayout.setVerticalGroup(
            pesertabtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel3.add(pesertabtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 230, 50));

        rumahpesertabtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rumahpesertabtnMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rumahpesertabtnMousePressed(evt);
            }
        });

        label4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mainpagelogo2.png"))); // NOI18N
        label4.setText("  Data Rumah Peserta PKH");

        javax.swing.GroupLayout rumahpesertabtnLayout = new javax.swing.GroupLayout(rumahpesertabtn);
        rumahpesertabtn.setLayout(rumahpesertabtnLayout);
        rumahpesertabtnLayout.setHorizontalGroup(
            rumahpesertabtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rumahpesertabtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        rumahpesertabtnLayout.setVerticalGroup(
            rumahpesertabtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.add(rumahpesertabtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 230, 50));

        pendampingbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pendampingbtnMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pendampingbtnMousePressed(evt);
            }
        });

        label3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/kotaklogo3.PNG"))); // NOI18N
        label3.setText("  Data Pendamping PKH");

        javax.swing.GroupLayout pendampingbtnLayout = new javax.swing.GroupLayout(pendampingbtn);
        pendampingbtn.setLayout(pendampingbtnLayout);
        pendampingbtnLayout.setHorizontalGroup(
            pendampingbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pendampingbtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pendampingbtnLayout.setVerticalGroup(
            pendampingbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel3.add(pendampingbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 230, 50));

        laporankegiatanbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                laporankegiatanbtnMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                laporankegiatanbtnMousePressed(evt);
            }
        });

        label5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/diagamkotaklogo2.PNG"))); // NOI18N
        label5.setText("   Laporan Kegiatan");

        javax.swing.GroupLayout laporankegiatanbtnLayout = new javax.swing.GroupLayout(laporankegiatanbtn);
        laporankegiatanbtn.setLayout(laporankegiatanbtnLayout);
        laporankegiatanbtnLayout.setHorizontalGroup(
            laporankegiatanbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(laporankegiatanbtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        laporankegiatanbtnLayout.setVerticalGroup(
            laporankegiatanbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel3.add(laporankegiatanbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 230, 50));

        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logoutMousePressed(evt);
            }
        });

        label6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logoutlogo.png"))); // NOI18N
        label6.setText("  Log Out");

        javax.swing.GroupLayout logoutLayout = new javax.swing.GroupLayout(logout);
        logout.setLayout(logoutLayout);
        logoutLayout.setHorizontalGroup(
            logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        logoutLayout.setVerticalGroup(
            logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 240, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 230, 560));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Program Keluarga Harapan");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 635, 63));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/detail.PNG"))); // NOI18N
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 640, -1));

        jDesktopPane1.setLayer(jPanel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 1140, 560));

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1370, 600));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/program keluarga harapan4.jpg"))); // NOI18N
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 160, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void WindowOpen(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_WindowOpen
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_WindowOpen

    private void mainpagebtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainpagebtnMousePressed
        // TODO add your handling code here:
         mainpagebtn.setBackground(ClickedColor);
         pesertabtn.setBackground(DefaultColor);
         pendampingbtn.setBackground(DefaultColor);
         rumahpesertabtn.setBackground(DefaultColor);
         laporankegiatanbtn.setBackground(DefaultColor);
         logout.setBackground(DefaultColor);
         label1.setForeground(Clickedlabelcolor);
         label2.setForeground(Defaultlabelcolor);
         label3.setForeground(Defaultlabelcolor);
         label4.setForeground(Defaultlabelcolor);
         label5.setForeground(Defaultlabelcolor);
         label6.setForeground(Defaultlabelcolor);
    }//GEN-LAST:event_mainpagebtnMousePressed

    private void pesertabtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesertabtnMousePressed
        // TODO add your handling code here:
         mainpagebtn.setBackground(DefaultColor);
         pesertabtn.setBackground(ClickedColor);
         pendampingbtn.setBackground(DefaultColor);
         rumahpesertabtn.setBackground(DefaultColor);
         laporankegiatanbtn.setBackground(DefaultColor);
         logout.setBackground(DefaultColor);
         label1.setForeground(Defaultlabelcolor);
         label2.setForeground(Clickedlabelcolor);
         label3.setForeground(Defaultlabelcolor);
         label4.setForeground(Defaultlabelcolor);
         label5.setForeground(Defaultlabelcolor);
         label6.setForeground(Defaultlabelcolor);
    }//GEN-LAST:event_pesertabtnMousePressed

    private void pendampingbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pendampingbtnMousePressed
        // TODO add your handling code here:
         mainpagebtn.setBackground(DefaultColor);
         pesertabtn.setBackground(DefaultColor);
         pendampingbtn.setBackground(ClickedColor);
         rumahpesertabtn.setBackground(DefaultColor);
         laporankegiatanbtn.setBackground(DefaultColor);
         logout.setBackground(DefaultColor);
         label1.setForeground(Defaultlabelcolor);
         label2.setForeground(Defaultlabelcolor);
         label3.setForeground(Clickedlabelcolor);
         label4.setForeground(Defaultlabelcolor);
         label5.setForeground(Defaultlabelcolor);
         label6.setForeground(Defaultlabelcolor);
    }//GEN-LAST:event_pendampingbtnMousePressed

    private void rumahpesertabtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rumahpesertabtnMousePressed
        // TODO add your handling code here:
         mainpagebtn.setBackground(DefaultColor);
         pesertabtn.setBackground(DefaultColor);
         pendampingbtn.setBackground(DefaultColor);
         rumahpesertabtn.setBackground(ClickedColor);
         laporankegiatanbtn.setBackground(DefaultColor);
         logout.setBackground(DefaultColor);
         label1.setForeground(Defaultlabelcolor);
         label2.setForeground(Defaultlabelcolor);
         label3.setForeground(Defaultlabelcolor);
         label4.setForeground(Clickedlabelcolor);
         label5.setForeground(Defaultlabelcolor);
         label6.setForeground(Defaultlabelcolor);
    }//GEN-LAST:event_rumahpesertabtnMousePressed

    private void laporankegiatanbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_laporankegiatanbtnMousePressed
        // TODO add your handling code here:
         mainpagebtn.setBackground(DefaultColor);
         pesertabtn.setBackground(DefaultColor);
         pendampingbtn.setBackground(DefaultColor);
         rumahpesertabtn.setBackground(DefaultColor);
         laporankegiatanbtn.setBackground(ClickedColor);
         logout.setBackground(DefaultColor);
         label1.setForeground(Defaultlabelcolor);
         label2.setForeground(Defaultlabelcolor);
         label3.setForeground(Defaultlabelcolor);
         label4.setForeground(Defaultlabelcolor);
         label5.setForeground(Clickedlabelcolor);
         label6.setForeground(Defaultlabelcolor);
    }//GEN-LAST:event_laporankegiatanbtnMousePressed

    private void logoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMousePressed
        // TODO add your handling code here:
         mainpagebtn.setBackground(DefaultColor);
         pesertabtn.setBackground(DefaultColor);
         pendampingbtn.setBackground(DefaultColor);
         rumahpesertabtn.setBackground(DefaultColor);
         laporankegiatanbtn.setBackground(DefaultColor);
         logout.setBackground(ClickedColor);
         label1.setForeground(Defaultlabelcolor);
         label2.setForeground(Defaultlabelcolor);
         label3.setForeground(Defaultlabelcolor);
         label4.setForeground(Defaultlabelcolor);
         label5.setForeground(Defaultlabelcolor);
         label6.setForeground(Clickedlabelcolor);
    }//GEN-LAST:event_logoutMousePressed

    private void mainpagebtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mainpagebtnKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_mainpagebtnKeyPressed

    private void mainpagebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainpagebtnMouseClicked
        // TODO add your handling code here:
        MainPage2 Menu = new MainPage2();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(Menu).setVisible(true);
    }//GEN-LAST:event_mainpagebtnMouseClicked

    private void pesertabtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesertabtnMouseClicked
        // TODO add your handling code here:
        DataPesertaPKH Menu = new DataPesertaPKH();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(Menu).setVisible(true);
    }//GEN-LAST:event_pesertabtnMouseClicked

    private void pendampingbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pendampingbtnMouseClicked
        // TODO add your handling code here:
         DataPendampingPKH Menu = new DataPendampingPKH();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(Menu).setVisible(true);
    }//GEN-LAST:event_pendampingbtnMouseClicked

    private void rumahpesertabtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rumahpesertabtnMouseClicked
        // TODO add your handling code here:
        DataRumahPesertaPKH Menu = new DataRumahPesertaPKH();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(Menu).setVisible(true);
    }//GEN-LAST:event_rumahpesertabtnMouseClicked

    private void laporankegiatanbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_laporankegiatanbtnMouseClicked
        // TODO add your handling code here:
        LaporanKegiatan Menu = new LaporanKegiatan();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(Menu).setVisible(true);
    }//GEN-LAST:event_laporankegiatanbtnMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new LoginForm(null,true).setVisible(true);
    }//GEN-LAST:event_logoutMouseClicked

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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       
java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JPanel laporankegiatanbtn;
    private javax.swing.JLabel lb1MovingText;
    private javax.swing.JPanel logout;
    private javax.swing.JPanel mainpagebtn;
    private javax.swing.JPanel pendampingbtn;
    private javax.swing.JPanel pesertabtn;
    private javax.swing.JPanel rumahpesertabtn;
    // End of variables declaration//GEN-END:variables
}
