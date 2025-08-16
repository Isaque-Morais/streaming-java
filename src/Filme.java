public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacao;
    int totalAvaliacao;
    int tempoDeDuracao;

    void exibeFichaTecnica(){
        nome = "Carros 2";
        anoDeLancamento = 2020;
        incluidoNoPlano = true;
        somaDasAvaliacao = 8.0;
        totalAvaliacao = 8;
        tempoDeDuracao = 2;

        System.out.println(String.format("O nome do filme: %s", nome));
        System.out.println(String.format("Ano de lançamento: %d", anoDeLancamento));
        System.out.println(String.format("Incluido no plano: %b", incluidoNoPlano));
        System.out.println(String.format("Soma das avaliações: %.2f", somaDasAvaliacao));
        System.out.println(String.format("Total avaliação: %d", totalAvaliacao));

    }

    void avalia(double nota){
        System.out.println(somaDasAvaliacao += nota);
        totalAvaliacao++;
    }

    double retornaMedia(){
        return somaDasAvaliacao / totalAvaliacao;
    }
}


