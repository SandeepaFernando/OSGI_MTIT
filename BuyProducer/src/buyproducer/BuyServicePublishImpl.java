package buyproducer;

import java.util.Scanner;

public class BuyServicePublishImpl implements BuyServicePublish {

	@Override
	public boolean displayMenuBuy() {
		// TODO Auto-generated method stub
		System.out.println("\n");
		System.out.println("=================Kirul Enterprise=====================");
		System.out.println("**********-------Enter your Credit Card Number-------**********");

		boolean isvalid = false;
		Scanner num = new Scanner(System.in);
		int cCard = num.nextInt();

		while (!isvalid) {
			
			System.out.println("Enter payment");
			String ScardNum = String.valueOf(cCard);
			//System.out.println(ScardNum.length());
			
			if (ScardNum.length() == 16) {
//				System.out.println("Payment Done.....");
//				System.out.println("\n");
//				System.out.println("Good Byee.....");
//				System.out.println("Come Again.....");
				
				isvalid = true;
			} else {
				System.out.println("Invalid Card Number..!");
				cCard = num.nextInt();
				isvalid = false;
			}
		
		}
		return isvalid;

	}

}
