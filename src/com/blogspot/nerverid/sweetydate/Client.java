package com.blogspot.nerverid.sweetydate;

import java.util.ArrayList;

public class Client {
	private int idClient;
	private String firstName;
	private String secondName;
	private String lastName;
	private int age;
	//private ArrayList referals;
	private Referals referals;
	private CurrAccount curAccount;

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Referals getReferals() {
		return referals;
	}

	public void setReferals(Referals referals) {
		this.referals = referals;
	}

	public CurrAccount getCurAccount() {
		return curAccount;
	}

	public void setCurAccount(CurrAccount curAccount) {
		this.curAccount = curAccount;
	}
}
