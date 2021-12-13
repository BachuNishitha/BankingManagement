package com.bankingapplicaton;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
@RequestMapping("/home")
	public String home() {
	return "HELLO WELCOME TO SBI BANK";
}
@RequestMapping("/contact")
public String contact() {
return "WELCOME TO SBI CONTACT";
}
@RequestMapping("/about")
public String about() {
return "ABOUT SBI BANK";
}
@RequestMapping("/balance")
public String balance() {
return "BALANCE AMOUNT";
}

}
