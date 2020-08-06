package eduardo_lopes_projeto_final;

/**
 *
 * @author Eduardo
 */
public abstract class Veiculo {

    private int ano = 0;
    private long kmrodado;
    private String marca;
    private String modelo;
    private String placa;
    static double valor_padrao;

    public Veiculo() {
    }

    public Veiculo(String placa, int ano, String marca, String modelo, long kmrodado) {
        this.ano = ano;
        this.kmrodado = kmrodado;
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "ano=" + ano + ", kmrodado=" + kmrodado + ", marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + '}';
    }

    public int getAno() {
        return ano;
    }

    public long getKmrodado() {
        return kmrodado;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }    

    public abstract double CalcularDiaria();

    public String Exportar() {
        String exp = "";

        return exp;
    }    
}
