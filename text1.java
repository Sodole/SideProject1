package online;

import java.util.*;
import java.io.*;

public class text1 {

	public static void main(String[] args) throws Exception{
		Item i1 = new Item();
		i1.settitle("samsung");
		i1.setPrice(56000);

		Item i2 = new Item();
		i2.settitle("skhynix");
		i2.setPrice(62000);
		
		FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\82103\\Desktop\\test1.csv\\");
		OutputStreamWriter OutputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
		BufferedWriter fw = new BufferedWriter(OutputStreamWriter);
		
		fw.write(i1.gettitle()+ ","+ i1.getPrice() + "\n");
		fw.write(i2.gettitle()+ "," + i2.getPrice());
		fw.close();
		
		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\82103\\Desktop\\test1.csv\\");
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
		BufferedReader br = new BufferedReader(inputStreamReader);
		
		String str;
		while((str=br.readLine()) != null) {
			System.out.println(str);
		}
		br.close();
	}
}
