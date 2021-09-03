package p1;

import java.io.Serializable;

/*
 *  To restrict serialization of particular variables or
 *   methods we use transient keyword.
 * */
public class Ex2 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String name = "pankaj";
	String city = " bangalore";
	transient String password = "12345"; // restricts serialization.
}
