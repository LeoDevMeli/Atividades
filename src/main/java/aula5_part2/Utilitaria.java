package aula5_part2;

import java.util.ArrayList;
import java.util.List;

public class Utilitaria {

    public static double areaMedia(List<FiguraGeometrica> arr) {
        double value = arr.stream().mapToDouble(FiguraGeometrica::area).sum();
        return value / arr.size();
    }

    public static void main(String[] args) {
        List<FiguraGeometrica> figura = new ArrayList<FiguraGeometrica>();
        Circulo circulo = new Circulo(7);
        figura.add(circulo);
        System.out.println(circulo);

        Triangulo triangulo = new Triangulo(4,2);
        figura.add(triangulo);
        System.out.println(triangulo);

        Retangulo retangulo = new Retangulo(5,8);
        figura.add(retangulo);
        System.out.println(retangulo);

        System.out.println("Media da area: " + String.format("%.2f", areaMedia(figura)));
    }
}
