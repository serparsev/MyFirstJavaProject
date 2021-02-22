package com.netmind.presentation;

import java.util.Scanner;

import com.netmind.business.StudentBl;
import com.netmind.dao.StudentDao;

public class Menu {

	public static void menu() {

		Scanner scanner = new Scanner(System.in);
		StudentBl studentBl = new StudentBl();
		StudentDao studentDao = new StudentDao();

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

			value = scanner.nextInt();
			switch (value) {

			case 1:
				studentBl.add();
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
