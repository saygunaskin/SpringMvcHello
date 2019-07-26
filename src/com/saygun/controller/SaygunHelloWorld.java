package com.saygun.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
/*
 * author: Saygun Aşkın
 * 
 */
 
@Controller
public class SaygunHelloWorld {
 
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello Spring MVC</h3>This message is coming from SaygunHelloWorld.java **********</div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}
}