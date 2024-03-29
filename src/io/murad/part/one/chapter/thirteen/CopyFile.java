package io.murad.part.one.chapter.thirteen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* Copy a text file.
 * 
 * To use this program, specify the name
 * of the source file and the destination file.
 * For example, to copy a file called First.txt
 * to a file called Second.txt, use the following
 * command line.
 * 
 *  java CopyFile First.txt Second.txt
 */

public class CopyFile {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {

		int i;
		FileInputStream fin;
		FileOutputStream fout;
		try {
			// open input file
			try {
				fin = new FileInputStream(args[0]);
			} catch (FileNotFoundException e) {
				System.out.println("Input File Not Found");
				return;
			}

			// open output file
			try {
				fout = new FileOutputStream(args[1]);
			} catch (FileNotFoundException e) {
				System.out.println("Error Opening Output File");
				return;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Usage: CopyFile From To");
			return;
		}
		// Copy File
		try {
			do {
				i = fin.read();
				if (i != -1)
					fout.write(i);
			} while (i != -1);
		} catch (IOException e) {
			System.out.println("File Error");
		}
		fin.close();
		fout.close();
		
		// try-with-resources
		/*
		 * try(call object here to close file automatically){ 
		 * } catch(){
		 *  }
		 */
	}
}