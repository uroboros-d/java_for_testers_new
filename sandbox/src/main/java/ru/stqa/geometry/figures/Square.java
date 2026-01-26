package ru.stqa.geometry.figures;

public record Square(double side) {

    public static void printArea(Square square) {
        System.out.println(String.format(
           "Площадь квадрата со стороной %.1f = %.1f", square.side, square.getArea()));
    }

    public double getArea() {
        return this.side * this.side;
    }

    public double getPerimeter() {
        return 4 * this.side;
    }
}
