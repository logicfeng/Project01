package huyunfeng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

public class Createmodule {

    public  static  final String INIT_CODE = "11";



    public static void main(String[] args) {
        System.out.println("HelloWorld!!!!!");//ctrl+
        String name = "huyunfeng";
        Date date = new Date();
        ArrayList list = new ArrayList();
        list.add("huyunfeng");
    }

    public static  void test(){
        System.out.println("aaa");
        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
