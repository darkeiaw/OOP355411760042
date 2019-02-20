package Lab8;

public class Police extends Person{
        private String  workCountry;

    @Override
    public void introdoce() {
        super.introdoce();
        System.out.println("I'm Police work at "+this. workCountry);
    }

    public Police(String name, String pid, String bornYear, String  workCountry) {
        super(name, pid, bornYear);
        this. workCountry =  workCountry;

    }

    public String getWorkCountry() {
        return  workCountry;
    }

    public void setWorkCountry(String  workCountry) {
        this.workCountry =  workCountry;
    }
}