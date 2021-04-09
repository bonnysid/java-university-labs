package com.bonnysid.labs.labs;

import com.bonnysid.labs.labs.model.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan("com.bonnysid.labs.labs")
public class Config {

	@Bean("red")
	public Color red(@Lazy @Qualifier("yellowGreen") Color color) {
		return new RedColor(color);
	}

	@Bean("yellowRed")
	public Color yellowRed(@Qualifier("red") Color color) {
		return new YellowColor(color);
	}

	@Bean("yellowGreen")
	public Color yellowGreen(@Qualifier("green") Color color) {
		return new YellowColor(color);
	}

	@Bean("green")
	public Color green(@Qualifier("yellowRed") Color color) {
		return new GreenColor(color);
	}

	@Bean("trafficLight")
	public TrafficLight trafficLight(@Qualifier("green") Color color) {
		return new TrafficLight(color);
	}

}
