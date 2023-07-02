/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stockmanagementsys;

/**
 *
 * @author HP EliteBook 840
 */
public class Home extends javax.swing.JFrame {

    /** Creates new form Home */
    public Home() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        userhome = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        vendorhome = new javax.swing.JLabel();
        pembelianhome = new javax.swing.JLabel();
        baranghome = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        logouthome = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("HOME");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 22, -1, -1));

        userhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stockmanagementsys/icons8-user-account-64.png"))); // NOI18N
        userhome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userhomeMouseClicked(evt);
            }
        });
        getContentPane().add(userhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 117, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("User");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 187, -1, -1));

        vendorhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stockmanagementsys/icons8-supplier-64.png"))); // NOI18N
        vendorhome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vendorhomeMouseClicked(evt);
            }
        });
        getContentPane().add(vendorhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 117, -1, -1));

        pembelianhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stockmanagementsys/icons8-add-shopping-cart-64.png"))); // NOI18N
        pembelianhome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pembelianhomeMouseClicked(evt);
            }
        });
        getContentPane().add(pembelianhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 226, -1, -1));

        baranghome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stockmanagementsys/icons8-product-64.png"))); // NOI18N
        baranghome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                baranghomeMouseClicked(evt);
            }
        });
        getContentPane().add(baranghome, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 226, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Barang");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 296, -1, -1));

        logouthome.setBackground(new java.awt.Color(51, 51, 51));
        logouthome.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        logouthome.setForeground(new java.awt.Color(255, 255, 255));
        logouthome.setText("LogOut");
        logouthome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logouthomeActionPerformed(evt);
            }
        });
        getContentPane().add(logouthome, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 389, 110, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Vendor");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 187, -1, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Pembelian");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 296, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stockmanagementsys/BgHomepage (1).jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logouthomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logouthomeActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        login.show();
    }//GEN-LAST:event_logouthomeActionPerformed

    private void userhomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userhomeMouseClicked
        dispose();
        User user = new User();
        user.show();
    }//GEN-LAST:event_userhomeMouseClicked

    private void vendorhomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vendorhomeMouseClicked
        // TODO add your handling code here:
        dispose();
        Vendor vendor = new Vendor();
        vendor.show();
    }//GEN-LAST:event_vendorhomeMouseClicked

    private void baranghomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_baranghomeMouseClicked
        dispose();
        Barang barang = new Barang();
        barang.show();
    }//GEN-LAST:event_baranghomeMouseClicked

    private void pembelianhomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pembelianhomeMouseClicked
        dispose();
        Pembelian beli = new Pembelian();
        beli.show();
    }//GEN-LAST:event_pembelianhomeMouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel baranghome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton logouthome;
    private javax.swing.JLabel pembelianhome;
    private javax.swing.JLabel userhome;
    private javax.swing.JLabel vendorhome;
    // End of variables declaration//GEN-END:variables

}
