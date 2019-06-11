package com.micro.bean;

import java.math.BigDecimal;

public class ExchangeData {

	private Long id;
	private String from;
	private String to;
	private BigDecimal rate;
	private BigDecimal unit;
	private BigDecimal value;
	private Long port;
	
	
	public ExchangeData() {
		
	}


	public ExchangeData(Long id,String from, String to, 
			BigDecimal rate, BigDecimal unit, BigDecimal value,
			Long port) {
		super();
		this.id=id;
		this.from = from;
		this.to = to;
		this.rate = rate;
		this.unit = unit;
		this.value = value;
		this.port = port;
	}
	
	
	public Long getPort() {
		return port;
	}


	public void setPort(Long port) {
		this.port = port;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getRate() {
		return rate;
	}
	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}
	public BigDecimal getUnit() {
		return unit;
	}
	public void setUnit(BigDecimal unit) {
		this.unit = unit;
	}
	public BigDecimal getValue() {
		return value;
	}
	public void setValue(BigDecimal value) {
		this.value = value;
	}
	
	
	
}
