package com.test2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PersonalLoan {
	@BeforeTest
	public void prerequisite() {
		System.out.println("Prerequisites");
	}

	@Test
	public void webLoginHomeLoan() {
		System.out.println("Web Personal loan");
	}

	@AfterTest
	public void testCompletion() {
		System.out.println("testCompletion");
	}
}
