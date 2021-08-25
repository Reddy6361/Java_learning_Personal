package p1;
/*if we don't keep super keyword inside child class constructor
*  then compiler will automatically place the super keyword
*  such that it can call only no argument constructor of parent class.*/
public class Ex6 {
	Ex6(){
		System.out.println("parent class");
	}
}
