package com.flex.bean;

import org.springframework.stereotype.Component;

@Component
public class Car {
	private String name;
	private Honda honda;

	public Car() {
		System.out.println("init Car");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Honda getHonda() {
		return honda;
	}

	public void setHonda(Honda honda) {
		this.honda = honda;
	}
}
