package eduardo_lopes_projeto_final;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Eduardo
 */
public class View extends javax.swing.JFrame {

    static int nro_portas;
    static int cont = 0;
    static String tipoVeiculo;
    static String veicLoc;

    public View() {
        initComponents();
        setLocationRelativeTo(null);
        limpar_btn_aplicar();
    }

    public Veiculo InstanciaVeiculo(Veiculo veic) {
        if (veic.getClass() == Passeio.class) {
            Veiculo passeio = new Passeio(placa.getText().toUpperCase(), Integer.parseInt(ano.getText()), marca.getText().toUpperCase(), modelo.getText().toUpperCase(),
                    Long.parseLong(km_rodado.getText()), cx_luxo.isSelected(), nro_portas, Integer.parseInt(potencia.getText()));
            veic = passeio;
        } else if (veic.getClass() == Caminhao.class) {
            Veiculo caminhao = new Caminhao(placa.getText().toUpperCase(), Integer.parseInt(ano.getText()), marca.getText().toUpperCase(), modelo.getText().toUpperCase(),
                    Long.parseLong(km_rodado.getText()), Integer.parseInt(nro_eixos.getText()), Long.parseLong(carga_maxima.getText()),
                    Caminhao.TipoCaminhao.valueOf(cb_tipo_caminhao.getSelectedItem().toString()));
            veic = caminhao;
        } else if (veic.getClass() == Moto.class) {
            Veiculo moto = new Moto(placa.getText().toUpperCase(), Integer.parseInt(ano.getText()), marca.getText().toUpperCase(), modelo.getText().toUpperCase(),
                    Long.parseLong(km_rodado.getText()), Moto.Estilo.valueOf(cb_estilo_moto.getSelectedItem().toString()), Integer.parseInt(potencia.getText()));
            veic = moto;
        }
        return veic;
    }

    public void habilita_carro() {
        marca.setEnabled(true);
        modelo.setEnabled(true);
        placa.setEnabled(true);
        potencia.setEnabled(true);
        km_rodado.setEnabled(true);
        ano.setEnabled(true);
        nro_portas_2.setEnabled(true);
        nro_portas_4.setEnabled(true);
        cx_luxo.setEnabled(true);
        subMenu_carroPasseio.setSelected(true);
        /*--------------------------------------*/
        valor_diaria.setEnabled(false);
        valor_fixo.setEnabled(false);
        dias.setEnabled(false);
        data_locacao.setEnabled(false);
        nome.setEnabled(false);
        carga_maxima.setEnabled(false);
        nro_eixos.setEnabled(false);
        km_rodado_atual.setEnabled(false);
        cb_tipo_caminhao.setEnabled(false);
        cb_estilo_moto.setEnabled(false);
        menu_consultaPlaca.setSelected(false);
        menu_consultarDisponiveis.setSelected(false);
        menu_consultarLocados.setSelected(false);
        menu_devolverVeiculo.setSelected(false);
        menu_informarValor.setSelected(false);
        menu_locarVeiculo.setSelected(false);
        menu_sair.setSelected(false);
        menu_simularDevolucao.setSelected(false);
        menu_venderVeiculo.setSelected(false);
        subMenu_caminhao.setSelected(false);
        subMenu_moto.setSelected(false);
    }

    public void habilita_moto() {
        marca.setEnabled(true);
        modelo.setEnabled(true);
        placa.setEnabled(true);
        potencia.setEnabled(true);
        km_rodado.setEnabled(true);
        ano.setEnabled(true);
        cb_estilo_moto.setEnabled(true);
        subMenu_moto.setSelected(true);
        /*----------------------------------------*/
        nro_portas_2.setEnabled(false);
        nro_portas_4.setEnabled(false);
        cx_luxo.setEnabled(false);
        valor_diaria.setEnabled(false);
        valor_fixo.setEnabled(false);
        dias.setEnabled(false);
        data_locacao.setEnabled(false);
        nome.setEnabled(false);
        carga_maxima.setEnabled(false);
        nro_eixos.setEnabled(false);
        km_rodado_atual.setEnabled(false);
        cb_tipo_caminhao.setEnabled(false);
        menu_consultaPlaca.setSelected(false);
        menu_consultarDisponiveis.setSelected(false);
        menu_consultarLocados.setSelected(false);
        menu_devolverVeiculo.setSelected(false);
        menu_informarValor.setSelected(false);
        menu_locarVeiculo.setSelected(false);
        menu_sair.setSelected(false);
        menu_simularDevolucao.setSelected(false);
        menu_venderVeiculo.setSelected(false);
        subMenu_caminhao.setSelected(false);
        subMenu_carroPasseio.setSelected(false);
    }

    public void habilita_caminhao() {
        marca.setEnabled(true);
        modelo.setEnabled(true);
        placa.setEnabled(true);
        km_rodado.setEnabled(true);
        ano.setEnabled(true);
        nro_eixos.setEnabled(true);
        cb_tipo_caminhao.setEnabled(true);
        carga_maxima.setEnabled(true);
        subMenu_caminhao.setSelected(true);
        /*-----------------------------------------*/
        potencia.setEnabled(false);
        cb_estilo_moto.setEnabled(false);
        nro_portas_2.setEnabled(false);
        nro_portas_4.setEnabled(false);
        cx_luxo.setEnabled(false);
        valor_diaria.setEnabled(false);
        valor_fixo.setEnabled(false);
        dias.setEnabled(false);
        data_locacao.setEnabled(false);
        nome.setEnabled(false);
        km_rodado_atual.setEnabled(false);
        menu_consultaPlaca.setSelected(false);
        menu_consultarDisponiveis.setSelected(false);
        menu_consultarLocados.setSelected(false);
        menu_devolverVeiculo.setSelected(false);
        menu_informarValor.setSelected(false);
        menu_locarVeiculo.setSelected(false);
        menu_sair.setSelected(false);
        menu_simularDevolucao.setSelected(false);
        menu_venderVeiculo.setSelected(false);
        subMenu_carroPasseio.setSelected(false);
        subMenu_moto.setSelected(false);
    }

