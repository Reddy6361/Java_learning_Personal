package unary_operator;

/*1) pre-increment/pre decrement: (++i/--i) -here we first increase 
 * the value by 1 and stored there itself and it will remain
 * same when we see next i.
 *2) post increment/post decrement:(i++/i--) -here we first don't 
 * increase the value by 1 here we store same value but when we see 
 * next i value will be increased.
 * */
public class Ex1 {
	public static void main(String[] args) {
		int i =10;
		int j = ++i + i++;// 11, 11++;
		System.out.println(i);// 11++ -> 12 output.
		System.out.println(j); // 11+11 -> 22 output.
		System.out.println("-----------------");
		int k =10;
		int l = --k + k--;//9,9--
		System.out.println(k);//9-- -> 8 output.
		System.out.println(l);// 9+9 -> 18 output.
	}
}
