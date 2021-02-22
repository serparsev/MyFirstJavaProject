package com.netmind.business;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

import com.netmind.dao.StudentDao;
import com.netmind.model.Student;

public class StudentBl {

	private Integer idStudent;
	private String name;
	private String surname;
	private Integer age;
	private Date dateOfBirth;

	public boolean add() {
		Scanner scanner = new Scanner(System.in);
		StudentDao studentDao = new StudentDao();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		ZoneId defaultZoneId = ZoneId.systemDefault();

		System.out.println("Id del estudiante:");
		idStudent = scanner.nextInt();

		System.out.println("Nombre del estudiante:");
		scanner.nextLine();
		name = scanner.nextLine();

		System.out.println("Apellido del estudiante:");
		surname = scanner.nextLine();

		System.out.println("Fecha de nacimiento del estudiante (dd/mm/yyyy):");
		String stringDate = scanner.nextLine();

		LocalDate birthDate = LocalDate.parse(stringDate, formatter);

		dateOfBirth = Date
				.from(birthDate.atStartOfDay(defaultZoneId).toInstant());

		age = Period.between(birthDate, LocalDate.now()).getYears();

		Student student = new Student.Builder(idStudent, name, surname).age(age)
				.dateOfBirth(dateOfBirth).build();

		studentDao.add(student);

		return true;
	}

}
