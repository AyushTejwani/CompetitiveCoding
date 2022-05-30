import java.util.HashSet;
import java.util.Scanner;

public class NewPassword {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        int k= scanner.nextInt();
        String kLengthString="";

        for(int i=0;i<k;i++){
            kLengthString= kLengthString + (char)(i+97);
        }

        String finalString="";
        for(int i=0;i<n/k;i++)
        {
            finalString=finalString+kLengthString;
        }
        finalString=finalString+kLengthString.substring(0,(n%k));
        System.out.println(finalString);
    }
}
