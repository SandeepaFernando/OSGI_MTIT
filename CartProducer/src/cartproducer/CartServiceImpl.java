package cartproducer;
import java.util.Scanner;
import com.mtit.service.CartDetail;

public class CartServiceImpl implements CartServicePublisher {

	@Override
	public String cartMenue(int tot) {
		// TODO Auto-generated method stub
		
//		CartDetail cartDetail = new CartDetail();
//		int total = cartDetail.getAmount();
		
		System.out.println("Your Total Cost is: " +tot);
		
		System.out.println("Do you want to Buy?");
		Scanner buyRes = new Scanner(System.in);
		String buyResponse = buyRes.next();
		return buyResponse;
		
	}

}
