package io.murad.part.one.chapter.twelve;

//Use an enum constructor, instance variable, and method
public enum Apple2 {

	Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);

	private int price;

	Apple2(int p) {
		this.price = p;
	}

	int getPrice() {
		return this.price;
	}
}
