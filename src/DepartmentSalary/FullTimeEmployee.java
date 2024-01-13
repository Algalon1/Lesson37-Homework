/*
Создайте класс PartTimeEmployee и FullTimeEmployee, которые наследуются от Employee.
Помимо свойств и методов Employee данные классы должны иметь.
FullTimeEmployee:
свойство salary (зарплата)
метод getSalary (метод возвращает зп удержав 10 процентов налога)
 */

package DepartmentSalary;

public class FullTimeEmployee extends Employee {

    private double salary;

    public FullTimeEmployee(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    @Override
    public double getSalary(){
        return salary*0.9;
    }
}
