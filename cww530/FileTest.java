package cww530;

import org.junit.Test;
import  java.io.File;
public class FileTest {
//    @Test
//    public  void t2(){
//        FileTest file = new FileTest("D:\\3-18\\src\\Test.java");
//
//    }
public static void main(String[] args) {
     File file = new File("D:\\3-18\\src\\Test.java");
       System.out.println(file.exists());
}
}
