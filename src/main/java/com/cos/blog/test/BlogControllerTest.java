package com.cos.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BlogControllerTest {
	
	@GetMapping("/test/hello")
	public String Hello() {
		return "<H1>Hello Spring boot</H1>";
	}
}
