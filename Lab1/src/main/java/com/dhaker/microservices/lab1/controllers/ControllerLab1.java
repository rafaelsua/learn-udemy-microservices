/**

 * 
 */
package com.dhaker.microservices.lab1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author rsuarez
 *
 */
@Controller
public class ControllerLab1 {
	
	@RequestMapping("/")
	String methodLab1 (){
		return "hello";
	}

}
