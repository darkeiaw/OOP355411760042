package CaseStudy;

public class Customer {
    private String name;
    private int yearBorn;

    public Customer(String name, int yearBorn) {
        this.name = name;
        this.yearBorn = yearBorn;
    }

    public String getName() {
        return name;
    }

    public int getYearBorn() {
        return yearBorn;
    }

    public void setName(String name) {
        this.name = name;
    }
}
