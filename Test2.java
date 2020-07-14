package com.day5.remote;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CommandTest {
	static UniversalRemote uremote;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		 uremote=new UniversalRemote();
		uremote.useRemote(1);
		uremote.setCommand(new NewsCommand(), 1);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
	
		String result1=uremote.useRemote(1);
		System.out.println(result1);
		assertEquals("onhdmnews", result1);
		
	}

}
