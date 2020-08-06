package eduardo_lopes_projeto_final;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class Locadora {

    private List<Locacao> locacao;
    private List<Veiculo> veiculos;
    private List<Veiculo> veiculoIndisponivel;

    public Locadora() {

        this.locacao = new ArrayList<>();
        this.veiculos = new ArrayList<>();
        this.veiculoIndisponivel = new ArrayList<>();
    }

    public List<Locacao> getVeiculosLocados() {
        return locacao;
    }

    public List<Veiculo> getVeiculoIndisponivel() {
        return veiculoIndisponivel;
    }

    public List<Veiculo> VeiculosDisponiveis() {

        return veiculos;
    }

    public boolean CompraVeiculo(Veiculo veic) {
        boolean compra = true;
        for (Veiculo v : VeiculosDisponiveis()) {
            String compra_veic = v.getPlaca();
            compra_veic = compra_veic.replaceAll("LP", "").replaceAll("LC", "").replaceAll("LM", "");
            if (compra_veic.equals(veic.getPlaca())) {
                return compra = false;
            }
        }
        for (Locacao v : getVeiculosLocados()) {
            if (v.getVeiculolocado().getPlaca().equals(veic.getPlaca())) {
                return compra = false;
            }
        }
        return compra;
    }

    public Veiculo ConsultarVeiculo(String placa) {
        Veiculo consulta = null;
        String consulta_placa = "";
        for (Veiculo veic : VeiculosDisponiveis()) {
            consulta_placa = veic.getPlaca().replaceAll("LP", "").replaceAll("LC", "").replaceAll("LM", "");
            if (consulta_placa.equals(placa)) {
                consulta = veic;
            }
        }
        for (Locacao veic : getVeiculosLocados()) {
            if (veic.getVeiculolocado().getPlaca().equals(placa));
            consulta = veic.getVeiculolocado();
        }
        return consulta;
    }

    public String Exportar() { //Exporta arquivo vazio, substituindo o antigo.
        String exp = "";

        try {
            FileWriter arquivo = new FileWriter("locadora.txt", false);

            arquivo.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return exp;
    }

    public void ExportaLocado(Veiculo veic) {
        String toStringVeic = veic.toString();
        String[] v = toStringVeic.replaceAll(" ", "").split(":|\n");
        v[3] = v[3].replaceAll("LP", "").replaceAll("LC", "").replaceAll("LM", "");
        if (veic.getClass() == Passeio.class) {
            try {
                FileWriter arquivo = new FileWriter("locadora.txt", true);
                PrintWriter gravar = new PrintWriter(arquivo);

                gravar.print("LP");
                gravar.print(v[3] + ";");
                gravar.print(v[5] + ";");
                gravar.print(v[7] + ";");
                gravar.print(v[9] + ";");
                gravar.print(v[11] + ";");
                gravar.print(v[13] + ";");
                gravar.print(v[15] + ";");
                gravar.println(v[17]);
                arquivo.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else if (veic.getClass() == Caminhao.class) {
            try {
                FileWriter arquivo = new FileWriter("locadora.txt", true);
                PrintWriter gravar = new PrintWriter(arquivo);

                gravar.print("LC");
                gravar.print(v[3] + ";");
                gravar.print(v[5] + ";");
                gravar.print(v[7] + ";");
                gravar.print(v[9] + ";");
                gravar.print(v[11] + ";");
                gravar.print(v[15] + ";");
                gravar.print(v[17] + ";");
                gravar.println(v[13]);
                arquivo.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else if (veic.getClass() == Moto.class) {
            try {
                FileWriter arquivo = new FileWriter("locadora.txt", true);
                PrintWriter gravar = new PrintWriter(arquivo);

                gravar.print("LM");
                gravar.print(v[3] + ";");
                gravar.print(v[5] + ";");
                gravar.print(v[7] + ";");
                gravar.print(v[9] + ";");
                gravar.print(v[11] + ";");
                gravar.print(v[13] + ";");
                gravar.println(v[15]);
                arquivo.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    public void Importar(String linha) {

        try {
            Scanner scanner = new Scanner(new FileReader("locadora.txt"));

            if (linha.equals("V")) {

                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String verificador = line.substring(0, 2);

                    switch (verificador) {
                        case "VP":
                            line = line.replace("VP", ""); //RETIRA O "VP" DA LINHA
                            String vp[] = line.split(";"); //RETIRA O ";" E ARMAZENA CADA ITEM EM UMA POSIÇÃO DIFERENTE DO VETOR
                            Veiculo passeio = new Passeio(vp[0], Integer.parseInt(vp[1]), vp[2], vp[3], Long.parseLong(vp[4]), Boolean.parseBoolean(vp[5]),
                                    Integer.parseInt(vp[6]), Integer.parseInt(vp[7]));
                            VeiculosDisponiveis().add(passeio);
                            break;
                        case "VC":
                            line = line.replace("VC", ""); //RETIRA O "VC" DA LINHA
                            String vc[] = line.split(";"); //RETIRA O ";" E ARMAZENA CADA ITEM EM UMA POSIÇÃO DIFERENTE DO VETOR
                            Veiculo caminhao = new Caminhao(vc[0], Integer.parseInt(vc[1]), vc[2], vc[3], Long.parseLong(vc[4]), Integer.parseInt(vc[5]),
                                    Long.parseLong(vc[6]), Caminhao.TipoCaminhao.valueOf(vc[7]));
                            VeiculosDisponiveis().add(caminhao);
                            break;
                        case "VM":
                            line = line.replace("VM", ""); //RETIRA O "VM" DA LINHA
                            String vm[] = line.split(";"); //RETIRA O ";" E ARMAZENA CADA ITEM EM UMA POSIÇÃO DIFERENTE DO VETOR
                            Veiculo moto = new Moto(vm[0], Integer.parseInt(vm[1]), vm[2], vm[3], Long.parseLong(vm[4]), Moto.Estilo.valueOf(vm[5]), Integer.parseInt(vm[6]));
                            VeiculosDisponiveis().add(moto);
                            break;

                        case "LP":
                            String vlp[] = line.split(";"); //RETIRA O ";" E ARMAZENA CADA ITEM EM UMA POSIÇÃO DIFERENTE DO VETOR
                            Veiculo passeio_locado = new Passeio(vlp[0], Integer.parseInt(vlp[1]), vlp[2], vlp[3], Long.parseLong(vlp[4]), Boolean.parseBoolean(vlp[5]),
                                    Integer.parseInt(vlp[6]), Integer.parseInt(vlp[7]));
                            getVeiculoIndisponivel().add(passeio_locado);
                            break;
                        case "LC":
                            String vlc[] = line.split(";"); //RETIRA O ";" E ARMAZENA CADA ITEM EM UMA POSIÇÃO DIFERENTE DO VETOR
                            Veiculo caminhao_locado = new Caminhao(vlc[0], Integer.parseInt(vlc[1]), vlc[2], vlc[3], Long.parseLong(vlc[4]), Integer.parseInt(vlc[5]),
                                    Long.parseLong(vlc[6]), Caminhao.TipoCaminhao.valueOf(vlc[7]));
                            getVeiculoIndisponivel().add(caminhao_locado);
                            break;
                        case "LM":
                            String vlm[] = line.split(";"); //RETIRA O ";" E ARMAZENA CADA ITEM EM UMA POSIÇÃO DIFERENTE DO VETOR
                            Veiculo moto_locado = new Moto(vlm[0], Integer.parseInt(vlm[1]), vlm[2], vlm[3], Long.parseLong(vlm[4]), Moto.Estilo.valueOf(vlm[5]), Integer.parseInt(vlm[6]));
                            getVeiculoIndisponivel().add(moto_locado);
                            break;
                    }
                }
            }
            if (linha.equals("LL")) {
                Importar("V");
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String verificador = line.substring(0, 2);

                    if (verificador.equals("LL")) {
                        line = line.replaceAll("LL", "");
                        String vLL[] = line.split(";");

                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                        LocalDateTime ldt = null;
                        try {
                            ldt = LocalDateTime.parse(vLL[0], formatter);
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "ERRO no LocaleDateTime do método Importar " + e);
                        }
                        for (Veiculo veic : getVeiculoIndisponivel()) {
                            String infosVeic = veic.toString();
                            String[] v = infosVeic.replaceAll(" ", "").split(":|\n");
                            v[3] = v[3].replaceAll("LP", "").replaceAll("LM", "").replaceAll("LC", "");

                            if (v[3].equals(vLL[3])) {
                                if (veic.getClass() == Passeio.class) {
                                    Passeio passeio = new Passeio(v[3], Integer.parseInt(v[5]), v[7], v[9], Long.parseLong(v[11]),
                                            Boolean.parseBoolean(v[13]), Integer.parseInt(v[15]), Integer.parseInt(v[17]));
                                    Veiculo.valor_padrao = Double.parseDouble(vLL[1]) / (Double.parseDouble(v[17]) / Double.parseDouble(v[15]));
                                    Locacao locacao = new Locacao(passeio, vLL[2], ldt);
                                    getVeiculosLocados().add(locacao);
                                } else if (veic.getClass() == Caminhao.class) {
                                    Caminhao caminhao = new Caminhao(v[3], Integer.parseInt(v[5]), v[7], v[9], Long.parseLong(v[11]),
                                            Integer.parseInt(v[15]), Long.parseLong(v[17]), Caminhao.TipoCaminhao.valueOf(v[13]));
                                    Veiculo.valor_padrao = Double.parseDouble(vLL[1]) / (Double.parseDouble(v[17]) / Double.parseDouble(v[15]));
                                    Locacao locacao = new Locacao(caminhao, vLL[2], ldt);
                                    getVeiculosLocados().add(locacao);
                                } else if (veic.getClass() == Moto.class) {
                                    Moto moto = new Moto(v[3], Integer.parseInt(v[5]), v[7], v[9], Long.parseLong(v[11]),
                                            Moto.Estilo.valueOf(v[13]), Integer.parseInt(v[15]));
                                    Veiculo.valor_padrao = Double.parseDouble(vLL[1]) / Double.parseDouble(v[15]);
                                    Locacao locacao = new Locacao(moto, vLL[2], ldt);
                                    getVeiculosLocados().add(locacao);
                                }
                            }
                        }
                    }
                }
            }
            scanner.close();

        } catch (IOException e) {
            System.out.println("ERRO!" + e);
        }
    }

    public boolean Vender(String placa) {
        boolean conclui_venda = false;
        for (Veiculo veic : VeiculosDisponiveis()) {
            if (veic.getPlaca().equals(placa)) {
                VeiculosDisponiveis().remove(veic);
                conclui_venda = true;
                break;
            } else {
                conclui_venda = false;
            }
        }
        Exportar(); //Limpa TXT
        for (Veiculo veic : VeiculosDisponiveis()) {
            veic.Exportar();
        }
        for (Locacao l : getVeiculosLocados()) {
            l.getVeiculolocado().Exportar();
        }
        return conclui_venda;
    }
}
