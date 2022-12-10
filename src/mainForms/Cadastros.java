package mainForms;

import models.Corretora;
import javax.swing.JOptionPane;

public class Cadastros extends javax.swing.JFrame {

    Corretora corretora = new Corretora();
        
    public Cadastros() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneCadastros = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCorretora = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabelNomeCorretora = new javax.swing.JLabel();
        jLabelTelefoneCorretora = new javax.swing.JLabel();
        jLabelContatoCorretora = new javax.swing.JLabel();
        jTextFieldNomeCorretora = new javax.swing.JTextField();
        jTextFieldTelefoneCorretora = new javax.swing.JTextField();
        jTextFieldContatoCorretora = new javax.swing.JTextField();
        jButtonSalvarCorretora = new javax.swing.JButton();
        jButtonCancelarCorretora = new javax.swing.JButton();
        jButtonNovoCorretora = new javax.swing.JButton();
        jButtonEditarCorretora = new javax.swing.JButton();
        jButtonExcluirCorretora = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableMotorista = new javax.swing.JTable();
        jButtonNovoMotorista = new javax.swing.JButton();
        jButtonEditarMotorista = new javax.swing.JButton();
        jButtonExcluirMotorista = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabelNomeMotorista = new javax.swing.JLabel();
        jLabelTelefoneMotorista = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButtonSalvarMotorista = new javax.swing.JButton();
        jButtonCancelarMotorista = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableSeguradora = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabelNomeSeguradora = new javax.swing.JLabel();
        jLabelTelefoneSeguradora = new javax.swing.JLabel();
        jTextFieldNomeSeguradora = new javax.swing.JTextField();
        jTextFieldTelefoneSeguradora = new javax.swing.JTextField();
        jButtonSalvarSeguradora = new javax.swing.JButton();
        jButtonCancelarSeguradora = new javax.swing.JButton();
        jButtonNovoSeguradora = new javax.swing.JButton();
        jButtonEditarSeguradora = new javax.swing.JButton();
        jButtonExcluirSeguradora = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableVeiculo = new javax.swing.JTable();
        jButtonNovoVeiculo = new javax.swing.JButton();
        jButtonEditarVeiculo = new javax.swing.JButton();
        jButtonExcluirVeiculo = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButtonSalvarVeiculo = new javax.swing.JButton();
        jButtonCancelarVeiculo = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableSeguro = new javax.swing.JTable();
        jButtonNovoSeguro = new javax.swing.JButton();
        jButtonEditarSeguro = new javax.swing.JButton();
        jButtonExcluirSeguro = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabelCoberturaSeguro = new javax.swing.JLabel();
        jLabelValorSeguro = new javax.swing.JLabel();
        jLabelFranquiaSeguro = new javax.swing.JLabel();
        jLabelVencimentoSeguro = new javax.swing.JLabel();
        jTextFieldCoberturaSeguro = new javax.swing.JTextField();
        jTextFieldValorSeguro = new javax.swing.JTextField();
        jTextFieldFranquiaSeguro = new javax.swing.JTextField();
        jTextFieldVencimentoSeguro = new javax.swing.JTextField();
        jButtonSalvarSeguro = new javax.swing.JButton();
        jButtonCancelarSeguro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableCorretora.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Telefone", "Contato"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableCorretora);

