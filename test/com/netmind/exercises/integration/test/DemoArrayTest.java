package com.netmind.exercises.integration.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.netmind.exercises.DemoArray;

public class DemoArrayTest {

	@Test
	public void testSumArray() {
		DemoArray arr = new DemoArray();
		int[] array = arr.createArray();
		assertEquals(arr.sumEvenPositions(array), 2450);
	}

}
