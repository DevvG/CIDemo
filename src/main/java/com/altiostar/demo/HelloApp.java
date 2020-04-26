package com.altiostar.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloApp {
@RequestMapping(value = "/hello", 
			  method = RequestMethod.GET)
  public String sayHello(@RequestParam("name") String name) {
    return name + ", say Hello Kubernetes World";
  }

  public static void main(String[] args) {
    SpringApplication.run(HelloApp.class, args);
  }

}
