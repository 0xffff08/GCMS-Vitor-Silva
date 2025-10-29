package com.example.WebApp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@RequestMapping("/")
	public @ResponseBody String greeting() {
			return "Hello, World!";
	}
	@RequestMapping("/vitor")
	public @ResponseBody String greetingFulano() {
		return "Hello, Vitor!";
	}
	@RequestMapping("/eclipse")
	public @ResponseBody String greetingFulano() {
		return "Hello, Eclipse!";
	}
	@RequestMapping("/intellij")
	public @ResponseBody String greetingFulano() {
		return "Hello, Injellij!";
	}
	
	
}