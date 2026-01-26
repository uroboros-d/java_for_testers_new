package ru.stqa.geometry.figures;

public class Square {
    public static void printArea(double side) {
        System.out.println(String.format(
           "Площадь квадрата со стороной %.1f = %.1f", side, getArea(side)));
    }

    public static double getArea(double side) {
        return side * side;
    }

    public static double getPerimeter(double side) {
        return 4 * side;
    }
}
