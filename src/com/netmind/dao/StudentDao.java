package com.netmind.dao;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.netmind.model.Student;

public class StudentDao {

	private static final String FILE_PATH = "C:\\Users\\serpa\\eclipse-workspace\\testFile.txt";

	private static ArrayList<Student> studentList = null;

	static {
		studentList = new ArrayList<Student>();

	}

	public StudentDao() {
		File file = new File(FILE_PATH);

		// Create the file
		try {
			if (file.createNewFile()) {
				System.out.println("File is created!");
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean add(Student student) {
		studentList.add(student);
		return true;

	}
}
