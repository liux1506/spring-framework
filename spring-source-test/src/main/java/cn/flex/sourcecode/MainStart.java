package cn.flex.sourcecode;

import cn.flex.sourcecode.bean.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("cn.flex")
public class MainStart {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		UserServiceImpl bean = applicationContext.getBean(UserServiceImpl.class);
		bean.say();
	}
}
