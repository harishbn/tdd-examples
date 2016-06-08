package demo;

import static org.junit.Assert.*;

import javax.rmi.CORBA.Stub;

import org.junit.Before;
import org.junit.Test;

public class StubExampleTests {
	Item item;
	
	@Before
	public void setup() {
		item = new Item();
		item.price = 100;
		item.product = "apple";		
	}
	
	@Test
	public void testBasicDiscount() {

		StubExample ex = new StubExample();
		ex.setDiscountCalculator(new IDiscountCalculator() {
			public double calculateDiscount(Item item) {
				return 10;
			}
		});
		
		assertEquals(90, ex.calculatePrice(item), 0);	
	}

	@Test
	public void testBasicDiscountWithFake() {
		StubExample ex = new StubExample();
		ex.setDiscountCalculator(new FakeDiscountCalculator());
		assertEquals(80, ex.calculatePrice(item),0);

	}
	
}
