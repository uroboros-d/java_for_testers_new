package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTests {

    @Test
    void canCalculateArea() {
        //вызываем конструктор объкта и передаем в кач-ве параметра сторону квадрата
        var square = new Square(5.);
        //затем вызываем метод getArea() в этом объекте, метод будет брать данные из объекта, в котором он вызывается
        var actResult = square.getArea();
        var expResult = 25.;
        //Assertions.assertEquals(expResult, actResult);
        if(actResult!=expResult) {
            throw new AssertionError(String.format("Expected %f, actual %f", 25., actResult));
        }
    }

    @Test
    void canCalculatePerimeter() {
        Assertions.assertEquals(20.0, new Square(5.).getPerimeter());
    }

    @Test
        // тест сравнения 2 квадратов
    void testEquality() {
        var squareOne = new Square(5);
        var squareTwo = new Square(5);
        Assertions.assertEquals(squareOne, squareTwo);
    }

    @Test
        // тест сравнения 2 квадратов
    void testNonEquality() {
        var squareOne = new Square(5);
        var squareTwo = new Square(4);
        Assertions.assertNotEquals(squareOne, squareTwo);
    }

    @Test
        // тест сравнения 2 квадратов
    void testFail() {
        var squareOne = new Square(5);
        var squareTwo = new Square(5);
        Assertions.assertTrue(squareOne == squareTwo);
    }

    @Test
        // тест сравнения 2 квадратов
    void testPass() {
        var squareOne = new Square(5);
        var squareTwo = new Square(5);
        Assertions.assertTrue(squareOne.equals(squareTwo));
    }
}
