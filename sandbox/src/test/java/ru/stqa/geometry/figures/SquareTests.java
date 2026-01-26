package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTests {

    @Test
    void canCalculateArea() {
        var actResult = Square.getArea(5.);
        var expResult = 25.;
        Assertions.assertEquals(expResult, actResult);
    }

    @Test
    void canCalculatePerimeter() {
        Assertions.assertEquals(20.0, Square.getPerimeter(5.0));
    }
}
