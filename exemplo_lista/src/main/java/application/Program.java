package application;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");

        System.out.println(list.size());

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("---------------------");

        //Remoção por tipo
        //list.remove("Anna");
        //Remoção por posição
        //list.remove(1);
        //Remoção utilizando um predicado
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("---------------------");

        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        // -1 index não encontrado
        System.out.println("Index of Marco: " + list.indexOf("Marco"));

        System.out.println("---------------------");
        //Converte a lista para stream, executa a expressão lambda e converte novamente para list
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').toList();
        for (String r : result) {
            System.out.println(r);
        }

        System.out.println("---------------------");

        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);

        //retorna nulo para elemento não encontrado
        name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);

    }
}
