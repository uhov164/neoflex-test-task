package com.uhov.neoflex.testTask.controller;

import com.uhov.neoflex.testTask.dto.RequestDTO;
import com.uhov.neoflex.testTask.service.CalculateService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DateController {

	@Autowired
	CalculateService calculateService;  // Сервисный слой, реализующий подсчет отпускных

	static private final String CALCULATE = "/api/calculate"; 
 

	@GetMapping(CALCULATE)
	private ResponseEntity<Integer> calculate(@RequestBody RequestDTO request) {

		int numberOfVacationDays = request.getNumberOfVacationDays();
		int averageSallary 		 = request.getAverageSallary();

		return ResponseEntity.ok(calculateService.calculate(averageSallary, numberOfVacationDays));
	}
}

