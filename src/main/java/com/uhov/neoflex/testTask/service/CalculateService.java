package com.uhov.neoflex.testTask.service;

import org.springframework.stereotype.Service;

@Service
public class CalculateService {
	
	// Метод для подсчета суммы отпускных
	// Считается как (среднедневной заработок * продолжительность отпуска)
	public double calculateVacationPay(int averageYearSallary, int daysOfVacation) {

		double averageDaySallary = ((double) averageYearSallary) / 365; 

		return averageDaySallary * daysOfVacation;
	}
}
