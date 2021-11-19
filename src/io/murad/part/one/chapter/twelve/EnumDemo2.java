package io.murad.part.one.chapter.twelve;

public class EnumDemo2 {

	public static void main(String[] args) {
		Apple apple;
		System.out.println("Here are all apple");

		// use values
		Apple allApples[] = Apple.values();
		for (Apple a : allApples) {
			System.out.println(a);
		}
		System.out.println();
		// use valueOf()
		apple = Apple.valueOf("Winesap");
		System.out.println("apple contains " + apple);
	}

}
