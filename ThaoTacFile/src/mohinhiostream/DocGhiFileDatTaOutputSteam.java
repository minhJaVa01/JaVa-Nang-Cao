package mohinhiostream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DocGhiFileDatTaOutputSteam {

	public static void main(String[] args) {
		String filePath="D:\\JAVA\\JaVa-Nang-Cao\\DaTaOutPutStream.dat";
		int i= 5;
		char c= 'a';
		double d = 5.5;
		String s= "nguyen van minh";
		FileOutputStream  fos=null;
		DataOutputStream dos =null;
		FileInputStream fis =null;
		DataInputStream dis =null;
		try {
			
			//kết nối vào file 
			 fos= new FileOutputStream(filePath);
			//Tao Doi tuong DOS kết nối với FileOutPutStream
			 dos= new DataOutputStream(fos);
			dos.writeInt(i);
			dos.writeDouble(d);
			dos.writeUTF(s);
			
			 fis = new FileInputStream(filePath);
			dis = new DataInputStream(fis);
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readUTF());
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
				if (dos !=null) {
					try {
						dos.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if (fis != null) {
					try {
						fis.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if (dis != null) {
					try {
						dis.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}

}
