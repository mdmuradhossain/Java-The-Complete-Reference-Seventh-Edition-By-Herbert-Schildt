package io.murad.part.two.chapter.nineteen;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIODemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fout = new FileOutputStream("Test.dat");
		DataOutputStream out = new DataOutputStream(fout);

		out.writeDouble(98.6);
		out.writeInt(1000);
		out.writeBoolean(true);

		out.close();

		FileInputStream fin = new FileInputStream("Test.dat");
		DataInputStream in = new DataInputStream(fin);

		double d = in.readDouble();
		int i = in.readInt();
		boolean b = in.readBoolean();

		System.out.println("Here are values: " + d + " " + " " + i + " " + b);

		in.close();

	}

}
