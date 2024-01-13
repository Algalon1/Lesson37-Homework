import Contacts.Contact;
import DepartmentSalary.Employee;
import DepartmentSalary.FullTimeEmployee;
import DepartmentSalary.PartTimeEmployee;
import StudentWithMaxGrade.Student;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Alex","+380975232323"));
        contacts.add(new Contact("Oleg","+380954234232"));
        contacts.add(new Contact("Anna","+380679879423"));
        contacts.add(new Contact("Max","+380050693253"));
        contacts.add(new Contact("Igor","+380094325235"));
        System.out.println("-------------------------------------------------------------");
        for (Contact elem:contacts) {
            System.out.println( elem.info());
        }
        System.out.println();

        System.out.println("Looking for the contact with name Oleg: "+Contact.findName(contacts,"Oleg"));
        System.out.println("Looking for the contact with name Felix: "+Contact.findName(contacts,"Felix"));

        System.out.println();

        System.out.println("Looking for the contact with phone number +380050693253: "+Contact.findPhoneNumber(contacts,"+380050693253"));
        System.out.println("Looking for the contact with phone number +380010693253: "+Contact.findPhoneNumber(contacts,"+12345678901"));
        System.out.println("-------------------------------------------------------------");
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Max",16,4.8));
        students.add(new Student("Nikita",18,6.2));
        students.add(new Student("Inga",17,4.2));
        students.add(new Student("Anton",19,5));

        for (Student elem:students) {
            System.out.println( elem.info());
        }
        System.out.println();



        double maxGrade = students.get(0).getGrade();

        for (Student elem:students) {
            if (elem.getGrade()>maxGrade){
                maxGrade = elem.getGrade();
            }
        }
        System.out.println("Student with max grade is: "+Student.findIndexByMaxGrade(students,maxGrade));
        System.out.println("-------------------------------------------------------------");
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new PartTimeEmployee("Sergo","Amandes",15.0,80));
        employees.add(new PartTimeEmployee("Oleg","Kornev",23.0,67));
        employees.add(new PartTimeEmployee("Anatoly","Martinez",21.5,100));
        employees.add(new FullTimeEmployee("Andrew","Ford",3400));
        employees.add(new FullTimeEmployee("Michael","Martinez",2750));

        for (Employee elem:employees) {
            System.out.println( elem.info());
        }
        System.out.println();

        System.out.println();

        double totalDepartmentSalary = 0;

        for (Employee elem:employees) {
            totalDepartmentSalary+= elem.getSalary();
        }

        System.out.println("Total department salary is: "+totalDepartmentSalary);



    }
}
