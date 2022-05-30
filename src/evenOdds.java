import java.util.Scanner;

public class evenOdds {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        int m= scanner.nextInt();

        if(m<=(n+1)/2){
            System.out.println(m*2-1);
            return;
        }
        System.out.println((m-(n+1)/2)*2);
    }
}
