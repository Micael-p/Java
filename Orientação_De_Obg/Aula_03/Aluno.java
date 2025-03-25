import java.util.Date;

// Classe Aluno
class Aluno extends Pessoa {
    private int matricula;
    
    // Constructor
    public Aluno(String nome, String cpf, Date datadenascimento, int matricula) {
        super(nome, cpf, datadenascimento);
        this.matricula = matricula;
    }
    
    // Gatter e Setter especifico para matricula
    public int getMatricula(){
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

}
