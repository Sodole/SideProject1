package online;

import java.io.*;
import java.util.*;


public class fileread {
	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("C:\\Users\\82103\\Desktop\\stock_data.csv\\");
		int ch;
		while((ch=reader.read())!= -1) {
			System.out.print((char)ch);
		}
	}
}
