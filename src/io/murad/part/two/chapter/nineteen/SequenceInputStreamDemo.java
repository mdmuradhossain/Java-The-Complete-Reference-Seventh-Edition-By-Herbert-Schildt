package io.murad.part.two.chapter.nineteen;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

class InputStreamEnumerator implements Enumeration<FileInputStream> {
	private Enumeration<String> files;

	public InputStreamEnumerator(Vector<String> files) {
		this.files = files.elements();
	}

	public boolean hasMoreElements() {
		return files.hasMoreElements();
	}

	public FileInputStream nextElement() {
		try {
			return new FileInputStream(files.nextElement().toString());
		} catch (IOException e) {
			return null;
		}
	}
}

public class SequenceInputStreamDemo {

	public static void main(String[] args) throws IOException {
		int c;
		Vector<String> files = new Vector<>();

		files.addElement("/autoexec.bat");
		files.addElement("/config.sys");
		InputStreamEnumerator e = new InputStreamEnumerator(files);
		InputStream input = new SequenceInputStream(e);

		while ((c = input.read()) != -1) {
			System.out.println((char) c);
		}
		input.close();
	}

}
