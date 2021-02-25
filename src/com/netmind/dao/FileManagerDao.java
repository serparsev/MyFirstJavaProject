package com.netmind.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.netmind.model.Student;

public class FileManagerDao {

	private static final String FILE_PATH = "C:\\Users\\serpa\\eclipse-workspace\\testFile.csv";
	private static final String CSV_SEPARATOR = ",";

	public static void createFile() {
		File file = new File(FILE_PATH);

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

	public static void writeCSV(Student student) {
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(FILE_PATH, true));
			StringBuilder sb = new StringBuilder();

			sb.append(student.getIdStudent());
			sb.append(CSV_SEPARATOR);
			sb.append(student.getName());
			sb.append(CSV_SEPARATOR);
			sb.append(student.getSurname());
			sb.append(CSV_SEPARATOR);
			sb.append(student.getAge());
			sb.append(CSV_SEPARATOR);
			sb.append(student.getDateOfBirth());
			sb.append("\n");

			pw.write(sb.toString());
			pw.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void readCSV() {
		try {
			BufferedReader br = new BufferedReader(new FileReader(FILE_PATH));
			String line;

			while ((line = br.readLine()) != null) {
				String values[] = line.split(",");
				System.out.println(values[0]);
				System.out.println(values[1]);
				System.out.println(values[2]);
				System.out.println(values[3]);
				System.out.println(values[4]);
				System.out.println("");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
