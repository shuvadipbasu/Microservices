package com.micro.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;

@Entity
public class ExchangeRate {

	@Id
	private Long id;
	private String fromRate;
	private String toRate;
	private BigDecimal rate;
	
	@Column(nullable = true)
	@ColumnDefault(value = "0")
	private int port;

	public ExchangeRate() {
		super();
	}

	public ExchangeRate(String from, String to, BigDecimal rate) {
		super();
		this.fromRate = from;
		this.toRate = to;
		this.rate = rate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom() {
		return fromRate;
	}

	public void setFrom(String from) {
		this.fromRate = from;
	}

	public String getTo() {
		return toRate;
	}

	public void setTo(String to) {
		this.toRate = to;
	}

	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	
	
	
}
