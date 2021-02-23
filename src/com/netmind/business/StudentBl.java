package com.netmind.business;

import java.time.LocalDate;
import java.time.Period;

public class StudentBl {

	public int calculateAge(LocalDate birthDate) {

		int age = Period.between(birthDate, LocalDate.now()).getYears();

		return age;
	}

}
