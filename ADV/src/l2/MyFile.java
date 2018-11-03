package l2;

import java.io.File;
import java.util.Arrays;

public class MyFile {

    public static void main(String[] args) {
        File file = new File("C:/Users");
        System.out.println(file.exists());
        System.out.println(file.isDirectory());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.isFile());
        String[] folder = file.list();
        System.out.println(Arrays.toString(folder));
        file.mkdir();
        
        // HomeWork minimum:


//        сделать это через свинг


        //  PART2
//            если это картинка, вывод картинок, если текст - то текст
    }

}
//ConsoleFileManager, который стартует с диска ÷ и выводит все что видит в диске —
//!важно, директори€ сверху, файлы снизу, все должно быть в алфавитном пор€дке
//!важно, всегда показывать текущий путь
//далее, можно перейти в любую папку из тех что вывело, и оп€ть вывести все внутри папки