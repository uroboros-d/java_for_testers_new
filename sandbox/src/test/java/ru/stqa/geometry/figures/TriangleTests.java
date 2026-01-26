package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {

    @Test
    void canCalculateArea() {
        var triangle = new Triangle(3., 4., 5.);
        //вызываем конструктор объкта и передаем в кач-ве параметра стороны треугольника

        var actResult = triangle.getArea();
        //затем вызываем метод getArea() в этом объекте, метод будет брать данные из объекта, в котором он вызывается

        var expResult = 6.;

        Assertions.assertEquals(expResult, actResult);
    }

    @Test
    void canCalculatePerimeter() {
        Assertions.assertEquals(12.0, new Triangle(3., 4., 5.).getPerimeter());
    }

}
