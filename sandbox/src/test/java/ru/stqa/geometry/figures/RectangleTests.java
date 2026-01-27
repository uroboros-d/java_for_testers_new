package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTests {

    @Test
    // тест сравнения 2 прямоугольников
    void testEquality() {
        var rectangleOne = new Rectangle(5,2);
        var rectangleTwo = new Rectangle(5,2);
        Assertions.assertEquals(rectangleOne, rectangleTwo);
    }

    @Test
        // тест сравнения 2 прямоугольников
    void testEqualityTwo() {
        var rectangleOne = new Rectangle(5,2);
        var rectangleTwo = new Rectangle(2,5);
        Assertions.assertEquals(rectangleOne, rectangleTwo);
    }
}
