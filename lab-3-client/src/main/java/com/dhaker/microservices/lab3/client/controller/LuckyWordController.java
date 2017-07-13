/**
 * 
 */
package com.dhaker.microservices.lab3.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rsuarez
 *
 */
@RestController
public class LuckyWordController {

	@Value("${lucky-word}")
	String luckyWord;

	@RequestMapping("/lucky-word")
	public String showLuckyWord() {
		return "The lucky word is: " + luckyWord;
	}

}
