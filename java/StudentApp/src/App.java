import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Controllers.AccountController;
import Domain.Employee;
import Domain.PersonComparator;
import Domain.Student;
import Domain.StudentGroup;
import Domain.Teacher;

public class App {
    public static void main(String[] args) throws Exception {

        Student s1 = new Student("Алексей", 25);
        Student s2 = new Student("Жора", 23);
        Student s3 = new Student("Алексей", 22);
        Student s4 = new Student("Жора",  23);
        Student s5 = new Student("Надежда",  23);
        Student s6 = new Student("Максим",  23);

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);
        

        StudentGroup group4580 = new StudentGroup(listStud, 4580);
        System.out.println(group4580);

        for(Student std : group4580)
        {
            System.out.println(std);
        }

        System.out.println("=========================================================");

        Collections.sort(group4580.getGroup());

        for(Student std: group4580.getGroup())
        {
            System.out.println(std);
        }

        Teacher t1 = new Teacher("Екатерина", 55, "Docent");
        Teacher t2 = new Teacher("Ольга", 57, "Docent");

        System.out.println(new PersonComparator<Student>().compare(s1, s3));

        Employee e1 = new Employee("Николай", 55, "Разнорабочий");


       AccountController.paySalary(t1, 50000);
       AccountController.paySalary(t2, 30000);
       
       AccountController.paySalary(e1, 20000);
       
       System.out.println(AccountController.averageAge(listStud));


    }
}