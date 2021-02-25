package com.netmind.dao;

import static com.netmind.dao.FileManagerDao.createFile;
import static com.netmind.dao.FileManagerDao.writeCSV;

import java.util.ArrayList;

import com.netmind.model.Student;

public class StudentDao {

	private static ArrayList<Student> studentList = null;

	static {
		studentList = new ArrayList<Student>();
		createFile();

	}

	public boolean add(Student student) {
		studentList.add(student);
		writeCSV(student);
		return true;

	}
}
