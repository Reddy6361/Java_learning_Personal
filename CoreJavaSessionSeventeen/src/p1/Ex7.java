package p1;
/***/
@FunctionalInterface
public interface Ex7 {
 public void test(); // only one incomplete method , zero also error
 //more than 1 also error, but complete methods can be any number.
 default void test2() {
	 System.out.println("compltete method 1");
 }
default void test3() {
	 System.out.println("compltete method 2");
 }
}
