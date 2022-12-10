
package persistence;

import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import models.Corretora;

public class JDBCmodels {
    
    Connection conexao;
    
    public JDBCmodels(Connection conexao) {
        this.conexao = conexao;
    }
    
    public void inserir(Corretora p) {
        String sql = "insert into corretora(nome, telefone, contato) values (?, ?, ?)";
        PreparedStatement ps;
        
        try{
            ps = (PreparedStatement) this.conexao.prepareStatement(sql); //ps = this.conexao.prepareStatement(sql);
            ps.setString(1, p.getNome());
            ps.setString(2, p.getTelefone());
            ps.setString(3, p.getContato());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<Corretora> listar() {
        ArrayList<Corretora> corretoras = new ArrayList<Corretora>();
        String sql = "select * from corretora";
        
        try {
            Statement declaracao = conexao.createStatement();
            ResultSet resposta = declaracao.executeQuery(slq);
            
            
            while(resposta.next()) {
                
                String nome = resposta.getString("nome");
                String telefone = resposta.getString("telefone");
                String contato =  resposta.getString("contato");   
                
                Corretora p = new Corretora(nome, telefone, contato);
                corretoras.add(p);                
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return corretoras;
    }
    
    public void apagar() {
        String sql = "delet fron corretora";
        
        PreparedStatement ps;
        
        try {
            ps = this.conexao.prepareStatement(sql);
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
}
