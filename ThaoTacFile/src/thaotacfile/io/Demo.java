package thaotacfile.io;
import java.io.File;
public class Demo {

	public static void main(String[] args) {
		try {
			String fileName = "D:\\JAVA\\JaVa-Nang-Cao\\data.txt";
			String fileName2= "D:\\\\JAVA\\\\JaVa-Nang-Cao\\";
			File file = new File(fileName);
			System.out.println("Parent folder:" +file.getParent());
			System.out.println(" File có thể đọc được hay không ? ---(true/flase)      " + file.canRead());
			System.out.println("File có thể ghi được hay không ?---(true/flase)      "+file.canWrite());
			System.out.println("kiểm tra sự tồn tại của File   ---(true/flase)    "+ file.exists());
			if (file.exists()) {
				System.out.println("phương thức xóa file: delete()  ---(true/flase)      "+  file.delete());
			}
			if (!file.exists()) {
				System.out.println("tao moi file data.txt bang phuog thưc "+file.createNewFile());
			}
			File file2 = new File(fileName2);
			System.out.println("kiểm tra đường dẫn  là file không---(true/flase) "+file.isFile());
			System.out.println(" kiểm tra đường dẫn là foder hay không---(true/flase) "+file.isDirectory());
			System.out.println("----------------------------------------------------------");
			System.out.println("Phương thức litsFile(); trả về mảng các file");
			File fileList[]= file2.listFiles();
			for (int i = 0; i < fileList.length; i++) {
				File fileObject= fileList[i];
				if (fileObject.isFile()) {
					System.out.println("Đây là file và có đường dẫn là:"+fileObject.getCanonicalPath());
				}
				else {
					System.out.println(" Day la directory(thu muc) đường dẫn thư mục là :"+fileObject.getCanonicalPath());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
