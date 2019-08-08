package com.narayan.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BookStoreApplication {
	
	 @RequestMapping(value = "/recommended")
	  public String readingList(){
	    return "Learn Spring technoliogies from Narayana";
	  }

	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	}

}
