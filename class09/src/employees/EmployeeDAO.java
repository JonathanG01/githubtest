package employees;

import java.util.List;

public interface EmployeeDAO { //perform in database;
void addEmployee(Employee emp);
void updateEmployee(Employee emp); //pass employee object
void deleteEmployee(int id);//pass employee id

//get all employees
List<Employee> getEmployees(); //method to return list of employees;
Employee employeeById(int id); // method to return a single employee;

}
