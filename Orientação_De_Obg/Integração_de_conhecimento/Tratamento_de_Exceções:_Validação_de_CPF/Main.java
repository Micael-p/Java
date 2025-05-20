public class Main {
    public static void main (String[] args) {

        try {
            ValidadorCPF pessoa = new ValidadorCPF("123.456.789-10");
        } catch (ExcecaoNumeroInvalido e){
            System.out.println(e.getMessage());
        }

    }
}
