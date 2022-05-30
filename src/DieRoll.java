import java.util.Scanner;

public class DieRoll {
    public static int getgcd(int a,int b)
    {
        return b == 0 ? a : getgcd(b, a % b);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int wakoo= scanner.nextInt();
        int yakoo= scanner.nextInt();
        int comp=Math.max(wakoo,yakoo);
        int gcd= getgcd(7-comp,6);
        System.out.println((7-comp)/gcd+"/"+6/gcd);

    }
}
