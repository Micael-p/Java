public class cliente extends conta {

    //declaração de atributos
    private String nome;
    private String CPF;

    //declaração de metodos
    public void setNome (String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setCPF (String CPF){
        this.CPF = CPF;
    }
    public String getCPF(){
        return this.CPF;
    }
}
