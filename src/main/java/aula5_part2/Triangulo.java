package aula5_part2;

public class Triangulo extends FiguraGeometrica{
    public double base;
    public double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return (base * altura) / 2;
    }
}
