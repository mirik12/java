package l1;

import java.io.*;
import java.util.Scanner;

public class HelloAdvancedJava {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
//        try {
//            fis = new FileInputStream("putty.exe");
//            fos = new FileOutputStream("copy_putty.exe");
//            int c;
//            while((c = fis.read()) != -1) {
//                
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if(fis!=null) {
//                try {
//                    fis.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            if (fos!= null) {
//                try {
//                    fos.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
        
        
        
//        
//        try(FileInputStream fis = new FileInputStream("putty.exe");
//                    FileOutputStream fos = new FileOutputStream("copy_putty.exe"));
//                int c;
//                while((c = fis.read())!= -1) {
//                    fos.write(c);
//
//                }} catch(IOException e) {
//        e.printStackTrace();
//                }
                
//        try(FileReader fr = new FileReader("putty.exe");
//                    FileWriter fw = new FileWriter("fw_putty.exe")){
//            int c;
//            while((c = fr.read()) != -1) {
//                fw.write(c);
//            }
//        }catch(IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println("OK");
        
        
        
//         try(BufferedReader in = new BufferedReader(new FileReader("Hello.java"));
//         PrintWriter pw = new PrintWriter("hi.txt");
//         ) {
//            
//         String line = null;
//             while((line = in.readLine()) != null) {
//                
//                 System.out.println(line);
        // pw.write(line);
        // }
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//         System.out.println("OK");
        
        
//        Scanner in = null;
//        try {
//            in = new Scanner(new File("hello.java"));
//            
//        } catch (FileNotFoundException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        while(in.hasNext()) {        
//            if(in.hasNextDouble()) {
//                String num = in.next();
//                try {
//                    Integer.parseInt(num);
//                    
//                } catch (NumberFormatException e) {
//                    e.printStackTrace();
//                    System.out.println(num);
//                }
//            } else {
//                in.next();
//            }
//        }
        Scanner in = null;
        try {
            in = new Scanner(new File("hello.java"));
            in.useDelimiter("a");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        while(in.hasNext()) {        
            System.out.println(in.next());
            
        }
        in.close();
        
        
        
    }
}