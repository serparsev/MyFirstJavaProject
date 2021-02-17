package com.netmind.ejercicios;

public class DemoArray {
	
	public int sumArray() {
		
		
		int suma = 0;
		int arr[] = new int[99];
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = i;
			
			if (i%2==0) {
				suma += i;
			}
		}
		
		return suma;
	}
	
}
