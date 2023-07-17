package com.wipro.bean;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Customer {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int custid;
	@Column(length=30)
	private String fname;
	@Column(length=30)
	private String mname;
	@Column(length=30)
	private String ltname;
	@Column(length=20)
	private String city;
	@Column(length=10)
	private String mobileno;
	@Column(length=15)
	private String occupation;
	
	public Customer() {
		
	}

	public Customer(int custid, String fname, String mname, String ltname, String city, String mobileno, String occupation) 
	{
		super();
		this.custid=custid; 
		this.fname=fname; 
		this.mname=mname; 
		this.ltname=ltname; 
		this.city=city; 
		this.mobileno=mobileno; 
		this.occupation=occupation; 
		
	}

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getLtname() {
		return ltname;
	}

	public void setLtname(String ltname) {
		this.ltname = ltname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}


	@Override
	public String toString() {
		return "Customer [custid=" + custid +", fname=" + fname + ", mname=" + mname + ", ltname=" + ltname + ", city=" + city + ", mobileno=" + mobileno +
				 ", occupation=" + occupation + " ]";
				}
	
}
