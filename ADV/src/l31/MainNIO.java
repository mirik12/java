package adv03;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MainNIO {

	public static void main(String[] args) {
		Path p = Paths.get("C:\\Users\\Java base\\workspace\\Pudge\\Dota1");
		try {
			if(!Files.exists(p)){
				Files.createDirectory(p);
				System.out.println("Create success");
			}
			
			File file=new File(p.toString()+"\\hello.html");
			try (FileOutputStream fos=new FileOutputStream(file)){
				String text="NEW text";
				fos.write(text.getBytes());
				System.out.println("Write success");
			} catch (Exception e) {
				System.out.println("Error writing file");
				e.printStackTrace();
			}
		} catch (IOException e) {
			System.out.println("Error creating folder");
			e.printStackTrace();
		}

	}

}
