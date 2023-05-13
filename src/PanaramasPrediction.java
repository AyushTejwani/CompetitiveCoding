import java.util.Scanner;

public class PanaramasPrediction {

    public static boolean primeCheck(int i){
        for(int a=2;a<i;a++){
            if(i%a==0)
                return false;
        }
        return true;
    }

          public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();

        int i=a+1;
        while(i<=b){
            if(primeCheck(i) && i!=b || !primeCheck(i) && i==b){
                System.out.println("NO");
                break;
            }
            else if(primeCheck(i) && i==b){
                System.out.println("YES");
                break;
            }
            i=i+1;
            continue;
        }

    }
}
