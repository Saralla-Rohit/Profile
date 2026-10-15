package com.rohit.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Profile("dev")
@PropertySource("application-dev.properties")
@ComponentScan("com.rohit.beans")
public class ProfileDevConfig {
	
}
