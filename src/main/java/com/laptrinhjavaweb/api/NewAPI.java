package com.laptrinhjavaweb.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.laptrinhjavaweb.dto.NewDTO;

@Controller
public class NewAPI {
	
	  @PostMapping(value = "/new")
	  @ResponseBody
	   public NewDTO createNew(@RequestBody NewDTO model) {
	      return model;
	   }
}
