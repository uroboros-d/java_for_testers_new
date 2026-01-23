public class Geometry {
    public static void main(String[] args) {
        printSquareArea(5);
        printRectangleArea(3,4);
    }

    private static void printRectangleArea(double firstSide, double secondSide) {
        System.out.println("Площадь прямоугольника со сторонами " + firstSide + " и " + secondSide + " = " + getRectangleArea(firstSide, secondSide));
    }

    private static double getRectangleArea(double firstSide, double secondSide) {
        return firstSide * secondSide;
    }

    static void printSquareArea(double side) {
        System.out.println("Площадь квадрата со стороной " + side + " = " + getSquareArea(side));
    }

    private static double getSquareArea(double side) {
        return side * side;
    }
}