package com.flex.ioc;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class CustomFactoryBean implements FactoryBean {

	private String name;

	@Override
	public Object getObject() throws Exception {
		return new Car();
	}

	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}
}
