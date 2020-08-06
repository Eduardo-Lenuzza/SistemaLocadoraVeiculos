package eduardo_lopes_projeto_final;

import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class Moto extends Veiculo {

    private Estilo estiloMoto;
    private int potencia;

    static enum Estilo {

        Basica,
        Esportiva,
        Custom;
    }

    public Moto() {
    }

    public Moto(String placa, int ano, String marca, String modelo, long kmrodado, Estilo estilo, int potencia) {
        super(placa, ano, marca, modelo, kmrodado);

        this.estiloMoto = estilo;
        this.potencia = potencia;
    }

    @Override
    public double CalcularDiaria() {
        double calc = Veiculo.valor_padrao * getPotencia();

        if (getEstiloMoto().equals("Custom") && getKmrodado() > 10000 && getKmrodado() <= 20000) {
            calc += calc + (calc * 0.2);
        } else if (getEstiloMoto().equals("Custom") && getKmrodado() > 20000) {
            calc += calc + (calc * 0.15);
        } else if (getEstiloMoto().equals("Esportiva") && getKmrodado() > 10000 && getKmrodado() <= 20000) {
            calc += calc + (calc * 0.4);
        } else if (getEstiloMoto().equals("Esportiva") && getKmrodado() > 20000) {
            calc += calc + (calc * 0.35);
        }
        return calc;
    }

    public Estilo getEstiloMoto() {
        return estiloMoto;
    }

    public int getPotencia() {
        return potencia;
    }

    @Override
    public String Exportar() {
        String exp = toString();
        try {
            FileWriter arquivo = new FileWriter("locadora.txt", true);
            PrintWriter gravar = new PrintWriter(arquivo);
            gravar.print("VM");
            gravar.print(getPlaca().replaceAll("LM", "") + ";");
            gravar.print(getAno() + ";");
            gravar.print(getMarca() + ";");
            gravar.print(getModelo() + ";");
            gravar.print(getKmrodado() + ";");
            gravar.print(getEstiloMoto() + ";");
            gravar.println(getPotencia());

            arquivo.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return exp;
    }

    @Override
    public String toString() {

        return "Moto:\n"
                + "Placa: " + getPlaca() + "\n"
                + "Ano: " + getAno() + "\n"
                + "Marca: " + getMarca() + "\n"
                + "Modelo: " + getModelo() + "\n"
                + "KmRodado: " + getKmrodado() + "\n"
                + "Estilo: " + getEstiloMoto() + "\n"
                + "Potência: " + getPotencia();
    }

}
