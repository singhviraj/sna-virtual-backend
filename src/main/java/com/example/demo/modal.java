package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class modal {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private int id;
 private int card;
 private String fullname;
 private String email;
 private String password;


public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFullname() {
	return fullname;
}

public int getCard() {
	return card;
}

public void setCard(int card) {
	this.card = card;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public void setFullname(String fullname) {
	this.fullname = fullname;
}
public modal() {
	 
}
/*public modal(int id, String fullname) {
	super();
	this.id = id;
	this.fullname = fullname;
}*/

public modal(int id, int card, String fullname, String email, String password) {
	super();
	this.id = id;
	this.card = card;
	this.fullname = fullname;
	this.email = email;
	this.password = password;
}

}
