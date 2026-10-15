package com.rohit.beans;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("dev")
@Component
public class DigitalTuner implements ITuner{

	public DigitalTuner() {
		IO.println("Digital Tuner");
	}
	@Override
	public void tune(int freq) {
		IO.println("The Freq : "+freq);
	}
}
