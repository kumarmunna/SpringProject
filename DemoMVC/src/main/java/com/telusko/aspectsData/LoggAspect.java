package com.telusko.aspectsData;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class LoggAspect {

	@Before("execution(* com.telusko.controller.userDetilsController.*(..))")
	public void methodLogging(JoinPoint joinPoint) {
		System.out.println(" logging for all method: " + joinPoint.getSignature().getName());

	}

	@Before("execution(public String checkloging())")
	public void getLogging() {
		System.out.println(" logging method execution");

	}
}
