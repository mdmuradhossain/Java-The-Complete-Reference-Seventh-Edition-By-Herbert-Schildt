package io.murad.part.one.chapter.twelve;

public class EnumDemo {

	public static void main(String[] args) {
		Apple apple;

		apple = Apple.RedDel;

		// output an enum value.
		System.out.println("Value of apple: " + apple);
		System.out.println();

		apple = Apple.GoldenDel;

		if (apple == Apple.GoldenDel)
			System.out.println("apple contains Golden.\n");

		// Use an enum to control a switch statement.
		switch (apple) {
		case Jonathan:
			System.out.println("Jonathan is red");
			break;
		case GoldenDel:
			System.out.println("Golden is delicious yellow");
			break;
		case RedDel:
			System.out.println("RedDel delicious is red");
			break;
		case Winesap:
			System.out.println("Winesap is red");
			break;
		case Cortland:
			System.out.println("Cortland is red");
			break;
		}
	}

}
