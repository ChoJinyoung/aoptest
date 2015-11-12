package com.bit2015.aoptest.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
	@Before("execution(* com.bit2015.aoptest.service.*.*(..))")
	public void before(){
		
	}
}
