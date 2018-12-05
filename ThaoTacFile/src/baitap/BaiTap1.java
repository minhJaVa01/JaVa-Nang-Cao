package baitap;

import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class BaiTap1 {

	public static void main(String[] args) {
		do {
			try {
				String filePath;
				Scanner sc = new Scanner(System.in);
				System.out.println("Nhập vào đương dẫn file: ");
				filePath =sc.nextLine();
				File file = new File(filePath);
				if (!file.exists()) {
					System.out.println("createFile thành công " + file.createNewFile());
				}
				else  {
					
					System.out.println("1.kích thước file là "+file.length()+"  byte");
					System.out.println("\"phương thức length() --trả về kích thước cùa file dưới dạng byte\"");
					System.out.println(" . file có quyền đọc hay không ??"+file.canRead());
					System.out.println(" file có quyền ghi không ??"+file.canWrite());
					System.out.println(" Directory cha của file là :" + file.getParent());
					Date date = new Date(file.lastModified());
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		} while (true);

	}

}
