package com.testng.practice;

import org.testng.annotations.Test;

public class CarLoan {

	@Test(groups = { "Smoke" })
	public void webLoginCarLoan() {
		System.out.println("Web Login Car");
	}

	@Test
	public void mobileLoginCarLoan() {
		System.out.println("Mobile Login Car");
	}

	@Test(dependsOnMethods = { "mobileLoginCarLoan" })
	public void loginAPICarLoan() {
		System.out.println("Log API Car Loan");
	}

}
