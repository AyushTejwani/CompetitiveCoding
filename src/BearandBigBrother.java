import java.util.Scanner;

public class BearandBigBrother {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int bear= scanner.nextInt();
        int bro=scanner.nextInt();
        int count=0;
        while (bear<=bro)
        {
            bear= bear*3;
            bro=bro*2;
            count+=1;
        }
        System.out.println(count);
    }
}
