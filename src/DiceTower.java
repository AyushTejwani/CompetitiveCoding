import java.util.Scanner;

public class DiceTower {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        int m= scanner.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
           count=count+(m + (i%5))/5;
        }
        System.out.println(count);
    }

}
