package p1;

public class PlatinumAccount extends GoldAccount {
	@Override // checks weather method is going to override,
	// so that typo is avoided
	public void chqBooks() {// Overridden method
		System.out.println("unlimitted"); // overrideen and logic is been alterd.
	}

	@Override // checks weather method is going to override,
	// so that typo is avoided
	public void rateOfIntrest() { // overriden method
		System.out.println("7% pa");// overrideen and logic is been alterd.
	}

	public static void main(String[] args) {
		PlatinumAccount p = new PlatinumAccount();// object of child class
		p.chqBooks(); // no inheritance
		p.onlineBanking(); // inheritance is happening
		p.rateOfIntrest();// no inheritance
		System.out.println("---------------------");
		GoldAccount g = new GoldAccount(); // object of parent class
		g.chqBooks();// no inheritance
		g.onlineBanking();// inheritance is happening
		g.rateOfIntrest();// no inheritance
	}
}
