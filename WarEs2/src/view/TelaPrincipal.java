/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.awt.Color;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author felipe
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        initMeus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void initMeus(){
        
        jButton7.setBackground(Color.yellow);
        jButton1.setBackground(Color.yellow);
        jButton8.setBackground(Color.yellow);
        jButton9.setBackground(Color.yellow);
        
        jTabbedPane1.setEnabledAt(1, false);
        jTabbedPane1.setEnabledAt(2, false);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WarEs2");
        setMaximumSize(new java.awt.Dimension(950, 750));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(950, 750));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Início do jogo ~> +01 de exército todos os terrenos\n");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 470, 470, 100));

        jButton1.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jButton1.setText("1");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 40, 20));

        jLabel2.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabel2.setText("Console:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, 110, 30));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Branco", "22"},
                {"Verde", "17"},
                {"Preto", "7"},
                {"Vermelho", "9"},
                {"Azul", "18"},
                {"Amarelo", "11"}
            },
            new String [] {
                "Jogador", "Exécitos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setEnabled(false);
        jTable2.setRowHeight(17);
        jScrollPane3.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, 270, 130));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Jogando:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, 130, 30));

        jButton7.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jButton7.setText("1");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 40, 20));

        jButton8.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jButton8.setText("1");
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 40, 20));

        jButton9.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jButton9.setText("1");
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 40, 20));

        jTabbedPane1.setFocusable(false);
        jTabbedPane1.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jTabbedPane1.setRequestFocusEnabled(false);
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel5.setLayout(null);

        jButton10.setText("Finalizar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton10);
        jButton10.setBounds(180, 230, 90, 30);

        jLabel3.setText("Exércitos restantes:");
        jPanel5.add(jLabel3);
        jLabel3.setBounds(90, 130, 150, 20);

        jButton41.setBackground(new java.awt.Color(158, 216, 242));
        jButton41.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jButton41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Botões/map_pin_fill-48.png"))); // NOI18N
        jButton41.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton41.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton41.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton41);
        jButton41.setBounds(20, 50, 60, 50);

        jButton42.setBackground(new java.awt.Color(158, 216, 242));
        jButton42.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jButton42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Botões/cancelar.png"))); // NOI18N
        jButton42.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton42.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton42.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton42);
        jButton42.setBounds(20, 120, 60, 50);

        jLabel4.setText("Total de Exércitos");
        jPanel5.add(jLabel4);
        jLabel4.setBounds(100, 40, 160, 15);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Planos de fundo/war_brasil4.png"))); // NOI18N
        jPanel5.add(jLabel19);
        jLabel19.setBounds(2, -5, 290, 280);

        jTabbedPane1.addTab("Alocar", jPanel5);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(null);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Dados/1 vermelho.png"))); // NOI18N
        jPanel3.add(jLabel14);
        jLabel14.setBounds(110, 20, 53, 50);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Dados/2 vermelho.png"))); // NOI18N
        jPanel3.add(jLabel15);
        jLabel15.setBounds(110, 90, 53, 50);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Dados/1 vermelho.png"))); // NOI18N
        jPanel3.add(jLabel17);
        jLabel17.setBounds(110, 160, 53, 50);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Dados/2.png"))); // NOI18N
        jPanel3.add(jLabel18);
        jLabel18.setBounds(200, 160, 53, 50);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Dados/1.png"))); // NOI18N
        jPanel3.add(jLabel13);
        jLabel13.setBounds(200, 20, 53, 50);

        jButton5.setBackground(new java.awt.Color(158, 216, 242));
        jButton5.setForeground(new java.awt.Color(158, 216, 242));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Botões/Close3.png"))); // NOI18N
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setOpaque(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);
        jButton5.setBounds(20, 160, 60, 50);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Dados/2.png"))); // NOI18N
        jPanel3.add(jLabel16);
        jLabel16.setBounds(200, 90, 53, 50);

        jButton4.setText("Finalizar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);
        jButton4.setBounds(180, 230, 90, 30);

        jButton13.setBackground(new java.awt.Color(158, 216, 242));
        jButton13.setForeground(new java.awt.Color(158, 216, 242));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Botões/1411846837_cannon.png"))); // NOI18N
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton13.setOpaque(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton13);
        jButton13.setBounds(20, 20, 60, 50);

        jButton14.setBackground(new java.awt.Color(158, 216, 242));
        jButton14.setForeground(new java.awt.Color(158, 216, 242));
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Botões/dice.png"))); // NOI18N
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton14.setOpaque(false);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton14);
        jButton14.setBounds(20, 90, 60, 50);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Planos de fundo/war_brasil4.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        jLabel8.setOpaque(true);
        jPanel3.add(jLabel8);
        jLabel8.setBounds(0, 0, 290, 270);

        jTabbedPane1.addTab("Atacar", jPanel3);

        jPanel4.setLayout(null);

        jButton3.setBackground(new java.awt.Color(158, 216, 242));
        jButton3.setForeground(new java.awt.Color(158, 216, 242));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Botões/go-jump.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3);
        jButton3.setBounds(160, 50, 60, 50);
        jPanel4.add(jSpinner1);
        jSpinner1.setBounds(190, 130, 50, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Número De Exércitos:");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(30, 120, 170, 40);

        jButton11.setText("Finalizar");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton11);
        jButton11.setBounds(180, 230, 90, 30);

        jButton15.setBackground(new java.awt.Color(158, 216, 242));
        jButton15.setForeground(new java.awt.Color(158, 216, 242));
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Botões/icon-map-48.png"))); // NOI18N
        jButton15.setToolTipText("ufuvuk uyf uif ufuyf u uf ");
        jButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton15);
        jButton15.setBounds(70, 50, 60, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Planos de fundo/war_brasil4.png"))); // NOI18N
        jPanel4.add(jLabel5);
        jLabel5.setBounds(0, 0, 290, 270);

        jTabbedPane1.addTab("Mover", jPanel4);

        jPanel2.setLayout(null);

        jButton2.setBackground(new java.awt.Color(158, 216, 242));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Botões/Question-48.png"))); // NOI18N
        jButton2.setText("Objetivo");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(20, 20, 80, 80);

        jButton6.setText("Trocar");
        jPanel2.add(jButton6);
        jButton6.setBounds(30, 140, 90, 30);

        jButton12.setText("Finalizar Turno");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton12);
        jButton12.setBounds(150, 230, 120, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Planos de fundo/war_brasil4.png"))); // NOI18N
        jPanel2.add(jLabel10);
        jLabel10.setBounds(0, 0, 290, 270);

        jTabbedPane1.addTab("Cartas", jPanel2);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 290, 300));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, 290, 20));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(608, 0, 20, 470));

        jButton17.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jButton17.setText("1");
        jButton17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 40, 20));

        jButton18.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jButton18.setText("1");
        jButton18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 40, 20));

        jButton19.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jButton19.setText("1");
        jButton19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 40, 20));

        jButton20.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jButton20.setText("1");
        jButton20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 40, 20));

        jButton21.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jButton21.setText("1");
        jButton21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 40, 20));

        jButton22.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jButton22.setText("1");
        jButton22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 40, 20));

        jButton23.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jButton23.setText("1");
        jButton23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 40, 20));

        jButton24.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jButton24.setText("1");
        jButton24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 40, 20));

        jButton25.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jButton25.setText("1");
        jButton25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 40, 20));

        jButton26.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jButton26.setText("1");
        jButton26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 40, 20));

        jButton27.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jButton27.setText("1");
        jButton27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 40, 20));

        jButton28.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jButton28.setText("1");
        jButton28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 40, 20));

        jButton29.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jButton29.setText("1");
        jButton29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 40, 20));

        jButton30.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jButton30.setText("1");
        jButton30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 40, 20));

        jButton31.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jButton31.setText("1");
        jButton31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 40, 20));

        jButton32.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jButton32.setText("1");
        jButton32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 40, 20));

        jButton33.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jButton33.setText("1");
        jButton33.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 40, 20));

        jButton34.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jButton34.setText("1");
        jButton34.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 510, 40, 20));

        jButton35.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jButton35.setText("1");
        jButton35.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 40, 20));

        jButton36.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jButton36.setText("1");
        jButton36.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 40, 20));

        jButton37.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jButton37.setText("1");
        jButton37.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 40, 20));

        jButton38.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jButton38.setText("1");
        jButton38.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton38, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 40, 20));

        jButton39.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jButton39.setText("1");
        jButton39.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton39, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 40, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Planos de fundo/mapa.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 580));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 580));

        jMenu1.setText("Arquivo");

        jMenuItem2.setText("Novo Jogo");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
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

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int numDado = new Random().nextInt(6);
        jTable2.setRowSelectionInterval(numDado,numDado);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setEnabledAt(0, false);
        jTabbedPane1.setEnabledAt(1, true);
        jTabbedPane1.setSelectedIndex(1);
        jTabbedPane1.setEnabledAt(2, false);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setEnabledAt(0, false);
        jTabbedPane1.setEnabledAt(2, true);
        jTabbedPane1.setSelectedIndex(2);
        jTabbedPane1.setEnabledAt(1, false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
         jTabbedPane1.setEnabledAt(0, false);
        jTabbedPane1.setSelectedIndex(3);
        jTabbedPane1.setEnabledAt(1, false);
        jTabbedPane1.setEnabledAt(2, false);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setEnabledAt(1, false);
        jTabbedPane1.setEnabledAt(0, true);
        jTabbedPane1.setSelectedIndex(0);
        jTabbedPane1.setEnabledAt(2, false);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String a = "/view/imagens/Cartas Objetivo/con_nordeste_centrooeste.jpg";
        JOptionPane.showMessageDialog(this, null, "Objetivo", 2,new javax.swing.ImageIcon(getClass().getResource(a)));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new TelaInicial().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton42ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