    public void limpar_btn_aplicar() {
        valor_diaria.setText("");
        valor_diaria.setEnabled(false);
        valor_fixo.setText("");
        valor_fixo.setEnabled(false);
        dias.setText("");
        dias.setEnabled(false);
        data_locacao.setText("");
        data_locacao.setEnabled(false);
        nome.setText("");
        nome.setEnabled(false);
        marca.setText("");
        marca.setEnabled(false);
        modelo.setText("");
        modelo.setEnabled(false);
        placa.setText("");
        placa.setEnabled(false);
        potencia.setText("");
        potencia.setEnabled(false);
        carga_maxima.setText("");
        carga_maxima.setEnabled(false);
        nro_eixos.setText("");
        nro_eixos.setEnabled(false);
        km_rodado.setText("");
        km_rodado.setEnabled(false);
        km_rodado_atual.setText("");
        km_rodado_atual.setEnabled(false);
        ano.setText("");
        ano.setEnabled(false);
        total_a_pagar.setText("");
        total_a_pagar.setEnabled(false);
        nro_portas_2.setSelected(false);
        nro_portas_2.setEnabled(false);
        nro_portas_4.setSelected(false);
        nro_portas_4.setEnabled(false);
        cx_luxo.setSelected(false);
        cx_luxo.setEnabled(false);
        cb_tipo_caminhao.setSelectedItem("<Selecione>");
        cb_tipo_caminhao.setEnabled(false);
        cb_estilo_moto.setSelectedItem("<Selecione>");
        cb_estilo_moto.setEnabled(false);
        menu_compraVeiculo.setSelected(false);
        menu_consultaPlaca.setSelected(false);
        menu_consultarDisponiveis.setSelected(false);
        menu_consultarLocados.setSelected(false);
        menu_devolverVeiculo.setSelected(false);
        menu_informarValor.setSelected(false);
        menu_locarVeiculo.setSelected(false);
        menu_sair.setSelected(false);
        menu_simularDevolucao.setSelected(false);
        menu_venderVeiculo.setSelected(false);
        subMenu_caminhao.setSelected(false);
        subMenu_carroPasseio.setSelected(false);
        subMenu_moto.setSelected(false);
        subMenu_sair.setSelected(false);
        btn_aplicar.setSelected(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entityManager1 = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory(null).createEntityManager();
        entityManager2 = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory(null).createEntityManager();
        query1 = java.beans.Beans.isDesignTime() ? null : ((javax.persistence.EntityManager)null).createQuery("");
        valor_fixo = new javax.swing.JFormattedTextField();
        dias = new javax.swing.JFormattedTextField();
        valor_diaria = new javax.swing.JFormattedTextField();
        data_locacao = new javax.swing.JFormattedTextField();
        nome = new javax.swing.JFormattedTextField();
        marca = new javax.swing.JFormattedTextField();
        modelo = new javax.swing.JTextField();
        nro_portas_2 = new javax.swing.JRadioButton();
        nro_portas_4 = new javax.swing.JRadioButton();
        cx_luxo = new javax.swing.JCheckBox();
        placa = new javax.swing.JFormattedTextField();
        potencia = new javax.swing.JFormattedTextField();
        carga_maxima = new javax.swing.JFormattedTextField();
        nro_eixos = new javax.swing.JFormattedTextField();
        km_rodado = new javax.swing.JFormattedTextField();
        km_rodado_atual = new javax.swing.JFormattedTextField();
        ano = new javax.swing.JFormattedTextField();
        cb_tipo_caminhao = new javax.swing.JComboBox();
        cb_estilo_moto = new javax.swing.JComboBox();
        total_a_pagar = new javax.swing.JFormattedTextField();
        btn_aplicar = new javax.swing.JToggleButton();
        labelPlaca = new javax.swing.JLabel();
        labelAno = new javax.swing.JLabel();
        labelMarca = new javax.swing.JLabel();
        labelModelo = new javax.swing.JLabel();
        labelKmRodado = new javax.swing.JLabel();
        labelLuxo = new javax.swing.JLabel();
        labelNroPortas = new javax.swing.JLabel();
        labelPotencia = new javax.swing.JLabel();
        labelEstiloMoto = new javax.swing.JLabel();
        labelNroEixos = new javax.swing.JLabel();
        labelTipoCaminhao = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        labelValorFixo = new javax.swing.JLabel();
        labelCargaMaxima = new javax.swing.JLabel();
        labelKg = new javax.swing.JLabel();
        guias = new javax.swing.JTabbedPane();
        painel_tab1 = new javax.swing.JScrollPane();
        tab_veic_disp = new javax.swing.JTable();
        painel_tab2 = new javax.swing.JScrollPane();
        tab_veic_loc = new javax.swing.JTable();
        detalhes_veic = new javax.swing.JScrollPane();
        area_detalhes_veic = new javax.swing.JTextArea();
        labelDiasDiaria = new javax.swing.JLabel();
        labelDataLocacao = new javax.swing.JLabel();
        labelKmRodadoAtual = new javax.swing.JLabel();
        jLabelTotalAPagar = new javax.swing.JLabel();
        labelBarra = new javax.swing.JLabel();
        barra_de_menus = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        menu_informarValor = new javax.swing.JMenuItem();
        menu_compraVeiculo = new javax.swing.JMenu();
        subMenu_carroPasseio = new javax.swing.JMenuItem();
        subMenu_caminhao = new javax.swing.JMenuItem();
        subMenu_moto = new javax.swing.JMenuItem();
        subMenu_sair = new javax.swing.JMenuItem();
        menu_venderVeiculo = new javax.swing.JMenuItem();
        menu_locarVeiculo = new javax.swing.JMenuItem();
        menu_devolverVeiculo = new javax.swing.JMenuItem();
        menu_exportarDados = new javax.swing.JMenuItem();
        menu_importarDados = new javax.swing.JMenuItem();
        menu_simularDevolucao = new javax.swing.JMenuItem();
        menu_consultarDisponiveis = new javax.swing.JMenuItem();
        menu_consultarLocados = new javax.swing.JMenuItem();
        menu_consultaPlaca = new javax.swing.JMenuItem();
        menu_sair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DADOS DO VEÍCULO");

        valor_fixo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        dias.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        valor_diaria.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        data_locacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        nome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nomeKeyTyped(evt);
            }
        });

        nro_portas_2.setText("2");
        nro_portas_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nro_portas_2ActionPerformed(evt);
            }
        });

        nro_portas_4.setText("4");
        nro_portas_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nro_portas_4ActionPerformed(evt);
            }
        });

        try {
            placa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("UUU####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        potencia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        potencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                potenciaKeyTyped(evt);
            }
        });

        carga_maxima.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        carga_maxima.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                carga_maximaKeyTyped(evt);
            }
        });

        nro_eixos.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        nro_eixos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nro_eixosKeyTyped(evt);
            }
        });

        km_rodado.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        km_rodado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                km_rodadoKeyTyped(evt);
            }
        });

        km_rodado_atual.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        try {
            ano.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        cb_tipo_caminhao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Selecione>", "CarretaBau", "CavaloTruckado", "BiTrem", " " }));

        cb_estilo_moto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Selecione>", "Basica", "Esportiva", "Custom" }));

        total_a_pagar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        btn_aplicar.setText("Aplicar");
        btn_aplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aplicarActionPerformed(evt);
            }
        });

        labelPlaca.setText("Placa:");

        labelAno.setText("Ano:");

        labelMarca.setText("Marca:");

        labelModelo.setText("Modelo:");

        labelKmRodado.setText("Km rodado / Atual:");

        labelLuxo.setText("Carro de luxo:");

        labelNroPortas.setText("Nº de portas:");

        labelPotencia.setText("Potência:");

        labelEstiloMoto.setText("Estilo da moto:");

        labelNroEixos.setText("Nº de eixos:");

        labelTipoCaminhao.setText("Tipo de caminhão:");

        labelTitulo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(0, 51, 255));
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("DADOS DO VEÍCULO");

        labelNome.setText("Nome:");

        labelValorFixo.setText("Valor Fixo:");

        labelCargaMaxima.setText("Carga máxima:");

        labelKg.setText("Kg");

        tab_veic_disp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Placa", "TP", "Modelo", "Marca", "Km Rodado", "Ano"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tab_veic_disp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab_veic_dispMouseClicked(evt);
            }
        });
        painel_tab1.setViewportView(tab_veic_disp);

        guias.addTab("Veículos Disponíveis", painel_tab1);

        tab_veic_loc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Data", "Nome", "Placa", "Modelo", "Marca", "Km Rodado", "Ano"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tab_veic_loc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab_veic_locMouseClicked(evt);
            }
        });
        painel_tab2.setViewportView(tab_veic_loc);

        guias.addTab("Veículos Locados", painel_tab2);

        area_detalhes_veic.setColumns(20);
        area_detalhes_veic.setRows(5);
        area_detalhes_veic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                area_detalhes_veicMouseClicked(evt);
            }
        });
        detalhes_veic.setViewportView(area_detalhes_veic);

        guias.addTab("Detalhes do veículo", detalhes_veic);

        labelDiasDiaria.setText("Dias / Valor diária:");

        labelDataLocacao.setText("Data / hora da locação:");

        labelKmRodadoAtual.setText("/");

        jLabelTotalAPagar.setText("Total a pagar:");

        labelBarra.setText("/");

        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Menu azul reduzido.png"))); // NOI18N
        menu.setText("Menu");

        menu_informarValor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Informar Valor reduzido.png"))); // NOI18N
        menu_informarValor.setText("Informar valor fixo");
        menu_informarValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_informarValorActionPerformed(evt);
            }
        });
        menu.add(menu_informarValor);

        menu_compraVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Comprar reduzido.png"))); // NOI18N
        menu_compraVeiculo.setText("Comprar Veículo");

        subMenu_carroPasseio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Carro reduzido.png"))); // NOI18N
        subMenu_carroPasseio.setText("Carro de Passeio");
        subMenu_carroPasseio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenu_carroPasseioActionPerformed(evt);
            }
        });
        menu_compraVeiculo.add(subMenu_carroPasseio);

        subMenu_caminhao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Caminhao reduzido.png"))); // NOI18N
        subMenu_caminhao.setText("Caminhão");
        subMenu_caminhao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenu_caminhaoActionPerformed(evt);
            }
        });
        menu_compraVeiculo.add(subMenu_caminhao);

        subMenu_moto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Moto reduzido.png"))); // NOI18N
        subMenu_moto.setText("Moto");
        subMenu_moto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenu_motoActionPerformed(evt);
            }
        });
        menu_compraVeiculo.add(subMenu_moto);

        subMenu_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Sair reduzido.png"))); // NOI18N
        subMenu_sair.setText("Sair");
        subMenu_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenu_sairActionPerformed(evt);
            }
        });
        menu_compraVeiculo.add(subMenu_sair);

        menu.add(menu_compraVeiculo);

        menu_venderVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Vender reduzido.png"))); // NOI18N
        menu_venderVeiculo.setText("Vender veículo");
        menu_venderVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_venderVeiculoActionPerformed(evt);
            }
        });
        menu.add(menu_venderVeiculo);

        menu_locarVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Alugar reduzido.png"))); // NOI18N
        menu_locarVeiculo.setText("Locar veículo");
        menu_locarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_locarVeiculoActionPerformed(evt);
            }
        });
        menu.add(menu_locarVeiculo);

        menu_devolverVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Devolver veículo reduzido.png"))); // NOI18N
        menu_devolverVeiculo.setText("Devolver veículo");
        menu_devolverVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_devolverVeiculoActionPerformed(evt);
            }
        });
        menu.add(menu_devolverVeiculo);

        menu_exportarDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Exportar reduzido.png"))); // NOI18N
        menu_exportarDados.setText("Exportar dados");
        menu.add(menu_exportarDados);

        menu_importarDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Importar reduzido.png"))); // NOI18N
        menu_importarDados.setText("Importar dados");
        menu.add(menu_importarDados);

        menu_simularDevolucao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Simular dev reduzido.png"))); // NOI18N
        menu_simularDevolucao.setText("Simular devolução");
        menu_simularDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_simularDevolucaoActionPerformed(evt);
            }
        });
        menu.add(menu_simularDevolucao);

        menu_consultarDisponiveis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Consultar reduzido.png"))); // NOI18N
        menu_consultarDisponiveis.setText("Consultar veículos disponíveis para locação");
        menu_consultarDisponiveis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_consultarDisponiveisActionPerformed(evt);
            }
        });
        menu.add(menu_consultarDisponiveis);

        menu_consultarLocados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Consultar reduzido.png"))); // NOI18N
        menu_consultarLocados.setText("Consulta veículos locados");
        menu_consultarLocados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_consultarLocadosActionPerformed(evt);
            }
        });
        menu.add(menu_consultarLocados);

        menu_consultaPlaca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Consultar reduzido.png"))); // NOI18N
        menu_consultaPlaca.setText("Consulta veículo por placa");
        menu_consultaPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_consultaPlacaActionPerformed(evt);
            }
        });
        menu.add(menu_consultaPlaca);

        menu_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Sair reduzido.png"))); // NOI18N
        menu_sair.setText("Sair");
        menu_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_sairActionPerformed(evt);
            }
        });
        menu.add(menu_sair);

        barra_de_menus.add(menu);

        setJMenuBar(barra_de_menus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(guias)
                    .addComponent(labelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelMarca, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelDiasDiaria, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelModelo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelLuxo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelNroPortas, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelNome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelValorFixo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelDataLocacao, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(nro_portas_2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nro_portas_4))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cx_luxo)
                                    .addGap(49, 49, 49)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(dias, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(labelBarra)
                                    .addGap(2, 2, 2)
                                    .addComponent(valor_diaria))
                                .addComponent(data_locacao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(valor_fixo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelKmRodado, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelPotencia, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelEstiloMoto, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelNroEixos, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelTipoCaminhao, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelCargaMaxima, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelPlaca, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelAno, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(placa, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(potencia, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carga_maxima, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nro_eixos, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(km_rodado, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_tipo_caminhao, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_estilo_moto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(labelKmRodadoAtual)
                                .addGap(4, 4, 4)
                                .addComponent(km_rodado_atual, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelKg))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(btn_aplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabelTotalAPagar)
                        .addGap(4, 4, 4)
                        .addComponent(total_a_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPlaca))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(potencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPotencia))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(labelCargaMaxima))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(carga_maxima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelKg))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(labelNroEixos))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(nro_eixos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(labelKmRodado))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(km_rodado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(labelKmRodadoAtual))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(km_rodado_atual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(labelAno))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(labelTipoCaminhao))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(cb_tipo_caminhao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(labelEstiloMoto))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(cb_estilo_moto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelValorFixo)
                            .addComponent(valor_fixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDiasDiaria)
                            .addComponent(dias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valor_diaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelBarra))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDataLocacao)
                            .addComponent(data_locacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNome)
                            .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelMarca)
                            .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelModelo)
                            .addComponent(modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNroPortas)
                            .addComponent(nro_portas_4)
                            .addComponent(nro_portas_2))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelLuxo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cx_luxo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_aplicar)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabelTotalAPagar))
                    .addComponent(total_a_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(guias, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subMenu_carroPasseioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenu_carroPasseioActionPerformed
        tipoVeiculo = "P";
        habilita_carro();
        labelTitulo.setText("COMPRA DE CARRO DE PASSEIO");
    }//GEN-LAST:event_subMenu_carroPasseioActionPerformed

    private void subMenu_caminhaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenu_caminhaoActionPerformed
        tipoVeiculo = "C";
        habilita_caminhao();
        labelTitulo.setText("COMPRA DE CAMINHÃO");
    }//GEN-LAST:event_subMenu_caminhaoActionPerformed

    private void subMenu_motoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenu_motoActionPerformed
        tipoVeiculo = "M";
        habilita_moto();
        labelTitulo.setText("COMPRA DE MOTO");
    }//GEN-LAST:event_subMenu_motoActionPerformed

    private void subMenu_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenu_sairActionPerformed
        dispose();
    }//GEN-LAST:event_subMenu_sairActionPerformed

    private void menu_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_sairActionPerformed
        dispose();
    }//GEN-LAST:event_menu_sairActionPerformed

    private void menu_consultarDisponiveisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_consultarDisponiveisActionPerformed
        menu_consultarDisponiveis.setSelected(true);
        menu_compraVeiculo.setSelected(false);
        menu_consultaPlaca.setSelected(false);
        menu_consultarLocados.setSelected(false);
        menu_devolverVeiculo.setSelected(false);
        menu_informarValor.setSelected(false);
        menu_locarVeiculo.setSelected(false);
        menu_sair.setSelected(false);
        menu_simularDevolucao.setSelected(false);
        menu_venderVeiculo.setSelected(false);
        subMenu_caminhao.setSelected(false);
        subMenu_carroPasseio.setSelected(false);
        subMenu_moto.setSelected(false);
        subMenu_sair.setSelected(false);
        btn_aplicar.setSelected(false);

        labelTitulo.setText("CONSULTA DE VEÍCULOS DISPONÍVEIS PARA LOCAÇÃO");
    }//GEN-LAST:event_menu_consultarDisponiveisActionPerformed

    private void menu_consultarLocadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_consultarLocadosActionPerformed
        menu_consultarLocados.setSelected(true);
        menu_compraVeiculo.setSelected(false);
        menu_consultaPlaca.setSelected(false);
        menu_consultarDisponiveis.setSelected(false);
        menu_devolverVeiculo.setSelected(false);
        menu_informarValor.setSelected(false);
        menu_locarVeiculo.setSelected(false);
        menu_sair.setSelected(false);
        menu_simularDevolucao.setSelected(false);
        menu_venderVeiculo.setSelected(false);
        subMenu_caminhao.setSelected(false);
        subMenu_carroPasseio.setSelected(false);
        subMenu_moto.setSelected(false);
        subMenu_sair.setSelected(false);        

        labelTitulo.setText("CONSULTA DE VEÍCULOS LOCADOS");
    }//GEN-LAST:event_menu_consultarLocadosActionPerformed

    private void menu_consultaPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_consultaPlacaActionPerformed
        menu_consultaPlaca.setSelected(true);
        menu_compraVeiculo.setSelected(false);
        menu_consultarDisponiveis.setSelected(false);
        menu_consultarLocados.setSelected(false);
        menu_devolverVeiculo.setSelected(false);
        menu_informarValor.setSelected(false);
        menu_locarVeiculo.setSelected(false);
        menu_sair.setSelected(false);
        menu_simularDevolucao.setSelected(false);
        menu_venderVeiculo.setSelected(false);
        subMenu_caminhao.setSelected(false);
        subMenu_carroPasseio.setSelected(false);
        subMenu_moto.setSelected(false);
        subMenu_sair.setSelected(false);        
        placa.setEnabled(true);

        labelTitulo.setText("CONSULTA VEÍCULO POR PLACA");
    }//GEN-LAST:event_menu_consultaPlacaActionPerformed

    private void menu_informarValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_informarValorActionPerformed
        menu_informarValor.setSelected(true);
        menu_compraVeiculo.setSelected(false);
        menu_consultaPlaca.setSelected(false);
        menu_consultarDisponiveis.setSelected(true);
        menu_consultarLocados.setSelected(false);
        menu_devolverVeiculo.setSelected(false);
        menu_locarVeiculo.setSelected(false);
        menu_sair.setSelected(false);
        menu_simularDevolucao.setSelected(false);
        menu_venderVeiculo.setSelected(false);
        subMenu_caminhao.setSelected(false);
        subMenu_carroPasseio.setSelected(false);
        subMenu_moto.setSelected(false);
        subMenu_sair.setSelected(false);
        btn_aplicar.setSelected(false);        
        valor_fixo.setEnabled(true);

        labelTitulo.setText("INFORME O VALOR FIXO");
    }//GEN-LAST:event_menu_informarValorActionPerformed

    private void btn_aplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aplicarActionPerformed
        cont = 0;
        Locadora loc = new Locadora();

        if (menu_venderVeiculo.isSelected()) { //MENU VENDER VEÍCULO            
            loc.Importar("LL");

            if (loc.Vender(placa.getText()) == true) {
                JOptionPane.showMessageDialog(null, "Venda concluída");
            } else {
                JOptionPane.showMessageDialog(null, "Não é possível vender");
            }
            loc.VeiculosDisponiveis().clear();
            loc.getVeiculosLocados().clear();
        }

        if (menu_simularDevolucao.isSelected()) { //MENU SIMULAR DEVOLUÇÃO

            Veiculo.valor_padrao = Double.parseDouble(valor_fixo.getText());

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            LocalDateTime ldt_locacao = LocalDateTime.parse(data_locacao.getText(), formatter).truncatedTo((ChronoUnit.SECONDS));

            loc.Importar("LL");
            for (Locacao locacao : loc.getVeiculosLocados()) {
                if (placa.getText().equals(locacao.getVeiculolocado().getPlaca())) {
                    double valor_simulado = 0;
                    Locacao l = new Locacao(InstanciaVeiculo(locacao.getVeiculolocado()), nome.getText(), ldt_locacao);

                    valor_simulado = l.CalcularValor(Integer.parseInt(dias.getText()));
                    total_a_pagar.setText(String.format("R$%,2.2f", valor_simulado));
                }
            }
            loc.VeiculosDisponiveis().clear();
            loc.getVeiculosLocados().clear();
        }

        if (menu_devolverVeiculo.isSelected() && !valor_fixo.getText().equals("")) { //MENU DEVOLVER VEÍCULO            
            if (tab_veic_loc.isShowing() == false) {
                JOptionPane.showMessageDialog(null, "Selecione a 'Aba' de Veículos locados");
            }
            Veiculo.valor_padrao = Double.parseDouble(valor_fixo.getText());

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            LocalDateTime ldt_locacao = LocalDateTime.parse(data_locacao.getText(), formatter).truncatedTo((ChronoUnit.SECONDS));
            LocalDateTime ldt_devolucao = LocalDateTime.now().truncatedTo((ChronoUnit.SECONDS));

            long diferenca = ChronoUnit.DAYS.between(ldt_devolucao, ldt_locacao);

            loc.Importar("LL");
            for (Locacao locacao : loc.getVeiculosLocados()) {
                if (placa.getText().equals(locacao.getVeiculolocado().getPlaca())) {
                    double valorTotal = 0;
                    Locacao l = new Locacao(InstanciaVeiculo(locacao.getVeiculolocado()), nome.getText(), ldt_locacao);
                    valorTotal = l.Devolver((int) diferenca, Long.parseLong(km_rodado_atual.getText()));

                    if (valorTotal == 0) {
                        total_a_pagar.setText(String.format("R$%,2.2f", locacao.getVlrDiaria()));
                    } else {
                        total_a_pagar.setText(String.format("R$%,2.2f", valorTotal));
                    }
                }
            }
            loc.VeiculosDisponiveis().clear();
            loc.getVeiculosLocados().clear();
            loc.getVeiculoIndisponivel().clear();
            loc.Importar("LL");
            loc.Exportar(); //Limpa

            for (int i = 0; i < loc.getVeiculoIndisponivel().size(); i++) {
                Veiculo v = loc.getVeiculoIndisponivel().get(i);
                String verificaPlaca = v.getPlaca().replaceAll("LP", "").replaceAll("LM", "").replaceAll("LC", "");
                if (verificaPlaca.equals(placa.getText())) {
                    loc.getVeiculoIndisponivel().remove(v);                    
                }
            }
            for (Veiculo veic : loc.VeiculosDisponiveis()) {
                veic.Exportar();
            }
            for (Veiculo veic : loc.getVeiculoIndisponivel()) {
                loc.ExportaLocado(veic);
            }
            for (int i = 0; i < loc.getVeiculosLocados().size(); i++) {
                Locacao locacao = loc.getVeiculosLocados().get(i);
                if (locacao.getVeiculolocado().getPlaca().replaceAll("LL", "").equals(placa.getText())) {
                    loc.getVeiculosLocados().remove(locacao);
                } else {
                    locacao.getVeiculolocado().Exportar();
                }
            }
            loc.VeiculosDisponiveis().clear();
            loc.getVeiculosLocados().clear();
            loc.getVeiculoIndisponivel().clear();
        }

        if (menu_consultaPlaca.isSelected()) { //MENU CONSULTA POR PLACA
            loc.Importar("LL");
            ((DefaultTableModel) tab_veic_disp.getModel()).setRowCount(0);
            ((DefaultTableModel) tab_veic_loc.getModel()).setRowCount(0);
            area_detalhes_veic.setText("");
            guias.setEnabled(true);
            area_detalhes_veic.setEnabled(true);

            if (area_detalhes_veic.isShowing() == false) {
                JOptionPane.showMessageDialog(null, "Selecione a 'Aba' Detalhes do veículo");
            }
            if (loc.ConsultarVeiculo(placa.getText().toUpperCase()) != null) {
                area_detalhes_veic.setText(loc.ConsultarVeiculo(placa.getText()).toString());
            } else {
                JOptionPane.showMessageDialog(null, "Veículo não encontrado");
            }
            loc.getVeiculosLocados().clear();
            loc.VeiculosDisponiveis().clear();
        }
        if (menu_consultarLocados.isSelected()) { //MENU CONSULTAR VEÍCULOS LOCADOS
            ((DefaultTableModel) tab_veic_disp.getModel()).setRowCount(0);
            ((DefaultTableModel) tab_veic_loc.getModel()).setRowCount(0);
            area_detalhes_veic.setText("");
            menu_consultarDisponiveis.setSelected(false);

            if (tab_veic_loc.isShowing() == false) {
                JOptionPane.showMessageDialog(null, "Selecione a 'Aba' de Veículos locados");
            }
            loc.Importar("LL");

            DefaultTableModel model = (DefaultTableModel) tab_veic_loc.getModel();
            tab_veic_loc.setRowSorter(new TableRowSorter(model));

            for (Locacao veic : loc.getVeiculosLocados()) {

                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                String dataForm = veic.getDatalocacao().format(formato);

                model.setNumRows(cont);
                model.addRow(new Object[]{dataForm, veic.getNome(), veic.getVeiculolocado().getPlaca(), veic.getVeiculolocado().getModelo(), veic.getVeiculolocado().getMarca(),
                    veic.getVeiculolocado().getKmrodado(), veic.getVeiculolocado().getAno()});
                cont += 1;
            }
            if (cont == 0) {
                JOptionPane.showMessageDialog(null, "Não há veículos locados");
            }
            loc.getVeiculosLocados().clear();
            loc.getVeiculosLocados().clear();
        }
        if (menu_consultarDisponiveis.isSelected()) { //MENU CONSULTAR VEÍCULOS DISPONÍVEIS
            ((DefaultTableModel) tab_veic_disp.getModel()).setRowCount(0);
            ((DefaultTableModel) tab_veic_loc.getModel()).setRowCount(0);
            area_detalhes_veic.setText("");

            if (tab_veic_disp.isShowing() == false) {
                JOptionPane.showMessageDialog(null, "Selecione a 'Aba' de Veículos disponíveis");
            }
            cont = 0;
            loc.VeiculosDisponiveis().clear();

            loc.Importar("V");

            DefaultTableModel modelo = (DefaultTableModel) tab_veic_disp.getModel();
            tab_veic_disp.setRowSorter(new TableRowSorter(modelo));

            for (Veiculo veic : loc.VeiculosDisponiveis()) { //Adiciono os objetos da lista à tabela e atribuo os valores da linha ao vetor do objeto correspondente 

                if (veic.getClass() == Passeio.class) {
                    modelo.setNumRows(cont);
                    modelo.addRow(new Object[]{veic.getPlaca(), "P", veic.getModelo(), veic.getMarca(), veic.getKmrodado(), veic.getAno()});
                    cont += 1;
                } else if (veic.getClass() == Caminhao.class) {
                    modelo.setNumRows(cont);
                    modelo.addRow(new Object[]{veic.getPlaca(), "C", veic.getModelo(), veic.getMarca(), veic.getKmrodado(), veic.getAno()});
                    cont += 1;
                } else if (veic.getClass() == Moto.class) {
                    modelo.setNumRows(cont);
                    modelo.addRow(new Object[]{veic.getPlaca(), "M", veic.getModelo(), veic.getMarca(), veic.getKmrodado(), veic.getAno()});
                    cont += 1;
                }
            }
            if (cont == 0) {
                JOptionPane.showMessageDialog(null, "Não há veículos disponíveis");
            }
            loc.getVeiculosLocados().clear();
            loc.getVeiculosLocados().clear();
        }
        if (menu_locarVeiculo.isSelected()) { //MENU LOCAR VEÍCULO
            ((DefaultTableModel) tab_veic_loc.getModel()).setRowCount(0);
            area_detalhes_veic.setText("");

            Veiculo.valor_padrao = Double.parseDouble(valor_fixo.getText().replaceAll(",", "."));
            loc.VeiculosDisponiveis().clear();
            loc.getVeiculosLocados().clear();

            loc.Importar("LL"); //CARREGA AS LISTAS DE VEICULOS
            if (nro_portas_2.isSelected()) {
                nro_portas = 2;
            } else {
                nro_portas = 4;
            }

            for (int i = 0; i < loc.VeiculosDisponiveis().size(); i++) {
                Veiculo automovel = loc.VeiculosDisponiveis().get(i);

                if (placa.getText().equals(automovel.getPlaca())) {
                    LocalDateTime ldt = LocalDateTime.now();
                    Locacao locacao = new Locacao(InstanciaVeiculo(automovel), nome.getText().toUpperCase(), ldt.truncatedTo((ChronoUnit.SECONDS)));

                    loc.getVeiculoIndisponivel().add(automovel);
                    loc.getVeiculosLocados().add(locacao);
                    loc.VeiculosDisponiveis().remove(automovel);
                }

            }
            loc.Exportar(); //Exporta arquivo vazio, substituindo o antigo.                

            for (Veiculo v : loc.getVeiculoIndisponivel()) {
                loc.ExportaLocado(v);
            }
            for (Veiculo v : loc.VeiculosDisponiveis()) {
                v.Exportar();
            }
            for (Locacao loca : loc.getVeiculosLocados()) {//EXPORTA OS VEÍCULOS LOCADOS NO FORMATO DATETIME, NOME ETC... PARA O TXT.
                loca.Exportar();
            }
            ((DefaultTableModel) tab_veic_disp.getModel()).setRowCount(0);
            loc.getVeiculosLocados().clear();
            loc.getVeiculosLocados().clear();
        }
        if (subMenu_moto.isSelected()) { //MENU DE COMPRAR VEÍCULO MOTO
            labelTitulo.setText("COMPRAR MOTO");
            loc.Importar("LL");

            if (cb_estilo_moto.getSelectedItem().equals("<Selecione>") || cb_estilo_moto.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog(null, "Selecione uma opção de moto!");

            } else if (!placa.getText().equals("") && !ano.getText().equals("") && !marca.getText().equals("") && !modelo.getText().equals("")
                    && !km_rodado.getText().equals("") && !potencia.getText().equals("")) {

                Veiculo moto = new Moto(placa.getText().toUpperCase(), Integer.parseInt(ano.getText()), marca.getText().toUpperCase(), modelo.getText().toUpperCase(),
                        Long.parseLong(km_rodado.getText()), Moto.Estilo.valueOf(cb_estilo_moto.getSelectedItem().toString()), Integer.parseInt(potencia.getText()));

                DefaultTableModel modelo = (DefaultTableModel) tab_veic_disp.getModel();
                tab_veic_disp.setRowSorter(new TableRowSorter(modelo));
                modelo.setNumRows(cont);
                modelo.addRow(new Object[]{placa.getText().toUpperCase(), "M", this.modelo.getText().toUpperCase(), marca.getText().toUpperCase(), km_rodado.getText(), ano.getText()});
                cont += 1;
                if (loc.CompraVeiculo(moto) == true) {
                    moto.Exportar();
                } else {
                    JOptionPane.showMessageDialog(null, "Este veículo está na frota");
                }
                area_detalhes_veic.setText(moto.toString());
            } else {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            }
            subMenu_moto.setSelected(false);
            loc.getVeiculosLocados().clear();
            loc.VeiculosDisponiveis().clear();
            labelTitulo.setText("ESCOLHA UM OPÇÃO NO MENU");
        }
        if (subMenu_caminhao.isSelected()) { //MENU DE COMPRAR VEÍCULO CAMINHÃO
            labelTitulo.setText("COMPRAR CAMINHÃO");
            loc.Importar("LL");

            if (cb_tipo_caminhao.getSelectedItem().equals("<Selecione>") || cb_tipo_caminhao.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog(null, "Selecione uma opção de caminhão!");

            } else if (!placa.getText().equals("") && !ano.getText().equals("") && !marca.getText().equals("") && !modelo.getText().equals("")
                    && !km_rodado.getText().equals("") && !nro_eixos.getText().equals("") && !carga_maxima.getText().equals("")) {

                Veiculo caminhao = new Caminhao(placa.getText().toUpperCase(), Integer.parseInt(ano.getText()), marca.getText().toUpperCase(), modelo.getText().toUpperCase(),
                        Long.parseLong(km_rodado.getText()), Integer.parseInt(nro_eixos.getText()), Long.parseLong(carga_maxima.getText()),
                        Caminhao.TipoCaminhao.valueOf(cb_tipo_caminhao.getSelectedItem().toString()));
                DefaultTableModel modelo = (DefaultTableModel) tab_veic_disp.getModel();
                tab_veic_disp.setRowSorter(new TableRowSorter(modelo));
                modelo.setNumRows(cont);
                modelo.addRow(new Object[]{placa.getText().toUpperCase(), "C", this.modelo.getText().toUpperCase(), marca.getText().toUpperCase(), km_rodado.getText(), ano.getText()});
                cont += 1;
                if (loc.CompraVeiculo(caminhao) == true) {
                    caminhao.Exportar();
                } else {
                    JOptionPane.showMessageDialog(null, "Este veículo está na frota");
                }
                area_detalhes_veic.setText(caminhao.toString());
            } else {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            }
            subMenu_caminhao.setSelected(false);
            loc.getVeiculosLocados().clear();
            loc.VeiculosDisponiveis().clear();
            labelTitulo.setText("ESCOLHA UM OPÇÃO NO MENU");
        }
        if (subMenu_carroPasseio.isSelected()) { //MENU DE COMPRAR VEÍCULO DE PASSEIO
            labelTitulo.setText("COMPRAR CARRO");
            loc.Importar("LL");

            if (!placa.getText().equals("") && !ano.getText().equals("") && !marca.getText().equals("") && !modelo.getText().equals("")
                    && !km_rodado.getText().equals("") && (nro_portas_2.isSelected() || nro_portas_4.isSelected()) && !potencia.getText().equals("")) {

                Veiculo passeio = new Passeio(placa.getText().toUpperCase(), Integer.parseInt(ano.getText()), marca.getText().toUpperCase(), modelo.getText().toUpperCase(),
                        Long.parseLong(km_rodado.getText()), cx_luxo.isSelected(), nro_portas, Integer.parseInt(potencia.getText()));
                DefaultTableModel modelo = (DefaultTableModel) tab_veic_disp.getModel();
                tab_veic_disp.setRowSorter(new TableRowSorter(modelo));
                modelo.setNumRows(cont);
                modelo.addRow(new Object[]{placa.getText().toUpperCase(), "P", this.modelo.getText().toUpperCase(), marca.getText().toUpperCase(), km_rodado.getText(), ano.getText()});
                cont += 1;
                if (loc.CompraVeiculo(passeio) == true) {
                    passeio.Exportar();
                } else {
                    JOptionPane.showMessageDialog(null, "Este veículo está na frota");
                }
                area_detalhes_veic.setText(passeio.toString());
            } else {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            }
            subMenu_carroPasseio.setSelected(false);
            loc.getVeiculosLocados().clear();
            loc.VeiculosDisponiveis().clear();
            labelTitulo.setText("ESCOLHA UM OPÇÃO NO MENU");
        }
        limpar_btn_aplicar();

    }//GEN-LAST:event_btn_aplicarActionPerformed

    private void menu_locarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_locarVeiculoActionPerformed
        if (((DefaultTableModel) tab_veic_disp.getModel()).getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Pesquise veículos disponíveis");
            limpar_btn_aplicar();
        } else {
            valor_fixo.setEnabled(true);
            nome.setEnabled(true);
            menu_locarVeiculo.setSelected(true);
            labelTitulo.setText("LOCAR VEÍCULO");
        }
    }//GEN-LAST:event_menu_locarVeiculoActionPerformed

    private void tab_veic_dispMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_veic_dispMouseClicked
        limpar_btn_aplicar();
        if (tab_veic_disp.getSelectedRow() != -1) {

            placa.setText(tab_veic_disp.getValueAt(tab_veic_disp.getSelectedRow(), 0).toString());
            modelo.setText(tab_veic_disp.getValueAt(tab_veic_disp.getSelectedRow(), 2).toString());
            marca.setText(tab_veic_disp.getValueAt(tab_veic_disp.getSelectedRow(), 3).toString());
            km_rodado.setText(tab_veic_disp.getValueAt(tab_veic_disp.getSelectedRow(), 4).toString());
            ano.setText(tab_veic_disp.getValueAt(tab_veic_disp.getSelectedRow(), 5).toString());

            Locadora loc = new Locadora();
            loc.VeiculosDisponiveis().clear();

            try {
                loc.Importar("V");
            } catch (Exception e) {
                System.out.println("ERRO no import (V) 'MouseClicked' !" + e);
            }
            for (Veiculo veic : loc.VeiculosDisponiveis()) {
                String infosVeic = veic.toString();
                String[] v = infosVeic.replaceAll(" ", "").split(":|\n");
                if (tab_veic_disp.getValueAt(tab_veic_disp.getSelectedRow(), 0).toString().equals(veic.getPlaca())) {
                    area_detalhes_veic.setText(veic.toString());

                    if (veic.getClass() == Passeio.class) {
                        cx_luxo.setSelected(Boolean.parseBoolean(v[13]));
                        potencia.setText(v[17]);
                        if (Integer.parseInt(v[15]) == 2) {
                            nro_portas_2.setSelected(true);
                        } else {
                            nro_portas_4.setSelected(true);
                        }
                    } else if (veic.getClass() == Caminhao.class) {
                        nro_eixos.setText(v[17]);
                        carga_maxima.setText(v[15]);
                        cb_tipo_caminhao.setSelectedItem(v[13]);
                    } else if (veic.getClass() == Moto.class) {

                        cb_estilo_moto.setSelectedItem(v[13]);
                        potencia.setText(v[15]);
                    }
                }
            }
        }
        if (menu_locarVeiculo.isSelected() == false && menu_devolverVeiculo.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "Selecione Locar ou Vender no Menu");

        } else {
            labelTitulo.setText("LOCAR VEÍCULO");
        }
    }//GEN-LAST:event_tab_veic_dispMouseClicked

    private void nro_portas_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nro_portas_2ActionPerformed
        nro_portas_2.setSelected(true);
        nro_portas_4.setSelected(false);
        nro_portas = 2;
    }//GEN-LAST:event_nro_portas_2ActionPerformed

    private void nro_portas_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nro_portas_4ActionPerformed
        nro_portas_4.setSelected(true);
        nro_portas_2.setSelected(false);
        nro_portas = 4;
    }//GEN-LAST:event_nro_portas_4ActionPerformed

    private void km_rodadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_km_rodadoKeyTyped
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_km_rodadoKeyTyped

    private void potenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_potenciaKeyTyped
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_potenciaKeyTyped

    private void carga_maximaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_carga_maximaKeyTyped
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_carga_maximaKeyTyped

    private void nro_eixosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nro_eixosKeyTyped
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_nro_eixosKeyTyped

    private void nomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeKeyTyped
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz´~^ç` ";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_nomeKeyTyped

    private void tab_veic_locMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_veic_locMouseClicked
        tab_veic_loc.isShowing();
        limpar_btn_aplicar();
        if (tab_veic_loc.getSelectedRow() != -1) {

            data_locacao.setText(tab_veic_loc.getValueAt(tab_veic_loc.getSelectedRow(), 0).toString());
            nome.setText(tab_veic_loc.getValueAt(tab_veic_loc.getSelectedRow(), 1).toString());
            placa.setText(tab_veic_loc.getValueAt(tab_veic_loc.getSelectedRow(), 2).toString());
            modelo.setText(tab_veic_loc.getValueAt(tab_veic_loc.getSelectedRow(), 3).toString());
            marca.setText(tab_veic_loc.getValueAt(tab_veic_loc.getSelectedRow(), 4).toString());
            km_rodado.setText(tab_veic_loc.getValueAt(tab_veic_loc.getSelectedRow(), 5).toString());
            ano.setText(tab_veic_loc.getValueAt(tab_veic_loc.getSelectedRow(), 6).toString());

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            LocalDateTime ldt_locacao = LocalDateTime.parse(data_locacao.getText(), formatter).truncatedTo((ChronoUnit.SECONDS));
            LocalDateTime ldt_devolucao = LocalDateTime.now().truncatedTo((ChronoUnit.SECONDS));

            long diferenca = ChronoUnit.DAYS.between(ldt_devolucao, ldt_locacao);
            dias.setText(String.valueOf(diferenca));

            Locadora loc = new Locadora();
            loc.VeiculosDisponiveis().clear();
            loc.getVeiculosLocados().clear();
            loc.Importar("LL");

            for (Locacao veic : loc.getVeiculosLocados()) {
                String infosVeic = veic.getVeiculolocado().toString();
                String[] v = infosVeic.replaceAll(" ", "").split(":|\n");
                if (tab_veic_loc.getValueAt(tab_veic_loc.getSelectedRow(), 2).toString().equals(veic.getVeiculolocado().getPlaca())) {
                    area_detalhes_veic.setText(veic.getVeiculolocado().toString());

                    valor_diaria.setText(String.format("R$%,2.2f", veic.getVlrDiaria()));

                    if (veic.getVeiculolocado().getClass() == Passeio.class) { // valor_fixo = vlrDiaria / (potência / nro_portas); 
                        cx_luxo.setSelected(Boolean.parseBoolean(v[13]));
                        potencia.setText(v[17]);
                        double calc_valor_fixo = veic.getVlrDiaria() / (Double.parseDouble(v[17]) / Double.parseDouble(v[15]));
                        valor_fixo.setText(String.valueOf(calc_valor_fixo));
                        if (Integer.parseInt(v[15]) == 2) {
                            nro_portas_2.setSelected(true);
                            nro_portas = 2;
                        } else {
                            nro_portas_4.setSelected(true);
                            nro_portas = 4;
                        }
                    } else if (veic.getVeiculolocado().getClass() == Caminhao.class) { // valor_fixo = vlrDiaria / (cargaMaxima / nroEixos); 
                        nro_eixos.setText(v[15]);
                        carga_maxima.setText(v[17]);
                        cb_tipo_caminhao.setSelectedItem(v[13]);
                        double calc_valor_fixo = veic.getVlrDiaria() / (Double.parseDouble(v[17]) / Double.parseDouble(v[15]));
                        valor_fixo.setText(String.valueOf(calc_valor_fixo));
                    } else if (veic.getVeiculolocado().getClass() == Moto.class) { // valor_fixo = vlrDiaria / potencia; 
                        cb_estilo_moto.setSelectedItem(v[13]);
                        potencia.setText(v[15]);
                        double calc_valor_fixo = veic.getVlrDiaria() / Double.parseDouble(v[15]);
                        valor_fixo.setText(String.valueOf(calc_valor_fixo));
                    }
                }
            }
            loc.VeiculosDisponiveis().clear();
            loc.getVeiculosLocados().clear();
        }
        if (menu_devolverVeiculo.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "Para devolver este veículo, selecione Devolver Veículo na barra de Menu");
        } else {
            labelTitulo.setText("DEVOLVER VEICULO");
        }
    }//GEN-LAST:event_tab_veic_locMouseClicked

    private void area_detalhes_veicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_area_detalhes_veicMouseClicked
        area_detalhes_veic.isShowing();
    }//GEN-LAST:event_area_detalhes_veicMouseClicked

    private void menu_devolverVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_devolverVeiculoActionPerformed
        if (((DefaultTableModel) tab_veic_loc.getModel()).getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Consulte veículos locados");
        } else {
            menu_locarVeiculo.setSelected(false);
            menu_devolverVeiculo.setSelected(true);
            km_rodado_atual.setEnabled(true);
            labelTitulo.setText("PARA DEVOLVER VEÍCULO LOCADO SELECIONE-O NA LISTA DE LOCAÇÕES");
        }
    }//GEN-LAST:event_menu_devolverVeiculoActionPerformed

    private void menu_simularDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_simularDevolucaoActionPerformed
        if (((DefaultTableModel) tab_veic_loc.getModel()).getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Consulte veículos locados primeiro");
        } else {
            menu_simularDevolucao.setSelected(true);
            dias.setText("");
            dias.setEnabled(true);
            labelTitulo.setText("PARA SIMULAR A DEVOLUÇÃO SELECIONE UM AUTOMÓVEL LOCADO E INSIRA O Nº DE DIAS");
        }
    }//GEN-LAST:event_menu_simularDevolucaoActionPerformed

    private void menu_venderVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_venderVeiculoActionPerformed
        if (((DefaultTableModel) tab_veic_disp.getModel()).getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Consulte veículos disponíveis");
        } else {
            menu_venderVeiculo.setSelected(true);
            labelTitulo.setText("VENDER VEÍCULO");
        }
    }//GEN-LAST:event_menu_venderVeiculoActionPerformed

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
            java.util.logging.Logger.getLogger(View.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>      

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField ano;
    private javax.swing.JTextArea area_detalhes_veic;
    private javax.swing.JMenuBar barra_de_menus;
    private javax.swing.JToggleButton btn_aplicar;
    private javax.swing.JFormattedTextField carga_maxima;
    private javax.swing.JComboBox cb_estilo_moto;
    private javax.swing.JComboBox cb_tipo_caminhao;
    private javax.swing.JCheckBox cx_luxo;
    private javax.swing.JFormattedTextField data_locacao;
    private javax.swing.JScrollPane detalhes_veic;
    private javax.swing.JFormattedTextField dias;
    private javax.persistence.EntityManager entityManager1;
    private javax.persistence.EntityManager entityManager2;
    private javax.swing.JTabbedPane guias;
    private javax.swing.JLabel jLabelTotalAPagar;
    private javax.swing.JFormattedTextField km_rodado;
    private javax.swing.JFormattedTextField km_rodado_atual;
    private javax.swing.JLabel labelAno;
    private javax.swing.JLabel labelBarra;
    private javax.swing.JLabel labelCargaMaxima;
    private javax.swing.JLabel labelDataLocacao;
    private javax.swing.JLabel labelDiasDiaria;
    private javax.swing.JLabel labelEstiloMoto;
    private javax.swing.JLabel labelKg;
    private javax.swing.JLabel labelKmRodado;
    private javax.swing.JLabel labelKmRodadoAtual;
    private javax.swing.JLabel labelLuxo;
    private javax.swing.JLabel labelMarca;
    private javax.swing.JLabel labelModelo;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNroEixos;
    private javax.swing.JLabel labelNroPortas;
    private javax.swing.JLabel labelPlaca;
    private javax.swing.JLabel labelPotencia;
    private javax.swing.JLabel labelTipoCaminhao;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelValorFixo;
    private javax.swing.JFormattedTextField marca;
    private javax.swing.JMenu menu;
    private javax.swing.JMenu menu_compraVeiculo;
    private javax.swing.JMenuItem menu_consultaPlaca;
    private javax.swing.JMenuItem menu_consultarDisponiveis;
    private javax.swing.JMenuItem menu_consultarLocados;
    private javax.swing.JMenuItem menu_devolverVeiculo;
    private javax.swing.JMenuItem menu_exportarDados;
    private javax.swing.JMenuItem menu_importarDados;
    private javax.swing.JMenuItem menu_informarValor;
    private javax.swing.JMenuItem menu_locarVeiculo;
    private javax.swing.JMenuItem menu_sair;
    private javax.swing.JMenuItem menu_simularDevolucao;
    private javax.swing.JMenuItem menu_venderVeiculo;
    private javax.swing.JTextField modelo;
    private javax.swing.JFormattedTextField nome;
    private javax.swing.JFormattedTextField nro_eixos;
    private javax.swing.JRadioButton nro_portas_2;
    private javax.swing.JRadioButton nro_portas_4;
    private javax.swing.JScrollPane painel_tab1;
    private javax.swing.JScrollPane painel_tab2;
    private javax.swing.JFormattedTextField placa;
    private javax.swing.JFormattedTextField potencia;
    private javax.persistence.Query query1;
    private javax.swing.JMenuItem subMenu_caminhao;
    private javax.swing.JMenuItem subMenu_carroPasseio;
    private javax.swing.JMenuItem subMenu_moto;
    private javax.swing.JMenuItem subMenu_sair;
    private javax.swing.JTable tab_veic_disp;
    private javax.swing.JTable tab_veic_loc;
    private javax.swing.JFormattedTextField total_a_pagar;
    private javax.swing.JFormattedTextField valor_diaria;
    private javax.swing.JFormattedTextField valor_fixo;
    // End of variables declaration//GEN-END:variables

}
