package model;

public class USER1 {
private String username;
private String passw;
private String hovaten;
public USER1(String username, String passw, String hovaten) {
	super();
	this.username = username;
	this.passw = passw;
	this.hovaten = hovaten;
}
public USER1() {
	super();
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassw() {
	return passw;
}
public void setPassw(String passw) {
	this.passw = passw;
}
public String getHovaten() {
	return hovaten;
}
public void setHovaten(String hovaten) {
	this.hovaten = hovaten;
}
@Override
public String toString() {
	return "USER1 [username=" + username + ", passw=" + passw + ", hovaten=" + hovaten + "]";
}


}
