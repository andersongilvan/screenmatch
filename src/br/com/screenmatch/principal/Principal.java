import br.com.screenmatch.calculos.CalculadoraDeTempo;
import br.com.screenmatch.models.Filme;
import br.com.screenmatch.models.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Avatar", 2000);


        meuFilme.setDuracaoEmMinutos(200);

        Filme filme2 = new Filme("O poderoso chefão", 1980);

        filme2.setDuracaoEmMinutos(180);

        meuFilme.avalia(10);
        meuFilme.avalia(8.5);
        meuFilme.avalia(5.5);
        System.out.println("média do filme " + meuFilme.pegaMedia());
        System.out.println("total de avaliações " + meuFilme.getTotalAvaliacao());

        System.out.println(meuFilme.toString());


        Serie serie = new Serie("Lost", 2000);

        serie.setTemporadas(10);
        serie.setEpisodioPorTemporada(10);
        serie.setMinutosPorEpisodio(50);


        System.out.println(serie.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        calculadoraDeTempo.inclui(filme2);
        calculadoraDeTempo.inclui(meuFilme);
        calculadoraDeTempo.inclui(serie);

        System.out.println("tempo total do filme: " + calculadoraDeTempo.getTempoTotal());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(serie);
        System.out.println(calculadora.getTempoTotal());


        Filme dogville = new Filme("Dogville", 2003);
        dogville.setDuracaoEmMinutos(200);

        ArrayList<Filme> filmes = new ArrayList<>();
        filmes.add(dogville);
        filmes.add(filme2);
        filmes.add(meuFilme);
        System.out.println("tamanho da lista: " + filmes.size());
        System.out.println("primeiro item da lista: " + filmes.get(0));
        System.out.println("todos os itens da lista: ");
        for (var filme : filmes) {
            System.out.println(filme.toString() + "\n");
        }

        System.out.println("imprimindo lista: " + filmes);
    }
}