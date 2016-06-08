package demo;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class OrderProcessorTests {

	@Test @Ignore
	public void testWith1Item() {
		IOrderIdGenerator idGenerator = mock(IOrderIdGenerator.class);
		when(idGenerator.getOrderId()).thenReturn("OR1");
		
		OrderProcessor processor = new OrderProcessor();
		processor.setIdGenerator(idGenerator);
		processor.setOrderDao(mock(IOrderDAO.class));
		
		assertEquals(processor.processOrder(null), "OR1");
		
	}
	
	
	@Test 
	public void verifyEmailSent() {
		IOrderIdGenerator idGenerator = mock(IOrderIdGenerator.class);
		when(idGenerator.getOrderId()).thenReturn("OR1");
		IEmailSender emailSender = mock(IEmailSender.class);
		
		OrderProcessor processor = new OrderProcessor();
		processor.setIdGenerator(idGenerator);
		processor.setOrderDao(mock(IOrderDAO.class));
		processor.setEmailSender(emailSender);
		
		processor.processOrder(null);
		
		verify(emailSender, times(2)).sendEmail();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
