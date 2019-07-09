package com.xwrokz.web.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class MovieComponent {

	public MovieComponent() {
		System.out.println("Created\t" + this.getClass().getSimpleName());
	}

	@RequestMapping("/ticketBokked.do")
	public String onSave(MovieDTO dto) {
		System.out.println("invoked onSave()");
		System.out.println("Dto object is\t" + dto);
		return "/MovieSuccess.jsp";
	}

	@RequestMapping("/ticketBokked1.do")
	public String onSave(@RequestParam String name, @RequestParam String date, @RequestParam int nooftickets,
			@RequestParam String theatreName) {
		System.out.println("invoked onSave()");
		return "/MovieSuccess.jsp";
	}

}