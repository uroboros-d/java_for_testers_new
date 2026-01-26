package ru.stqa.geometry.figures;

public record Rectangle(double sideOne, double sideTwo){

    public static void printRectangleArea(double firstSide, double secondSide) {
        System.out.println(String.format(
                "Площадь прямоугольника со сторонами %.1f и %.1f = %.1f" ,firstSide, secondSide, getRectangleArea(firstSide, secondSide)));
    }

    private static double getRectangleArea(double firstSide, double secondSide) {
        return firstSide * secondSide;
    }
}
