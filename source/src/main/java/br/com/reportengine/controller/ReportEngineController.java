package br.com.reportengine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/WebEngineReport")
public class ReportEngineController {

	@GetMapping()
	public String doGet() {
		return "Running...";
		
	}
	
	@PostMapping(value="/run")
	public String runReport() {
		return "Under construction";
	}
}
