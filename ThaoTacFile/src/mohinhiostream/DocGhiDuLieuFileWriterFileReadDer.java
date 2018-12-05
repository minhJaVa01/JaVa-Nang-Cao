package mohinhiostream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DocGhiDuLieuFileWriterFileReadDer {

	public static void main(String[] args) {
		String fileName ="D:\\JAVA\\JaVa-Nang-Cao\\FileWiterFileReadDer.txt";
		char c= 'm';
		String s1="nguyen van manh";
		String s2 ="hoang anh gia lai";
		FileWriter fw=null;
		FileReader fr = null;
		try {
			
			 fw =new FileWriter(fileName);
			fw.write(c);
			fw.write(s1);
			fw.write(s2);
			
			 fr = new FileReader(fileName);
			char chars[]= new char[100];
			fr.read(chars);
			System.out.println(chars);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (fw !=null) {
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (fr!=null) {
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
		}
	}
}
