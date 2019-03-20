package com.niit.demospring;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class springDemo {
@RequestMapping("/MyPage")
	public String display()
	{
		return "MyPage";
	}	
}
