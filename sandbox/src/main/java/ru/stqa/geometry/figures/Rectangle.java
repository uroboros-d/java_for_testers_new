package ru.stqa.geometry.figures;

import java.util.Objects;

public record Rectangle(double sideOne, double sideTwo){
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return (Double.compare(this.sideOne, rectangle.sideOne) == 0 && Double.compare(this.sideTwo, rectangle.sideTwo) == 0)
                ||
                (Double.compare(this.sideOne, rectangle.sideTwo) == 0 && Double.compare(this.sideTwo, rectangle.sideOne) == 0);
    }

    @Override
    public int hashCode() {
        //return Objects.hash(sideOne, sideTwo);
        return 1;
    }

    public static void printRectangleArea(double firstSide, double secondSide) {
        System.out.println(String.format(
                "Площадь прямоугольника со сторонами %.1f и %.1f = %.1f" ,firstSide, secondSide, getRectangleArea(firstSide, secondSide)));
    }

    private static double getRectangleArea(double firstSide, double secondSide) {
        return firstSide * secondSide;
    }


}
