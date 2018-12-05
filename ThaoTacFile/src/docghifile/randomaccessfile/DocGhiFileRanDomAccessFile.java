package docghifile.randomaccessfile;

import java.io.IOException;
import java.io.RandomAccessFile;

public class DocGhiFileRanDomAccessFile {

	public static void main(String[] args) {
		String fileName ="D:\\JAVA\\JaVa-Nang-Cao\\data2.txt";
		RandomAccessFile raf=null;
		try {
			 raf = new RandomAccessFile(fileName, "rw");
			char c='b';
			String str= "this is String";
			int i = 10;
			double d = 5.5;
			float f = 1.5f;
			raf.writeChar(c);
			raf.writeInt(i);
			raf.writeDouble(d);
			raf.writeFloat(f);
			raf.writeUTF(str);
			raf.seek(0); 
			System.out.println(raf.readChar());
			System.out.println(raf.readInt());
			System.out.println(raf.readDouble());
			System.out.println(raf.readFloat());
			System.out.println(raf.readUTF());
			System.out.println("\" chú ý!!! Thứ tự đọc cũng phải theo thứ tự ghi file\"");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				raf.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
