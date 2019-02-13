package Lab8;

public class EmployeeApp {
    public static void main(String[] args) {

        Employee emp = new Employee("Eiaw","PID191","Lecturer",15000);

        System.out.println(emp.toString());
        System.out.println(emp.getPid());
    }
}
