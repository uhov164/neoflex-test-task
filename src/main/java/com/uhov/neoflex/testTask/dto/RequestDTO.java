package com.uhov.neoflex.testTask.dto;

import java.util.List;
import java.time.LocalDate;

// DTO для получения запроса, состояющего из:
//   1) Средней годовая зарплаты пользователя
//   2) Количество дней отпуска
public class RequestDTO {

	private int averageYearSallary;
	private int numberOfVacationDays;

	public RequestDTO(int averageYearSallary, int numberOfVacationDays) {
		this.averageYearSallary = averageYearSallary;
		this.numberOfVacationDays = numberOfVacationDays;
	}

	public int getAverageYearSallary() {
		return averageYearSallary;	
	}

	public int getNumberOfVacationDays() {
		return numberOfVacationDays;	
	}

	public void setAverageYearSallary(int averageYearSallary) {
		this.averageYearSallary = averageYearSallary;
	}

	public void setNumberOfVacationDays(int numberOfVacationDays) {
		this.numberOfVacationDays = numberOfVacationDays;
	}
}
