package meuprimeirocrud;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Eduardo
 */
public class Principal extends javax.swing.JFrame {

    public Principal() {

        initComponents();

        DefaultTableModel modelo = (DefaultTableModel) tb_cad_tabela.getModel();
        tb_cad_tabela.setRowSorter(new TableRowSorter(modelo));

        setLocationRelativeTo(null);
        c_cad_nomeAluno.setEnabled(true);
        c_cad_contrato.setEnabled(true);
        c_cad_dataNascimento.setEnabled(true);
        c_cad_plano.setEnabled(true);
        c_cad_inicioPlano.setEnabled(true);
        c_cad_fimPlano.setEnabled(true);
        c_cad_endereco.setEnabled(true);
        c_cad_numero.setEnabled(true);
        c_cad_complemento.setEnabled(true);
        c_cad_cep.setEnabled(true);
        c_cad_telefone.setEnabled(true);
        c_cad_celular.setEnabled(true);
        c_cad_email.setEnabled(true);

        btn_cad_cancelar.setEnabled(true);
        btn_cad_consultar.setEnabled(true);
        btn_cad_atualizar.setEnabled(true);
        btn_cad_excluir.setEnabled(true);
        btn_cad_salvar.setEnabled(true);

    }

    public void limpar() {

        c_cad_nomeAluno.setText("");
        c_cad_contrato.setText("");
        c_cad_dataNascimento.setText("");
        c_cad_plano.setText("");
        c_cad_inicioPlano.setText("");
        c_cad_fimPlano.setText("");
        c_cad_endereco.setText("");
        c_cad_numero.setText("");
        c_cad_complemento.setText("");
        c_cad_cep.setText("");
        c_cad_telefone.setText("");
        c_cad_celular.setText("");
        c_cad_email.setText("");

    }

