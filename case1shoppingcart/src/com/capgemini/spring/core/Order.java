package com.capgemini.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Order {
public static void main(String[] args) {
	ApplicationContext context=new	ClassPathXmlApplicationContext("spring.xml");
	Cart cart=(Cart) context.getBean("cart");
	cart.displayOrderedProduts();
}
}