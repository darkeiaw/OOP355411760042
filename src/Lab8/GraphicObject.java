package Lab8;

public abstract class GraphicObject {

    private String color;

    //adstract methods
    abstract void draw();
    abstract void findArea();

    public GraphicObject(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "GraphicObject{" +
                "color='" + color + '\'' +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
