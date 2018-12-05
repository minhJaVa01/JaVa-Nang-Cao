package bt.RanDomAccessFile;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class DocGhiDuLieuFile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String fileName;
		RandomAccessFile raf = null;
		String comment=null;
		try {
			
			System.out.println("vui long nhap duong dan file");
			fileName=sc.nextLine();
			File file = new File(fileName);
			if (!file.exists()) {
				file.createNewFile();
			}
			System.out.println("vui long nhap vao chuoi");
			comment = sc.nextLine();
			raf = new RandomAccessFile(fileName, "rw");
//			raf.writeUTF(comment); để ghi file ta dùng thêm cách wBytes 
			raf.writeBytes(comment);
			raf.seek(0);
			System.out.println(raf.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (raf != null) {
				try {
					raf.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
