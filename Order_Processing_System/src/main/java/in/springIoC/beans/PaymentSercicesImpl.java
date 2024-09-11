package in.springIoC.beans;

import in.springIoC.interfaces.PaymentServices;

public class PaymentSercicesImpl  implements PaymentServices{
	
	
	
	@Override
	public void makePayment(double amount) {
		
		System.out.println("Payment of $"+amount + " processed successfully");
		
	}
	
	

}
