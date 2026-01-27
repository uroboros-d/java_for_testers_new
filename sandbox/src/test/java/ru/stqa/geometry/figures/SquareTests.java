package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTests {

    @Test
    void canCalculateArea() {
        //вызываем конструктор объкта и передаем в кач-ве параметра сторону квадрата
        var square = new Square(4.);
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
}
