package Lab8;

public class Sheriff extends Person{
        private String workState;

    @Override
    public void introdoce() {
        super.introdoce();
        System.out.println("I'm sheriff work at "+this.workState);
    }

    public Sheriff(String name, String pid, String bornYear, String workState) {
        super(name, pid, bornYear);
        this.workState = workState;

    }

    public String getWorkState() {
        return workState;
    }

    public void setWorkState(String workState) {
        this.workState = workState;
    }
}