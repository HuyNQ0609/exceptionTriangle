public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("The value of the side must be greater than 0!");
        } else if (a + b <= c || b + c <= a || c + a <= b) {
            throw new IllegalTriangleException("The sum of 2 of the 3 sides must be greater than the other side!");
        } else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getPerimeter() {
        return a + b + c;
    }

    public double getArea() {
        return Math.sqrt((a + b + c) * (b + c - a) * (a + b - c) * (a + c - b)) / 4;
    }
}
