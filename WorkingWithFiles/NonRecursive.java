package files;
import java.io.File;

public class NonRecursive {

	public static void main(String[] args) {
		System.out.println("Question1");
		String[] extention={"java","txt"};
		File file=new File("D:\\sample");
		if(file.exists()) {
			if(file.isFile()) {
				System.out.println("it's a file:"+file.getName());
			}
			else if(file.isDirectory()) {
				System.out.println("it's a directory:"+file.getName());
				
				File[] files=file.listFiles();
				if(files!= null) {
					System.out.println("no.of files:"+files.length);
					for(File file2:files) {
						System.out.println(file2);
					}
					for(String ext:extention) {
						System.out.println("Extention:"+ext);
						for(File file2:files) {
							if(file2.isFile()&& file2.getName().endsWith(ext)) {
								System.out.println("file found:"+file2);
							}
							else {
								System.out.println("not found");
								break;
							}
							
						}
					}
					
				}
				else {
					System.out.println("no files");
				}
			}
		}
		else {
			System.out.println("not exist");
		}
 
	}
 
}

