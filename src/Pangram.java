import javax.annotation.processing.SupportedSourceVersion;
import java.util.HashSet;
import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int size= scanner.nextInt();
        if(size<26)
        {
            System.out.println("NO");
            return;
        }
        String str= scanner.next();
        HashSet<Integer> hs= new HashSet<>();
        for(int i=0;i<26;i++){
          hs.add(i);
        }
        for(int i=0;i<str.length();i++){
            int ch= str.charAt(i);
            if(ch>=97 && ch<=122){
                ch=ch-97;
            }
            else{
                ch=ch-65;
            }
            hs.remove(ch);
        }
        if(hs.size()==0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
