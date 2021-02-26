package com.netmind.model;

public enum EnumStudent {
	ADD_STUDENT(1), OLDEST_STUDENT(2), EXIT(5);

	private int value;

	private EnumStudent(int valu) {

	}

	public static EnumStudent fromValue(int value) {
		for (EnumStudent my : EnumStudent.values()) {
			if (my.value == value) {
				return my;
			}
		}
		return null;
	}

	public int value() {
		return value;
	}

}
