public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");

        int ano = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        //Media calculada pelas 3 notas da Jack, Paulo e Suelen
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);

        String sinopse = """
            Filme Top Gun
            Filme de aventura com galã dos anos 80
            Muito bom!
            Ano de lançamento:""" + " " + ano;
        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
        System.out.println(classificacao + " estrelas");
    }
}