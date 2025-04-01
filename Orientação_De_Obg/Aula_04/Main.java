public class Main {
    public static void main(String[] args) {
        Fisica fisica = new Fisica();
        fisica.setNome("Micael");
        fisica.setCPF(1234567890);

        Juridica juridica = new Juridica();
        juridica.setNome("Kayo");
        juridica.setCNPJ(1234567890);

        Pessoa[] pessoas = new Pessoa[2];
        pessoas[0] = fisica;
        pessoas[1] = juridica;

        for(Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome());
        }
    }
}
