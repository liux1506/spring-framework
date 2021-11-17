package com.flex.aop;

import org.springframework.stereotype.Component;

/**
 * class:Calculator
 * description:
 *
 * @date:2021/11/15
 * @author:muji
 */
@Component
public class Calculator {

	public int plus(int a , int b) {
		System.out.println(a + b);
		return a + b;
	}

	public int sub(int a, int b) {
		System.out.println(a - b);
		return a - b;
	}

	public int returnLing() {
		System.out.println("returnLing");
		return 0;
	}
}
