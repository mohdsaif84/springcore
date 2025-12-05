package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
	
		//init method hai yeh privious video me bataya tha we can change name method but signature must be same.
		//method name kuch bhi likh do bs signature same rhe fir bhi woh init method ka kaam krega.
		System.out.println("taking pepsi: init");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		//destroy method
		System.out.println("Going to put bottle back to shop : destroy");
		
	}
	

}
