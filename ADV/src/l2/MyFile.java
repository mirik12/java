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


//        ������� ��� ����� �����


        //  PART2
//            ���� ��� ��������, ����� ��������, ���� ����� - �� �����
    }

}
//ConsoleFileManager, ������� �������� � ����� � � ������� ��� ��� ����� � ����� �
//!�����, ���������� ������, ����� �����, ��� ������ ���� � ���������� �������
//!�����, ������ ���������� ������� ����
//�����, ����� ������� � ����� ����� �� ��� ��� ������, � ����� ������� ��� ������ �����