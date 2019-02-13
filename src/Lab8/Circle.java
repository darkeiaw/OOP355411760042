package Lab8;

public class Circle extends GraphicObject {
    private double radius;
    final double PI = 3.4;
    //area of circle = PI*(r*r)

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "} " + super.toString();
    }

    //getter and setter

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    void draw() {
       System.out.println("Drawing Circle...");
    }

    @Override
    void findArea() {
        System.out.println("The area is: "+(PI*(radius*radius)));

    }
}
