package io.murad.part.one.chapter.fourteen;

//A Simple generic class.
//Here, T is a type parameter that
//will be replaced by a real type
//when an object of type Gen is created.
public class Gen<T> {

	T ob;

	// pass the constructor a reference to
	// an object of type T.
	public Gen(T o) {
		this.ob = o;
	}

	// Return ob
	T getob() {
		return this.ob;
	}

	void showType() {
		System.out.println("Type of T is " + ob.getClass().getName());
	}
}
