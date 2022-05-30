import java.util.Scanner;

public class BuyAShovel {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int pricepershovel=scanner.nextInt();
        int chillar= scanner.nextInt();
        int a=pricepershovel%10;
        int store=0;
        for(int i=1;i<10;i++)
        {
            if((i*a)%10==chillar || (i*a)%10==0)
            {
                store=i;
                break;
            }
        }
        System.out.println(store);
    }
}
