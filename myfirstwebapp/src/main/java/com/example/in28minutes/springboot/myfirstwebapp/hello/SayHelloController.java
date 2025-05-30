package com.example.in28minutes.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SayHelloController {
	//"say -hello"=>"Hello What are you learning today?"
	
	@RequestMapping("/say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello! what are you learning today?";
	}
	
	@RequestMapping("/say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb=new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
			sb.append("<title>My first HTml page-changed</title>");
		sb.append("</head>");
		sb.append("<body >");
			sb.append(" My first html  page with the body.");
		sb.append("</body>");
		sb.append("</html>");
		
		return sb.toString();
	}
	
	// "say-hello-jsp"=> sayHello.jsp
	/// src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
	@RequestMapping("/say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}
}
