package cww530;
import jdk.nashorn.internal.objects.Global;
import org.junit.Test;

import java.io.PrintWriter;
import java.io.StringWriter;

public class System {
    public static Global out;

    @Test
    public  void  t1(){
//        int i = 1/0;
        try {
            int i = 4 /0;
//            System.out.println("1/0");
//            System.out.println("4/0");
        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("error");
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            e.printStackTrace(pw);
        }
//        System.out.println("t1");
    }
}
