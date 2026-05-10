package com.nt.runners;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.JobSeeker;
import com.nt.service.IJobSeekerMgmtService;

@Component
public class DateTimeTestRunner implements CommandLineRunner {

	@Autowired
	private IJobSeekerMgmtService jobService;

	@Override
	public void run(String... args) throws Exception {
		try {
			// prepare Job Seeker Obj
			JobSeeker js = new JobSeeker("Satya", "Orrisa", LocalDateTime.of(1999, 11, 30, 13, 45),
					LocalTime.of(15, 10), LocalDate.of(2009, 01, 11));
			String msg = jobService.registerJobSeeker(js);
			System.out.println(msg);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("*************************");
		
		try {
			jobService.showAllJobSeeker().forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("*************************");


		try {
			double age = jobService.showJSAgeByid(1);
			System.out.println(age);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Press any key to end the app");
		System.in.read();

	}

}
