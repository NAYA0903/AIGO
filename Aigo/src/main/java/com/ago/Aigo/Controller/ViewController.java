package com.ago.Aigo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
	
	
	/* 메인 페이지 호출 메소드 */
	@GetMapping("/")
	public String MainPage() {
		return "Main";
	}
	
}
