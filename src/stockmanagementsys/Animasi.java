package stockmanagementsys;

public class Animasi extends javax.swing.JFrame {

    public Animasi() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        persen = new javax.swing.JLabel();
        progressku = new javax.swing.JProgressBar();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Imprint MT Shadow", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Stock Management System");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, -1));

        persen.setBackground(new java.awt.Color(255, 255, 255));
        persen.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        persen.setForeground(new java.awt.Color(255, 255, 255));
        persen.setText("%");
        getContentPane().add(persen, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 301, -1, -1));

        progressku.setBackground(new java.awt.Color(51, 51, 51));
        progressku.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(progressku, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 640, 10));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stockmanagementsys/Bg Animasi01.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 360));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        Animasi Animasiku = new Animasi();
        Animasiku.setVisible(true);
        try{
            for(int i = 0; i <= 100; i++) {
                Thread.sleep(40);
                Animasiku.progressku.setValue(i);
                Animasiku.persen.setText(Integer.valueOf(i)+"%");
            }
        }catch(InterruptedException e)
        {
        
        }
        new Login().setVisible(true);
        Animasiku.dispose();
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel persen;
    private javax.swing.JProgressBar progressku;
    // End of variables declaration//GEN-END:variables
}
