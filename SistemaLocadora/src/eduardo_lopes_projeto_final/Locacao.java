package eduardo_lopes_projeto_final;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class Locacao {

    private LocalDateTime datalocacao;
    private String nome;
    private Veiculo veiculolocado;
    private double vlrDiaria;

    public Locacao() {
    }

    public Locacao(Veiculo veic, String nome, LocalDateTime datalocacao) {
        this.datalocacao = datalocacao;
        this.nome = nome;
        this.veiculolocado = veic;
        this.vlrDiaria = veic.CalcularDiaria();        
    }

    public LocalDateTime getDatalocacao() {
        return datalocacao;
    }

    public String getNome() {
        return nome;
    }

    public Veiculo getVeiculolocado() {
        return veiculolocado;
    }

    public double getVlrDiaria() {
        return vlrDiaria;
    }

    public double CalcularValor(int dias) {
        double vlrCalculado = dias * getVlrDiaria();
        return vlrCalculado;
    }

    public double Devolver(int dias, long kmrodado) {
        double total_a_pagar = CalcularValor(dias);
        if (total_a_pagar == 0) {
            total_a_pagar = this.vlrDiaria;
        }
        String[] v = veiculolocado.toString().replaceAll(" ", "").split(":|\n");
        if (veiculolocado.getClass() == Passeio.class) {
            Veiculo passeio = new Passeio(v[3], Integer.parseInt(v[5]), v[7], v[9], kmrodado,
                    Boolean.parseBoolean(v[13]), Integer.parseInt(v[15]), Integer.parseInt(v[17]));
            passeio.Exportar();

        } else if (veiculolocado.getClass() == Caminhao.class) {
            Veiculo caminhao = new Caminhao(v[3], Integer.parseInt(v[5]), v[7], v[9], kmrodado,
                    Integer.parseInt(v[15]), Long.parseLong(v[17]), Caminhao.TipoCaminhao.valueOf(v[13]));
            caminhao.Exportar();

        } else if (veiculolocado.getClass() == Moto.class) {
            Veiculo moto = new Moto(v[3], Integer.parseInt(v[5]), v[7], v[9], kmrodado,
                    Moto.Estilo.valueOf(v[13]), Integer.parseInt(v[15]));
            moto.Exportar();
        }       
        return total_a_pagar;
    }

    public String Exportar() {
        String exp = "";

        try {
            LocalDateTime ldt = getDatalocacao();
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            String dataFormatada = ldt.format(formato);

            FileWriter arquivo = new FileWriter("locadora.txt", true);
            PrintWriter gravar = new PrintWriter(arquivo);

            gravar.print("LL");
            gravar.print(dataFormatada + ";");
            gravar.print(getVlrDiaria() + ";");
            gravar.print(getNome() + ";");
            gravar.println(getVeiculolocado().getPlaca());

            arquivo.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return exp;
    }    

}
