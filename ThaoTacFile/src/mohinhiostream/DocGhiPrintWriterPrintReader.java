package mohinhiostream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DocGhiPrintWriterPrintReader {

	public static void main(String[] args) {
		String fileName="D:\\\\JAVA\\\\JaVa-Nang-Cao\\\\FileWriterFileReader.txt";
     String s1="this is String 1";
     String s2= "this is String 2 ";
     String s3="this is String 3";
     char c ='a';
     FileWriter fw =null;
     FileReader fr =null;
     try {
    	 fw= new FileWriter(fileName);
    	 fw.write(s1);
    	 fw.write(s2);
    	 fw.write(s3);
    	 fw.write(c);
		 fr = new FileReader(fileName);
		char chars[] = new char[100];
		fr.read(chars);
		System.out.println(chars);
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		if (fw !=null) {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (fr !=null) {
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
