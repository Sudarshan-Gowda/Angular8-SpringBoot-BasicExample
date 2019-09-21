package com.star.sud.Angular8SpringBootBasicExample.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.star.sud.Angular8SpringBootBasicExample.Model.BasicExampleInfo;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BasicExampleController {

	@RequestMapping("/basic-info")
	public BasicExampleInfo getBasicDetails() {
		String projectName = "Angular8 Spring Boot Exampe";
		String serverSideLanguage = "Spring Boot2";
		String frontEndLanguage = "Angular 8";
		String description = "This project demonstarte the Introduction to Spring Boot and Angular 8";
		return new BasicExampleInfo(projectName, serverSideLanguage, frontEndLanguage, description);
	}

}
