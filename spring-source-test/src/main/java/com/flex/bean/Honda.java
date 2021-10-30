package com.flex.bean;

import org.springframework.stereotype.Component;

@Component
public class Honda {
	private String name;

	public Honda() {
		System.out.println("init Honda");;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
