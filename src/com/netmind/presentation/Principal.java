package com.netmind.presentation;

import com.netmind.business.Calculator;
import com.netmind.exercises.DemoArray;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hola Mundo");
//		
//		Calculator calculator = new Calculator();
		
		DemoArray array = new DemoArray();
		
		int arr[] = array.createArray();
		
		System.out.println(array.sumEvenPositions(arr));

	}

}
