package applicatiion;

import entities.Employee;

public class Program {
    static void main(){
        Employee employee = new Employee();


        employee.name = IO.readln("Name: ");

        employee.grossSalary = Double.parseDouble(IO.readln("Gross salary: "));
        employee.tax = Double.parseDouble(IO.readln("Tax: "));

        IO.println("Employee: " + employee);

        double percentage = Double.parseDouble(IO.readln("Which percentage to increase salary? "));
        employee.increaseSalary(percentage);

        IO.println("Updated data: " + employee);


    }
}
