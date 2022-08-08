package com.hms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book_stay")
public class RoomBook {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "booking_id")
private int bookId;
	@Column(name ="first_name")
private String fName;
	@Column(name ="last_name")
private String lName;
	@Column(name ="no_of_people")
private int nOP;
private String location;
    @Column(name ="check_in_date")
private String inDate;
private String outDate;
    @Column(name ="Room_type")
private String type;
private String payed;
private int ammount;
//private String userName;
//private String orderNo;


public RoomBook() {
	super();
	// TODO Auto-generated constructor stub
}
public RoomBook(int bookId, String fName, String lName, int nOP, String location, String inDate, String outDate,
		String type, String payed, int ammount, String userName, String orderNo) {
	super();
	this.bookId = bookId;
	this.fName = fName;
	this.lName = lName;
	this.nOP = nOP;
	this.location = location;
	this.inDate = inDate;
	this.outDate = outDate;
	this.type = type;
	this.payed = payed;
	this.ammount = ammount;
//	this.userName = userName;
//	this.orderNo = orderNo;
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
//public String getUserName() {
//	return userName;
//}
//public void setUserName(String userName) {
//	this.userName = userName;
//}
//public String getOrderNo() {
//	return orderNo;
//}
//public void setOrderNo(String orderNo) {
//	this.orderNo = orderNo;
//}



}
