package iib;
//main method> IIB> Constructor- (special case).
public class Ex6 {
	
		{// IIB // runs second //step4
			System.out.println("from IIB");//step5
		}//step6

		Ex6() { // runs third //step7
			System.out.println("from constructor"); //step8
		}//step9

		public static void main(String[] args) { // runs first//step1
			System.out.println("main start");// step2
			new Ex6();// object should be created mandatorily to call the IIB
			//step3 //step10
			System.out.println("from main");//step11
		}//step12 stop.
	}


