package com.flex;

import com.flex.bean.Car;
import com.flex.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainStart {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
		Car car = (Car) applicationContext.getBean("car");
		car.getHonda();
	}
}
