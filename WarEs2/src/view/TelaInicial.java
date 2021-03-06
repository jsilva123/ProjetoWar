package view;

import Controller.WarController;
import java.awt.Color;
import javax.swing.JOptionPane;

public class TelaInicial extends javax.swing.JFrame {

    private WarController instance;

    public TelaInicial() {
        initComponents();
        instance = WarController.getInstance();
        this.setLocationRelativeTo(null);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        nome5 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        nome2 = new javax.swing.JTextField();
        nome4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        nome1 = new javax.swing.JTextField();
        nome6 = new javax.swing.JTextField();
        nome3 = new javax.swing.JTextField();
        corPreta = new javax.swing.JTextField();
        corBranca = new javax.swing.JTextField();
        corVerde = new javax.swing.JTextField();
        corAzul = new javax.swing.JTextField();
        corAmarela = new javax.swing.JTextField();
        corVermelha = new javax.swing.JTextField();
        jComboBox7 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jComboBox9 = new javax.swing.JComboBox();
        jComboBox10 = new javax.swing.JComboBox();
        jComboBox11 = new javax.swing.JComboBox();
        jComboBox12 = new javax.swing.JComboBox();
        jComboBox13 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WarEs2");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome Jogador 2:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 120, 40));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cor:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 40, 20));

        jButton1.setText("Iniciar Partida");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 540, 140, 30));

        nome5.setEnabled(false);
        jPanel1.add(nome5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 160, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "3", "4", "5", "6" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, 80, 30));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Número de Jogadores:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, 30));

        nome2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome2ActionPerformed(evt);
            }
        });
        jPanel1.add(nome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 160, -1));

        nome4.setEnabled(false);
        nome4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome4ActionPerformed(evt);
            }
        });
        jPanel1.add(nome4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 160, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nome Jogador 4:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 120, 40));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cor:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 480, 40, 20));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nome Jogador 3:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 120, 40));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cor:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 50, 20));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Nome Jogador 1:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 120, 40));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Nome Jogador 5:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 120, 40));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Nome Jogador 6:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, 120, 40));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Cor:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 30, 20));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Cor:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, 50, 20));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Cor:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, 50, 20));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 80, 40, 450));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 520, 490, 20));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 490, 20));

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 40, 450));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Opçôes De Jogo:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 140, 40));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Opçôes Jogadores:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 140, 40));

        nome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome1ActionPerformed(evt);
            }
        });
        jPanel1.add(nome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 160, -1));

        nome6.setEnabled(false);
        jPanel1.add(nome6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, 160, -1));
        jPanel1.add(nome3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 160, -1));

        corPreta.setEditable(false);
        corPreta.setBackground(java.awt.Color.black);
        corPreta.setForeground(java.awt.Color.red);
        jPanel1.add(corPreta, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, 50, -1));

        corBranca.setEditable(false);
        corBranca.setBackground(java.awt.Color.lightGray);
        corBranca.setForeground(java.awt.Color.gray);
        jPanel1.add(corBranca, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 50, -1));

        corVerde.setEditable(false);
        corVerde.setBackground(java.awt.Color.green);
        corVerde.setForeground(java.awt.Color.red);
        jPanel1.add(corVerde, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 50, -1));

        corAzul.setEditable(false);
        corAzul.setBackground(java.awt.Color.blue);
        corAzul.setForeground(java.awt.Color.red);
        jPanel1.add(corAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 430, 50, -1));

        corAmarela.setEditable(false);
        corAmarela.setBackground(java.awt.Color.yellow);
        corAmarela.setForeground(java.awt.Color.red);
        jPanel1.add(corAmarela, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 480, 50, -1));

        corVermelha.setEditable(false);
        corVermelha.setBackground(java.awt.Color.red);
        corVermelha.setForeground(java.awt.Color.red);
        jPanel1.add(corVermelha, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 50, -1));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Humano", "Cpu" }));
        jPanel1.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 380, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tipo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, 50, 20));

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Tipo");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, 50, 20));

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Tipo");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, 50, 20));

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Tipo");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 430, 50, 20));

        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Tipo");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 480, 50, 20));

        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Tipo");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, 50, 20));

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Humano", "Cpu" }));
        jPanel1.add(jComboBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, -1, -1));

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Humano", "Cpu" }));
        jPanel1.add(jComboBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 330, -1, -1));

        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Humano", "Cpu" }));
        jPanel1.add(jComboBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 430, -1, -1));

        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Humano", "Cpu" }));
        jPanel1.add(jComboBox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 480, -1, -1));

        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Humano", "Cpu" }));
        jPanel1.add(jComboBox13, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 230, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Planos de fundo/Tela inicial.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 580));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 580));

        jMenu1.setText("Arquivo");

        jMenuItem2.setText("Novo Jogo");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sobre");

        jMenuItem1.setText("Regras");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem3.setText("Créditos");
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String[] juntaNomes(int numeroJogadores) {
        switch (numeroJogadores) {
            case 3:
                return new String[]{nome1.getText(), nome2.getText(), nome3.getText()};
            case 4:
                return new String[]{nome1.getText(), nome2.getText(), nome3.getText(), nome4.getText()};
            case 5:
                return new String[]{nome1.getText(), nome2.getText(), nome3.getText(), nome4.getText(), nome5.getText()};
            default:
                return new String[]{nome1.getText(), nome2.getText(), nome3.getText(), nome4.getText(), nome5.getText(), nome6.getText()};
        }
    }

    public Color[] juntaCores(int numeroJogadores) {
        switch (numeroJogadores) {
            case 3:
                return new Color[]{Color.RED,Color.BLACK,Color.LIGHT_GRAY};
            case 4:
                return new Color[]{Color.RED,Color.BLACK,Color.LIGHT_GRAY,Color.GREEN};
            case 5:
                return new Color[]{Color.RED,Color.BLACK,Color.LIGHT_GRAY,Color.GREEN,Color.BLUE};
            default:
                return new Color[]{Color.RED,Color.BLACK,Color.LIGHT_GRAY,Color.GREEN,Color.BLUE,Color.YELLOW};
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        switch (jComboBox2.getSelectedIndex()) {
            case 0://3 jogadores
                if (nome1.getText().compareTo("") == 0 || nome2.getText().compareTo("") == 0 || nome3.getText().compareTo("") == 0) {
                    JOptionPane.showMessageDialog(rootPane, "Um ou mais campos de nomes não preenchidos!");
                } else {
                    instance.iniciaJogadores(3,juntaNomes(3),juntaCores(3));
                    new TelaPrincipal().setVisible(true);
                    this.dispose();
                }
                break;
            case 1://4 jogadores
                if (nome1.getText().compareTo("") == 0
                        || nome2.getText().compareTo("") == 0
                        || nome3.getText().compareTo("") == 0 || nome4.getText().compareTo("") == 0) {
                    JOptionPane.showMessageDialog(rootPane, "Um ou mais campos de nomes não preenchidos");
                } else {
                    instance.iniciaJogadores(4,juntaNomes(4),juntaCores(4));
                    new TelaPrincipal().setVisible(true);
                    this.dispose();
                }
                break;
            case 2://5 jogadores
                if (nome1.getText().compareTo("") == 0
                        || nome2.getText().compareTo("") == 0
                        || nome3.getText().compareTo("") == 0
                        || nome4.getText().compareTo("") == 0 || nome5.getText().compareTo("") == 0) {
                    JOptionPane.showMessageDialog(rootPane, "Um ou mais campos de nomes não preenchidos");
                } else {
                    instance.iniciaJogadores(5,juntaNomes(5),juntaCores(5));
                    new TelaPrincipal().setVisible(true);
                    this.dispose();
                }
                break;
            case 3://6 jogadores
                if (nome1.getText().compareTo("") == 0
                        || nome2.getText().compareTo("") == 0
                        || nome3.getText().compareTo("") == 0
                        || nome4.getText().compareTo("") == 0
                        || nome5.getText().compareTo("") == 0 || nome6.getText().compareTo("") == 0) {
                    JOptionPane.showMessageDialog(rootPane, "Um ou mais campos de nomes não preenchidos");
                } else {
                    instance.iniciaJogadores(6,juntaNomes(6),juntaCores(6));
                    new TelaPrincipal().setVisible(true);
                    this.dispose();
                }
                break;
        }
        // new TelaPrincipal().setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        switch (jComboBox2.getSelectedIndex()) {
            case 0:
                nome4.setEnabled(false);
                nome5.setEnabled(false);
                nome6.setEnabled(false);
                nome4.setText("");
                nome5.setText("");
                nome6.setText("");
                break;
            case 1:
                nome4.setEnabled(true);
                nome5.setEnabled(false);
                nome6.setEnabled(false);
                nome5.setText("");
                nome6.setText("");
                break;
            case 2:
                nome4.setEnabled(true);
                nome5.setEnabled(true);
                nome6.setEnabled(false);
                nome6.setText("");
                break;
            case 3:
                nome4.setEnabled(true);
                nome5.setEnabled(true);
                nome6.setEnabled(true);
                break;
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void nome4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void nome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome1ActionPerformed

    private void nome2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField corAmarela;
    private javax.swing.JTextField corAzul;
    private javax.swing.JTextField corBranca;
    private javax.swing.JTextField corPreta;
    private javax.swing.JTextField corVerde;
    private javax.swing.JTextField corVermelha;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox10;
    private javax.swing.JComboBox jComboBox11;
    private javax.swing.JComboBox jComboBox12;
    private javax.swing.JComboBox jComboBox13;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField nome1;
    private javax.swing.JTextField nome2;
    private javax.swing.JTextField nome3;
    private javax.swing.JTextField nome4;
    private javax.swing.JTextField nome5;
    private javax.swing.JTextField nome6;
    // End of variables declaration//GEN-END:variables
}