    public void readTable() {

        DefaultTableModel modelo = (DefaultTableModel) tb_cad_tabela.getModel();

        modelo.setNumRows(0);

        CadastroDAO cdao = new CadastroDAO();

        for (Cadastro cad : cdao.read()) {

            modelo.addRow(new Object[]{
                cad.getContrato(),
                cad.getNome(),
                cad.getEmail(),
                cad.getEndereco(),
                cad.getComplemento(),
                cad.getCep(),
                cad.getNumero(),
                cad.getNascimento(),
                cad.getPlano(),
                cad.getInicio(),
                cad.getFim(),
                cad.getTelefone(),
                cad.getCelular()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        Cadastro = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        c_cad_contrato = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        c_cad_endereco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        c_cad_numero = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        c_cad_complemento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        c_cad_email = new javax.swing.JTextField();
        btn_cad_salvar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btn_cad_cancelar = new javax.swing.JButton();
        btn_cad_consultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_cad_tabela = new javax.swing.JTable();
        btn_cad_excluir = new javax.swing.JButton();
        btn_cad_atualizar = new javax.swing.JButton();
        c_cad_dataNascimento = new javax.swing.JFormattedTextField();
        c_cad_inicioPlano = new javax.swing.JFormattedTextField();
        c_cad_fimPlano = new javax.swing.JFormattedTextField();
        c_cad_plano = new javax.swing.JFormattedTextField();
        c_cad_telefone = new javax.swing.JFormattedTextField();
        c_cad_celular = new javax.swing.JFormattedTextField();
        c_cad_nomeAluno = new javax.swing.JFormattedTextField();
        c_cad_cep = new javax.swing.JFormattedTextField();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome do Aluno:");

        jLabel2.setText("Nº do contrato:");

        c_cad_contrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_cad_contratoActionPerformed(evt);
            }
        });

        jLabel3.setText("Data de nascimento:");

        jLabel4.setText("Endereço:");

        c_cad_endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_cad_enderecoActionPerformed(evt);
            }
        });

        jLabel5.setText("Número:");

        c_cad_numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_cad_numeroActionPerformed(evt);
            }
        });

        jLabel6.setText("Complemento:");

        c_cad_complemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_cad_complementoActionPerformed(evt);
            }
        });

        jLabel7.setText("CEP:");

        jLabel8.setText("Telefone:");

        jLabel9.setText("Celular:");

        jLabel10.setText("E-mail:");

        c_cad_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_cad_emailActionPerformed(evt);
            }
        });

        btn_cad_salvar.setText("Salvar");
        btn_cad_salvar.setMaximumSize(new java.awt.Dimension(75, 23));
        btn_cad_salvar.setMinimumSize(new java.awt.Dimension(75, 23));
        btn_cad_salvar.setPreferredSize(new java.awt.Dimension(75, 23));
        btn_cad_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cad_salvarActionPerformed(evt);
            }
        });

        jLabel12.setText("Plano:");

        jLabel13.setText("Início:");

        jLabel14.setText("Fim:");

        btn_cad_cancelar.setText("Cancelar");
        btn_cad_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cad_cancelarActionPerformed(evt);
            }
        });

        btn_cad_consultar.setText("Consultar");
        btn_cad_consultar.setMaximumSize(new java.awt.Dimension(75, 23));
        btn_cad_consultar.setMinimumSize(new java.awt.Dimension(75, 23));
        btn_cad_consultar.setPreferredSize(new java.awt.Dimension(75, 23));
        btn_cad_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cad_consultarActionPerformed(evt);
            }
        });

        tb_cad_tabela.setBorder(new javax.swing.border.MatteBorder(null));
        tb_cad_tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Contrato", "Nome", "Email", "Endereco", "Complemento", "Cep", "Numero", "Nascimento", "Plano", "inicioPlano", "fimPlano", "Telefone", "Celular"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_cad_tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_cad_tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_cad_tabela);

        btn_cad_excluir.setText("Excluir");
        btn_cad_excluir.setMaximumSize(new java.awt.Dimension(75, 23));
        btn_cad_excluir.setMinimumSize(new java.awt.Dimension(75, 23));
        btn_cad_excluir.setPreferredSize(new java.awt.Dimension(75, 23));
        btn_cad_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cad_excluirActionPerformed(evt);
            }
        });

        btn_cad_atualizar.setText("Atualizar");
        btn_cad_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cad_atualizarActionPerformed(evt);
            }
        });

        try {
            c_cad_dataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            c_cad_inicioPlano.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            c_cad_fimPlano.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            c_cad_plano.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("# mes(es)")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            c_cad_telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            c_cad_celular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        c_cad_nomeAluno.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        try {
            c_cad_cep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(btn_cad_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cad_atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cad_consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cad_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cad_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c_cad_complemento, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c_cad_cep, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c_cad_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c_cad_celular, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c_cad_email, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(c_cad_plano, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(c_cad_inicioPlano, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(c_cad_fimPlano, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(19, 19, 19)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(c_cad_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(c_cad_numero))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(c_cad_nomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(c_cad_contrato, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(c_cad_dataNascimento)))))))
                .addGap(24, 24, 24))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_cad_atualizar, btn_cad_cancelar, btn_cad_consultar, btn_cad_excluir, btn_cad_salvar});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {c_cad_dataNascimento, c_cad_fimPlano, c_cad_inicioPlano});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(c_cad_contrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(c_cad_dataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_cad_nomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel4)
                    .addComponent(c_cad_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(c_cad_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_cad_inicioPlano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_cad_fimPlano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_cad_plano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(c_cad_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_cad_complemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(c_cad_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_cad_celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_cad_cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cad_cancelar)
                    .addComponent(btn_cad_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cad_atualizar)
                    .addComponent(btn_cad_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cad_consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(315, 315, 315))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_cad_atualizar, btn_cad_cancelar, btn_cad_consultar, btn_cad_excluir, btn_cad_salvar});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {c_cad_dataNascimento, c_cad_fimPlano, c_cad_inicioPlano});

        Cadastro.addTab("Cadastro", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Cadastro)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cad_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cad_atualizarActionPerformed
        if (tb_cad_tabela.getSelectedRow() != -1) {

            Cadastro c = new Cadastro();
            CadastroDAO dao = new CadastroDAO();

            c.setNome(c_cad_nomeAluno.getText());
            c.setEmail(c_cad_email.getText());
            c.setEndereco(c_cad_endereco.getText());
            c.setComplemento(c_cad_complemento.getText());
            c.setCep(c_cad_cep.getText());
            c.setNumero(Integer.parseInt(c_cad_numero.getText()));
            c.setContrato(Integer.parseInt(c_cad_contrato.getText()));
            c.setNascimento(c_cad_dataNascimento.getText());
            c.setPlano(c_cad_plano.getText());
            c.setInicio(c_cad_inicioPlano.getText());
            c.setFim(c_cad_fimPlano.getText());
            c.setTelefone(c_cad_telefone.getText());
            c.setCelular(c_cad_celular.getText());
            c.setContrato((int) tb_cad_tabela.getValueAt(tb_cad_tabela.getSelectedRow(), 0));

            dao.update(c);
            limpar();

        } else {

            JOptionPane.showMessageDialog(null, "Selecione uma linha para atualizar.");
        }
    }//GEN-LAST:event_btn_cad_atualizarActionPerformed

    private void btn_cad_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cad_excluirActionPerformed
        if (tb_cad_tabela.getSelectedRow() != -1) {

            Cadastro c = new Cadastro();

            CadastroDAO dao = new CadastroDAO();

            c.setContrato((int) tb_cad_tabela.getValueAt(tb_cad_tabela.getSelectedRow(), 0));

            dao.delete(c);

            readTable();
            limpar();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha para excluir.");
        }
    }//GEN-LAST:event_btn_cad_excluirActionPerformed

    private void tb_cad_tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_cad_tabelaMouseClicked
        if (tb_cad_tabela.getSelectedRow() != -1) {

            c_cad_nomeAluno.setText(tb_cad_tabela.getValueAt(tb_cad_tabela.getSelectedRow(), 1).toString());
            c_cad_email.setText(tb_cad_tabela.getValueAt(tb_cad_tabela.getSelectedRow(), 2).toString());
            c_cad_endereco.setText(tb_cad_tabela.getValueAt(tb_cad_tabela.getSelectedRow(), 3).toString());
            c_cad_complemento.setText(tb_cad_tabela.getValueAt(tb_cad_tabela.getSelectedRow(), 4).toString());
            c_cad_cep.setText(tb_cad_tabela.getValueAt(tb_cad_tabela.getSelectedRow(), 5).toString());
            c_cad_numero.setText(tb_cad_tabela.getValueAt(tb_cad_tabela.getSelectedRow(), 6).toString());
            c_cad_contrato.setText(tb_cad_tabela.getValueAt(tb_cad_tabela.getSelectedRow(), 7).toString());
            c_cad_dataNascimento.setText(tb_cad_tabela.getValueAt(tb_cad_tabela.getSelectedRow(), 8).toString());
            c_cad_plano.setText(tb_cad_tabela.getValueAt(tb_cad_tabela.getSelectedRow(), 9).toString());
            c_cad_inicioPlano.setText(tb_cad_tabela.getValueAt(tb_cad_tabela.getSelectedRow(), 10).toString());
            c_cad_fimPlano.setText(tb_cad_tabela.getValueAt(tb_cad_tabela.getSelectedRow(), 11).toString());
            c_cad_telefone.setText(tb_cad_tabela.getValueAt(tb_cad_tabela.getSelectedRow(), 12).toString());
            c_cad_celular.setText(tb_cad_tabela.getValueAt(tb_cad_tabela.getSelectedRow(), 13).toString());

        } else {

            JOptionPane.showMessageDialog(null, "Selecione uma linha.");
        }
    }//GEN-LAST:event_tb_cad_tabelaMouseClicked

    private void btn_cad_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cad_consultarActionPerformed
        if (c_cad_contrato.getText() != null) {

            Cadastro c = new Cadastro();
            CadastroDAO dao = new CadastroDAO();

            c.setContrato(Integer.parseInt(c_cad_contrato.getText()));

            dao.consulta(c);

            DefaultTableModel modelo = (DefaultTableModel) tb_cad_tabela.getModel();

            modelo.setNumRows(0);

            CadastroDAO cdao = new CadastroDAO();

            for (Cadastro cad : cdao.consulta(c)) {

                modelo.addRow(new Object[]{
                    cad.getContrato(),
                    cad.getNome(),
                    cad.getEmail(),
                    cad.getEndereco(),
                    cad.getComplemento(),
                    cad.getCep(),
                    cad.getNumero(),
                    cad.getNascimento(),
                    cad.getPlano(),
                    cad.getInicio(),
                    cad.getFim(),
                    cad.getTelefone(),
                    cad.getCelular()
                });
            }
            limpar();
        } else {
            JOptionPane.showMessageDialog(null, "Digite o número do contrato para consultar.");
        }

    }//GEN-LAST:event_btn_cad_consultarActionPerformed

    private void btn_cad_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cad_cancelarActionPerformed
        Principal.this.dispose();
    }//GEN-LAST:event_btn_cad_cancelarActionPerformed

    private void btn_cad_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cad_salvarActionPerformed

        Cadastro c = new Cadastro();
        CadastroDAO dao = new CadastroDAO();

        c.setContrato(Integer.parseInt(c_cad_contrato.getText()));
        c.setNome(c_cad_nomeAluno.getText());
        c.setEmail(c_cad_email.getText());
        c.setEndereco(c_cad_endereco.getText());
        c.setComplemento(c_cad_complemento.getText());
        c.setCep(c_cad_cep.getText());
        c.setNumero(Integer.parseInt(c_cad_numero.getText()));
        c.setNascimento(c_cad_dataNascimento.getText());
        c.setPlano(c_cad_plano.getText());
        c.setInicio(c_cad_inicioPlano.getText());
        c.setFim(c_cad_fimPlano.getText());
        c.setTelefone(c_cad_telefone.getText());
        c.setCelular(c_cad_celular.getText());

        dao.create(c);

        limpar();

        readTable();
    }//GEN-LAST:event_btn_cad_salvarActionPerformed

    private void c_cad_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_cad_emailActionPerformed

    }//GEN-LAST:event_c_cad_emailActionPerformed

    private void c_cad_complementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_cad_complementoActionPerformed

    }//GEN-LAST:event_c_cad_complementoActionPerformed

    private void c_cad_numeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_cad_numeroActionPerformed

    }//GEN-LAST:event_c_cad_numeroActionPerformed

    private void c_cad_enderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_cad_enderecoActionPerformed

    }//GEN-LAST:event_c_cad_enderecoActionPerformed

    private void c_cad_contratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_cad_contratoActionPerformed

    }//GEN-LAST:event_c_cad_contratoActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Cadastro;
    private javax.swing.JButton btn_cad_atualizar;
    private javax.swing.JButton btn_cad_cancelar;
    private javax.swing.JButton btn_cad_consultar;
    private javax.swing.JButton btn_cad_excluir;
    private javax.swing.JButton btn_cad_salvar;
    private javax.swing.JFormattedTextField c_cad_celular;
    private javax.swing.JFormattedTextField c_cad_cep;
    private javax.swing.JTextField c_cad_complemento;
    private javax.swing.JTextField c_cad_contrato;
    private javax.swing.JFormattedTextField c_cad_dataNascimento;
    private javax.swing.JTextField c_cad_email;
    private javax.swing.JTextField c_cad_endereco;
    private javax.swing.JFormattedTextField c_cad_fimPlano;
    private javax.swing.JFormattedTextField c_cad_inicioPlano;
    private javax.swing.JFormattedTextField c_cad_nomeAluno;
    private javax.swing.JTextField c_cad_numero;
    private javax.swing.JFormattedTextField c_cad_plano;
    private javax.swing.JFormattedTextField c_cad_telefone;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_cad_tabela;
    // End of variables declaration//GEN-END:variables

}
