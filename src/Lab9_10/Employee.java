package Lab9_10;

public class Employee {
    private int ID;
    private String Name;
    private String Position;
    private double Salary;
    //constructor

    public Employee(int ID, String name, String position, double salary) {
        this.ID = ID;
        Name = name;
        Position = position;
        Salary = salary;
    }

    //getter and setter methods

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }
    //toString


    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", Position='" + Position + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
