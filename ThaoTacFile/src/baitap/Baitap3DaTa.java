package baitap;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Baitap3DaTa {

	public static void main(String[] args) {
		String fileName;
		FileOutputStream fos=null;
		DataOutputStream dos =null;
		FileInputStream fis =null;
		DataInputStream dis=null;
		
		try {
			Scanner input = new Scanner(System.in);
			System.out.println("Nhập đường dẫn file :");
			fileName= input.nextLine();
			File file = new  File(fileName);
			if (!file.exists()) {
				file.createNewFile();
			}
			System.out.println("Nhap vao chuoi van ban: ");
			String content =input.nextLine();
			/**
			 * kết nối File bằng đối tượng FileOutPutStream
			 */
			 fos = new FileOutputStream(fileName);
			/**
			 * Khởi tạo đối tượng DataOutPutStream và kết nối tới đối tượng File
			 */
			 dos = new DataOutputStream(fos);
			//
			dos.writeUTF(content);
			
			 fis  =new FileInputStream(fileName);
			 dis = new DataInputStream(fis);
			System.out.println(dis.readUTF());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}if (dos !=null) {
				try {
					dos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (fis !=null) {
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
