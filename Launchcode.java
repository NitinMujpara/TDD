package com.javatdd.chandrayan3;

import org.junit.Test;
import org.junit.Assert;


public class Launchcode {
	
	@Test
	public void findPosition() {
		
		char[] arr = {'f','r','u','b','l'};
		String expectedPosition = "N";
		PositionSearch ps = new PositionSearch();
		char position = ps.getPosition(arr);
		Assert.assertEquals(expectedPosition,position);
	}
}
