package com.bah.msd.api;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class ServiceAPI {

	public static long instanceId = new Random().nextInt();
	public static int count = 0;

	
	@GetMapping
	public String healthCheck() {
		count += 1;
		Date date = new Date();
		String dateformat = SimpleDateFormat.getDateTimeInstance(SimpleDateFormat.SHORT, SimpleDateFormat.FULL).format(date);
		return "<h3>The Authentication service is up and running!</h3>" + "<br/>Instance: " + instanceId + ", " + "<br/>DateTime: " + dateformat  + "<br/>CallCount: "+count;
	}
	

}
