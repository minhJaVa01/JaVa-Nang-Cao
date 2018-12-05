package mohinhiostream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoStreamMucThapBytes {

	public static void main(String[] args) {
		String fileName ="D:\\JAVA\\JaVa-Nang-Cao\\data.txt";
		File file =null;
		FileOutputStream fos=null;
		try {
			char c ='H';
			int i = 5;
			String str="nguyen van manh";
			file = new File(fileName);
			if (!file.exists()) {
				file.createNewFile();
			}
			 fos = new FileOutputStream(fileName);
			fos.write(c);
			fos.write(i);
			fos.write(str.getBytes());
			FileInputStream fis = new FileInputStream(file);
			byte bytes[] = new byte[1];
			fis.read(bytes);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (fos !=null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		

	}

}
