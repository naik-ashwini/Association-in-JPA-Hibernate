package com.prowings.one_to_one_bi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Account {

	@Id
	@Column(name = "Acc_Id")
	private int id;
	@Column
	private String accountName;
	@Column
	private int accountNumber;
	@OneToOne(mappedBy = "account")
	private Employee employee;
	
	public Account() {
		super();
	}

	public Account(String accountName, int accountNumber, Employee employee) {
		super();
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.employee = employee;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", accountName=" + accountName + ", accountNumber=" + accountNumber + ", employee="
				+ employee + "]";
	}
}
