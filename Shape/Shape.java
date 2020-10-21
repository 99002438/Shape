package com.lts.autowiring;

import org.springframework.stereotype.Component;

@Component
public interface Shape {

	void CalculateArea(int x,int y);
	
}
