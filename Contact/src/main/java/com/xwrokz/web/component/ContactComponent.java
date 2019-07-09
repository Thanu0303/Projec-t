package com.xwrokz.web.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@RequestMapping("/")
public class ContactComponent {

	public ContactComponent() {
		System.out.println("Created\t" + this.getClass().getSimpleName());
	}

	@RequestMapping("/saveContact.do")
	public String onSaveContact(ContactDTO dto) {
		System.out.println("invoked onSaveContact");
		System.out.println("Dto values are\t" + dto);
		return "/SaveSuccess.jsp";
	}
}
