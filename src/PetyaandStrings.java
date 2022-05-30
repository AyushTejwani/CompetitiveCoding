import java.util.Scanner;

public class PetyaandStrings {
    public static int solve(String first,String second)
    {
        String firstlow=first.toLowerCase();
        String  secondLow= second.toLowerCase();

        for(int i=0;i<firstlow.length();i++)
        {
            if(firstlow.charAt(i)>secondLow.charAt(i))
                return 1;
            else if(firstlow.charAt(i)<secondLow.charAt(i))
                return -1;

        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String first=scanner.next();
        String second=scanner.next();
        int answer=solve(first,second);
        System.out.println(answer);

    }
}
