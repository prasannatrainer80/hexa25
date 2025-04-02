package com.java.bank.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.bank.dao.BankDao;
import com.java.bank.dao.BankDaoImpl;
import com.java.bank.model.Accounts;

public class CreateAccountMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Accounts accounts = new Accounts();
		System.out.println("Enter FirstName  ");
		accounts.setFirstName(sc.next());
		System.out.println("Enter LastName   ");
		accounts.setLastName(sc.next());
		System.out.println("Enter City   ");
		accounts.setCity(sc.next()); 
		System.out.println("Enter State  ");
		accounts.setState(sc.next());
		System.out.println("Enter Amount  ");
		accounts.setAmount(sc.nextDouble());
		System.out.println("Enter CheqFacil (YEs/NO)   ");
		accounts.setCheqFacil(sc.next());
		System.out.println("Enter Account Type  (Savings/Current)  ");
		accounts.setAccountType(sc.next());
		BankDao dao = new BankDaoImpl();
		try {
			System.out.println(dao.createAccount(accounts));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
