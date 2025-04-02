package com.java.bank.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor 
@AllArgsConstructor 
@ToString
public class Accounts {

	private int accountNo;
	private String firstName;
	private String lastName;
	private String city;
	private String state;
	private double amount;
	private String cheqFacil;
	private String accountType;
	
}
