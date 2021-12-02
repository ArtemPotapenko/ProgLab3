package MainClasses;

import java.util.concurrent.TimeUnit;

public final  class PrintSleep {
    public static void println(String s){
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException ignored) {
        }
        System.out.println("\n"+s+"\n");
    }
    public static void print(String s) {

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException ignored) {

        }
        System.out.print(s);
    }
}
