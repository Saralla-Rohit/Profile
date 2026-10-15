package com.rohit.beans;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("qa")
@Component
public class AnalogTuner implements ITuner{

	public AnalogTuner() {
		IO.println("Analog Tuner");
	}
	@Override
	public void tune(int freq) {
		IO.println("The Freq : "+freq);	
	}
}
