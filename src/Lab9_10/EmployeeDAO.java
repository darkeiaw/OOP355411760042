package Lab9_10;

import java.util.List;

public interface EmployeeDAO {
    public List <Employee> getALLEmp();
    public void addEmp (Employee newEmp);
    public void updateEmp (Employee emp);
    public void deleteEmp (int ID);
    public Employee findEmp (int ID);
}
