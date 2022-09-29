package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.entity.BankdtlsEntity;
import com.example.demo.service.BankdtlsService;

@Controller
public class BankController {
	
	@Autowired // service class connect in controller using Autowired
	private BankdtlsService service;
	
	@GetMapping("/") 
	public String mainpage(Model m )// model attribute to use map value using java util map
	{
		//create list type object
		List<BankdtlsEntity> refobj1 = service.getAllbankdata();
		
		m.addAttribute("valuedata",refobj1);
		
		return "index";
	}
	
	@GetMapping("Addbankdtls")
	public String Addbankdtlspage() {
		return "Addbankdtls";
	}
	
	@GetMapping("checkdtls")
	public String checkdtlspage() {
		return "checkdtls";
	}
	
	@GetMapping("dtls")
	public BankdtlsEntity dtlspage(Model m) {	
			   Optional<BankdtlsEntity> empid= service.findById(3);
			   m.addAttribute("valuedata2",empid);
			   return empid.get();
	}
	
	@PostMapping("/register")
	public String BankReg(@ModelAttribute BankdtlsEntity e ) {
		System.out.println(e);
		
		service.AddBank(e);
		return "redirect:/";
	}
}
