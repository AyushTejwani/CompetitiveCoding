import sun.security.util.Length;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class LongestUncommonSequence {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String a= scanner.next();
        String b= scanner.next();

        int count=-1;
        if(!a.equals(b)){
            count=Math.max(a.length(),b.length());
        }
        System.out.println(count);
    }

}
