package com.netmind.model;

import java.util.Date;

public class Student {

	private final Integer idStudent;
	private final String name;
	private final String surname;
	private final Integer age;
	private final Date dateOfBirth;

	public static class Builder {
		// Required parameters
		private final Integer idStudent;
		private final String name;
		private final String surname;

		// Optional parameters - inizializated to default values
		private Integer age = 0;
		private Date dateOfBirth = null;

		public Builder(Integer idStudent, String name, String surname) {
			this.idStudent = idStudent;
			this.name = name;
			this.surname = surname;
		}

		public Builder dateOfBirth(Date value) {
			dateOfBirth = value;
			return this;
		}

		public Builder age(Integer value) {
			age = value;
			return this;
		}

		public Student build() {
			return new Student(this);
		}
	}

	private Student(Builder builder) {
		idStudent = builder.idStudent;
		name = builder.name;
		surname = builder.surname;
		age = builder.age;
		dateOfBirth = builder.dateOfBirth;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [idStudent=");
		builder.append(idStudent);
		builder.append(", name=");
		builder.append(name);
		builder.append(", surname=");
		builder.append(surname);
		builder.append(", age=");
		builder.append(age);
		builder.append(", dateOfBirth=");
		builder.append(dateOfBirth);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result
				+ ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result
				+ ((idStudent == null) ? 0 : idStudent.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (idStudent == null) {
			if (other.idStudent != null)
				return false;
		} else if (!idStudent.equals(other.idStudent))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

}