        jPanel6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));

        jLabelNomeCorretora.setText("Nome:");

        jLabelTelefoneCorretora.setText("Telefone:");

        jLabelContatoCorretora.setText("Contato:");

        jButtonSalvarCorretora.setText("Salvar");
        jButtonSalvarCorretora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarCorretoraActionPerformed(evt);
            }
        });

        jButtonCancelarCorretora.setText("Cancelar");
        jButtonCancelarCorretora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarCorretoraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabelTelefoneCorretora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldTelefoneCorretora, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelContatoCorretora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldContatoCorretora, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabelNomeCorretora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldNomeCorretora, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jButtonSalvarCorretora, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCancelarCorretora, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeCorretora)
                    .addComponent(jTextFieldNomeCorretora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefoneCorretora)
                    .addComponent(jLabelContatoCorretora)
                    .addComponent(jTextFieldTelefoneCorretora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldContatoCorretora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvarCorretora)
                    .addComponent(jButtonCancelarCorretora))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jButtonNovoCorretora.setText("Novo");
        jButtonNovoCorretora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoCorretoraActionPerformed(evt);
            }
        });

        jButtonEditarCorretora.setText("Editar");
        jButtonEditarCorretora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarCorretoraActionPerformed(evt);
            }
        });

        jButtonExcluirCorretora.setText("Excluir");
        jButtonExcluirCorretora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirCorretoraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jButtonNovoCorretora, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157)
                .addComponent(jButtonEditarCorretora, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonExcluirCorretora, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovoCorretora)
                    .addComponent(jButtonEditarCorretora)
                    .addComponent(jButtonExcluirCorretora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPaneCadastros.addTab("Corretora", jPanel1);

        jTableMotorista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Nome", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableMotorista);

        jButtonNovoMotorista.setText("Novo");
        jButtonNovoMotorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoMotoristaActionPerformed(evt);
            }
        });

        jButtonEditarMotorista.setText("Editar");
        jButtonEditarMotorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarMotoristaActionPerformed(evt);
            }
        });

        jButtonExcluirMotorista.setText("Excluir");
        jButtonExcluirMotorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirMotoristaActionPerformed(evt);
            }
        });

        jPanel7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));

        jLabelNomeMotorista.setText("Nome:");

        jLabelTelefoneMotorista.setText("Telefone:");

        jButtonSalvarMotorista.setText("Salvar");
        jButtonSalvarMotorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarMotoristaActionPerformed(evt);
            }
        });

        jButtonCancelarMotorista.setText("Cancelar");
        jButtonCancelarMotorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarMotoristaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabelNomeMotorista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabelTelefoneMotorista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jButtonSalvarMotorista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCancelarMotorista)
                .addGap(155, 155, 155))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeMotorista)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefoneMotorista)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvarMotorista)
                    .addComponent(jButtonCancelarMotorista))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jButtonNovoMotorista)
                .addGap(180, 180, 180)
                .addComponent(jButtonEditarMotorista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonExcluirMotorista)
                .addGap(70, 70, 70))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovoMotorista)
                    .addComponent(jButtonEditarMotorista)
                    .addComponent(jButtonExcluirMotorista))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPaneCadastros.addTab("Motorita", jPanel2);

        jTableSeguradora.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Nome", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTableSeguradora);

        jPanel8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));

        jLabelNomeSeguradora.setText("Nome:");

        jLabelTelefoneSeguradora.setText("Telefone:");

        jButtonSalvarSeguradora.setText("Salvar");
        jButtonSalvarSeguradora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarSeguradoraActionPerformed(evt);
            }
        });

        jButtonCancelarSeguradora.setText("Cancelar");
        jButtonCancelarSeguradora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarSeguradoraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabelNomeSeguradora)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldNomeSeguradora, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabelTelefoneSeguradora)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldTelefoneSeguradora, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jButtonSalvarSeguradora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCancelarSeguradora)
                .addGap(163, 163, 163))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeSeguradora)
                    .addComponent(jTextFieldNomeSeguradora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefoneSeguradora)
                    .addComponent(jTextFieldTelefoneSeguradora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvarSeguradora)
                    .addComponent(jButtonCancelarSeguradora))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jButtonNovoSeguradora.setText("Novo");
        jButtonNovoSeguradora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoSeguradoraActionPerformed(evt);
            }
        });

        jButtonEditarSeguradora.setText("Editar");
        jButtonEditarSeguradora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarSeguradoraActionPerformed(evt);
            }
        });

        jButtonExcluirSeguradora.setText("Excluir");
        jButtonExcluirSeguradora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirSeguradoraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jButtonNovoSeguradora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonEditarSeguradora)
                .addGap(175, 175, 175)
                .addComponent(jButtonExcluirSeguradora)
                .addGap(84, 84, 84))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovoSeguradora)
                    .addComponent(jButtonEditarSeguradora)
                    .addComponent(jButtonExcluirSeguradora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPaneCadastros.addTab("Seguradora", jPanel3);

        jTableVeiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Marca", "Modelo", "Placa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTableVeiculo);

        jButtonNovoVeiculo.setText("Novo");
        jButtonNovoVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoVeiculoActionPerformed(evt);
            }
        });

        jButtonEditarVeiculo.setText("Editar");
        jButtonEditarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarVeiculoActionPerformed(evt);
            }
        });

        jButtonExcluirVeiculo.setText("Excluir");
        jButtonExcluirVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirVeiculoActionPerformed(evt);
            }
        });

        jPanel9.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));

        jLabel1.setText("Marca:");

        jLabel2.setText("Modelo:");

        jLabel3.setText("Placa:");

        jButtonSalvarVeiculo.setText("Salvar");
        jButtonSalvarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarVeiculoActionPerformed(evt);
            }
        });

        jButtonCancelarVeiculo.setText("Cancelar");
        jButtonCancelarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarVeiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jButtonSalvarVeiculo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCancelarVeiculo)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvarVeiculo)
                    .addComponent(jButtonCancelarVeiculo))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jButtonNovoVeiculo)
                .addGap(148, 148, 148)
                .addComponent(jButtonEditarVeiculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonExcluirVeiculo)
                .addGap(75, 75, 75))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovoVeiculo)
                    .addComponent(jButtonEditarVeiculo)
                    .addComponent(jButtonExcluirVeiculo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPaneCadastros.addTab("Veíclo", jPanel4);

        jTableSeguro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Cobertura", "Valor", "Franquia", "Vencimento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTableSeguro);

        jButtonNovoSeguro.setText("Novo");
        jButtonNovoSeguro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoSeguroActionPerformed(evt);
            }
        });

        jButtonEditarSeguro.setText("Editar");
        jButtonEditarSeguro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarSeguroActionPerformed(evt);
            }
        });

        jButtonExcluirSeguro.setText("Cancelar");
        jButtonExcluirSeguro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirSeguroActionPerformed(evt);
            }
        });

        jPanel10.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));

        jLabelCoberturaSeguro.setText("Cobertura:");

        jLabelValorSeguro.setText("Valor:");

        jLabelFranquiaSeguro.setText("Franquia:");

        jLabelVencimentoSeguro.setText("Vencimento:");

        jButtonSalvarSeguro.setText("Salvar");
        jButtonSalvarSeguro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarSeguroActionPerformed(evt);
            }
        });

        jButtonCancelarSeguro.setText("Cancelar");
        jButtonCancelarSeguro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarSeguroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelFranquiaSeguro)
                    .addComponent(jLabelCoberturaSeguro))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldCoberturaSeguro)
                    .addComponent(jTextFieldFranquiaSeguro, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabelVencimentoSeguro)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldVencimentoSeguro))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabelValorSeguro)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldValorSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jButtonSalvarSeguro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCancelarSeguro)
                .addGap(179, 179, 179))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCoberturaSeguro)
                    .addComponent(jLabelValorSeguro)
                    .addComponent(jTextFieldCoberturaSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldValorSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFranquiaSeguro)
                    .addComponent(jLabelVencimentoSeguro)
                    .addComponent(jTextFieldFranquiaSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldVencimentoSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvarSeguro)
                    .addComponent(jButtonCancelarSeguro))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jButtonNovoSeguro)
                .addGap(143, 143, 143)
                .addComponent(jButtonEditarSeguro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                .addComponent(jButtonExcluirSeguro)
                .addGap(87, 87, 87))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovoSeguro)
                    .addComponent(jButtonEditarSeguro)
                    .addComponent(jButtonExcluirSeguro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPaneCadastros.addTab("Seguro", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneCadastros)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneCadastros)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(708, 412));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoCorretoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoCorretoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNovoCorretoraActionPerformed

    private void jButtonEditarCorretoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarCorretoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEditarCorretoraActionPerformed

    private void jButtonExcluirCorretoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirCorretoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonExcluirCorretoraActionPerformed

    private void jButtonSalvarCorretoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarCorretoraActionPerformed
        salvarDados();
    }//GEN-LAST:event_jButtonSalvarCorretoraActionPerformed
    
    private void salvarDados(){
    if(validarDados()){
            JOptionPane.showMessageDialog(null,"Preencha todos os campos!");
        }else{
            try{
                corretora.setNome(jTextFieldNomeCorretora.getText());
                corretora.setTelefone(jTextFieldTelefoneCorretora.getText());
                corretora.setContato(jTextFieldContatoCorretora.getText());
                
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Erro ao salvar os dados! " + e.toString());
            }
}
    }
       
    private boolean validarDados() {
        return (jTextFieldNomeCorretora.getText().equals("")
                || jTextFieldTelefoneCorretora.getText().equals("")
                || jTextFieldContatoCorretora.getText().equals(""));
                }
    private void jButtonCancelarCorretoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarCorretoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelarCorretoraActionPerformed

    private void jButtonNovoMotoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoMotoristaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNovoMotoristaActionPerformed

    private void jButtonEditarMotoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarMotoristaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEditarMotoristaActionPerformed

    private void jButtonExcluirMotoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirMotoristaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonExcluirMotoristaActionPerformed

    private void jButtonSalvarMotoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarMotoristaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalvarMotoristaActionPerformed

    private void jButtonCancelarMotoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarMotoristaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelarMotoristaActionPerformed

    private void jButtonNovoSeguradoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoSeguradoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNovoSeguradoraActionPerformed

    private void jButtonEditarSeguradoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarSeguradoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEditarSeguradoraActionPerformed

    private void jButtonExcluirSeguradoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirSeguradoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonExcluirSeguradoraActionPerformed

    private void jButtonSalvarSeguradoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarSeguradoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalvarSeguradoraActionPerformed

    private void jButtonCancelarSeguradoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarSeguradoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelarSeguradoraActionPerformed

    private void jButtonNovoVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoVeiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNovoVeiculoActionPerformed

    private void jButtonEditarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarVeiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEditarVeiculoActionPerformed

    private void jButtonExcluirVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirVeiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonExcluirVeiculoActionPerformed

    private void jButtonSalvarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarVeiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalvarVeiculoActionPerformed

    private void jButtonCancelarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarVeiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelarVeiculoActionPerformed

    private void jButtonNovoSeguroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoSeguroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNovoSeguroActionPerformed

    private void jButtonEditarSeguroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarSeguroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEditarSeguroActionPerformed

    private void jButtonExcluirSeguroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirSeguroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonExcluirSeguroActionPerformed

    private void jButtonSalvarSeguroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarSeguroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalvarSeguroActionPerformed

    private void jButtonCancelarSeguroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarSeguroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelarSeguroActionPerformed


    public static void main(String args[]) {
    
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelarCorretora;
    private javax.swing.JButton jButtonCancelarMotorista;
    private javax.swing.JButton jButtonCancelarSeguradora;
    private javax.swing.JButton jButtonCancelarSeguro;
    private javax.swing.JButton jButtonCancelarVeiculo;
    private javax.swing.JButton jButtonEditarCorretora;
    private javax.swing.JButton jButtonEditarMotorista;
    private javax.swing.JButton jButtonEditarSeguradora;
    private javax.swing.JButton jButtonEditarSeguro;
    private javax.swing.JButton jButtonEditarVeiculo;
    private javax.swing.JButton jButtonExcluirCorretora;
    private javax.swing.JButton jButtonExcluirMotorista;
    private javax.swing.JButton jButtonExcluirSeguradora;
    private javax.swing.JButton jButtonExcluirSeguro;
    private javax.swing.JButton jButtonExcluirVeiculo;
    private javax.swing.JButton jButtonNovoCorretora;
    private javax.swing.JButton jButtonNovoMotorista;
    private javax.swing.JButton jButtonNovoSeguradora;
    private javax.swing.JButton jButtonNovoSeguro;
    private javax.swing.JButton jButtonNovoVeiculo;
    private javax.swing.JButton jButtonSalvarCorretora;
    private javax.swing.JButton jButtonSalvarMotorista;
    private javax.swing.JButton jButtonSalvarSeguradora;
    private javax.swing.JButton jButtonSalvarSeguro;
    private javax.swing.JButton jButtonSalvarVeiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelCoberturaSeguro;
    private javax.swing.JLabel jLabelContatoCorretora;
    private javax.swing.JLabel jLabelFranquiaSeguro;
    private javax.swing.JLabel jLabelNomeCorretora;
    private javax.swing.JLabel jLabelNomeMotorista;
    private javax.swing.JLabel jLabelNomeSeguradora;
    private javax.swing.JLabel jLabelTelefoneCorretora;
    private javax.swing.JLabel jLabelTelefoneMotorista;
    private javax.swing.JLabel jLabelTelefoneSeguradora;
    private javax.swing.JLabel jLabelValorSeguro;
    private javax.swing.JLabel jLabelVencimentoSeguro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPaneCadastros;
    private javax.swing.JTable jTableCorretora;
    private javax.swing.JTable jTableMotorista;
    private javax.swing.JTable jTableSeguradora;
    private javax.swing.JTable jTableSeguro;
    private javax.swing.JTable jTableVeiculo;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextFieldCoberturaSeguro;
    private javax.swing.JTextField jTextFieldContatoCorretora;
    private javax.swing.JTextField jTextFieldFranquiaSeguro;
    private javax.swing.JTextField jTextFieldNomeCorretora;
    private javax.swing.JTextField jTextFieldNomeSeguradora;
    private javax.swing.JTextField jTextFieldTelefoneCorretora;
    private javax.swing.JTextField jTextFieldTelefoneSeguradora;
    private javax.swing.JTextField jTextFieldValorSeguro;
    private javax.swing.JTextField jTextFieldVencimentoSeguro;
    // End of variables declaration//GEN-END:variables
}
