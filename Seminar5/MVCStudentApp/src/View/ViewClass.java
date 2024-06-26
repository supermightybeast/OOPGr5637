
package View;

import java.util.List;
import java.util.Scanner;

import Controller.Interfaces.iGetView;
import Model.Domain.Student;

public class ViewClass implements iGetView {
	public void printAllStudents(List<Student> students) {
		System.out.println("--- Список студентов ---");
		for (Student s : students) {
			System.out.println(s);
		}
		System.out.println("--- --- ---");
	}

	public String prompt(String message) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(message);
		return scanner.nextLine();
	}
}
