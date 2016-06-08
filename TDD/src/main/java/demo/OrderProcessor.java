package demo;

import java.util.List;

public class OrderProcessor {
	
	IOrderIdGenerator idGenerator;
	IOrderDAO orderDao;
	IEmailSender emailSender;
	ISmsSender smsSender;

	/** Return order ID */
	public String processOrder (List<Item> items) {
		
		// 1. Generate Order ID
		String orderId = idGenerator.getOrderId();
		
		// 2. Calculator Order total
		
		// 3. Update DB
		orderDao.saveOrder();
		
		// 4. Send EMail/SMS notification
		emailSender.sendEmail();
		emailSender.sendEmail();
		return orderId;
	}
	
	
	
	

	public IOrderIdGenerator getIdGenerator() {
		return idGenerator;
	}

	public void setIdGenerator(IOrderIdGenerator idGenerator) {
		this.idGenerator = idGenerator;
	}

	public IOrderDAO getOrderDao() {
		return orderDao;
	}

	public void setOrderDao(IOrderDAO orderDao) {
		this.orderDao = orderDao;
	}

	public IEmailSender getEmailSender() {
		return emailSender;
	}

	public void setEmailSender(IEmailSender emailSender) {
		this.emailSender = emailSender;
	}

	public ISmsSender getSmsSender() {
		return smsSender;
	}

	public void setSmsSender(ISmsSender smsSender) {
		this.smsSender = smsSender;
	}
}
