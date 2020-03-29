package meuprimeirocrud;

/**
 *
 * @author Eduardo
 */
public class Cadastro {

    private String Nome;
    private String Email;
    private String Endereco;
    private String Complemento;
    private String Cep;
    private int id;
    private int Numero;
    private int Contrato;
    private String Nascimento;
    private String Plano;
    private String Inicio;
    private String Fim;
    private String Telefone;
    private String Celular;

    public Cadastro() {

    }

    public Cadastro(String Nome, String Email, String Endereco, String Complemento, String Cep, int Numero,
            int Contrato, String Nascimento, String Plano, String Inicio, String Fim, String Telefone, String Celular) {

        this.Nome = Nome;
        this.Email = Email;
        this.Endereco = Endereco;
        this.Complemento = Complemento;
        this.Cep = Cep;
        this.Numero = Numero;
        this.Contrato = Contrato;
        this.Nascimento = Nascimento;
        this.Plano = Plano;
        this.Inicio = Inicio;
        this.Fim = Fim;
        this.Telefone = Telefone;
        this.Celular = Celular;
    }

    /**
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the Endereco
     */
    public String getEndereco() {
        return Endereco;
    }

    /**
     * @param Endereco the Endereco to set
     */
    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    /**
     * @return the Complemento
     */
    public String getComplemento() {
        return Complemento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param Complemento the Complemento to set
     */
    public void setComplemento(String Complemento) {
        this.Complemento = Complemento;
    }

    public String getCep() {
        return Cep;
    }

    public void setCep(String Cep) {
        this.Cep = Cep;
    }

    /**
     * @return the Numero
     */
    public int getNumero() {
        return Numero;
    }

    /**
     * @param Numero the Numero to set
     */
    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    /**
     * @return the Contrato
     */
    public int getContrato() {
        return Contrato;
    }

    /**
     * @param Contrato the Contrato to set
     */
    public void setContrato(int Contrato) {
        this.Contrato = Contrato;
    }

    /**
     * @return the Nascimento
     */
    public String getNascimento() {
        return Nascimento;
    }

    /**
     * @param Nascimento the Nascimento to set
     */
    public void setNascimento(String Nascimento) {
        this.Nascimento = Nascimento;
    }

    /**
     * @return the Plano
     */
    public String getPlano() {
        return Plano;
    }

    /**
     * @param Plano the Plano to set
     */
    public void setPlano(String Plano) {
        this.Plano = Plano;
    }

    public String getInicio() {
        return Inicio;
    }

    public void setInicio(String Inicio) {
        this.Inicio = Inicio;
    }

    public String getFim() {
        return Fim;
    }

    public void setFim(String Fim) {
        this.Fim = Fim;
    }

    /**
     * @return the Telefone
     */
    public String getTelefone() {
        return Telefone;
    }

    /**
     * @param Telefone the Telefone to set
     */
    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    /**
     * @return the Celular
     */
    public String getCelular() {
        return Celular;
    }

    /**
     * @param Celular the Celular to set
     */
    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

}
