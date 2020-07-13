package com.test.day6;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestDemo {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Set up before called...!");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Tear Down after class is called...!");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Befor setup method is called..!");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After tear down is called..!");
	}
    @Ignore
	@Test(timeout=2000)
	public void test() {
		int result=new Calculater().add(10,20);
		assertEquals(30,result);
		}
	@Test(expected = ArithmeticException.class)
	public void test1() {
		int i=1/0;
		assertEquals(30,12);
		}
	@Test
	public void test2() {
		String result="Hello";
		assertEquals("hello",result);
		}
}
