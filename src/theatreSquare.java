import java.util.Scanner;

public class theatreSquare {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        int m= scanner.nextInt();
        int a= scanner.nextInt();
        int l= n/a;
        int w= m/a;
        if(n%a!=0)
            l+=1;
        if(m%a!=0)
            w+=1;
        System.out.println(l*w);
    }
}
