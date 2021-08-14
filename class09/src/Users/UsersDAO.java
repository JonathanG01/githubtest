package Users;

import java.util.List;
//DAO all methods that wll be performed on users table;

public interface UsersDAO { //perform in database;
void addUsers(Users user);
void updateUsers(Users user); //pass employee object
void deleteUsers(int id);//pass employee id
void withdraw(Users users, double balance, double amount);
void deposit(Users users, double balance, double amount);


//get all employees
List<Users> getUsers(); //method to return list of employees;
//Users usersById(int id); // method to return a single employee;

}
