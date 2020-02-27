package com.mtit.service;

import java.util.HashMap;
import java.util.Scanner;
import com.mtit.service.CartDetail;

public class ServicePublishImpl implements ServicePublish {

	@Override
	public CartDetail displayMenu() {
		// TODO Auto-generated method stub
		String con = "Y";
		int amount = 0;

//		while (con.equalsIgnoreCase("Y")) {

			System.out.println("Publisher start");
			System.out.println("=================Welcome to Kirul Enterprise=====================");
			System.out.println("**********-------Item List-------**********");
			System.out.println("Item 1");
			System.out.println("Item 2");
			System.out.println("Item 3");
			System.out.println("Item 4");
			System.out.println("Item 5");
			System.out.println("Item 6");
//			System.out.println("To Buy.....");
			System.out.println("**********-------End Of Item List-------**********");

			String conBuy = "N";
			while (conBuy.equalsIgnoreCase("N")) {

				System.out.println("Enter Item Number");
				Scanner optionKey = new Scanner(System.in);
				int selector = optionKey.nextInt();

				HashMap priceMap = new HashMap();
				priceMap.put(1, 1000);
				priceMap.put(2, 2000);
				priceMap.put(3, 3000);
				priceMap.put(4, 4000);
				priceMap.put(5, 5000);
				priceMap.put(6, 6000);

				switch (selector) {

				case 1:
					amount = amount + (Integer)priceMap.get(1);
					System.out.println("Item Price: "+ priceMap.get(1));
					//System.out.println(amount);
					break;

				case 2:
					amount = amount + (Integer)priceMap.get(2);
					System.out.println("Item Price: "+ priceMap.get(2));
					//System.out.println(amount);
					break;

				case 3:
					amount = amount + (Integer)priceMap.get(3);
					System.out.println("Item Price: "+ priceMap.get(3));
					//System.out.println(amount);
					break;

				case 4:
					amount = amount + (Integer)priceMap.get(4);
					System.out.println("Item Price: "+ priceMap.get(4));
					//System.out.println(amount);
					break;
				case 5:
					amount = amount + (Integer)priceMap.get(5);
					System.out.println("Item Price: "+ priceMap.get(5));
					//System.out.println(amount);
					break;

				case 6:
					amount = amount + (Integer)priceMap.get(6);
					System.out.println("Item Price: "+ priceMap.get(6));
					//System.out.println(amount);
					break;

				default:
					break;

				}

				System.out.println("Do you What to ADD To Cart?");
				Scanner contuBUY = new Scanner(System.in);
				conBuy = contuBUY.next();
				
				//System.out.println(conBuy);	

			}
			return new CartDetail(conBuy, amount);
			
			

//			System.out.println("Do you What to Continue?");
//			Scanner contu = new Scanner(System.in);
//			con = contu.next();
//		}

	}

//	@Override
//	public String publishService() {
//		// TODO Auto-generated method stub
//		return "Execute the piblish service of ServicePublisher";
//	}

}
