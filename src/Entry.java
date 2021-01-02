public class Entry {
String date;
String price;
String location;
String reference;
String classifcaiton;
public Entry() {
	
}
public void setClass(String a ) {
	this.classifcaiton = a;
}

public void setDate( String d) {
	this.date = d;
}
public void setPrice(String p) {
	this.price = p;
}
public void setLocation(String d) {
	this.location = d;
}
public void setReference(String a) {
	this.reference = a;
}
public String getClassed() {
	return classifcaiton;
}
public String getPrice() {
	return price;
}
public String getDate() {
	return date;
}
public String getLocation() {
	return location;
}
public String getReference() {
	return reference;
}
public String getEntry() {
	return "Date: "+date + "\nAmount: " + price + " \nLocation: " + location + "\nClassed: " + classifcaiton;
}
}
