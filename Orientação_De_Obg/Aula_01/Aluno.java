// Classe Aluno (deve ser salva em um arquivo separado chamado Aluno.java)

import java.time.LocalDate;
import java.time.Period;
public class Aluno {
    private String nome;
    private LocalDate dataNascimento;
    
    // Construtor
    
    public Aluno(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }
    
    // Métodos Getters e Setters
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    // Metodo para calcular a idade do aluno
    
    public int calcularIdade() {
        return Period.between(this.dataNascimento,
                LocalDate.now()).getYears();
    }
}
