import java.util.Scanner;

public class calculatingFunction {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Long n= scanner.nextLong();
       if(n%2==0){
            System.out.println(n/2);
        }
       else{
           System.out.println(n=-1*((n+1)/2));

        }
    }
}
