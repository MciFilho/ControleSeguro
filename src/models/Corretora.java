package models;

public class Corretora {
    
    private String nome;
    private String telefone;
    private String contato;

    public Corretora(){}
    
    public Corretora(String nome, String telefone, String contato) {
        this.nome = nome;
        this.telefone = telefone;
        this.contato = contato;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
    
    
}
