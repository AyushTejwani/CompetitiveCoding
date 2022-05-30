import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input= scanner.next();
        int count=0;
        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i)>='a')
                count++;
        }

        if(count>=input.length()-count)
            System.out.println(input.toLowerCase());
        else
            System.out.println(input.toUpperCase());
    }
}
