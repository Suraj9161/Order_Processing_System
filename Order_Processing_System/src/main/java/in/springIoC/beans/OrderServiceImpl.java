package in.springIoC.beans;

import in.springIoC.interfaces.OrderServices;
import in.springIoC.interfaces.PaymentServices;

public class OrderServiceImpl implements OrderServices {

	private PaymentServices paymentServices;

//	setter method for DI





	@Override
	public void processOrder(String item) {
	
		double price=0.0;
		
		if("Laptop".equalsIgnoreCase(item)) {
			price=100.0;
		}else if("Mobile".equalsIgnoreCase(item)){
			price=50.00;
		}
		else {
			System.out.println("Your Itme Currently unable in my shop");
			return;
		}
		System.out.println("Processing order for: " + item);
        paymentServices.makePayment(price);  // Use price based on the item
	}

	public PaymentServices getPaymentServices() {
		return paymentServices;
	}

	public void setPaymentServices(PaymentServices paymentServices) {
		this.paymentServices = paymentServices;
	}
}
