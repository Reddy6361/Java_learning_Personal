package p1;
//constructor chaining:
 

public class Ex2 {
	Ex2(){
		this(500); /* calling constructor from line 9 and we can pass value 
		in this keyword while calling the constructor*/
	}
	Ex2(int x){
		System.out.println(x);
	}
	public static void main(String[] args) {
		 new Ex2();//object calling constructor at line 6
	}
}
