package com.rce.uicontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserUiController {
    @PostMapping
	public String hi() {
		return "hi";
	}
}
