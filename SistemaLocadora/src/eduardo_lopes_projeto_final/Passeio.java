package eduardo_lopes_projeto_final;

import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class Passeio extends Veiculo {

    private boolean luxo;
    private int nroPortas;
    private int potencia;

    public Passeio() {
    }

    public Passeio(String placa, int ano, String marca, String modelo, long kmrodado, boolean luxo, int nroPortas, int potencia) {
        super(placa, ano, marca, modelo, kmrodado);

        this.luxo = luxo;
        this.nroPortas = nroPortas;
        this.potencia = potencia;

    }

    public boolean isLuxo() {
        return luxo;
    }

    public int getNroPortas() {
        return nroPortas;
    }

    public int getPotencia() {
        return potencia;
    }

    @Override
    public double CalcularDiaria() {
        double calc = (Veiculo.valor_padrao * getPotencia()) / getNroPortas();

        if (isLuxo() && getKmrodado() > 10000 && getKmrodado() <= 20000) {
            calc += calc + (calc * 0.1);
        } else if (isLuxo() && getKmrodado() > 20000) {
            calc += calc + (calc * 0.5);
        } else if (isLuxo() == false && getKmrodado() > 10000 && getKmrodado() <= 20000) {
            calc += calc - (calc * 0.1);
        } else if (isLuxo() == false && getKmrodado() > 20000) {
            calc += calc - (calc * 0.15);
        }
        return calc;
    }

    @Override
    public String Exportar() {
        String exp = toString();
        try {
            FileWriter arquivo = new FileWriter("locadora.txt", true);
            PrintWriter gravar = new PrintWriter(arquivo);
            gravar.print("VP");
            gravar.print(getPlaca().replaceAll("LP", "") + ";");
            gravar.print(getAno() + ";");
            gravar.print(getMarca() + ";");
            gravar.print(getModelo() + ";");
            gravar.print(getKmrodado() + ";");
            gravar.print(isLuxo() + ";");
            gravar.print(getNroPortas() + ";");
            gravar.println(getPotencia());

            arquivo.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return exp;
    }

    @Override
    public String toString() {

        return "Carro:\n"
                + "Placa: " + getPlaca() + "\n"
                + "Ano: " + getAno() + "\n"
                + "Marca: " + getMarca() + "\n"
                + "Modelo: " + getModelo() + "\n"
                + "KmRodado: " + getKmrodado() + "\n"
                + "Luxo: " + isLuxo() + "\n"
                + "NºdePortas: " + getNroPortas() + "\n"
                + "Potência: " + getPotencia();
    }
}
