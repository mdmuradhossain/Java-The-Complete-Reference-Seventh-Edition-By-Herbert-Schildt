package io.murad.part.one.chapter.twelve;

public class EnumDemo3 {

	public static void main(String args[]) {
		Apple2 ap;

		// Display price of winesap.
		System.out.println("Winesap costs " + Apple2.Winesap.getPrice() + " cents.");

		// Display all apples and prices.
		System.out.println("All apple prices");
		for (Apple2 a : Apple2.values()) {
			System.out.println(a + " costs " + a.getPrice() + " cents.");
		}
	
	}
}
