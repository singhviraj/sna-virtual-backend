package com.example.demo;

public class generateorder {
private String id;
private String currency;
private int amount;



public generateorder(String orderid, String currency2, int amount2) {
	super();
	this.id = orderid;
	this.currency = currency2;
	this.amount = amount2;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getCurrency() {
	return currency;
}
public void setCurrency(String currency) {
	this.currency = currency;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}

}
