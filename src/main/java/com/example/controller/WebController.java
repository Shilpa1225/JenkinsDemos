/**
 * 
 */
package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author skamsani2
 *
 */
@RestController
public class WebController {

	@GetMapping("/hi")
	public String sayhai() {
		return "helooooo";
	}
	
	
	
	
	
	@GetMapping("/heelo")
	public String sayhelloo() {
		return "hello world";
		
	}
	
	
	
	
}
