package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Bank_Data")
public class BankdtlsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int  AcNo;
	private int Debit;
	private int Credit;
	private int Available;
	private String postImgURL;
	
	public BankdtlsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAcNo() {
		return AcNo;
	}

	public void setAcNo(int acNo) {
		AcNo = acNo;
	}

	public int getDebit() {
		return Debit;
	}

	public void setDebit(int debit) {
		Debit = debit;
	}

	public int getCredit() {
		return Credit;
	}

	public void setCredit(int credit) {
		Credit = credit;
	}

	public int getAvailable() {
		return Available;
	}

	public void setAvailable(int available) {
		Available = available;
	}

	public String getPostImgURL() {
		return postImgURL;
	}

	public void setPostImgURL(String postImgURL) {
		this.postImgURL = postImgURL;
	}

	public BankdtlsEntity(int id, String name, int acNo, int debit, int credit, int available, String postImgURL) {
		super();
		this.id = id;
		this.name = name;
		AcNo = acNo;
		Debit = debit;
		Credit = credit;
		Available = available;
		this.postImgURL = postImgURL;
	}
	
	
	
}
