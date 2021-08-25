package iib;
//main method> IIB> Constructor- (special case).
public class Ex5 {
	{// IIB // runs second //step3
		System.out.println("from IIB");//step4
	}//step5

	Ex5() { // runs third //step6
		System.out.println("from constructor"); //step7
	}//step8

	public static void main(String[] args) { // runs first//step1
		new Ex5();// object should be created mandatorily to call the IIB
		//step2 //step9
		System.out.println("from main");//step10
	}//step11 stop.
}
