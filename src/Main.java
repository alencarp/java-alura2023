public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match!");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        System.out.println(incluidoNoPlano + "\n" + notaDoFilme);

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(String.format("Média = %.2f", media));

        //Text Block apareceu no Java 15.
        String sinopse = """
                Filme: Top Gun: Maverick
                Categoria: Aventura
                Nota: %.2f
                Ano de lançamento: """.formatted(media) + anoDeLancamento;

        System.out.println(sinopse);
    }
}