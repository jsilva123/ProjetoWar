/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author fabiiane
 */
public class TelaMenu extends javax.swing.JFrame {

    /**
     * Creates new form TelaMenu
     */
    public TelaMenu() {
        initComponents();
        jogar1.setVisible(false);
        creditos.setVisible(false);
        regras.setVisible(false);
        sair.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        regras = new javax.swing.JButton();
        creditos = new javax.swing.JButton();
        jogar1 = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        fotomenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WarEs2");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        regras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regras.setFocusPainted(false);
        jPanel1.add(regras, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 490, 200, 60));

        creditos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        creditos.setFocusPainted(false);
        jPanel1.add(creditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 490, 110, 60));

        jogar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jogar1.setFocusPainted(false);
        jogar1.setOpaque(false);
        jPanel1.add(jogar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, 140, 60));

        sair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sair.setFocusPainted(false);
        jPanel1.add(sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, 160, 60));

        fotomenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Planos de fundo/menu.png"))); // NOI18N
        jPanel1.add(fotomenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 580));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton creditos;
    private javax.swing.JLabel fotomenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jogar1;
    private javax.swing.JButton regras;
    private javax.swing.JButton sair;
    // End of variables declaration//GEN-END:variables
}
