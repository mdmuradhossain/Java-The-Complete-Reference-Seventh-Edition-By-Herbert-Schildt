package io.murad.part.one.chapter.fourteen;

public class GenDemo {

	public static void main(String[] args) {
		// Create a Gen reference for Integers.
		Gen<Integer> iOb;

		// Create a Gen<Integer> object and assign its
		// reference to iOb. Notice the use of autoboxing
		// to encapsulate the 88 within an Integer Object

		iOb = new Gen<Integer>(88);

		// show the type of data used by iob
		iOb.showType();

		// Get the value in iOb. Notice that
		// no cast is needed
		int v = iOb.getob();
		System.out.println("value: " + v);

		System.out.println();

		// create a Gen objecty for strings
		Gen<String> strOb = new Gen<String>("Generic test");

		// show the type of data used by strOb
		strOb.showType();

		// get the value strob. Again notice
		// type cast is not needed
		String str = strOb.getob();
		System.out.println("value: " + str);
	}

}
