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

	public boolean add(Student student) {
		Scanner scanner = new Scanner(System.in);
		StudentDao studentDao = new StudentDao();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		ZoneId defaultZoneId = ZoneId.systemDefault();

		System.out.println("Id del estudiante:");
		student.setIdStudent(scanner.nextInt());

		System.out.println("Nombre del estudiante:");
		scanner.nextLine();
		student.setName(scanner.nextLine());

		System.out.println("Apellido del estudiante:");
		student.setSurname(scanner.nextLine());

		System.out.println("Fecha de nacimiento del estudiante (dd/mm/yyyy):");
		String stringDate = scanner.nextLine();

		LocalDate birthDate = LocalDate.parse(stringDate, formatter);

		Date classDate = Date
				.from(birthDate.atStartOfDay(defaultZoneId).toInstant());
		student.setDateOfBirth(classDate);

		Period age = Period.between(birthDate, LocalDate.now());
		student.setAge(age.getYears());

		studentDao.add(student);

		return true;
	}

}
