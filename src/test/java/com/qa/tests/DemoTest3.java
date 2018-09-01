package com.qa.tests;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class DemoTest3 {
	
	@Test
	public void sum()
	{
		System.out.println("SUM");
		int a = 20;
		int b = 30;
		
		Assert.assertEquals(50, a+b);
	}

	@Test
	public void sub()
	{
		System.out.println("SUB");
		int a = 20;
		int b = 30;
		
		Assert.assertEquals(10, b-a);
	}
	
	@Test
	public void div()
	{
		System.out.println("DIV");
		int a = 10;
		int b = 30;
		
		Assert.assertEquals(3, b/a);
	}
	
	@Test
	public void mul()
	{
		System.out.println("MUL");
		int a = 20;
		int b = 30;
		
		Assert.assertEquals(600, a*b);
	}
}
