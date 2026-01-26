package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTests {

    @Test
    void canCalculateArea() {
        var square = new Square(5.);
        //вызываем конструктор объкта и передаем в кач-ве параметра сторону квадрата

        var actResult = square.getArea();
        //затем вызываем метод getArea() в этом объекте, метод будет брать данные из объекта, в котором он вызывается

        var expResult = 25.;

        Assertions.assertEquals(expResult, actResult);
    }

    @Test
    void canCalculatePerimeter() {
        Assertions.assertEquals(20.0, new Square(5.).getPerimeter());
    }
}
