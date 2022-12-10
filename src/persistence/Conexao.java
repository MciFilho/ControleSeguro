
package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {
    
    private Connection conexao;
    
    public Connection abrirConexao() {
        String url = "jdbc:mysql://localhost:3306/ControleSeguroVeiculo?useTimezone=true&serverTimezone=UTC";
        String user = "root";
        String passoword = "";
        
        try {
            conexao = DriverManager.getConnection(url, user, passoword);
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return conexao;
    }
    
    public void fecharConexao() {
        try {
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
