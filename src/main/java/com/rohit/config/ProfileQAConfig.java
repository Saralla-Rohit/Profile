package com.rohit.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Profile("qa")
@PropertySource("application-qa.properties")
@Configuration
@ComponentScan("com.rohit.beans")//this will tell where are all the sterotype classes to find
public class ProfileQAConfig {
	

}
