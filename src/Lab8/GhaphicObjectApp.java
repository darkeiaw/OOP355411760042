package Lab8;

public class GhaphicObjectApp {
    public static void main(String[] args) {

        Rectangle rec = new Rectangle("Red", 20.0, 5.0);
        System.out.println(rec.toString());
        rec.findArea();
        rec.draw();

        Circle myCir = new Circle("blue",5.0);
        myCir.toString();
                myCir.draw();
                myCir.findArea();

    }
}
