package io.murad.part.one.chapter.thirteen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* Display a text file.
 * 
 * To use this program, specify the name
 * of the file that you want to see.
 * For example, to see a called Test.txt,
 * use the following command line
 * 
 * java showFile Test.txt
 */
public class ShowFile {

	public static void main(String[] args) throws IOException {
		int i;
		FileInputStream fInputStream;
		try {
			fInputStream = new FileInputStream(args[0]);
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
			return;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Usage: showFile File");
			return;
		}

		// read characters until EOF is encountered
		do {
			i = fInputStream.read();
			if (i != -1) {
				System.out.println((char) i);
			}
		} while (i != -1);
		fInputStream.close();
	}

}
