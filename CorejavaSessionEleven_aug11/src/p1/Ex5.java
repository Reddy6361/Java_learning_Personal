package p1;

// example email to understand overloading.
public class Ex5 {
	public void sendEmail(String tcid) {
		System.out.println("transactional emailer");
	}

	public void sendEmail() {
		System.out.println("promotional");
	}

	public static void main(String[] args) {
		Ex5 ex = new Ex5();
		ex.sendEmail();// will call promotional mail.
	}
}
