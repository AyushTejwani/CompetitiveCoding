import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int total= scanner.nextInt();
        String left="01";
        String right="10";
        String prev=scanner.next();
        int count=1;
        for(int i=1;i<total;i++)
        {
            String temp= scanner.next();
            if (!temp.equals(prev))
            {

                count++;
            }
                //count++;
            prev=temp;
        }
        System.out.println(count);
    }
}
