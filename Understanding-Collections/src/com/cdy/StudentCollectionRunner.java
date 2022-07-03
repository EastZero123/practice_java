package com.cdy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		return Integer.compare(student1.getId(), student2.getId());
	}

}

public class StudentCollectionRunner {

	public static void main(String[] args) {
		List<Student> students = List.of(new Student(1, "Range"), new Student(100, "Adam"), new Student(2, "Eve"));
		ArrayList<Student> studentsAl = new ArrayList<>(students);

		System.out.println(students);

		Collections.sort(studentsAl);
		System.out.println(studentsAl);

		// Collections.sort(studentsAl, new DescendingStudentComparator());
		studentsAl.sort(new DescendingStudentComparator());
		System.out.println("DescendingStudentComparator " + studentsAl);
	}
}
