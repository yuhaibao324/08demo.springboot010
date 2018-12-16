package com.xinbitiangao.springbootwebjsp;

import java.util.Date;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * HelloWorldController层
 */
@Controller
public class HelloWorldController {

	private String message = "Hello World";

	@GetMapping("/")
	public String HelloWorld(Map<String, Object> model) {
		model.put("time1", new Date());
		model.put("message1", message);
		return "HelloWorld";
	}
}
