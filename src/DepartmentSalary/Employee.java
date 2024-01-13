//Условие: Необходимо создать класс Employee со свойствами firstName и lastName и методом info,
// который возвращает строку с именем и фамилией сотрудника.
// Создайте класс PartTimeEmployee и FullTimeEmployee, которые наследуются от Employee.
// Создайте массив ArrayList из 5 сотрудников (среди которых и PartTimeEmployee и FullTimeEmployee)
// и найдите общую зарплату, которую получат все сотрудники.

package DepartmentSalary;

abstract public class Employee {
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String info(){
        return String.format("%s %s",this.firstName,this.lastName);
    }

    public abstract double getSalary();
}
