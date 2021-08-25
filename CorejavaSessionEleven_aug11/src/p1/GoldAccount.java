package p1;

// Practical Example of overriding.
public class GoldAccount {
	public void onlineBanking() {
		System.out.println("yes");// this method remains as it is because its common bw 2 accounts so we dont have
// to change the logic.
	}

	public void chqBooks() {
		System.out.println("2/year");// this method doesnot remains same values inside or in general logic will be
// changed by overriding.
	}

	public void rateOfIntrest() {
		System.out.println("nill");// this method doesnot remains same values inside or in general logic will be
// changed by overriding.
	}
}
