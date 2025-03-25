import java.util.Date;

// Classe Pessoa
public class Pessoa {
    private String nome;
    private String cpf;
    private Date datadenascimento;
    
    // Constructor
    public Pessoa(String nome, String cpf, Date datadenascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.datadenascimento = datadenascimento;
    }
    
    //Gatters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDatadenascimento() {
        return datadenascimento;
    }

    public void setDatadenascimento(Date datadenascimento) {
        this.datadenascimento = datadenascimento;
    }

}
