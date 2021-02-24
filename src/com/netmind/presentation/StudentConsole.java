package com.netmind.presentation;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

import com.netmind.business.StudentBl;
import com.netmind.model.Student;

public class StudentConsole {

	public static void showMenu() {

		Scanner scanner = new Scanner(System.in);
		StudentBl studentBl = new StudentBl();

		int value;
		boolean exit = false;

		while (!exit) {
			showPrincipalMenu();
			value = Integer.parseInt(scanner.nextLine());

			switch (value) {
			case 1:
				Student student = new Student();
				addStudent(student, scanner);
				studentBl.add(student);
				break;
			case 4:
				break;
			case 5:
				exit = true;
				scanner.close();
				System.out.println("Hasta otra!");
				break;
			}
		}
	}

	private static void showPrincipalMenu() {

		System.out.println("Eligue una opcion:");
		System.out.println("1- Insertar nuevo alumno");
		System.out.println("2- Calcular el estudiante de mayor edad");
		System.out.println(
				"3- Calcular la media de edad de todos los estudiantes");
		System.out.println("4- Mostrar todos los estudiantes");
		System.out.println("5- Salir");
	}

	private static boolean addStudent(Student student, Scanner scanner) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		ZoneId defaultZoneId = ZoneId.systemDefault();

		System.out.println("1- Insertar nuevo alumno");
		System.out.println("Id del estudiante:");
		student.setIdStudent(Integer.parseInt(scanner.nextLine()));

		System.out.println("Nombre del estudiante:");
		student.setName(scanner.nextLine());

		System.out.println("Apellido del estudiante:");
		student.setSurname(scanner.nextLine());

		System.out.println("Fecha de nacimiento del estudiante (dd/mm/yyyy):");
		String stringDate = scanner.nextLine();

		LocalDate birthDate = LocalDate.parse(stringDate, formatter);

		student.setDateOfBirth(
				Date.from(birthDate.atStartOfDay(defaultZoneId).toInstant()));

		return true;

	}

}
