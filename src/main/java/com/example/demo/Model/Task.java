package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Task {
    @Id
    private int id;
	private String Name;
    private String Tour_spot;
    private String Weather_condition;
    private int Amount;
    private String Date;
    private String Time;
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Task(String name, String tour_spot, String weather_condition, int amount, String date, String time, int id) {
		super();
		Name = name;
		Tour_spot = tour_spot;
		Weather_condition = weather_condition;
		Amount = amount;
		Date = date;
		Time = time;
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getTour_spot() {
		return Tour_spot;
	}
	public void setTour_spot(String tour_spot) {
		Tour_spot = tour_spot;
	}
	public String getWeather_condition() {
		return Weather_condition;
	}
	public void setWeather_condition(String weather_condition) {
		Weather_condition = weather_condition;
	}
	public int getAmount() {
		return Amount;
	}
	public void setAmount(int amount) {
		Amount = amount;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getTime() {
		return Time;
	}
	public void setTime(String time) {
		Time = time;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}