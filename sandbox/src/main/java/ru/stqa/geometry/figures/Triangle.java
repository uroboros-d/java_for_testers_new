package ru.stqa.geometry.figures;

public record Triangle(double sideOne, double sideTwo, double sideThree) {

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return (Double.compare(this.sideOne, triangle.sideOne) == 0 && Double.compare(this.sideTwo, triangle.sideTwo) == 0 && Double.compare(this.sideThree, triangle.sideThree) == 0)
                ||
                // добавил условие ниже после неуспешной 1 попытки
                (Double.compare(this.sideOne, triangle.sideOne) == 0 && Double.compare(this.sideTwo, triangle.sideThree) == 0 && Double.compare(this.sideThree, triangle.sideTwo) == 0)
                ||
                // добавил условие ниже после неуспешной 1 попытки
                (Double.compare(this.sideOne, triangle.sideTwo) == 0 && Double.compare(this.sideTwo, triangle.sideOne) == 0 && Double.compare(this.sideThree, triangle.sideThree) == 0)
                ||
                (Double.compare(this.sideOne, triangle.sideTwo) == 0 && Double.compare(this.sideTwo, triangle.sideThree) == 0 && Double.compare(this.sideThree, triangle.sideOne) == 0)
                ||
                (Double.compare(this.sideOne, triangle.sideThree) == 0 && Double.compare(this.sideTwo, triangle.sideOne) == 0 && Double.compare(this.sideThree, triangle.sideTwo) == 0)
                ||
                // добавил условие ниже после неуспешной 1 попытки
                (Double.compare(this.sideOne, triangle.sideThree) == 0 && Double.compare(this.sideTwo, triangle.sideTwo) == 0 && Double.compare(this.sideThree, triangle.sideOne) == 0);
    }

    @Override
    public int hashCode() {
        return 1;
    }

    public  Triangle {
        if (sideOne < 0 || sideTwo < 0 || sideThree < 0) {
            throw new IllegalArgumentException("Triangle side must be non-negative");
        }
        if (sideOne + sideTwo < sideThree ||
                sideOne + sideThree < sideTwo ||
                sideTwo + sideThree < sideOne) {
            throw new IllegalArgumentException("The sum of any two triangle sides must not be less than the third triangle side");
        }
    }
    public double getPerimeter() {
        return this.sideOne + this.sideTwo + this.sideThree;
    }

    public double getArea() {

        var p = (this.sideOne + this.sideTwo + this.sideThree)/2; //p - semiperimeter
        return Math.sqrt(p*(p-this.sideOne)*(p-this.sideTwo)*(p-this.sideThree));
    }
}
