package Lab9_10;

import java.util.List;

public class EmployeeApp {
    public static void main (String [] args){
        empDAOlmpl dao = empDAOlmpl.getInstant();

        //Get_All_Emp
        showData(dao);
        //ADD_NEW_EMP(Create)
        //dao.addEmp(new Employee(103,"Zone","Rogue",200000));
        //Find Employee
        System.out.println("Find Employee with ID:");
        Employee emp = dao.findEmp(1);
        System.out.println(emp.toString());

        //Update Employee
        emp.setSalary(250000);
        dao.updateEmp(emp);//update data in database
        showData(dao);
        //Delete Employee
        dao.deleteEmp(2);
        showData(dao);

    }

    private static void showData(empDAOlmpl dao) {
        List<Employee> myEmp = dao.getALLEmp();
        System.out.println("Employee Data in Database");

        for (Employee emp:myEmp) {
            System.out.println(emp.toString());

        }
    }
}
