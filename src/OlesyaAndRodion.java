import java.util.Scanner;

public class OlesyaAndRodion {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        int t= scanner.nextInt();
        int smallest= (int) Math.pow(10,n);
        smallest--;
        int rem= smallest%t;
        if(rem==0){
            System.out.println(smallest);
            return;
        }
        int add= smallest- rem  ;
        if(add%smallest!=0){
            System.out.println(add);
            return;
        }
        System.out.println("-1");
    }
}
