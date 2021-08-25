//Without inistialising local variable , if  used then it iwll give an error
public class Ex4 {
public static void main(String[] args) {
	@SuppressWarnings("unused")
	int weight;
	//System.out.println(weight);//error//we have to initialize local variable.// even we cannot store null value in it or assign null value to it, it will give an error.
}
}
