package eduardo_lopes_projeto_final;

import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class Caminhao extends Veiculo {

    private long cargaMaxima;
    private int nroEixos;
    private TipoCaminhao tipo;

    static enum TipoCaminhao {

        CarretaBau,
        CavaloTruckado,
        BiTrem;
    }

    public Caminhao() {
    }

    public Caminhao(String placa, int ano, String marca, String modelo, long kmrodado, int nroEixos, long cargaMaxima, TipoCaminhao tipo) {
        super(placa, ano, marca, modelo, kmrodado);

        this.cargaMaxima = cargaMaxima;
        this.nroEixos = nroEixos;
        this.tipo = tipo;
    }

    public long getCargaMaxima() {
        return cargaMaxima;
    }

    public int getNroEixos() {
        return nroEixos;
    }

    public TipoCaminhao getTipo() {
        return tipo;
    }

    @Override
    public double CalcularDiaria() {
        double calc = (Veiculo.valor_padrao * getCargaMaxima()) / getNroEixos();

        if (getTipo().equals("CavaloTruckado") && getKmrodado() > 10000 && getKmrodado() <= 20000) {
            calc += calc - (calc * 0.05);
        } else if (getTipo().equals("CavaloTruckado") && getKmrodado() > 20000) {
            calc += calc - (calc * 0.1);
        } else if (getTipo().equals("BiTrem") && getKmrodado() > 10000 && getKmrodado() <= 20000) {
            return calc;
        } else if (getTipo().equals("BiTrem") && getKmrodado() > 20000) {
            calc += calc - (calc * 0.05);
        }
        return calc;
    }

    @Override
    public String Exportar() {
        String exp = toString();
        try {
            FileWriter arquivo = new FileWriter("locadora.txt", true);
            PrintWriter gravar = new PrintWriter(arquivo);
            gravar.print("VC");
            gravar.print(getPlaca().replaceAll("LC", "") + ";");
            gravar.print(getAno() + ";");
            gravar.print(getMarca() + ";");
            gravar.print(getModelo() + ";");
            gravar.print(getKmrodado() + ";");
            gravar.print(getNroEixos() + ";");
            gravar.print(getCargaMaxima() + ";");
            gravar.println(getTipo());

            arquivo.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return exp;
    }

    @Override
    public String toString() {

        return "Caminhão:\n"
                + "Placa: " + getPlaca() + "\n"
                + "Ano: " + getAno() + "\n"
                + "Marca: " + getMarca() + "\n"
                + "Modelo: " + getModelo() + "\n"
                + "KmRodado: " + getKmrodado() + "\n"
                + "Tipo: " + getTipo() + "\n"
                + "NºdeEixos: " + getNroEixos() + "\n"
                + "CargaMáxima: " + getCargaMaxima();
    }

}
