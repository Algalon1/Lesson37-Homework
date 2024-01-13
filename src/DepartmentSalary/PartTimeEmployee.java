/*
Создайте класс PartTimeEmployee и FullTimeEmployee, которые наследуются от Employee.
Помимо свойств и методов Employee данные классы должны иметь.
PartTimeEmployee:
свойство perHour (ставка за час)
свойство totalTime (кол-во отработанных часов)
метод getSalary (метод возвращает произведение отработанных часов и ставку)
 */

package DepartmentSalary;

public class PartTimeEmployee extends Employee {
    private double salaryPerHour;
    private int totalTime;

    public PartTimeEmployee(String firstName, String lastName, double salaryPerHour, int totalTime) {
        super(firstName, lastName);
        this.salaryPerHour = salaryPerHour;
        this.totalTime = totalTime;
    }

    @Override
    public double getSalary(){
        return salaryPerHour*totalTime;
    }

//    @Override
//    public String info(){
//        return String.format("%s ",super.info(),)
//    }
}
