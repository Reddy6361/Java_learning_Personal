//more on constructor
//
// new keyword will request to class to create an object.
// new keyword will call constructor that is mandatory. 
// new keyword will gets object address and stores that in reference variable.
// if we create an object without an argument and explicitly constructor is not created by the programmer then during compilation in .class file empty body constructor gets added as shown in the below example.
public class Ex2 {
	/*Ex2(){
	 **empty body constructor is created by compiler in .class file automatically** 
	 * }
	 * */
	 public static void main(String[] args) {
		new Ex2();// object created an empty body constructor is created by new keyword automatically.
		
	}
}
