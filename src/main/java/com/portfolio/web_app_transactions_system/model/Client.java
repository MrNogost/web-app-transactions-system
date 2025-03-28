package com.portfolio.web_app_transactions_system.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;

public class Client {
	@Id
	private long id;
	
	private String name;
	private BigDecimal amount;
	
	public void setId(long id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
	public long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public BigDecimal getAmount() {
		return amount;
	}
}
