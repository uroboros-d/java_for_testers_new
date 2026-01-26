package ru.stqa.geometry.figures;

public record Triangle(double sideOne, double sideTwo, double sideThree) {

    public double getPerimeter() {
        return this.sideOne + this.sideTwo + this.sideThree;
    }

    public double getArea() {

        var p = (this.sideOne + this.sideTwo + this.sideThree)/2;
        return Math.sqrt(p*(p-this.sideOne)*(p-this.sideTwo)*(p-this.sideThree));
    }
}
