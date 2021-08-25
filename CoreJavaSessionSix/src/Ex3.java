// var-type:1) this was introduced in version 10 of java, 

/* 2)var-type can store any kind of value in it as shown in below example 
 * 
 * 3) var-type cannot be static and non static variable, it can be only local variable.
 * 
 * 4) var-type cannot be method argument,hence the below program throws error.
 * 
 * 5) var can have a variable name as a var itslf as it is atype not an data type.
 * 
 * 6) "-------"-------"
 * 
 * 7) even when we write any keyword and its name is String and if we print output also it will not give error.
 * */

/**************************************/

/*2)
 * public class Ex3{
 * psvm(){
 * var x1 = "pankaj";
 * var x3 =10;
 * var x7 =30.98;
 * var x8 = 'a';
 * var a1= new Ex3();
 * sop(x1);
 * sop(x3);
 * sop(x7);
 * sop(x8);
 * sop(a1);
 * }
 * }
 * */

/*3)
 * public class Ex3{
 * static var x2 =10;
 * var x3 =20;
 * psvm(){
 * var x1="pankaj"
 * }
 * }
 * */

/*4)
 * public class Ex3{
 * psvm(){
 * Ex3 ex = new Ex3();
 * ex.test(10);
 * }
 * p v test(var x){// error
 * sop(x)
 * }
 * */


/*5)
 * class Ex3 {
 * psvm(){
 * var var = 10;//it wont give error where as if it is a keyword it wont accept this syntax so we consider var as not a keyword.
 //int int =20;//error
 * sop(var);
 * }
 * }
 * */

/*6)
 * class Ex3 {
 * psvm(){
 * var String = 10;
 * sop(String)
 * }
 * }
 * */

/*7)
 * class Ex3{
 * psvm(){
 * int String = 30;
 * sop(String); //no error it will print special case
 * }
 * }
 * */
public class Ex3 {

}
