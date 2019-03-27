package Lab9_10;

import java.sql.Connection;
import java.util.List;

public class empDAOlmpl implements EmployeeDAO {
    private static String driverName = "org.sqlite.JDBC";
    private static String url = "jdbc:sqlite:D:/Company/company.sqlite";
    private static Connection conn = null;


    //Constant operators
    private static empDAOlmpl instant = new empDAOlmpl();
    public static empDAOlmpl getInstant() {
        return instant;
    }
    //constructor

    private empDAOlmpl() {
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Driver Load Successful");
    }

    @Override
    public List<Employee> getALLEmp() {
        return null;
    }

    @Override
    public void addEmp(Employee newEmp) {

    }

    @Override
    public void updateEmp(Employee emp) {

    }

    @Override
    public void deleteEmp(int ID) {

    }

    @Override
    public Employee findEmp(int ID) {
        return null;
    }
}
