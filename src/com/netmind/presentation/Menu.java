package com.netmind.presentation;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

import com.netmind.business.StudentBl;
import com.netmind.dao.StudentDao;
import com.netmind.model.Student;

public class Menu {

	private static Integer idStudent;
	private static String name;
	private static String surname;
	private static Integer age;
	private static Date dateOfBirth;

	public static void menu() {

		Scanner scanner = new Scanner(System.in);
		StudentBl studentBl = new StudentBl();
		StudentDao studentDao = new StudentDao();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		ZoneId defaultZoneId = ZoneId.systemDefault();

		int value;
		boolean exit = false;

		while (!exit) {

			System.out.println("Eligue una opcion:");
			System.out.println("1- Insertar nuevo alumno");
			System.out.println("2- Calcular el estudiante de mayor edad");
			System.out.println(
					"3- Calcular la media de edad de todos los estudiantes");
			System.out.println("4- Mostrar todos los estudiantes");
			System.out.println("5- Salir");

			value = Integer.parseInt(scanner.nextLine());
			switch (value) {

			case 1:
				System.out.println("1- Insertar nuevo alumno");
				System.out.println("Id del estudiante:");
				idStudent = Integer.parseInt(scanner.nextLine());

				System.out.println("Nombre del estudiante:");
				name = scanner.nextLine();

				System.out.println("Apellido del estudiante:");
				surname = scanner.nextLine();

				System.out.println(
						"Fecha de nacimiento del estudiante (dd/mm/yyyy):");
				String stringDate = scanner.nextLine();

				LocalDate birthDate = LocalDate.parse(stringDate, formatter);

				dateOfBirth = Date.from(
						birthDate.atStartOfDay(defaultZoneId).toInstant());

				age = studentBl.calculateAge(birthDate);

				Student student = new Student.Builder(idStudent, name, surname)
						.age(age).dateOfBirth(dateOfBirth).build();

				studentDao.add(student);

				break;
			case 4:
				studentDao.list();
				break;
			case 5:
				exit = true;
				scanner.close();
				System.out.println("Hasta otra!");
				break;

			}
		}

	}

}
