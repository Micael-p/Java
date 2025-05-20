public class ValidadorCPF {
    private String CPF;

    public ValidadorCPF (String CPF) throws ExcecaoNumeroInvalido{
        if (CPF.length() !=14){
            throw new ExcecaoNumeroInvalido("CPF invalido");
        }
        this.CPF = CPF;
    }

    public String getCPF(){
        return CPF;
    }

    public String SetCPF(String CPF){
        this.CPF = CPF;
        return CPF;
    }
