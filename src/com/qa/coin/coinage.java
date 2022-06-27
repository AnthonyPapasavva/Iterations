package com.qa.coin;

public class coinage {
	
	public static void makeChange(int cost, int amount) {
		int change = amount - cost;
		
		int twentyPound = 0;
		int twentyPence = 0;
		int twoPence = 0;
		int onePence = 0;
		
		while (change > 0) {
			if (change >= 2000) {
				twentyPound++;
				change -= 2000;
			}
			else if (change >= 20) {
				twentyPence++;
				change -= 20;
				}
			else if (change >= 2) {
				twoPence++;
				change -= 2;
				}
			else if (change >= 1) {
				onePence++;
				change -= 1;
				}	
	}
}
}

// WHAT IS GOING ON??


// Function expects a cost and an amount
// Most programs don't work that well with decimals and floats, therefore:
// its often better to multiply by 100 and work with int.
// 



