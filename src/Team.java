import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int number= scanner.nextInt();
        int count=0;
        for( int i=0;i<number;i++)
        {
            int a= scanner.nextInt();
            int b= scanner.nextInt();
            int c= scanner.nextInt();
            if(a+b+c<2)
                continue;
            count+=1;
        }
        System.out.println(count);
    }
}
