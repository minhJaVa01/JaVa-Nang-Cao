package baitap;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class BaiTap2 {

	public static void main(String[] args) {
		FileOutputStream fos=null;
		FileInputStream fis  =null;
		String fileName;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Vui lòng nhập đường dẫn của 1 file :");
			fileName = sc.nextLine();
			File file = new File(fileName);
			if (!file.exists()) {
				file.createNewFile();
			}
			System.out.println("vui long nhap chuoi");
			String moment =sc.nextLine();
			 fos = new FileOutputStream(file);
			fos.write(moment.getBytes());
			
			fis  =new FileInputStream(file);
			byte bytes[] = new byte[moment.length()];
			fis.read(bytes);
			System.out.println(new String(bytes));
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (fos !=null) {
				try {
					fos.close();
				} catch (IOException e) {
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
		}
	}

}
