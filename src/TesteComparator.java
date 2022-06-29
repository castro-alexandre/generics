import java.util.Arrays;
import java.util.List;

public class TesteComparator {
    
    public static void main(String[] args) {

        Empregado e1 = new Empregado("francisco", 123);
        Empregado e2 = new Empregado("alexandre", 45);
        Empregado e3 = new Empregado("melo", 23);
        Empregado e4 = new Empregado("castro", 1);
        Empregado[] empregados = {e1, e2, e3, e4};

        Carro c1 = new Carro("fusca", 500_000);
        Carro c2 = new Carro("gol", 400_000);
        Carro c3 = new Carro("monza", 300_000);
        Carro c4 = new Carro("chevete", 200_000);
        Carro c5 = new Carro("maverick", 100_000);
        Carro[] carros = {c1, c2, c3, c4, c5};

        Integer[] inteiros = {5,4,3,2,1};
        String[] nomes = {"Perola", "Livia","Emanuel", "Alexandre"};
        
        System.out.println("Listando Empregados");
        System.out.println(Arrays.toString(empregados));
        System.out.println("");
        System.out.println("Ordenando empregados segundo matrícula");
        List<Empregado> empregadosList = MyOwnLists.asListedSorted(empregados, new Comparador<Empregado>());
        System.out.println(empregadosList);

        System.out.println("\nlista de inteiros");
        System.out.println(Arrays.toString(inteiros));
        System.out.println("\nOrdenando inteiros");
        List<Integer> intList = MyOwnLists.asListedSorted(inteiros, new Comparador<Integer>());
        System.out.println(intList);

        System.out.println("\nLista de carros");
        System.out.println(Arrays.toString(carros));
        System.out.println("\nOrdenando carros segundo nome");
        List<Carro> carroList = MyOwnLists.asListedSorted(carros, new Comparador<Carro>());
        System.out.println(carroList);

        System.out.println("\nLista de nomes");
        System.out.println(Arrays.toString(nomes));
        System.out.println("\nOrdenando nomes em ordem alfabética");
        List<String> nomesList = MyOwnLists.asListedSorted(nomes, new Comparador<String>());
        System.out.println(nomesList);
    }
}
