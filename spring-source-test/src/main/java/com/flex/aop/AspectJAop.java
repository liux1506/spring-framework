package com.flex.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * class:AspectJAop
 * description:
 *
 * @date:2021/11/15
 * @author:muji
 */
@Aspect
@Component
public class AspectJAop {


	@Before("execution(* com.flex.aop..*.*(..)) && args(arg,..)")
	public void before(JoinPoint joinPoint, int arg) {
		System.out.println("before" + arg);
	}
}
