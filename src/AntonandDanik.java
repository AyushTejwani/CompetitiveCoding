import java.util.Scanner;

public class AntonandDanik {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int length=scanner.nextInt();

        String str= scanner.next();
        int count=0;

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='A')
            {
                count++;
            }
        }

        if(count>length-count)
        {
            System.out.println("Anton");

        }
        else if(count==length-count)
            System.out.println("Friendship");
        else
        {
            System.out.println("Danik");

        }
    }
}
