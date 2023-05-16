package com.uhov.neoflex.testTask.dto;

import java.util.List;
import java.time.LocalDate;

// DTO для получения запроса, состояющего из:
//   1) Средней зарплаты пользователя
//   2) Количество дней отпуска
public class RequestDTO {

	private int averageSallary;
	private int numberOfVacationDays;

	public RequestDTO(int averageSallary, int numberOfVacationDays) {
		this.averageSallary = averageSallary;
		this.numberOfVacationDays = numberOfVacationDays;
	}

	public int getAverageSallary() {
		return averageSallary;	
	}

	public int getNumberOfVacationDays() {
		return numberOfVacationDays;	
	}

	public void setAverageSallary(int averageSallary) {
		this.averageSallary = averageSallary;
	}

	public void setNumberOfVacationDays(int numberOfVacationDays) {
		this.numberOfVacationDays = numberOfVacationDays;
	}
}
