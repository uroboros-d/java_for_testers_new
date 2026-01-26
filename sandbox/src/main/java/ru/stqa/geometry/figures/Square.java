package ru.stqa.geometry.figures;

public class Square {
    public static void printSquareArea(double side) {
        System.out.println(String.format(
           "Площадь квадрата со стороной %.1f = %.1f", side, getSquareArea(side)));
    }

    public static double getSquareArea(double side) {
        return side * side;
    }
}
