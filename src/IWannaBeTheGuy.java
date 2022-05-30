import java.util.HashSet;
import java.util.Scanner;

public class IWannaBeTheGuy {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        HashSet<Integer> hs= new HashSet<>();
        for(int i=1;i<=n;i++){
            hs.add(i);
        }
        int l = scanner.nextInt();
        for(int i=0;i<l;i++){
            int temp= scanner.nextInt();
            hs.remove(temp);
        }

        int r = scanner.nextInt();
        for(int i=0;i<r;i++){
            int temp= scanner.nextInt();
            hs.remove(temp);
        }
        if(hs.isEmpty()){
            System.out.println("I become the guy.");
        }
        else{
            System.out.println("Oh, my keyboard!");
        }
    }
}
