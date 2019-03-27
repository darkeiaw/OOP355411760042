package Lab9_10;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class empDAOlmpl implements EmployeeDAO {
    private static String driverName = "org.sqlite.JDBC";
    private static String url = "jdbc:sqlite:D:/Company/company.sqlite";
    private static Connection conn = null;

    //Constant operators
    public static final String GET_ALL_EMP = "select * from employee";
    public static final String ADD_NEW_EMP = "insert into employee (ID,Name,Position,Salary) values (?,?,?,?)";
    public static final String UPDATE_EMP = "update employee set " + "Name=?,Position=?,Salary=? where ID=?";
    public static final String FIND_BY_ID = "select *"+"from employee where id = ?";
    public static final String DELETE_EMP = "delete from employee where ID = ?";
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
        System.out.println("Load  Driver  Successful");
    }

    @Override
    public List<Employee> getALLEmp() {
        List<Employee> emp = new ArrayList<Employee>();
        try {
            conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(GET_ALL_EMP);

            while (rs.next()){
                int ID = rs.getInt(1);
                String Name = rs.getString(2);
                String Position = rs.getString(3);
                double Salary = rs.getInt(4);

                emp.add(new Employee(ID,Name,Position,Salary));

            }
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return emp;
    }

    @Override
    public void addEmp(Employee newEmp) {
        try {
            conn = DriverManager.getConnection(url);
            PreparedStatement stmt = conn.prepareStatement(ADD_NEW_EMP);

            stmt.setInt(1,newEmp.getID());
            stmt.setString(2,newEmp.getName());
            stmt.setString(3,newEmp.getPosition());
            stmt.setDouble(4,newEmp.getSalary());
            boolean ex = stmt.execute();
            if (ex==false)System.out.println("Add new employee already.");
            else System.out.println("Could not add data.");

            stmt.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void updateEmp(Employee emp) {
        try {
            conn = DriverManager.getConnection(url);
            PreparedStatement ps =conn.prepareStatement(UPDATE_EMP);
            ps.setString(1,emp.getName());
            ps.setString(2,emp.getPosition());
            ps.setDouble(3,emp.getSalary());
            ps.setInt(4,emp.getID());

            int rs = ps.executeUpdate();
            if (rs !=0)
                System.out.println("Information of employee with ID"+ emp.getID() + "was updated.");
            else {
                System.out.println("Could not update information" + "with employee ID:"+emp.getID());
            }
            ps.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void deleteEmp(int ID) {
        try {
            conn = DriverManager.getConnection(url);
            PreparedStatement ps = conn.prepareStatement(DELETE_EMP);
            ps.setInt(1,ID);
            int rs = ps.executeUpdate();
            if (rs !=0){
                System.out.println("Employee with ID:" + ID + "was deleted");

            }else {
                System.out.println("No employee was deleted with ID ="+ID);
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public Employee findEmp(int ID) {
        Employee emp = null;
        try {
            conn = DriverManager.getConnection(url);
            PreparedStatement ps = conn.prepareStatement(FIND_BY_ID);

            ps.setInt(1,ID);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int IDD = rs.getInt(1);
                String Name = rs.getString(2);
                String Position = rs.getString(3);
                double Salary = rs.getDouble(4);

                emp = new Employee(IDD, Name, Position, Salary);
            }else{System.out.println("Employee with ID = "+ID +"not found.");}

            rs.close();
            ps.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return emp;
    }
}
