/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Controller.WarController;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import model.ConstantesEstados;

/**
 *
 * @author felipe
 */
public class TelaPrincipal extends javax.swing.JFrame {

    private WarController instance;
    private JButton[] botoesEstado;
    private boolean[] botoesHabilitados;

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        instance = WarController.getInstance();
        botoesHabilitados = new boolean[27];
        iniciaComponentesDaTela();
        this.setLocationRelativeTo(null);

    }

    public void geraVetorDeBotoes() {
        botoesEstado = new JButton[]{ACRE, ALAGOAS, AMAPA, AMAZONAS, BAHIA, CEARA, DF, ESPIRITOSANTO,
            GOIAS, MARANHAO, MATOGROSSO, MATOGROSSODOSUL, MINASGERAIS, PARA, PARAIBA, PARANA, PERNAMBUCO,
            PIAUI, RIODEJANEIRO, RIOGRANDEDONORTE, RIOGRANDEDOSUL, RONDONIA, RORAIMA, SANTACATARINA,
            SAOPAULO, SERGIPE, TOCANTINS};
    }

    public void atualizaTabelaJogadores() {
        for (int i = 0; i < instance.getNumeroJogadores(); i++) {
            tabelaJogadores.setValueAt(instance.getNomeJogador(i) + " (" + instance.getNomeCorJogador(i) + ")", i, 0);
            tabelaJogadores.setValueAt(instance.getTotalDeExercitoJogador(i), i, 1);
        }
        tabelaJogadores.setRowSelectionInterval(instance.getNumeroJogadorCorrente(), instance.getNumeroJogadorCorrente());

        tabelaJogadores.setSelectionBackground(instance.getCorJogador(instance.getNumeroJogadorCorrente()));
    }

    public void habilitarBotoes(int[] botoes) {
        for (int i = 0; i < botoes.length; i++) {
            botoesHabilitados[botoes[i]] = true;
        }
    }

    public void desabilitaBotoes() {
        for (int i = 0; i < botoesHabilitados.length; i++) {
            botoesHabilitados[i] = false;

        }
    }

    public void atualizaPainelDeAcoes() {
        switch (instance.getEtapaCorrente()) {
            case 0:
                jTabbedPane1.setSelectedIndex(0);
                jTabbedPane1.setEnabledAt(0, true);
                jTabbedPane1.setEnabledAt(1, true);
                jTabbedPane1.setEnabledAt(2, false);
                jTabbedPane1.setEnabledAt(3, false);
                break;
            case 1:
                jTabbedPane1.setSelectedIndex(1);
                jTabbedPane1.setEnabledAt(0, true);
                jTabbedPane1.setEnabledAt(1, true);
                jTabbedPane1.setEnabledAt(2, false);
                jTabbedPane1.setEnabledAt(3, false);
                break;
            case 2:
                jTabbedPane1.setSelectedIndex(2);
                jTabbedPane1.setEnabledAt(0, true);
                jTabbedPane1.setEnabledAt(1, false);
                jTabbedPane1.setEnabledAt(2, true);
                jTabbedPane1.setEnabledAt(3, false);
                break;
            case 3:
                jTabbedPane1.setSelectedIndex(3);
                jTabbedPane1.setEnabledAt(0, true);
                jTabbedPane1.setEnabledAt(1, false);
                jTabbedPane1.setEnabledAt(2, false);
                jTabbedPane1.setEnabledAt(3, true);
                break;
        }
    }

    private void atualizaBotoesCartasTerritorio() {
        int qtdCartasTerrit = instance.getNumeroDeCartasEstadoJogador();
        switch (qtdCartasTerrit) {
            case 0:
                CARTA1.setEnabled(false);
                usarCarta0.setEnabled(false);
                CARTA2.setEnabled(false);
                usarCarta1.setEnabled(false);
                CARTA3.setEnabled(false);
                usarCarta2.setEnabled(false);
                CARTA4.setEnabled(false);
                usarCarta3.setEnabled(false);
                CARTA5.setEnabled(false);
                usarCarta4.setEnabled(false);
                break;
            case 1:
                CARTA1.setEnabled(true);
                usarCarta0.setEnabled(true);
                CARTA2.setEnabled(false);
                usarCarta1.setEnabled(false);
                CARTA3.setEnabled(false);
                usarCarta2.setEnabled(false);
                CARTA4.setEnabled(false);
                usarCarta3.setEnabled(false);
                CARTA5.setEnabled(false);
                usarCarta4.setEnabled(false);
                break;
            case 2:
                CARTA1.setEnabled(true);
                usarCarta0.setEnabled(true);
                CARTA2.setEnabled(true);
                usarCarta1.setEnabled(true);
                CARTA3.setEnabled(false);
                usarCarta2.setEnabled(false);
                CARTA4.setEnabled(false);
                usarCarta3.setEnabled(false);
                CARTA5.setEnabled(false);
                usarCarta4.setEnabled(false);
                break;
            case 3:
                CARTA1.setEnabled(true);
                usarCarta0.setEnabled(true);
                CARTA2.setEnabled(true);
                usarCarta1.setEnabled(true);
                CARTA3.setEnabled(true);
                usarCarta2.setEnabled(true);
                CARTA4.setEnabled(false);
                usarCarta3.setEnabled(false);
                CARTA5.setEnabled(false);
                usarCarta4.setEnabled(false);
                break;
            case 4:
                CARTA1.setEnabled(true);
                usarCarta0.setEnabled(true);
                CARTA2.setEnabled(true);
                usarCarta1.setEnabled(true);
                CARTA3.setEnabled(true);
                usarCarta2.setEnabled(true);
                CARTA4.setEnabled(true);
                usarCarta3.setEnabled(true);
                CARTA5.setEnabled(false);
                usarCarta4.setEnabled(false);
                break;
            case 5:
                CARTA1.setEnabled(true);
                usarCarta0.setEnabled(true);
                CARTA2.setEnabled(true);
                usarCarta1.setEnabled(true);
                CARTA3.setEnabled(true);
                usarCarta2.setEnabled(true);
                CARTA4.setEnabled(true);
                usarCarta3.setEnabled(true);
                CARTA5.setEnabled(true);
                usarCarta4.setEnabled(true);
                break;
        }
    }

    private ArrayList<Integer> verificaQtdCartasEstSelecs() {
        ArrayList<Integer> cartasTerritorioSelec = new ArrayList<>();
        if (usarCarta0.isSelected()) {
            cartasTerritorioSelec.add(0);
        }
        if (usarCarta1.isSelected()) {
            cartasTerritorioSelec.add(1);
        }
        if (usarCarta2.isSelected()) {
            cartasTerritorioSelec.add(2);
        }
        if (usarCarta3.isSelected()) {
            cartasTerritorioSelec.add(3);
        }
        if (usarCarta4.isSelected()) {
            cartasTerritorioSelec.add(4);
        }
        return cartasTerritorioSelec;
    }

    public void clicouBotao(int idBotao, String nomeBotao) {
        switch (instance.getEtapaCorrente()) {
            case 0:// troca de cartas

                break;
            case 1:// alocacao de exercitos
                if (instance.alocaExercito(idBotao, 1)) {
                    console.append("+1 Exército no " + ConstantesEstados.getConstantesPorId(idBotao).getNome() + "\n");
                    TotalExercitos.setText(Integer.toString(instance.getNumExercitoGanhos()));
                } else {
                    console.append("Você não possui mais exércitos para alocar! \n");
                }
                break;
            case 2:// ataque 

                if (!instance.escolheuOrigemAtaque()) {
                    if (instance.setOrigemAtaque(idBotao)) {
                        ATACANTE.setText(nomeBotao);
                        console.append("Origem " + nomeBotao + " escolhida \n");
                        desabilitaBotoes();
                        habilitarBotoes(instance.vizinhosDoEstadoAtacante());
                    } else {
                        console.append("Origem inválida, escolha um Estado com mais de 1 exército! \n");
                    }
                } else if (!instance.escolheuDestinoAtaque()) {
                    if (instance.setDestinoAtaque(idBotao)) {
                        DEFENSOR.setText(nomeBotao);
                        instance.setJogadorDefensor(idBotao);
                        console.append("Destino " + nomeBotao + " escolhida \n");
                    } else {
                        console.append("Destino inválido, escolha um estado que faça fronteira com o estado atacante! \n");
                    }
                }

                break;
            case 3:// mover exercitos

                if (instance.getOrigem() == -1) {
                    instance.setOrigem(idBotao);
                    jLabel5.setText(nomeBotao);
                } else {
                    jLabel6.setText(nomeBotao);
                    instance.setDestino(idBotao);
                }
                break;
        }
        instance.atualizaMapa(botoesEstado);
        atualizaTabelaJogadores();

    }

    public void atualizaFotoDadosPadrao() {

        dado1_amarelo.setIcon(new ImageIcon(getClass().getResource("/view/imagens/Dados/ga1.gif")));
        dado2_amarelo.setIcon(new ImageIcon(getClass().getResource("/view/imagens/Dados/ga2.gif")));
        dado3_amarelo.setIcon(new ImageIcon(getClass().getResource("/view/imagens/Dados/ga3.gif")));
        dado1_vermelho.setIcon(new ImageIcon(getClass().getResource("/view/imagens/Dados/gv1.gif")));
        dado2_vermelho.setIcon(new ImageIcon(getClass().getResource("/view/imagens/Dados/gv2.gif")));
        dado3_vermelho.setIcon(new ImageIcon(getClass().getResource("/view/imagens/Dados/gv3.gif")));
    }

    public void atualizaFotoDados(int[] dadosAtaque, int[] dadosDefesa) {

        switch (dadosAtaque.length) {
            case 1:
                dado1_vermelho.setIcon(new ImageIcon(getClass().getResource("/view/imagens/Dados/" + Integer.toString(dadosAtaque[0]) + "v.png")));
                dado2_vermelho.setIcon(new ImageIcon(getClass().getResource("/view/imagens/Dados/0.png")));
                dado3_vermelho.setIcon(new ImageIcon(getClass().getResource("/view/imagens/Dados/0.png")));
                break;
            case 2:
                dado1_vermelho.setIcon(new ImageIcon(getClass().getResource("/view/imagens/Dados/" + Integer.toString(dadosAtaque[0]) + "v.png")));
                dado2_vermelho.setIcon(new ImageIcon(getClass().getResource("/view/imagens/Dados/" + Integer.toString(dadosAtaque[1]) + "v.png")));
                dado3_vermelho.setIcon(new ImageIcon(getClass().getResource("/view/imagens/Dados/0.png")));
                break;
            case 3:
                dado1_vermelho.setIcon(new ImageIcon(getClass().getResource("/view/imagens/Dados/" + Integer.toString(dadosAtaque[0]) + "v.png")));
                dado2_vermelho.setIcon(new ImageIcon(getClass().getResource("/view/imagens/Dados/" + Integer.toString(dadosAtaque[1]) + "v.png")));
                dado3_vermelho.setIcon(new ImageIcon(getClass().getResource("/view/imagens/Dados/" + Integer.toString(dadosAtaque[2]) + "v.png")));
                break;

        }
        switch (dadosDefesa.length) {
            case 1:
                dado1_amarelo.setIcon(new ImageIcon(getClass().getResource("/view/imagens/Dados/" + Integer.toString(dadosDefesa[0]) + "a.png")));
                dado2_amarelo.setIcon(new ImageIcon(getClass().getResource("/view/imagens/Dados/0.png")));
                dado3_amarelo.setIcon(new ImageIcon(getClass().getResource("/view/imagens/Dados/0.png")));
                break;
            case 2:
                dado1_amarelo.setIcon(new ImageIcon(getClass().getResource("/view/imagens/Dados/" + Integer.toString(dadosDefesa[0]) + "a.png")));
                dado2_amarelo.setIcon(new ImageIcon(getClass().getResource("/view/imagens/Dados/" + Integer.toString(dadosDefesa[1]) + "a.png")));
                dado3_amarelo.setIcon(new ImageIcon(getClass().getResource("/view/imagens/Dados/0.png")));
                break;
            case 3:
                dado1_amarelo.setIcon(new ImageIcon(getClass().getResource("/view/imagens/Dados/" + Integer.toString(dadosDefesa[0]) + "a.png")));
                dado2_amarelo.setIcon(new ImageIcon(getClass().getResource("/view/imagens/Dados/" + Integer.toString(dadosDefesa[1]) + "a.png")));
                dado3_amarelo.setIcon(new ImageIcon(getClass().getResource("/view/imagens/Dados/" + Integer.toString(dadosDefesa[2]) + "a.png")));
                break;

        }

    }

    //************************************************************************************************************************************
    //************************************************************************************************************************************
    //************************************************************************************************************************************
    private void iniciaComponentesDaTela() {

        instance.distribuiEstados();
        instance.distribuiObjetivos();

        geraVetorDeBotoes();

        atualizaTabelaJogadores();
        desabilitaBotoes();
        instance.atualizaMapa(botoesEstado);
        atualizaPainelDeAcoes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        console = new javax.swing.JTextArea();
        AMAZONAS = new javax.swing.JButton();
        Console = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaJogadores = new javax.swing.JTable();
        Jogando = new javax.swing.JLabel();
        RORAIMA = new javax.swing.JButton();
        MATOGROSSODOSUL = new javax.swing.JButton();
        BAHIA = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Cartas = new javax.swing.JPanel();
        CARTA1 = new javax.swing.JButton();
        CARTA2 = new javax.swing.JButton();
        CARTA4 = new javax.swing.JButton();
        CARTA3 = new javax.swing.JButton();
        CARTA5 = new javax.swing.JButton();
        VALORDATROCA = new javax.swing.JLabel();
        VALORTROCA = new javax.swing.JLabel();
        TROCAR = new javax.swing.JButton();
        usarCarta0 = new javax.swing.JCheckBox();
        usarCarta1 = new javax.swing.JCheckBox();
        usarCarta2 = new javax.swing.JCheckBox();
        usarCarta3 = new javax.swing.JCheckBox();
        usarCarta4 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        CARTAS = new javax.swing.JLabel();
        Alocacao = new javax.swing.JPanel();
        FINALIZARALOCAR = new javax.swing.JButton();
        ALOCAR = new javax.swing.JButton();
        PARARALOCACAO = new javax.swing.JButton();
        TOTALEXERCITOS = new javax.swing.JLabel();
        TotalExercitos = new javax.swing.JLabel();
        ALOCACAO = new javax.swing.JLabel();
        Ataque = new javax.swing.JPanel();
        dado1_vermelho = new javax.swing.JLabel();
        dado2_vermelho = new javax.swing.JLabel();
        dado3_vermelho = new javax.swing.JLabel();
        dado3_amarelo = new javax.swing.JLabel();
        dado2_amarelo = new javax.swing.JLabel();
        PARARATAQUE = new javax.swing.JButton();
        dado1_amarelo = new javax.swing.JLabel();
        FINALIZARATAQUE = new javax.swing.JButton();
        ATACAR = new javax.swing.JButton();
        DADOS = new javax.swing.JButton();
        ATACANTE = new javax.swing.JLabel();
        DEFENSOR = new javax.swing.JLabel();
        x = new javax.swing.JLabel();
        ATAQUE = new javax.swing.JLabel();
        Mover = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        N_EXERCITOS_SELECT = new javax.swing.JSpinner();
        N_EXERCITOS = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        FINALIZARTURNO = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        MOVER = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        MATOGROSSO = new javax.swing.JButton();
        AMAPA = new javax.swing.JButton();
        RONDONIA = new javax.swing.JButton();
        ACRE = new javax.swing.JButton();
        TOCANTINS = new javax.swing.JButton();
        MARANHAO = new javax.swing.JButton();
        PIAUI = new javax.swing.JButton();
        CEARA = new javax.swing.JButton();
        GOIAS = new javax.swing.JButton();
        MINASGERAIS = new javax.swing.JButton();
        SAOPAULO = new javax.swing.JButton();
        PARANA = new javax.swing.JButton();
        ESPIRITOSANTO = new javax.swing.JButton();
        RIODEJANEIRO = new javax.swing.JButton();
        RIOGRANDEDONORTE = new javax.swing.JButton();
        ALAGOAS = new javax.swing.JButton();
        SERGIPE = new javax.swing.JButton();
        RIOGRANDEDOSUL = new javax.swing.JButton();
        SANTACATARINA = new javax.swing.JButton();
        PERNAMBUCO = new javax.swing.JButton();
        PARAIBA = new javax.swing.JButton();
        DF = new javax.swing.JButton();
        PARA = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        OBJETIVO = new javax.swing.JButton();
        OBJETIVO1 = new javax.swing.JButton();
        FOTODEFUNDO = new javax.swing.JLabel();
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

        jPanel1.setPreferredSize(new java.awt.Dimension(950, 750));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        console.setColumns(20);
        console.setRows(5);
        console.setText("Início do jogo ~> +01 de exército todos os terrenos\n");
        jScrollPane1.setViewportView(console);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, 590, 100));

        AMAZONAS.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        AMAZONAS.setText("1");
        AMAZONAS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AMAZONAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AMAZONASActionPerformed(evt);
            }
        });
        jPanel1.add(AMAZONAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 40, 20));

        Console.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        Console.setText("Console:");
        jPanel1.add(Console, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, 110, 30));

        tabelaJogadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Branco", "22"},
                {"Verde", "17"},
                {"Preto", "7"},
                {" - ", " -"},
                {" - ", " - "},
                {" - ", " -"}
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
        tabelaJogadores.setEnabled(false);
        tabelaJogadores.setRowHeight(17);
        jScrollPane3.setViewportView(tabelaJogadores);
        if (tabelaJogadores.getColumnModel().getColumnCount() > 0) {
            tabelaJogadores.getColumnModel().getColumn(0).setResizable(false);
            tabelaJogadores.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 330, 300, 130));

        Jogando.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Jogando.setText("Jogando:");
        jPanel1.add(Jogando, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 300, 130, 30));

        RORAIMA.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        RORAIMA.setText("1");
        RORAIMA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RORAIMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RORAIMAActionPerformed(evt);
            }
        });
        jPanel1.add(RORAIMA, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 40, 20));

        MATOGROSSODOSUL.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        MATOGROSSODOSUL.setText("1");
        MATOGROSSODOSUL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MATOGROSSODOSUL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MATOGROSSODOSULActionPerformed(evt);
            }
        });
        jPanel1.add(MATOGROSSODOSUL, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 40, 20));

        BAHIA.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        BAHIA.setText("1");
        BAHIA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BAHIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAHIAActionPerformed(evt);
            }
        });
        jPanel1.add(BAHIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 40, 20));

        jTabbedPane1.setFocusable(false);
        jTabbedPane1.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jTabbedPane1.setRequestFocusEnabled(false);
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        Cartas.setLayout(null);

        CARTA1.setBackground(new java.awt.Color(158, 216, 242));
        CARTA1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        CARTA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Cartas Território/miniaturaversocarta.jpg"))); // NOI18N
        CARTA1.setEnabled(false);
        CARTA1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CARTA1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        CARTA1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        CARTA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CARTA1ActionPerformed(evt);
            }
        });
        Cartas.add(CARTA1);
        CARTA1.setBounds(20, 0, 100, 109);

        CARTA2.setBackground(new java.awt.Color(158, 216, 242));
        CARTA2.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        CARTA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Cartas Território/miniaturaversocarta.jpg"))); // NOI18N
        CARTA2.setEnabled(false);
        CARTA2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CARTA2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        CARTA2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        CARTA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CARTA2ActionPerformed(evt);
            }
        });
        Cartas.add(CARTA2);
        CARTA2.setBounds(140, 0, 100, 109);

        CARTA4.setBackground(new java.awt.Color(158, 216, 242));
        CARTA4.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        CARTA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Cartas Território/miniaturaversocarta.jpg"))); // NOI18N
        CARTA4.setEnabled(false);
        CARTA4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CARTA4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        CARTA4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        CARTA4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CARTA4ActionPerformed(evt);
            }
        });
        Cartas.add(CARTA4);
        CARTA4.setBounds(20, 130, 100, 109);

        CARTA3.setBackground(new java.awt.Color(158, 216, 242));
        CARTA3.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        CARTA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Cartas Território/miniaturaversocarta.jpg"))); // NOI18N
        CARTA3.setEnabled(false);
        CARTA3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CARTA3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        CARTA3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        CARTA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CARTA3ActionPerformed(evt);
            }
        });
        Cartas.add(CARTA3);
        CARTA3.setBounds(260, 0, 100, 109);

        CARTA5.setBackground(new java.awt.Color(158, 216, 242));
        CARTA5.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        CARTA5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Cartas Território/miniaturaversocarta.jpg"))); // NOI18N
        CARTA5.setEnabled(false);
        CARTA5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CARTA5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        CARTA5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        CARTA5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CARTA5ActionPerformed(evt);
            }
        });
        Cartas.add(CARTA5);
        CARTA5.setBounds(140, 130, 100, 109);

        VALORDATROCA.setText("Exércitos ganhos");
        Cartas.add(VALORDATROCA);
        VALORDATROCA.setBounds(250, 140, 130, 20);

        VALORTROCA.setText("3");
        Cartas.add(VALORTROCA);
        VALORTROCA.setBounds(320, 160, 20, 20);

        TROCAR.setBackground(new java.awt.Color(158, 216, 242));
        TROCAR.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        TROCAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Botões/iconetroca.png"))); // NOI18N
        TROCAR.setToolTipText("Alocar Exército");
        TROCAR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        TROCAR.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        TROCAR.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        TROCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TROCARActionPerformed(evt);
            }
        });
        Cartas.add(TROCAR);
        TROCAR.setBounds(270, 190, 60, 50);

        usarCarta0.setText("Usar");
        usarCarta0.setEnabled(false);
        usarCarta0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usarCarta0ActionPerformed(evt);
            }
        });
        Cartas.add(usarCarta0);
        usarCarta0.setBounds(20, 110, 70, 23);

        usarCarta1.setText("Usar");
        usarCarta1.setEnabled(false);
        usarCarta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usarCarta1ActionPerformed(evt);
            }
        });
        Cartas.add(usarCarta1);
        usarCarta1.setBounds(140, 110, 70, 23);

        usarCarta2.setText("Usar");
        usarCarta2.setEnabled(false);
        Cartas.add(usarCarta2);
        usarCarta2.setBounds(260, 110, 70, 23);

        usarCarta3.setText("Usar");
        usarCarta3.setEnabled(false);
        usarCarta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usarCarta3ActionPerformed(evt);
            }
        });
        Cartas.add(usarCarta3);
        usarCarta3.setBounds(20, 240, 70, 23);

        usarCarta4.setText("Usar");
        usarCarta4.setEnabled(false);
        usarCarta4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usarCarta4ActionPerformed(evt);
            }
        });
        Cartas.add(usarCarta4);
        usarCarta4.setBounds(140, 240, 70, 23);

        jLabel1.setText("nessa troca:");
        Cartas.add(jLabel1);
        jLabel1.setBounds(250, 160, 100, 14);

        CARTAS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Planos de fundo/mar.png"))); // NOI18N
        Cartas.add(CARTAS);
        CARTAS.setBounds(0, 0, 390, 280);

        jTabbedPane1.addTab("Cartas", Cartas);

        Alocacao.setLayout(null);

        FINALIZARALOCAR.setText("Finalizar");
        FINALIZARALOCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FINALIZARALOCARActionPerformed(evt);
            }
        });
        Alocacao.add(FINALIZARALOCAR);
        FINALIZARALOCAR.setBounds(280, 240, 90, 30);

        ALOCAR.setBackground(new java.awt.Color(158, 216, 242));
        ALOCAR.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        ALOCAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Botões/map_pin_fill-48.png"))); // NOI18N
        ALOCAR.setText("Território");
        ALOCAR.setToolTipText("Alocar Exército");
        ALOCAR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ALOCAR.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ALOCAR.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        ALOCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALOCARActionPerformed(evt);
            }
        });
        Alocacao.add(ALOCAR);
        ALOCAR.setBounds(60, 90, 110, 80);

        PARARALOCACAO.setBackground(new java.awt.Color(158, 216, 242));
        PARARALOCACAO.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        PARARALOCACAO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Botões/cancelar.png"))); // NOI18N
        PARARALOCACAO.setText("Cancelar ");
        PARARALOCACAO.setToolTipText("Remover Exército");
        PARARALOCACAO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PARARALOCACAO.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        PARARALOCACAO.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        PARARALOCACAO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PARARALOCACAOActionPerformed(evt);
            }
        });
        Alocacao.add(PARARALOCACAO);
        PARARALOCACAO.setBounds(210, 90, 110, 80);

        TOTALEXERCITOS.setText("Total de Exércitos:  +");
        Alocacao.add(TOTALEXERCITOS);
        TOTALEXERCITOS.setBounds(90, 40, 160, 30);

        TotalExercitos.setText("0");
        Alocacao.add(TotalExercitos);
        TotalExercitos.setBounds(240, 40, 49, 30);

        ALOCACAO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Planos de fundo/mar.png"))); // NOI18N
        Alocacao.add(ALOCACAO);
        ALOCACAO.setBounds(0, 0, 390, 280);

        jTabbedPane1.addTab("Alocar", Alocacao);

        Ataque.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Ataque.setLayout(null);

        dado1_vermelho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Dados/gv3.gif"))); // NOI18N
        Ataque.add(dado1_vermelho);
        dado1_vermelho.setBounds(110, 40, 70, 70);

        dado2_vermelho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Dados/gv2.gif"))); // NOI18N
        Ataque.add(dado2_vermelho);
        dado2_vermelho.setBounds(110, 110, 70, 70);

        dado3_vermelho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Dados/gv1.gif"))); // NOI18N
        Ataque.add(dado3_vermelho);
        dado3_vermelho.setBounds(110, 180, 70, 70);

        dado3_amarelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Dados/ga1.gif"))); // NOI18N
        Ataque.add(dado3_amarelo);
        dado3_amarelo.setBounds(200, 180, 80, 70);

        dado2_amarelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Dados/ga3.gif"))); // NOI18N
        Ataque.add(dado2_amarelo);
        dado2_amarelo.setBounds(200, 110, 70, 70);

        PARARATAQUE.setBackground(new java.awt.Color(158, 216, 242));
        PARARATAQUE.setForeground(new java.awt.Color(158, 216, 242));
        PARARATAQUE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Botões/Close3.png"))); // NOI18N
        PARARATAQUE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PARARATAQUE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PARARATAQUEActionPerformed(evt);
            }
        });
        Ataque.add(PARARATAQUE);
        PARARATAQUE.setBounds(20, 190, 60, 50);

        dado1_amarelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Dados/ga2.gif"))); // NOI18N
        Ataque.add(dado1_amarelo);
        dado1_amarelo.setBounds(200, 40, 70, 70);

        FINALIZARATAQUE.setText("Finalizar");
        FINALIZARATAQUE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FINALIZARATAQUEActionPerformed(evt);
            }
        });
        Ataque.add(FINALIZARATAQUE);
        FINALIZARATAQUE.setBounds(280, 240, 90, 30);

        ATACAR.setBackground(new java.awt.Color(158, 216, 242));
        ATACAR.setForeground(new java.awt.Color(158, 216, 242));
        ATACAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Botões/1411846837_cannon.png"))); // NOI18N
        ATACAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ATACAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ATACARActionPerformed(evt);
            }
        });
        Ataque.add(ATACAR);
        ATACAR.setBounds(20, 50, 60, 50);

        DADOS.setBackground(new java.awt.Color(158, 216, 242));
        DADOS.setForeground(new java.awt.Color(158, 216, 242));
        DADOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Botões/dice.png"))); // NOI18N
        DADOS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DADOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DADOSActionPerformed(evt);
            }
        });
        Ataque.add(DADOS);
        DADOS.setBounds(20, 120, 60, 50);

        ATACANTE.setText("Origem");
        Ataque.add(ATACANTE);
        ATACANTE.setBounds(80, 10, 130, 40);

        DEFENSOR.setText("Destino");
        Ataque.add(DEFENSOR);
        DEFENSOR.setBounds(230, 10, 170, 40);

        x.setText("X");
        Ataque.add(x);
        x.setBounds(190, 20, 30, 14);

        ATAQUE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Planos de fundo/mar.png"))); // NOI18N
        ATAQUE.setOpaque(true);
        Ataque.add(ATAQUE);
        ATAQUE.setBounds(0, 0, 400, 280);

        jTabbedPane1.addTab("Atacar", Ataque);

        Mover.setLayout(null);

        jButton3.setBackground(new java.awt.Color(158, 216, 242));
        jButton3.setForeground(new java.awt.Color(158, 216, 242));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Botões/go-jump.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Mover.add(jButton3);
        jButton3.setBounds(170, 90, 60, 50);
        Mover.add(N_EXERCITOS_SELECT);
        N_EXERCITOS_SELECT.setBounds(250, 160, 70, 40);

        N_EXERCITOS.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        N_EXERCITOS.setText("Número De Exércitos:");
        Mover.add(N_EXERCITOS);
        N_EXERCITOS.setBounds(80, 160, 170, 40);

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
        Mover.add(jButton15);
        jButton15.setBounds(80, 90, 60, 50);

        jButton43.setBackground(new java.awt.Color(158, 216, 242));
        jButton43.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jButton43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Botões/cancelar.png"))); // NOI18N
        jButton43.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton43.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton43.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });
        Mover.add(jButton43);
        jButton43.setBounds(260, 90, 60, 50);

        FINALIZARTURNO.setText("Finalizar Turno");
        FINALIZARTURNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FINALIZARTURNOActionPerformed(evt);
            }
        });
        Mover.add(FINALIZARTURNO);
        FINALIZARTURNO.setBounds(250, 240, 120, 30);

        jLabel3.setText("Origem: ");
        Mover.add(jLabel3);
        jLabel3.setBounds(10, 10, 90, 14);

        jLabel4.setText("Destino: ");
        Mover.add(jLabel4);
        jLabel4.setBounds(10, 40, 90, 14);

        jLabel5.setText("Rio de Janeiro");
        Mover.add(jLabel5);
        jLabel5.setBounds(80, 10, 180, 14);

        jLabel6.setText("Mato Grosso Do Sul");
        Mover.add(jLabel6);
        jLabel6.setBounds(80, 40, 180, 14);

        MOVER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Planos de fundo/mar.png"))); // NOI18N
        Mover.add(MOVER);
        MOVER.setBounds(0, 0, 400, 280);

        jTabbedPane1.addTab("Mover", Mover);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 375, 300));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 300, 378, 20));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1125, 0, 10, 480));

        MATOGROSSO.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        MATOGROSSO.setText("1");
        MATOGROSSO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MATOGROSSO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MATOGROSSOActionPerformed(evt);
            }
        });
        jPanel1.add(MATOGROSSO, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 40, 20));

        AMAPA.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        AMAPA.setText("1");
        AMAPA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AMAPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AMAPAActionPerformed(evt);
            }
        });
        jPanel1.add(AMAPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 40, 20));

        RONDONIA.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        RONDONIA.setText("1");
        RONDONIA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RONDONIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RONDONIAActionPerformed(evt);
            }
        });
        jPanel1.add(RONDONIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 40, 20));

        ACRE.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        ACRE.setText("1");
        ACRE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ACRE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ACREMouseEntered(evt);
            }
        });
        ACRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACREActionPerformed(evt);
            }
        });
        jPanel1.add(ACRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 40, 20));

        TOCANTINS.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        TOCANTINS.setText("1");
        TOCANTINS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TOCANTINS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TOCANTINSActionPerformed(evt);
            }
        });
        jPanel1.add(TOCANTINS, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 40, 20));

        MARANHAO.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        MARANHAO.setText("1");
        MARANHAO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MARANHAO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MARANHAOActionPerformed(evt);
            }
        });
        jPanel1.add(MARANHAO, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 40, 20));

        PIAUI.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        PIAUI.setText("1");
        PIAUI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PIAUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PIAUIActionPerformed(evt);
            }
        });
        jPanel1.add(PIAUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 40, 20));

        CEARA.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        CEARA.setText("1");
        CEARA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CEARA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CEARAActionPerformed(evt);
            }
        });
        jPanel1.add(CEARA, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 40, 20));

        GOIAS.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        GOIAS.setText("1");
        GOIAS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GOIAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GOIASActionPerformed(evt);
            }
        });
        jPanel1.add(GOIAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 40, 20));

        MINASGERAIS.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        MINASGERAIS.setText("1");
        MINASGERAIS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MINASGERAIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MINASGERAISActionPerformed(evt);
            }
        });
        jPanel1.add(MINASGERAIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 40, 20));

        SAOPAULO.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        SAOPAULO.setText("1");
        SAOPAULO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SAOPAULO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAOPAULOActionPerformed(evt);
            }
        });
        jPanel1.add(SAOPAULO, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 40, 20));

        PARANA.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        PARANA.setText("1");
        PARANA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PARANA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PARANAActionPerformed(evt);
            }
        });
        jPanel1.add(PARANA, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 40, 20));

        ESPIRITOSANTO.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        ESPIRITOSANTO.setText("1");
        ESPIRITOSANTO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ESPIRITOSANTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ESPIRITOSANTOActionPerformed(evt);
            }
        });
        jPanel1.add(ESPIRITOSANTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 40, 20));

        RIODEJANEIRO.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        RIODEJANEIRO.setText("1");
        RIODEJANEIRO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RIODEJANEIRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RIODEJANEIROActionPerformed(evt);
            }
        });
        jPanel1.add(RIODEJANEIRO, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 40, 20));

        RIOGRANDEDONORTE.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        RIOGRANDEDONORTE.setText("1");
        RIOGRANDEDONORTE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RIOGRANDEDONORTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RIOGRANDEDONORTEActionPerformed(evt);
            }
        });
        jPanel1.add(RIOGRANDEDONORTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 40, 20));

        ALAGOAS.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        ALAGOAS.setText("1");
        ALAGOAS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ALAGOAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALAGOASActionPerformed(evt);
            }
        });
        jPanel1.add(ALAGOAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 40, 20));

        SERGIPE.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        SERGIPE.setText("1");
        SERGIPE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SERGIPE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SERGIPEActionPerformed(evt);
            }
        });
        jPanel1.add(SERGIPE, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 40, 20));

        RIOGRANDEDOSUL.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        RIOGRANDEDOSUL.setText("1");
        RIOGRANDEDOSUL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RIOGRANDEDOSUL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RIOGRANDEDOSULActionPerformed(evt);
            }
        });
        jPanel1.add(RIOGRANDEDOSUL, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 510, 40, 20));

        SANTACATARINA.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        SANTACATARINA.setText("1");
        SANTACATARINA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SANTACATARINA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SANTACATARINAActionPerformed(evt);
            }
        });
        jPanel1.add(SANTACATARINA, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, 40, 20));

        PERNAMBUCO.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        PERNAMBUCO.setText("1");
        PERNAMBUCO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PERNAMBUCO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PERNAMBUCOActionPerformed(evt);
            }
        });
        jPanel1.add(PERNAMBUCO, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 40, 20));

        PARAIBA.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        PARAIBA.setText("1");
        PARAIBA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PARAIBA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PARAIBAActionPerformed(evt);
            }
        });
        jPanel1.add(PARAIBA, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 40, 20));

        DF.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        DF.setText("1");
        DF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DFActionPerformed(evt);
            }
        });
        jPanel1.add(DF, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 40, 20));

        PARA.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        PARA.setText("1");
        PARA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PARA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PARAActionPerformed(evt);
            }
        });
        jPanel1.add(PARA, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 40, 20));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(748, 0, 20, 470));

        OBJETIVO.setBackground(new java.awt.Color(158, 216, 242));
        OBJETIVO.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        OBJETIVO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Botões/Question-48.png"))); // NOI18N
        OBJETIVO.setText("Objetivo");
        OBJETIVO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        OBJETIVO.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        OBJETIVO.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        OBJETIVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OBJETIVOActionPerformed(evt);
            }
        });
        jPanel1.add(OBJETIVO, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, 80, 80));

        OBJETIVO1.setBackground(new java.awt.Color(158, 216, 242));
        OBJETIVO1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        OBJETIVO1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Botões/Question-48.png"))); // NOI18N
        OBJETIVO1.setText("Tabela De Troca");
        OBJETIVO1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        OBJETIVO1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        OBJETIVO1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        OBJETIVO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OBJETIVO1ActionPerformed(evt);
            }
        });
        jPanel1.add(OBJETIVO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 120, 80));

        FOTODEFUNDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Planos de fundo/mapa.jpg"))); // NOI18N
        jPanel1.add(FOTODEFUNDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 580));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 580));

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

    private void PARARATAQUEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PARARATAQUEActionPerformed

    }//GEN-LAST:event_PARARATAQUEActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if ((Integer) N_EXERCITOS_SELECT.getValue() <= 0) {
            JOptionPane.showMessageDialog(rootPane, "Você não escolheu quantos exércitos deseja mover");
        } else {
            if (instance.deslocaExercitoJogador((Integer) N_EXERCITOS_SELECT.getValue())) {
                console.append("\n deslocado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Quantidade inválida ou deslocamente errado!");
            }
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void FINALIZARALOCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FINALIZARALOCARActionPerformed
        // TODO add your handling code here:

        if (instance.isPrimeiraRodada()) {
            instance.finalizaTurno();
            instance.setEtapaCorrente(0);
            desabilitaBotoes();
            console.setText("Início do turno do jogador " + instance.getJogadorCorrente().getNome() + "\n");
        } else {
            desabilitaBotoes();
            instance.passaEtapa();
        }

        atualizaPainelDeAcoes();
        atualizaTabelaJogadores();

    }//GEN-LAST:event_FINALIZARALOCARActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void FINALIZARATAQUEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FINALIZARATAQUEActionPerformed
        // TODO add your handling code here:

        instance.passaEtapa();
        desabilitaBotoes();
        atualizaPainelDeAcoes();
    }//GEN-LAST:event_FINALIZARATAQUEActionPerformed

    private void finalizar_moverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizar_moverActionPerformed

        instance.receberExercitos();
        TotalExercitos.setText(Integer.toString(instance.getNumExercitoGanhos()));
        habilitarBotoes(instance.getJogadorCorrente().getIdsEstados());

        instance.passaEtapa();

        atualizaPainelDeAcoes();
    }//GEN-LAST:event_finalizar_moverActionPerformed


    private void FINALIZARTURNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FINALIZARTURNOActionPerformed
        // TODO add your handling code here:

        instance.finalizaTurno();
        atualizaPainelDeAcoes();
        atualizaBotoesCartasTerritorio();

        VALORTROCA.setText(Integer.toString(instance.getNumeroExercitoTroca()));


    }//GEN-LAST:event_FINALIZARTURNOActionPerformed

    private void OBJETIVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OBJETIVOActionPerformed
        JOptionPane.showMessageDialog(this, null, "Objetivo", 2, new javax.swing.ImageIcon(getClass().getResource(instance.getCaminhoFotoObjetivoJogador())));
    }//GEN-LAST:event_OBJETIVOActionPerformed

    private void ATACARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ATACARActionPerformed

        instance.resetaAtaque();
        desabilitaBotoes();
        habilitarBotoes(instance.getJogadorCorrente().getIdsEstados());
        console.append("Escolha um estado de origem \n");
        ATACANTE.setText("Origem");
        DEFENSOR.setText("Destino");
        atualizaFotoDadosPadrao();
    }//GEN-LAST:event_ATACARActionPerformed

    private void DADOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DADOSActionPerformed

        if (instance.podeRealizarAtaque()) {
            instance.ataque();
            atualizaFotoDados(instance.getValorDadosAtaque(), instance.getvalorDadosDefesa());
            atualizaTabelaJogadores();
            instance.atualizaMapa(botoesEstado);

        } else {
            atualizaFotoDadosPadrao();
            atualizaTabelaJogadores();
            instance.atualizaMapa(botoesEstado);
            console.append("Não foi possível atacar. \n");
            ATACANTE.setText("Origem");
            DEFENSOR.setText("Destino");
        }

    }//GEN-LAST:event_DADOSActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // Mover (mapinha)


    }//GEN-LAST:event_jButton15ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new TelaInicial().setVisible(true);

        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void ALOCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALOCARActionPerformed

        if (instance.getEtapaCorrente() != 1) {
            instance.setEtapaCorrente(1);
            instance.receberExercitos();
            TotalExercitos.setText(Integer.toString(instance.getNumExercitoGanhos()));
            habilitarBotoes(instance.getJogadorCorrente().getIdsEstados());
        }

        atualizaTabelaJogadores();
        atualizaPainelDeAcoes();

    }//GEN-LAST:event_ALOCARActionPerformed

    private void PARARALOCACAOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PARARALOCACAOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PARARALOCACAOActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        // TODO add your handling code here:
        instance.setOrigem(-1);
        instance.setDestino(-1);

    }//GEN-LAST:event_jButton43ActionPerformed

    private void RIODEJANEIROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RIODEJANEIROActionPerformed
        if (botoesHabilitados[ConstantesEstados.RIODEJANEIRO.getIdEstado()]) {
            clicouBotao(ConstantesEstados.RIODEJANEIRO.getIdEstado(), ConstantesEstados.RIODEJANEIRO.getNome());
        }
    }//GEN-LAST:event_RIODEJANEIROActionPerformed

    private void CARTA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CARTA1ActionPerformed

        if (instance.getNumeroDeCartasEstadoJogador() >= 1) {
            JOptionPane.showMessageDialog(this, null, "Estado", 2, new javax.swing.ImageIcon(getClass().getResource(instance.getCaminhoFotoEstadoJogador(0))));
        } else {
            JOptionPane.showMessageDialog(rootPane, "Você não possui essa carta!");
        }

    }//GEN-LAST:event_CARTA1ActionPerformed

    private void CARTA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CARTA2ActionPerformed

        if (instance.getNumeroDeCartasEstadoJogador() >= 2) {
            JOptionPane.showMessageDialog(this, null, "Estado", 2, new javax.swing.ImageIcon(getClass().getResource(instance.getCaminhoFotoEstadoJogador(1))));
        } else {
            JOptionPane.showMessageDialog(rootPane, "Você não possui essa carta!");
        }
    }//GEN-LAST:event_CARTA2ActionPerformed

    private void CARTA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CARTA4ActionPerformed
        if (instance.getNumeroDeCartasEstadoJogador() >= 4) {
            JOptionPane.showMessageDialog(this, null, "Estado", 2, new javax.swing.ImageIcon(getClass().getResource(instance.getCaminhoFotoEstadoJogador(3))));
        } else {
            JOptionPane.showMessageDialog(rootPane, "Você não possui essa carta!");
        }
    }//GEN-LAST:event_CARTA4ActionPerformed

    private void CARTA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CARTA3ActionPerformed
        if (instance.getNumeroDeCartasEstadoJogador() >= 3) {
            JOptionPane.showMessageDialog(this, null, "Estado", 2, new javax.swing.ImageIcon(getClass().getResource(instance.getCaminhoFotoEstadoJogador(2))));
        } else {
            JOptionPane.showMessageDialog(rootPane, "Você não possui essa carta!");
        }
    }//GEN-LAST:event_CARTA3ActionPerformed

    private void CARTA5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CARTA5ActionPerformed
        if (instance.getNumeroDeCartasEstadoJogador() >= 6) {
            JOptionPane.showMessageDialog(this, null, "Estado", 2, new javax.swing.ImageIcon(getClass().getResource(instance.getCaminhoFotoEstadoJogador(4))));
        } else {
            JOptionPane.showMessageDialog(rootPane, "Você não possui essa carta!");
        }
    }//GEN-LAST:event_CARTA5ActionPerformed

    private void TROCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TROCARActionPerformed
        ArrayList<Integer> idscartas = verificaQtdCartasEstSelecs();
        if (idscartas.size() == 3) {
            if (instance.trocaCartasTerritorio(idscartas.get(0), idscartas.get(1), idscartas.get(2))) {
                console.append("\n Troca realizada com sucesso !");
            } else {
                console.append("Combinação de cartas "
                        + "erradas! É preciso selecionar 3 cartas com figuras "
                        + "iguais ou então 3 cartas com figuras diferentes\n");
            }
        } else {
            console.append("Você não possui cartas suficientes ou "
                    + "não selecionou 3 cartas !\n");
        }

        atualizaBotoesCartasTerritorio();
    }//GEN-LAST:event_TROCARActionPerformed

    private void OBJETIVO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OBJETIVO1ActionPerformed
        String caminho = "/view/imagens/Planos de fundo/tabeladetrocas.jpg";
        JOptionPane.showMessageDialog(this, null, "Objetivo", 2, new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Planos de fundo/tabeladetrocas.jpg")));
    }//GEN-LAST:event_OBJETIVO1ActionPerformed

    private void PARAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PARAActionPerformed
        if (botoesHabilitados[ConstantesEstados.PARA.getIdEstado()]) {
            clicouBotao(ConstantesEstados.PARA.getIdEstado(), ConstantesEstados.PARA.getNome());
        }
    }//GEN-LAST:event_PARAActionPerformed

    private void ACREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACREActionPerformed
        if (botoesHabilitados[ConstantesEstados.ACRE.getIdEstado()]) {
            clicouBotao(ConstantesEstados.ACRE.getIdEstado(), ConstantesEstados.ACRE.getNome());
        }
    }//GEN-LAST:event_ACREActionPerformed

    private void ALAGOASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALAGOASActionPerformed
        if (botoesHabilitados[ConstantesEstados.ALAGOAS.getIdEstado()]) {
            clicouBotao(ConstantesEstados.ALAGOAS.getIdEstado(), ConstantesEstados.ALAGOAS.getNome());
        }
    }//GEN-LAST:event_ALAGOASActionPerformed

    private void AMAPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AMAPAActionPerformed
        if (botoesHabilitados[ConstantesEstados.AMAPA.getIdEstado()]) {
            clicouBotao(ConstantesEstados.AMAPA.getIdEstado(), ConstantesEstados.AMAPA.getNome());
        }
    }//GEN-LAST:event_AMAPAActionPerformed

    private void AMAZONASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AMAZONASActionPerformed
        if (botoesHabilitados[ConstantesEstados.AMAZONAS.getIdEstado()]) {
            clicouBotao(ConstantesEstados.AMAZONAS.getIdEstado(), ConstantesEstados.AMAZONAS.getNome());
        }
    }//GEN-LAST:event_AMAZONASActionPerformed

    private void BAHIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAHIAActionPerformed
        if (botoesHabilitados[ConstantesEstados.BAHIA.getIdEstado()]) {
            clicouBotao(ConstantesEstados.BAHIA.getIdEstado(), ConstantesEstados.BAHIA.getNome());
        }
    }//GEN-LAST:event_BAHIAActionPerformed

    private void CEARAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CEARAActionPerformed
        if (botoesHabilitados[ConstantesEstados.CEARA.getIdEstado()]) {
            clicouBotao(ConstantesEstados.CEARA.getIdEstado(), ConstantesEstados.CEARA.getNome());
        }
    }//GEN-LAST:event_CEARAActionPerformed

    private void DFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DFActionPerformed
        if (botoesHabilitados[ConstantesEstados.DISTRITOFEDERAL.getIdEstado()]) {
            clicouBotao(ConstantesEstados.DISTRITOFEDERAL.getIdEstado(), ConstantesEstados.DISTRITOFEDERAL.getNome());
        }
    }//GEN-LAST:event_DFActionPerformed

    private void ESPIRITOSANTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ESPIRITOSANTOActionPerformed
        if (botoesHabilitados[ConstantesEstados.ESPIRITOSANTO.getIdEstado()]) {
            clicouBotao(ConstantesEstados.ESPIRITOSANTO.getIdEstado(), ConstantesEstados.ESPIRITOSANTO.getNome());
        }
    }//GEN-LAST:event_ESPIRITOSANTOActionPerformed

    private void GOIASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GOIASActionPerformed
        if (botoesHabilitados[ConstantesEstados.GOIAS.getIdEstado()]) {
            clicouBotao(ConstantesEstados.GOIAS.getIdEstado(), ConstantesEstados.GOIAS.getNome());
        }
    }//GEN-LAST:event_GOIASActionPerformed

    private void MARANHAOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MARANHAOActionPerformed
        if (botoesHabilitados[ConstantesEstados.MARANHAO.getIdEstado()]) {
            clicouBotao(ConstantesEstados.MARANHAO.getIdEstado(), ConstantesEstados.MARANHAO.getNome());
        }
    }//GEN-LAST:event_MARANHAOActionPerformed

    private void MATOGROSSOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MATOGROSSOActionPerformed
        if (botoesHabilitados[ConstantesEstados.MATOGROSSO.getIdEstado()]) {
            clicouBotao(ConstantesEstados.MATOGROSSO.getIdEstado(), ConstantesEstados.MATOGROSSO.getNome());
        }
    }//GEN-LAST:event_MATOGROSSOActionPerformed

    private void MATOGROSSODOSULActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MATOGROSSODOSULActionPerformed
        if (botoesHabilitados[ConstantesEstados.MATOGROSSODOSUL.getIdEstado()]) {
            clicouBotao(ConstantesEstados.MATOGROSSODOSUL.getIdEstado(), ConstantesEstados.MATOGROSSODOSUL.getNome());
        }
    }//GEN-LAST:event_MATOGROSSODOSULActionPerformed

    private void MINASGERAISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MINASGERAISActionPerformed
        if (botoesHabilitados[ConstantesEstados.MINASGERAIS.getIdEstado()]) {
            clicouBotao(ConstantesEstados.MINASGERAIS.getIdEstado(), ConstantesEstados.MINASGERAIS.getNome());
        }
    }//GEN-LAST:event_MINASGERAISActionPerformed

    private void PARAIBAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PARAIBAActionPerformed
        if (botoesHabilitados[ConstantesEstados.PARAIBA.getIdEstado()]) {
            clicouBotao(ConstantesEstados.PARAIBA.getIdEstado(), ConstantesEstados.PARAIBA.getNome());
        }
    }//GEN-LAST:event_PARAIBAActionPerformed

    private void PARANAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PARANAActionPerformed
        if (botoesHabilitados[ConstantesEstados.PARANA.getIdEstado()]) {
            clicouBotao(ConstantesEstados.PARANA.getIdEstado(), ConstantesEstados.PARANA.getNome());
        }
    }//GEN-LAST:event_PARANAActionPerformed

    private void PERNAMBUCOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PERNAMBUCOActionPerformed
        if (botoesHabilitados[ConstantesEstados.PERNAMBUCO.getIdEstado()]) {
            clicouBotao(ConstantesEstados.PERNAMBUCO.getIdEstado(), ConstantesEstados.PERNAMBUCO.getNome());
        }
    }//GEN-LAST:event_PERNAMBUCOActionPerformed

    private void PIAUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PIAUIActionPerformed
        if (botoesHabilitados[ConstantesEstados.PIAUI.getIdEstado()]) {
            clicouBotao(ConstantesEstados.PIAUI.getIdEstado(), ConstantesEstados.PIAUI.getNome());
        }
    }//GEN-LAST:event_PIAUIActionPerformed

    private void RIOGRANDEDONORTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RIOGRANDEDONORTEActionPerformed
        if (botoesHabilitados[ConstantesEstados.RIOGRANDEDONORTE.getIdEstado()]) {
            clicouBotao(ConstantesEstados.RIOGRANDEDONORTE.getIdEstado(), ConstantesEstados.RIOGRANDEDONORTE.getNome());
        }
    }//GEN-LAST:event_RIOGRANDEDONORTEActionPerformed

    private void RIOGRANDEDOSULActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RIOGRANDEDOSULActionPerformed
        if (botoesHabilitados[ConstantesEstados.RIOGRANDEDOSUL.getIdEstado()]) {
            clicouBotao(ConstantesEstados.RIOGRANDEDOSUL.getIdEstado(), ConstantesEstados.RIOGRANDEDOSUL.getNome());
        }
    }//GEN-LAST:event_RIOGRANDEDOSULActionPerformed

    private void RONDONIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RONDONIAActionPerformed
        if (botoesHabilitados[ConstantesEstados.RONDONIA.getIdEstado()]) {
            clicouBotao(ConstantesEstados.RONDONIA.getIdEstado(), ConstantesEstados.RONDONIA.getNome());
        }
    }//GEN-LAST:event_RONDONIAActionPerformed

    private void RORAIMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RORAIMAActionPerformed
        if (botoesHabilitados[ConstantesEstados.RORAIMA.getIdEstado()]) {
            clicouBotao(ConstantesEstados.RORAIMA.getIdEstado(), ConstantesEstados.RORAIMA.getNome());
        }
    }//GEN-LAST:event_RORAIMAActionPerformed

    private void SANTACATARINAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SANTACATARINAActionPerformed
        if (botoesHabilitados[ConstantesEstados.SANTACATARINA.getIdEstado()]) {
            clicouBotao(ConstantesEstados.SANTACATARINA.getIdEstado(), ConstantesEstados.SANTACATARINA.getNome());
        }
    }//GEN-LAST:event_SANTACATARINAActionPerformed

    private void SAOPAULOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAOPAULOActionPerformed
        if (botoesHabilitados[ConstantesEstados.SAOPAULO.getIdEstado()]) {
            clicouBotao(ConstantesEstados.SAOPAULO.getIdEstado(), ConstantesEstados.SAOPAULO.getNome());
        }
    }//GEN-LAST:event_SAOPAULOActionPerformed

    private void SERGIPEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SERGIPEActionPerformed
        if (botoesHabilitados[ConstantesEstados.SERGIPE.getIdEstado()]) {
            clicouBotao(ConstantesEstados.SERGIPE.getIdEstado(), ConstantesEstados.SERGIPE.getNome());
        }
    }//GEN-LAST:event_SERGIPEActionPerformed

    private void TOCANTINSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TOCANTINSActionPerformed
        if (botoesHabilitados[ConstantesEstados.TOCANTINS.getIdEstado()]) {
            clicouBotao(ConstantesEstados.TOCANTINS.getIdEstado(), ConstantesEstados.TOCANTINS.getNome());
        }
    }//GEN-LAST:event_TOCANTINSActionPerformed

    private void usarCarta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usarCarta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usarCarta1ActionPerformed

    private void usarCarta4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usarCarta4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usarCarta4ActionPerformed

    private void usarCarta0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usarCarta0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usarCarta0ActionPerformed

    private void usarCarta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usarCarta3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usarCarta3ActionPerformed

    private void ACREMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ACREMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_ACREMouseEntered

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ACRE;
    private javax.swing.JButton ALAGOAS;
    private javax.swing.JLabel ALOCACAO;
    private javax.swing.JButton ALOCAR;
    private javax.swing.JButton AMAPA;
    private javax.swing.JButton AMAZONAS;
    private javax.swing.JLabel ATACANTE;
    private javax.swing.JButton ATACAR;
    private javax.swing.JLabel ATAQUE;
    private javax.swing.JPanel Alocacao;
    private javax.swing.JPanel Ataque;
    private javax.swing.JButton BAHIA;
    private javax.swing.JButton CARTA1;
    private javax.swing.JButton CARTA2;
    private javax.swing.JButton CARTA3;
    private javax.swing.JButton CARTA4;
    private javax.swing.JButton CARTA5;
    private javax.swing.JLabel CARTAS;
    private javax.swing.JButton CEARA;
    private javax.swing.JPanel Cartas;
    private javax.swing.JLabel Console;
    private javax.swing.JButton DADOS;
    private javax.swing.JLabel DEFENSOR;
    private javax.swing.JButton DF;
    private javax.swing.JButton ESPIRITOSANTO;
    private javax.swing.JButton FINALIZARALOCAR;
    private javax.swing.JButton FINALIZARATAQUE;
    private javax.swing.JButton FINALIZARTURNO;
    private javax.swing.JLabel FOTODEFUNDO;
    private javax.swing.JButton GOIAS;
    private javax.swing.JLabel Jogando;
    private javax.swing.JButton MARANHAO;
    private javax.swing.JButton MATOGROSSO;
    private javax.swing.JButton MATOGROSSODOSUL;
    private javax.swing.JButton MINASGERAIS;
    private javax.swing.JLabel MOVER;
    private javax.swing.JPanel Mover;
    private javax.swing.JLabel N_EXERCITOS;
    private javax.swing.JSpinner N_EXERCITOS_SELECT;
    private javax.swing.JButton OBJETIVO;
    private javax.swing.JButton OBJETIVO1;
    private javax.swing.JButton PARA;
    private javax.swing.JButton PARAIBA;
    private javax.swing.JButton PARANA;
    private javax.swing.JButton PARARALOCACAO;
    private javax.swing.JButton PARARATAQUE;
    private javax.swing.JButton PERNAMBUCO;
    private javax.swing.JButton PIAUI;
    private javax.swing.JButton RIODEJANEIRO;
    private javax.swing.JButton RIOGRANDEDONORTE;
    private javax.swing.JButton RIOGRANDEDOSUL;
    private javax.swing.JButton RONDONIA;
    private javax.swing.JButton RORAIMA;
    private javax.swing.JButton SANTACATARINA;
    private javax.swing.JButton SAOPAULO;
    private javax.swing.JButton SERGIPE;
    private javax.swing.JButton TOCANTINS;
    private javax.swing.JLabel TOTALEXERCITOS;
    private javax.swing.JButton TROCAR;
    private javax.swing.JLabel TotalExercitos;
    private javax.swing.JLabel VALORDATROCA;
    private javax.swing.JLabel VALORTROCA;
    private javax.swing.JTextArea console;
    private javax.swing.JLabel dado1_amarelo;
    private javax.swing.JLabel dado1_vermelho;
    private javax.swing.JLabel dado2_amarelo;
    private javax.swing.JLabel dado2_vermelho;
    private javax.swing.JLabel dado3_amarelo;
    private javax.swing.JLabel dado3_vermelho;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton43;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tabelaJogadores;
    private javax.swing.JCheckBox usarCarta0;
    private javax.swing.JCheckBox usarCarta1;
    private javax.swing.JCheckBox usarCarta2;
    private javax.swing.JCheckBox usarCarta3;
    private javax.swing.JCheckBox usarCarta4;
    private javax.swing.JLabel x;
    // End of variables declaration//GEN-END:variables
}
