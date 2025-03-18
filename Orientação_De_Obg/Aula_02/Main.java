public class Main {
    public static void main(String[] args) {
        
        //Definindo Instancias
        conta c1 = new conta();
        conta c2 = new conta();
        conta c3 = new conta();
        
        //Definindo nome das instancias
        c1.setNome("Pessoa 1");
        c2.setNome("Pessoa 2");
        c3.setNome("Pessoa 3");
        
        //Fazendo depositos
        c1.depositar(100);
        c2.depositar(200);
        c3.depositar(300);
        
        //Imprimindo valores
        System.out.println("c1 - Nome: " + c1.getNome());
        System.out.println("c2 - Saldo: " + c1.getSaldo());
        System.out.println("c2 - Nome: " + c2.getNome());
        System.out.println("c2 - Saldo: " + c2.getSaldo());
        System.out.println("c3 - Nome: " + c3.getNome());
        System.out.println("c3 - Saldo: " + c3.getSaldo());
    }
}
