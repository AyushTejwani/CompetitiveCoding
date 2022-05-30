import java.util.HashSet;
import java.util.Scanner;

public class BoyandGirl {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input= scanner.next();
        HashSet<String> hs=new HashSet<>();
        for(int i=0;i<input.length();i++)
        {
            hs.add(input.substring(i,i+1));
        }
        if(hs.size()%2==0)
            System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");
    }
}
