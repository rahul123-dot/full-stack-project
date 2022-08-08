package com.hms.payloads;

import javax.persistence.Column;

public class RoomBookDto {
private int bookId;
private String fName;
private String lName;
private int nOP;
private String location;
private String inDate;
private String outDate;
private String type;
private String payed;
private int ammount;
private String userName;
private String orderNo;




public RoomBookDto() {
	super();
	// TODO Auto-generated constructor stub
}


public int getBookId() {
	return bookId;
}
public void setBookId(int bookId) {
	this.bookId = bookId;
}
public String getfName() {
	return fName;
}
public void setfName(String fName) {
	this.fName = fName;
}
public String getlName() {
	return lName;
}
public void setlName(String lName) {
	this.lName = lName;
}
public int getnOP() {
	return nOP;
}
public void setnOP(int nOP) {
	this.nOP = nOP;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getInDate() {
	return inDate;
}
public void setInDate(String inDate) {
	this.inDate = inDate;
}
public String getOutDate() {
	return outDate;
}
public void setOutDate(String outDate) {
	this.outDate = outDate;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getPayed() {
	return payed;
}
public void setPayed(String payed) {
	this.payed = payed;
}
public int getAmmount() {
	return ammount;
}
public void setAmmount(int ammount) {
	this.ammount = ammount;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getOrderNo() {
	return orderNo;
}
public void setOrderNo(String orderNo) {
	this.orderNo = orderNo;
}

}
