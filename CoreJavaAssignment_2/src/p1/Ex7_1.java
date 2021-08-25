package p1;
// if you dont create child class constructor without argument then 
//compiler will automatically place no args constructor with super keyword
public class Ex7_1 extends Ex7 {
	/*by default we know that whenever we write new keyword anywhere 
	a default constructor is created and we know that every constructor 
	in child class created will have an super keyword by default 
	so it will call parent class constructor even if we don't create 
	the constructor and call the parent constructor from 
	child class constructor*/
public static void main(String[] args) {
	new Ex7_1();
}
}
