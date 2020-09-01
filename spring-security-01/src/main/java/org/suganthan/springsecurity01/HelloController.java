package org.suganthan.springsecurity01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String sayHello(@RequestParam(required = false, defaultValue = "Sugan") String name) {
		return "Hello "+name;
	}
	
	@GetMapping("/admin/hello")
	public String sayAdminHello(@RequestParam(required = false, defaultValue = "Sugan")String name) {
		return "Hello Admin "+name;
	}

}
