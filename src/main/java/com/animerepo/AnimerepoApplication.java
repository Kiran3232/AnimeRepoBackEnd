package com.animerepo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.airbrake.javabrake.Notifier;

@SpringBootApplication
public class AnimerepoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnimerepoApplication.class, args);

		int projectId = 263374;
		String projectKey = "3c53aa3751f0e168ad35bf696340ee8c";
		Notifier notifier = new Notifier(projectId, projectKey);

//		try {
//			int i = 1 / 0;
//		} catch (ArithmeticException e) {
//			notifier.report(e);
//		}
	}

}
