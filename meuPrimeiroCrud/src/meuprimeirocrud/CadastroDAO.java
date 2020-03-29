package meuprimeirocrud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class CadastroDAO {

    public void create(Cadastro cad) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("insert into Cadastro(Contrato,Nome,Email,Endereco,Complemento,Cep,Numero,Nascimento,Plano,inicioPlano,fimPlano,Telefone,Celular) values(?,?,?,?,?,?,?,?,?,?,?,?,?)");

            stmt.setInt(1, cad.getContrato());
            stmt.setString(2, cad.getNome());
            stmt.setString(3, cad.getEmail());
            stmt.setString(4, cad.getEndereco());
            stmt.setString(5, cad.getComplemento());
            stmt.setString(6, cad.getCep());
            stmt.setInt(7, cad.getNumero());            
            stmt.setString(8, cad.getNascimento());
            stmt.setString(9, cad.getPlano());
            stmt.setString(10, cad.getInicio());
            stmt.setString(11, cad.getFim());
            stmt.setString(12, cad.getTelefone());
            stmt.setString(13, cad.getCelular());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "ERRO ao salvar!" + ex);

        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    List<Cadastro> cadastro = new ArrayList<>();

    public List<Cadastro> read() {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        ResultSet rs = null;

        try {
            stmt = con.prepareStatement("SELECT * FROM Cadastro");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Cadastro cad = new Cadastro();

                cad.setContrato(rs.getInt("Contrato"));
                cad.setNome(rs.getString("Nome"));
                cad.setEmail(rs.getString("Email"));
                cad.setEndereco(rs.getString("Endereco"));
                cad.setComplemento(rs.getString("Complemento"));
                cad.setCep(rs.getString("Cep"));
                cad.setNumero(rs.getInt("Numero"));                
                cad.setNascimento(rs.getString("Nascimento"));
                cad.setPlano(rs.getString("Plano"));
                cad.setInicio(rs.getString("inicioPlano"));
                cad.setFim(rs.getString("fimPlano"));
                cad.setTelefone(rs.getString("Telefone"));
                cad.setCelular(rs.getString("Celular"));

                cadastro.add(cad);

            }            
            

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO ao efetuar leitura!" + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return cadastro;
    }
    public List<Cadastro> consulta(Cadastro cons) {
        
        Cadastro cad = new Cadastro();

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        ResultSet rs = null;

        try {
            stmt = con.prepareStatement("SELECT * FROM Cadastro WHERE Contrato = ?");
            stmt.setInt(1, cons.getContrato());
            rs = stmt.executeQuery();

            while (rs.next()) {                

                cad.setContrato(rs.getInt("Contrato"));
                cad.setNome(rs.getString("Nome"));
                cad.setEmail(rs.getString("Email"));
                cad.setEndereco(rs.getString("Endereco"));
                cad.setComplemento(rs.getString("Complemento"));
                cad.setCep(rs.getString("Cep"));
                cad.setNumero(rs.getInt("Numero"));                
                cad.setNascimento(rs.getString("Nascimento"));
                cad.setPlano(rs.getString("Plano"));
                cad.setInicio(rs.getString("inicioPlano"));
                cad.setFim(rs.getString("fimPlano"));
                cad.setTelefone(rs.getString("Telefone"));
                cad.setCelular(rs.getString("Celular"));

                cadastro.add(cad);

            }            

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO ao consultar!" + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return cadastro;
    }
    
    public void update(Cadastro cad) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE Cadastro SET Contrato = ?, Nome = ?, Email = ?, Endereco = ?, Complemento = ?, Cep = ?, "
                                        + "Numero = ?, Nascimento = ?, Plano = ?, inicioPlano = ?, fimPlano = ?,"
                                        + " Telefone = ?, Celular = ?) WHERE Contrato = ?");

            stmt.setInt(1, cad.getContrato());
            stmt.setString(2, cad.getNome());
            stmt.setString(3, cad.getEmail());
            stmt.setString(4, cad.getEndereco());
            stmt.setString(5, cad.getComplemento());
            stmt.setString(6, cad.getCep());
            stmt.setInt(7, cad.getNumero());            
            stmt.setString(8, cad.getNascimento());
            stmt.setString(9, cad.getPlano());
            stmt.setString(10, cad.getInicio());
            stmt.setString(11, cad.getFim());
            stmt.setString(12, cad.getTelefone());
            stmt.setString(13, cad.getCelular());
            stmt.setInt(14, cad.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "ERRO ao atualizar!" + ex);

        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void delete(Cadastro cad) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM Cadastro WHERE Contrato = ?");
            
            stmt.setInt(1, cad.getContrato());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "ERRO ao excluir!" + ex);

        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
