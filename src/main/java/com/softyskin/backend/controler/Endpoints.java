package com.softyskin.backend.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Endpoints {
	
  @GetMapping("/")
  @ResponseBody
  public String[] sayHello() {
    return new String[] {"working"};
  }

}
