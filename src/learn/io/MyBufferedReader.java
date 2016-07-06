package learn.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;

public class MyBufferedReader {
	FileReader r = null;
	int count = 0;
	int pos = 0;
	char[] buff = new char[1024];

	public MyBufferedReader(FileReader r) {
		super();
		this.r = r;
	}

	public int myRead() throws IOException {

		if (count == 0) {
			count = r.read(buff);
			pos = 0;
		}
		if (count < 0) {
			return -1;
		}
		char ch=buff[pos];
		pos++;
		count--;
		return ch;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("config.properties");
		MyBufferedReader mybr = new MyBufferedReader(fr);
		int a = 0;
		while ((a = mybr.myRead()) != -1) {
			System.out.print((char)97);
		}

	}

}
