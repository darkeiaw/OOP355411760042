package Lab8;

public class Rectangle extends GraphicObject {
    private double width,high;

    @Override
    void draw() {
        System.out.println("Drawing Rectangle...");
    }

    @Override
    void findArea() {
        System.out.println("The area is: "+this.width*this.high);
    }

    public Rectangle(String color, double width, double high) {
        super(color);
        this.width = width;
        this.high = high;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", high=" + high +
                "} " + super.toString();
    }
    //getter and setter


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }
}
