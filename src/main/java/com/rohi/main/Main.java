package com.rohi.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rohit.beans.Radio;
import com.rohit.config.ProfileDevConfig;
import com.rohit.config.ProfileQAConfig;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
		ctx.getEnvironment().setActiveProfiles("dev");
		ctx.register(ProfileDevConfig.class,ProfileQAConfig.class);
		ctx.refresh();
		Radio bean = ctx.getBean(Radio.class);
		bean.on(150);
		IO.print(bean);
	}
}
