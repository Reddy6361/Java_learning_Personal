package p1;

/*
 * Array: 
 * 3)command line arguments and empty array.
 * */
public class Ex5 {
	public static void main(String[] args) { //command line arguments& size of array is dyanamic, ie its size keeps on changing as we put values in it
		int [] arr = new int[0];
		System.out.println(arr.length);
		// empty array,array created but no value stored.
		System.out.println(args.length); // size is 1
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		//System.out.println(args[3]); // array out of bounds Exception
	}
}
