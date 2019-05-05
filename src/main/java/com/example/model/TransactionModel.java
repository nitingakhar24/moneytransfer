package com.example.model;

import java.math.BigDecimal;

public class TransactionModel 
{
	private String sourceAccountId;
	private String targetAccountId;
	private String ccyCode;
	private BigDecimal amount;
	public String getSourceAccountId() {
		return sourceAccountId;
	}
	public void setSourceAccountId(String sourceAccountId) {
		this.sourceAccountId = sourceAccountId;
	}
	public String getTargetAccountId() {
		return targetAccountId;
	}
	public void setTargetAccountId(String targetAccountId) {
		this.targetAccountId = targetAccountId;
	}
	public String getCcyCode() {
		return ccyCode;
	}
	public void setCcyCode(String ccyCode) {
		this.ccyCode = ccyCode;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	

}
