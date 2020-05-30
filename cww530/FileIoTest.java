package cww530;

import org.junit.Test;

import java.io.*;

public class FileIoTest {
    public FileIoTest() throws FileNotFoundException {
    }

    @Test
    public void t2() throws IOException {
        FileInputStream fis = null;
        try {
             fis = new FileInputStream(new File(""));
//             fis=this.getClass().getClassLoader().getResourceAsStream("cww-2");
            byte[] bytes = new byte[1024];
            int len =0;
            while ((len=fis.read(bytes))!=-1){
                String s = new String(bytes,0,len);
                System.out.println(s);
            }
        } finally {
                if(fis !=null)
                    fis.close();
        }
    }
    @Test
    public void t1() throws FileNotFoundException {
        FileReader fileReader = new FileReader("");
        char[] chars = new char[1024];
        int len;
        while ((len = fis.read(bytes)) != -1) {
            String s = new String(bytes, 0, len);
            System.out.println(s);
        }
    }
    @Test
    public void t3() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("");
//
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        boolean line;
        while((line = bufferedReader.readLine()!=null)){
            System.out.println(line);
//            @Override
//            public int read() throws IOException {
//                return 0;
//            }
        }
    }

}
