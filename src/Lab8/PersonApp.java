package Lab8;

public class PersonApp {
    public static void main (String[] args){
        Person person1,person2,person3;
        person1 = new Person("Dark","P001","1985");
        person2 = new Sheriff("Omega","P002","1984","Sun");
        person3 = new Police("Death","P003","1984","Earth");

        person1.introdoce();
        person2.introdoce();
        person3.introdoce();
    }
}
