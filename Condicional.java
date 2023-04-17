public class Condicional {
    public static void main(String[] args) {
        int ano = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";


        if (ano >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }
//Em caso de ser verdadeiro o boolean entra no if, se não for true no boolean ele não entra
//O ou no java é "||"
        if (incluidoNoPlano && tipoPlano.equals("plus")) {
            System.out.println("Filme Liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }
    }
}
