public class Main {
    public static void main(String[] args) {

        //Definindo Instancias
        cliente c1 = new cliente();


        //Definindo nome das instancias
        c1.setNome("Pessoa 1");
        c1.setCPF("142.378.586-27");


        //Fazendo depositos
        c1.depositar(100);


        //Imprimindo valores
        System.out.println("Nome do Cliente: " + c1.getNome());
        System.out.println("Saldo do Cliente: " + c1.getSaldo());
        System.out.println("CPF do Cliente: " + c1.getCPF());


    }
}
