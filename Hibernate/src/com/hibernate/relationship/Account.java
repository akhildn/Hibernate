package com.hibernate.relationship;

import javax.persistence.*;

@Entity
@Table(name="account")
public class Account {
	@Id
	int accountNo;
	String bankName;
	
	public Account() {
		super();
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

}
