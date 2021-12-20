package aula_2;

import java.util.Arrays;
import java.util.Comparator;

public class Lista2_Exercicio1 {

    public static void main(String[] args) {

        Integer[] arr = {52, 10, 85, 1324, 1, 13, 62, 30, 12, 127};

        System.out.println("Ordem crescente: ");
        Arrays.stream(arr).sorted().forEach(System.out::println);

        System.out.println("Ordem decrescente: ");
        Arrays.stream(arr).sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}

