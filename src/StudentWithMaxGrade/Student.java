/*
Журнал оценок студентов:

Условие: Необходимо создать класс StudentWithMaxGrade.Student со свойствами name, age и grade.
Добавьте метод grade, который возвращает оценку.
Создайте ArrayList из 5 студентов. Найдите объект студента с максимальной оценкой.
 */

package StudentWithMaxGrade;

import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public double getGrade() {
        return this.grade;
    }

    public static String findIndexByMaxGrade(ArrayList<Student> array, double maxGrade){
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getGrade() == maxGrade){
                return array.get(i).toString();
            }
        }
       return "not found";
    }

    @Override
    public String toString() {
        return String.format("Name: %s, age: %d, grade: %.1f",this.name,this.age,this.grade);
    }

    public String info(){
        return String.format("Name: %s, age: %d, grade: %.1f",this.name,this.age,this.grade);
    }
}
