import java.util.Scanner;

public class Fancyfence {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        for(int i=0;i<n;i++){
            double angle= scanner.nextDouble();
            double side= 360/(180-angle);
            if(side%1!=0)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
