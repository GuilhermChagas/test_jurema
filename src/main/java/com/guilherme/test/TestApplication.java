package com.guilherme.test;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
//		SpringApplication.run(TestApplication.class, args);

		
		for (int i = 0; i <= 100; i++) {
			System.out.println((i%3==0 && i%5==0 ? 
					i + "FizzBuzz" : i%3==0 ? 
							i + "Fizz" : i%5==0 ? 
									i + "Buzz" : i));
			
//			if(i%3==0 && i%5==0) System.out.println(i + "FizzBuzz");
//			else if(i%3==0) System.out.println(i + "Fizz");
//			else if(i%5==0) System.out.println(i + "Buzz");
//			else System.out.println(i);
		}
	}

	
}
