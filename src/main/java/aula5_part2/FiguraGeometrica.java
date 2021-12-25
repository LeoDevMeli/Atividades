package aula5_part2;

public abstract class FiguraGeometrica {

    public abstract double area();

    @Override
    public String toString() {
        return "A area da figura é: " + area();
    }

}
