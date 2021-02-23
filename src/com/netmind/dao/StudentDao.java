package com.netmind.dao;

import java.util.ArrayList;

import com.netmind.model.Student;

public class StudentDao {

	private static ArrayList<Student> studentList = null;

	static {
		studentList = new ArrayList<Student>();

	}

	public boolean add(Student student) {
		studentList.add(student);
		System.out.println("Estudiante añadido correctamente \n");
		System.out.println(student);
		return true;

	}

	public boolean list() {
		System.out.println(studentList);
		return true;
	}

}
