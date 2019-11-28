package org.emp;

public class Employee {
public void empId() {
System.out.println("123");
}
public void empName() {
System.out.println("Venkatesh");
}
public void empDob() {
System.out.println("21-07-1998");
}
public void empphone() {
System.out.println("8015137566");
}
public void empEmail() {
System.out.println("venky21798@gmail.com");
}
public void empAddress() {
System.out.println("No-1,Thrumalai Nagar, Perungudi");
}
public static void main(String[] args) {
	Employee e = new Employee();
	e.empId();
	e.empName();
	e.empDob();
	e.empphone();
	e.empEmail();
	e.empAddress();
}
}

