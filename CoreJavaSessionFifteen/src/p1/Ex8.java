package p1;

// best example to demonstrate interface, to show why it is used.
public interface Ex8 {
	abstract public void balance(); // incomplete method.
	// if we don't override it in class where we
	// inherit it , it will give an error.

	public abstract void transferMoney();// incomplete method.
	// if we don't override it in class where we
	// inherit it , it will give an error.

	public abstract void generateBankStatement();// incomplete method.
	// if we don't override it in class where we
	// inherit it , it will give an error.
}
