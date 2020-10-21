package com.lts.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Rectangle implements Shape {

	@Override
	public void CalculateArea(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Rec "+x*y);
		
	}
	
	

}
