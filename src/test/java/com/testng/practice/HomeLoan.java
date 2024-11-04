package com.testng.practice;

import org.testng.annotations.Test;

public class HomeLoan {
	@Test
	public void webLoginHomeLoan() {
		System.out.println("Web Home loan");
	}

	@Test
	public void mobileLoginHomeLoan() {
		System.out.println("Mobile Home Loan");
	}

	@Test(groups = { "Smoke" })
	public void mobile2() {
		System.out.println("Mobile Home2 Loan");
	}

	@Test
	public void mobile3() {
		System.out.println("Mobile Home3 Loan");
	}

	@Test
	public void loginAPIHomeLoan() {
		System.out.println("Log API Home Loan");
	}
}
