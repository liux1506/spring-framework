package com.flex;

import com.flex.aop.Calculator;
import com.flex.ioc.Car;
import com.flex.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainStart {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
//		Car car = (Car) applicationContext.getBean("car");
//		car.getHonda();
		Calculator calculator = (Calculator)applicationContext.getBean("calculator");
		calculator.plus(1, 2);
		calculator.sub(2, 1);
		calculator.returnLing();
	}
}
