package com.qa.main;

public class Runner {

	private float cost;
	private float payment;

	public void coinage(float cost, float payment) {
		this.cost = cost;
		this.payment = payment;
		float change = (this.payment - this.cost);
		
		System.out.println(change);
	}

}

// WHAT IS GOING ON??