package sjuJavaprojects;

public class Patient {
private String fName;
private String lName;
private String email;
private String reason;
private String ins;

public String getName () {
	return fName +" "+  lName;
}

public String getEmail() {
	return email;
}
public String getReason() {
	return reason;
}
public String getInsurance() {
	return ins;
}
public String getReasonForVisit () {
	return reason;
}
public void setFname(String name) {
	this.fName=name;
}
public void setlName(String name) {
	this.lName=name;
}
public void setEmail(String email) {
	this.email = email;
}
public void setReason(String reason) {
	this.reason = reason;
}
public void setInsurance(String ins) {
	this.ins = ins;
}

}
