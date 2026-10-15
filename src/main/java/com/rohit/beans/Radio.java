package com.rohit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Radio {
	@Autowired
	ITuner ituner;
	@Value("${band}")
	String band;
	@Value("${frequencyRange}")
	String frequency;
	public void on(int freq) {
		ituner.tune(freq);		
	}
	@Override
	public String toString() {
		return "Radio [ituner=" + ituner + ", band=" + band + ", frequency=" + frequency + "]";
	}
	
}
