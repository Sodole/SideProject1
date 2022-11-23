package online;

import java.util.*;
import java.io.*;

public class fileWriter {

	public static void main(String[] args)throws Exception {
		FileWriter fw = new FileWriter("C:\\Users\\82103\\Desktop\\test.csv\\", true);
		fw.write("문자열을" + "\n");
		fw.close();
		
	}

}
