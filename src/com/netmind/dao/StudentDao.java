package com.netmind.dao;

import java.util.ArrayList;

import com.netmind.model.Student;

public class StudentDao {

	static ArrayList<Student> list = new ArrayList<>();

	public boolean add(Student student) {

		list.add(student);
		System.out.println("Estudiante añadido correctamente \n");

		return true;

	}

	public void list() {

		System.out.println(list + "\n");

	}

}
