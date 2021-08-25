package p1;
//constructor chaining.
//Note: we cannot call constructor with this keyword we cannotcall it 
//Note:we cannot call constructor with this keyword from method.
/*this:
 * 1)this() -> used to call the constructor.
 * 2) using this keyword we can call the constructor, but this call should happen only from another constructor.
 * */
public class Ex1 {
Ex1(){
	System.out.println(500);
}
Ex1(int x){
	this();// this keyword calling constructor from line 10
}
public static void main(String[] args) {
	new Ex1(100);//object calling constructor at line 14
}
}
