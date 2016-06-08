package demo;

public class StubExample {
	
	IDiscountCalculator discountCalculator;
	
	public double calculatePrice(Item item) {
		
		// 1. get price from DB
		//TODO:
		
		// 2. perform discount calculation
		double discount = discountCalculator.calculateDiscount(item);
		
		// 3. return final price
			
		return item.price - discount;
	}

	public void setDiscountCalculator(IDiscountCalculator calc) {
		this.discountCalculator = calc;
	}
}
